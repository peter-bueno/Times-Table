/*Crie um algoritmo  que peça ao usuário para que se digite um número inteiro.
 Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("---Tabuada---\n Digite um numero para ve-la: ");
        int user_number = number.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i + " X " + user_number + " = "+ (i*user_number));
        }

        number.close();
    }
}
