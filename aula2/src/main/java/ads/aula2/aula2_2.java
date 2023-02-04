package ads.aula2;

import java.util.Scanner;

public class aula2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nome
        System.out.println("Insira o seu nome: ");
        String nome = sc.nextLine();

        //Idade
        System.out.println("Insira a sua idade: ");
        int idade = sc.nextInt();

        //Peso
        System.out.println("Insira o seu peso: ");
        float peso = sc.nextFloat();

        //Resposta
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Seu peso: " + peso);

    }
}
