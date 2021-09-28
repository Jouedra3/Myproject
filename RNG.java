/*
 * Class: CMSC 203
 * Instructor:
 * Description: A program that requires you to use functions to calculate the volume of a box and the volume of a Sphere
 * Due: 09/28/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your name here: Josue Ouedraogo

 */
import java.util.Random;
import java.util.Scanner;

public class RNG
{
    static int rand(){
        Random random = new Random();
        int number = random.nextInt(100);
        return number;
    }
    static int getCount(int c)
    {
        return c+1;
    }
   public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n=rand();
        System.out.println(n);
        @SuppressWarnings("unused")
        int c=0,count=0,l=0;
        int guess = 0 ; {      
        System.out.print("Enter your first guess ");
        while (count!=7 && guess!=n) {
        guess = scanner.nextInt();
        count=count+getCount(c);
        System.out.println("Number of guesses is " +count);
        if (guess>n) {
            System.out.println("Your guess is too high");
            System.out.println("Enter your next guess between " + 0 + "to 99");
        } else if (guess<n) {
     
            System.out.println("Your guess is too low");
            System.out.println("Enter your guess between 66 to 99");
         } else {
            System.out.println("Congratulation, you guessed correctly ");
            System.out.println("Try again ?  yes or No ");
            System.out.println("no");
            System.out.println("Thanks for playing...");
            }
        }
   }
}
}

