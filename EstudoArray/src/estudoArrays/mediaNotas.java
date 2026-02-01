package estudoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*******Média de notas********\n");
		System.out.println("Quantas notas você quer informar? ");
		int opcao = entrada.nextInt();
		
		System.out.println();
		
		double[] notasAluno = new double[opcao];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Digite a nota %d: \n", i + 1);
			double valor = entrada.next();
			notasAluno[i] = valor;
		}
		
		System.out.println("Notas do aluno: " + Arrays.toString(notasAluno));
		
		double soma = 0;
		for(double nota: notasAluno) {
			soma += nota;
		}
		
		System.out.println("Média do aluno: " + soma / notasAluno.length);
		
		entrada.close();
		
	}
	
}
