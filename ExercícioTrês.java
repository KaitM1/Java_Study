package br.com.generation.Lista.seis.cinco;
import java.util.Scanner;

public class ExercícioTrês {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade, menos = 0, mais = 0, cont;
        for(cont = 1; cont < 10; cont ++); {
        System.out.printf("Digite sua idade: ");
        idade = ler.nextInt();
        }
        while(idade != -99) {
            if(idade<21) {
                menos++;
            }
            else if(idade>50) {
                mais++;
            }
            System.out.printf("Digite sua idade: ");
            idade = ler.nextInt();
        }
        System.out.println("De acordo com as idade digitadas, temos: " + menos + " pessoas com menos de 21 anos e " + mais + " com mais de 50 anos.");
        ler.close();
    }
    
}
