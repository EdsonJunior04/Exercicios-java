package ads.aula2;

import java.util.Scanner;

public class aula2_5 {

    public static void main(String[] args) {
        float ladoQuadrado, resposta ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o lado do quadrado?");
         ladoQuadrado = sc.nextFloat();

        //Equação
         resposta = ladoQuadrado * ladoQuadrado;

        //resposta
        System.out.println("A area do quadrado e: " + resposta + "m2");
    }
}