programa
{
	
	funcao inicio()
	{
		real venda_janeiro, venda_fevereiro, venda_marco, venda_abril, total_vendas, media_vendas

		escreva("Digite o valor das vendas do mês de Janeiro: ")
		leia(venda_janeiro)

		escreva("Digite o valor das vendas do mês de Fevereiro: ")
		leia(venda_fevereiro)
		
		escreva("Digite o valor das vendas do mês de Março: ")
		leia(venda_marco)

		escreva("Digite o valor das vendas do mês de Abril: ")
		leia(venda_abril)

		total_vendas = venda_janeiro + venda_fevereiro + venda_marco + venda_abril
		media_vendas = total_vendas / 4

		escreva("O total de vendas é: " + total_vendas)		
		escreva("A média das vendas é: " + media_vendas)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */