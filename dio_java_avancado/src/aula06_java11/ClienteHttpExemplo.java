package aula06_java11;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class ClienteHttpExemplo {

    private static final ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread criada :: " + (thread.isDaemon() ? "daemon" : "")
                    + " Thread Group :: " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAkamaiHttpClient(HttpClient.Version.HTTP_2);
    }

    private static void connectAkamaiHttpClient(HttpClient.Version version) throws IOException, InterruptedException {
        System.out.println("Running " + version + " example...");

        try {
            HttpClient client = HttpClient.newBuilder().version(version)
                    .proxy(ProxySelector.getDefault()).build();

            long start = System.currentTimeMillis();

            HttpRequest request = HttpRequest.newBuilder().uri(URI
                    .create("https://http2.akamai.com/demo/h2_demo_frame.html")).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Headers: " + response.headers());
            final String responseBody = response.body();
            //System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            // Pega o caminho de todas as imagens
            Stream<String> stream = responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src=") + 5, line.indexOf("'/>")));

            stream.forEach(image -> {
                Future<?> imgFuture = executor.submit(() -> {
                    HttpRequest imgRequest = HttpRequest.newBuilder()
                            .uri(URI.create("https://http2.akamai.com/" + image))
                            .build();

                    try {
                        HttpResponse<String> imgRespose = client.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                        System.out.println("Image loaded :: " + image + ", Status Code: " + imgRespose.statusCode());
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Mensagem de erro durante a requisição para recuperar a imagem " + image);
                    }
                });

                future.add(imgFuture);
                System.out.println("Submetido um futuro para a imagem :: " + image);
            });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Erro ao esperar carregar a imagem do futuro");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de Carregamento total: " + (end - start));

        } finally {
            executor.shutdown();
        }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://docs.oracle.com/javase/10/language/")).build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Headers Response: " + response.headers());
        System.out.println(response.body());
    }
}
