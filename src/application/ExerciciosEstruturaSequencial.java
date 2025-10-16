package application;

import java.util.Scanner;

public class ExerciciosEstruturaSequencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

//        int x, y, soma;
//
//        System.out.println("Infome o primeiro inteiro: ");
//        x = sc.nextInt();
//        System.out.println("Informe o segundo inteiro:");
//        y = sc.nextInt();
//
//        soma = x + y;
//
//        System.out.println(x + " + " + y + " = " + soma);
//

        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
//        double r, area;
//        double pi = 3.14159;
//
//        System.out.println("Informe o valor do raio do circulo:");
//        r = sc.nextDouble();
//
//        area = pi * Math.pow(r, 2.0);
//
//        System.out.printf("Area do circulo: %.4f", area);

        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

//        int A, B, C, D, resultado;
//
//        System.out.println("Infome o primeiro inteiro: ");
//        A = sc.nextInt();
//
//        System.out.println("Infome o segundo inteiro: ");
//        B = sc.nextInt();
//
//        System.out.println("Infome o terceiro inteiro: ");
//        C = sc.nextInt();
//
//        System.out.println("Infome o quarto inteiro: ");
//        D = sc.nextInt();
//
//        resultado = (A * B) - (C * D);
//        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + resultado);

         /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais

        int n, h;
        double v, salary;

        System.out.println("Informe o número do funcionario:");
        n = sc.nextInt();
        System.out.println("Informe o número de horas trabalhadas pelo funcionário número " + n + ":");
        h = sc.nextInt();
        System.out.println("Informe quanto o funcionário numero " + n + " recebe por hora trabalhada:");
        v = sc.nextDouble();

        salary = h * v;

        System.out.println("NUMBER = " + n);
        System.out.println("SALARY = U$ " + salary);*/

        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int cp1, cp2, np1, np2;
        double vp1, vp2, total;

        System.out.println("Informe o código da primeira peça:");
        cp1 = sc.nextInt();
        System.out.println("Informe a quantidade de peças:");
        np1 = sc.nextInt();
        System.out.println("Informe o valor unitário de cada peças:");
        vp1 = sc.nextDouble();

        System.out.println("Informe o código da segunda peça:");
        cp2 = sc.nextInt();
        System.out.println("Informe a quantidade de peças:");
        np2 = sc.nextInt();
        System.out.println("Informe o valor unitário de cada peças:");
        vp2 = sc.nextDouble();

        total = (vp1*np1) + (vp2*np2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total); */

        /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
         mostre:
         a) a área do triângulo retângulo que tem A por base e C por altura.
         b) a área do círculo de raio C. (pi = 3.14159)
         c) a área do trapézio que tem A e B por bases e C por altura.
         d) a área do quadrado que tem lado B.
         e) a área do retângulo que tem lados A e B. */

        double A, B, C, atr, ac, at, aq, ar;

        System.out.println("Informe primeiro valor:");
        A = sc.nextDouble();
        System.out.println("Informe segundo valor:");
        B = sc.nextDouble();
        System.out.println("Informe terceiro valor:");
        C = sc.nextDouble();

        atr = A*C/2.0;
        ac = 3.14159 * Math.pow(C, 2.0);
        at =  (A + B)/ 2.0 * C;
        aq = B * B;
        ar = A * B;

        System.out.printf("TRIANGULO: %.3f\n", atr);
        System.out.printf("CIRCULO:  %.3f\n", ac);
        System.out.printf("TRAPEZIO:  %.3f\n", at);
        System.out.printf("QUADRADO:  %.3f\n", aq);
        System.out.printf("RETANGULO:  %.3f\n", ar);

        sc.close();
    }
}
