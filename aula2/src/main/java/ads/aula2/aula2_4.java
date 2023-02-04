package ads.aula2;

import java.util.Scanner;

public class aula2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media, notaUm, notaDois, notaTres, notaQuatro;

        //Nota um
        System.out.println("Insira a primeira nota: ");
        notaUm = sc.nextFloat();

        //Nota dois
        System.out.println("Insira a segunda nota: ");
        notaDois = sc.nextFloat();

        //NotaTres
        System.out.println("Insira a terceira nota: ");
        notaTres = sc.nextFloat();

        //Nota quatro
        System.out.println("Insira a quarta nota: ");
        notaQuatro = sc.nextFloat();

        //Equacao da media
        media = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        //Resposta
        System.out.println("Media: " + media);
    }
}
