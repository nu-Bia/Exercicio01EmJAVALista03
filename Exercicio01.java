// 1) Ler quatro n�meros inteiros e apresentar o resultado da adi��o e multiplica��o, baseando-se na 
// utiliza��o do conceito da propriedade distributiva. Ou seja, se forem lidas as vari�veis A, B, C, e D, 
// devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. 
// Perceba que ser� necess�rio efetuar seis opera��es de adi��o e seis opera��es de multiplica��o e apresentar 
// doze resultados de sa�da. 
package Exercicios;

import java.util.Scanner;


public class Exercicio01 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

double numero1,numero2,numero3,numero4;

System.out.println("digite o primeiro numero para que deseja que seja multiplicado e somado");
numero1= sc.nextInt();

System.out.println("digite o segundo numero para que deseja que seja multiplicado e somado");
numero2= sc.nextInt();

System.out.println("digite o terceiro numero para que deseja que seja multiplicado e somado");
numero3= sc.nextInt();

System.out.println("digite o quarto numero para que deseja que seja multiplicado e somado");
numero4= sc.nextInt();

System.out.println("A soma do numero1 com o numero2 �:" + numero1+numero2);
System.out.println("A MULTIPLICACAO do numero1 com o numero2 �:" + numero1*numero2);
System.out.println("A soma do numero1 com o numero3 �:"+ numero1+numero3);
System.out.println ("A MULTIPLICACAO do numero1 com o numero3 �:"+ numero1*numero3);
System.out.println("A SOMA do numero1 com numero4 �:"+ numero1+numero4);
System.out.println("A MULTIPLICACAO do numero1 com o numero4 �:"+ numero1*numero4);
System.out.println("A soma do numero 2 com o numero3 �:"+numero2+numero3);
System.out.println("A multiplicacao do numero 2 com o numero3 �:"+numero2*numero3);
System.out.println("A SOMA do numero2 com o numero 4 �:"+numero2+numero4);
System.out.println("A MULTIPLICACAO do numero2 com o numero4 �:" + numero2*numero4);
System.out.println("A SOMA do numero3 com o numero4 �:"+ numero3+numero4);
System.out.println("A MULTIPLICACAO do numero3 com o numero4 �:"+ numero3*numero4);


	
}
}


