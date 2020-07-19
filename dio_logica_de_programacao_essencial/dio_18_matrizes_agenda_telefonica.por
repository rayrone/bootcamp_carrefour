programa
{
	
	funcao inicio()
	{
		cadeia agenda[][] = {{"João", "São Paulo", "(11) 9999-5241"}, {"Maria", "Riberão Preto", "(16) 9999-8596"}, {"Ana", "Manaus", "(92) 9999-8574"}}
		inteiro contador = 0

		faca
		{
			escreva("Nome: " + agenda[contador][0] + "\nCidade: " + agenda[contador][1] + "\nTelefone: " + agenda[contador][2] + "\n\n")
			contador++
		} enquanto(contador <= 2)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */