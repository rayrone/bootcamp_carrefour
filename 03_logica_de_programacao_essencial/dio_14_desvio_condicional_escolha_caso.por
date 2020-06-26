programa
{
	
	funcao inicio()
	{
		inteiro menu = 0
		
		escreva("1 - Abrir Netflix | 2 - Abrir Amazon Prime | 3 - Abrir HBO GO | 4 - Sair")
		escreva("\nSua opção: ")
		leia(menu)

		escolha(menu)
		{
			caso 1 : // testa se o valor é igual a 1
			escreva("\nOK! Abrir Netflix!!")
			pare

			caso 2 : // testa se o valor é igual a 2
			escreva("\nOK! Abrir Amazon Prime!!")
			pare

			caso 3 : // testa se o valor é igual a 3
			escreva("\nOK! Abrir HBO GO!!")
			pare

			caso 4: // testa se o valor é igual a 4
			escreva("\nSaindo do menu...")
			pare

			caso contrario:
			escreva("\nVocê deve escolher as opções 1, 2, 3 ou 4")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */