package ads.aula2;

import java.util.Scanner;

public class aula2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nome completo
        System.out.println("Qual o seu nome? ");
        String nome = sc.nextLine();

        // curso
        System.out.println("Qual o seu curso? ");
        String curso = sc.nextLine();

        //RA
        System.out.println("Qual o seu RA? ");
        int ra = sc.nextInt();

        //Resposta
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("RA: " + ra);

    }
}
