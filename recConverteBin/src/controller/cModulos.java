package controller;

public class cModulos {
	public String calcBinario (int num, String bin) {
		
		if (num == 0) { //num é o número inicial e suas divisões por 2. quando num chegar a zero, as divisões param para evitar erros.
			return bin;
		} else {
			return calcBinario(num/2, String.valueOf(num%2)) + bin; //chamada da função com o num já dividido, o dígito binário da divisão obtido e a soma do binário em uma string.
		}
	}
}
