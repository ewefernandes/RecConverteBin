package controller;

public class cModulos {
	public String calcBinario (int num, String bin) {
		
		if (num == 0) { //num � o n�mero inicial e suas divis�es por 2. quando num chegar a zero, as divis�es param para evitar erros.
			return bin;
		} else {
			return calcBinario(num/2, String.valueOf(num%2)) + bin; //chamada da fun��o com o num j� dividido, o d�gito bin�rio da divis�o obtido e a soma do bin�rio em uma string.
		}
	}
}
