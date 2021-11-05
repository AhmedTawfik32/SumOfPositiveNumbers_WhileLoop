/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumpositivenumbersloop;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class SumPositiveNumbersLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        double sum = 0, average = 0;

        int number, count = 0;

        while (true) {
            System.out.printf("Please, enter a positive value of number %d: ", count + 1);
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sum += number;
            count++;
        }
        
        average = sum / count;

        System.out.println("The sum value is: " + sum + "\nThe average value is: " + average);

    }

}
