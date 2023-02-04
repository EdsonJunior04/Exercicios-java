package ads.aula2;

import java.util.Scanner;

public class aula2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //C = 2*PI*R
        System.out.println("Qual o raio?");
        float raio = sc.nextFloat();

        //Equação
        double resultado = (2 * 3.14159) * raio;
        
        System.out.println(resultado);

    }
}
