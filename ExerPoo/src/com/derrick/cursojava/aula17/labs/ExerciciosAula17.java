package com.derrick.cursojava.aula17.labs;

import java.util.Scanner;

public class ExerciciosAula17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		// QUEST�O 01 
		/*
		int nota;
		do {
			System.out.println("Digite uma nota de 0 a 10: ");
			nota = sc.nextInt();
			
		} while (nota < 0 || nota > 10);
		
		*/
		// QUEST�O 02
		/*
		boolean infoValidas = false;
		do {
			System.out.println("Informe um nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe uma Senha: ");
			String senha = sc.nextLine();
			
			if (nome.equalsIgnoreCase(senha)) { // equals() != "=="
				System.out.println("Nome e senha de �suario inv�lidos.");
			} else {
				infoValidas = true;
			}
		} while(!infoValidas);
		*/
		
		//QUEST�O 03
		/*
		boolean prosseguir = false;
		String nome, sexo, estCivil;
		int idade, salario;
		do {
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Informe seu sal�rio: ");
		salario = sc.nextInt();
		System.out.println("Digite seu sexo: (M / F)");
		sexo = sc.next();
		System.out.println("Informe seu Estado C�vil: ('S' 'C' 'V' 'D')");
		String estCivil = sc.next();
		
		if (prosseguir == false) {
			if (nome.length() < 3) {
				System.out.println("Nome Inv�lida");
			} else if (idade < 0 || idade > 150) {
				System.out.println("Idade Inv�lida");
			} else if (salario < 0) {
				System.out.println("Sal�rio Inv�lido");
			} else if ("M".equalsIgnonoreCase(sexo) || "F".equalsIgnonoreCase(sexo)) {
				System.out.println("Sexo Inv�lido");
			} else if (!"S".equalsIgnonoreCase(estCivil) || !"C".equalsIgnonoreCase(estCivil) || !"V".equalsIgnonoreCase(estCivil) || !"D".equals(estCivil)) {
				System.out.println("Estado C�vil Inv�lido");
			}
			prosseguir = true;
		}
		
		} while (prosseguir != false);
		*/
		
		/*
		//QUEST�O 04
		double paisA = 80000;
		double paisB = 200000;
		int cont = 0;
		while (paisA < paisB){
			paisA += (paisA/100) * 3; //176.000 em 4 anos
			paisB += (paisB/100) * 1.5; //212.000 en 4 anos
			cont++;
		} 
		System.out.println("Pais A: " + paisA);
		System.out.println("Pais A: " + paisB);
		System.out.println("Qtd anos: " + cont);
		*/
		
		/*
		// QUEST�O 05
		String continuar;
		 do {
			System.out.println("Informe o n�mero de habitantes do Pais A: ");
			double paisA = sc.nextDouble();
			System.out.println("Informe a taxa de crescimento do Pais A: ");
			double taxaCresA = sc.nextDouble();
			System.out.println("Informe o n�mero de habitantes do Pais B: ");
			double paisB = sc.nextDouble();
			System.out.println("Informe a taxa de crescimento do Pais B: ");
			double taxaCresB = sc.nextDouble();
			int anos = 1;
			double novoA = 0;
			double novoB = 0;
			do {
				novoA = paisA + (paisA * (taxaCresA * anos)); 
				novoB = paisB + (paisB * (taxaCresB * anos));
				anos++;
			} while (novoA < novoB);
			System.out.println("Ser� necess�rio " + anos + " anos para o Pais A superar a taxa de crescimeno do Pais B.");
			System.out.println(novoA + " " +novoB);
			System.out.println("Deseja fazer uma nova compara��o: (S/N)");
			continuar = sc.next();
		} while (continuar != "N");
		*/
		
		/*
		//QUEST�O 06
		int num = 20;
		String aoLado = " ";
		//for (int i = 0; i <= num; i++) {
		//	System.out.println(i);
		//}
		for (int i = 0; i <= num; i++) {
			aoLado += " " + i + " ";
		}
		System.out.println(aoLado);
		*/
		
		/*
		//QUEST�O 09
		for (int i = 0; i < 50; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
		*/
		
		/*
		//QUEST�O 12
		System.out.println("Informe o n�mero da tabuada para ser exibida: ");
		int tabuada = sc.nextInt();
		String acumulador = " ";
		for (int i = 0; i <= 10; i++) {
			acumulador = tabuada + " x " + i + " = " + (tabuada*i);
			System.out.println(acumulador);
		}
		*/
		
		/*
		//QUEST�O 15
		System.out.println("Digite o n-�simo n�mero da s�rie de fibonacci: ");
		int n = sc.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print(primeiro + " " + segundo + " ");
		
		for (int i = 3; i <= n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
		}
		*/
		
		/*
		//QUEST�O 16
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.print(primeiro + " " + segundo + " ");
		
		while(proximo <= 500) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " ");
		}
		*/
		
		/*
		int vetor[] = new int[6];
		for (int i = 1; i < 6; i++) {
			if (vetor[i] == 0) {
				System.out.println("Informe o " + i + "� n�mero: ");
				vetor[i] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < vetor.length; i++) {
			System.out.printf("v[%d] = %2d\n", i , vetor[i]);
		}

		for (int j = 0; j < vetor.length -1; j++) {
			for (int i = 0; i < vetor.length -1; i++) {
				if (vetor[i] > vetor[i+1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i+1]; // 10 20 30 40 50
					vetor[i+1] = aux;
				}
			}
		}
		
		System.out.printf("VETOR ORDENADO");
		for (int i = 1; i < vetor.length; i++) {
			System.out.printf("v[%d] = %2d\n", i , vetor[i]);
		}
		*/
		
		/*
			//QUEST�O 07
			System.out.println("Digite o 1� n�mero: ");
			int num1 = sc.nextInt();
			System.out.println("Digite o 2� n�mero: ");
			int num2 = sc.nextInt();
			System.out.println("Digite o 3� n�mero: ");
			int num3 = sc.nextInt();
			System.out.println("Digite o 4� n�mero: ");
			int num4 = sc.nextInt();
			System.out.println("Digite o 5� n�mero: ");
			int num5 = sc.nextInt();
			
			int max = 0;
			for (int i = 1; i <=5; i++) {
				if (num1 > num2) {
					if (num1 > num3) {
						if (num1 > num4) {
							if (num1 > num5) {
								max = num1;
							}
						}
					}
				} else if (num2 > num3) {
					if (num2 > num4) {
						if (num2 > num5) {
							max = num2;
						}
					}
				} if (num3 > num4) {
					if (num3 > num5) {
						max = num3;
					}
				} else if (num4 > num5) {
					max = num4;
				} else {
					max = num5;
				}
			}
			System.out.println("O maior n�mero �: " + max);
		*/
		
		/*
		//QUEST�O 14
		int par = 0;
		int impar = 0;
		for (int i=1; i <=10; i++) {
			System.out.println("Informe o " + i + "� n�mero: ");
			int numero = sc.nextInt();
			if (i == 1) {
				int num1 = numero;
				if (num1 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else if (i == 2) {
				int num2 = numero;
				if (num2 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} if (i == 3) {
				int num3 = numero;
				if (num3 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else if (i == 4) {
				int num4 = numero;
				if (num4 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} if (i == 5) {
				int num5 = numero;
				if (num5 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else if (i == 6) {
				int num6 = numero;
				if (num6 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} if (i == 7) {
				int num7 = numero;
				if (num7 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else if (i == 8) {
				int num8 = numero;
				if (num8 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} if (i == 9) {
				int num9 = numero;
				if (num9 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			} else if (i == 10) {
				int num10 = numero;
				if (num10 % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
			
		}
		System.out.println("Qtd de n�meros pares: " + par);
		System.out.println("Qtd de n�meros �mpares: " + impar);
	    */
		
		//QUEST�O 17 FATORIAL
		
		/*
		//QUEST�O 18
		System.out.println("Informe um n�mero: ");
		int num = sc.nextInt();
		int primo = 0;
		String divisivel = " ";
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				primo++;
				divisivel += i + " ";
			}
				
		}
		
		if (primo == 2) {
			System.out.println("� um n�mero primo!!!");
		} else {
			System.out.println("N�o � um n�mero primo, pois � divis�vel por: " + divisivel);
		  }
		*/
		
		
		/*
		//QUEST�O 19
		System.out.println("A m�dia se aplica a quantas notas: ");
		int n = sc.nextInt();
		int soma = 0;
		int media = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Dig�te a "+ i +"� nota: ");
			soma += sc.nextInt();
		}
		media = soma/n;
		System.out.println("A m�dia das notas s�o exatamente: " + media);
		*/
		
		//QUEST�O 26
		/*
		System.out.println("Informe um n�mero para o c�lculo fatorial: ");
		int fatorial = sc.nextInt();
		int aux1= fatorial;
		int aux = 0;
		String acumulador = " ";
		for (int i = fatorial; i > 0; i--) {
			if (fatorial == i) {
				aux = i *(fatorial-1);	
			} else {
				aux += i * (i-1);
			}
			acumulador += " " + (aux1--) + " .";
		}
		System.out.println("O fatorial de " + fatorial + " �: "+ acumulador + " = " + aux);
		*/
	}
}




















