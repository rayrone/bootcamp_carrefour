package aula03_processamento_assincrono_e_paralelo;

public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF geradorPDF = new GeradorPDF();
        BarraDeCarregamento barraCarregamento = new BarraDeCarregamento(geradorPDF);

        geradorPDF.start();
        barraCarregamento.start();
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        System.out.println("Iniciar geração de PDF.");

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PDF Gerado.");
    }
}

class BarraDeCarregamento extends Thread {

    private final Thread thread;

    public BarraDeCarregamento(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (thread.isAlive()) {
                System.out.println("Loading...");
            } else {
                break;
            }
        }
    }
}
