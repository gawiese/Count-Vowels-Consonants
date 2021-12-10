/*
////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// October 1st, 2021

// Programming Exercise 5.49 (Page 203) Count Vowels & Consonants

////////////////////////////////////////////////////////////////////////////////////
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner vAndC = new Scanner(System.in);

        System.out.println("Enter a string:");

        String userInput = vAndC.nextLine();

        userInput = userInput.toLowerCase();

        int vowels = 0;

        int consonants = 0;

        for (int c = 0; c <= userInput.length() - 1; c++) {

            if (userInput.charAt(c) == 'a' || userInput.charAt(c) == 'e' || userInput.charAt(c) == 'i' || userInput.charAt(c) == 'o' || userInput.charAt(c) == 'u')

                vowels++;

            else if (userInput.charAt(c) == 'b' || userInput.charAt(c) == 'c' ||
                    userInput.charAt(c) == 'd'|| userInput.charAt(c) == 'f'|| userInput.charAt(c) == 'g'|| userInput.charAt(c) == 'h'|| userInput.charAt(c) == 'j'||
                    userInput.charAt(c) == 'k'|| userInput.charAt(c) == 'l'|| userInput.charAt(c) == 'm'|| userInput.charAt(c) == 'n'|| userInput.charAt(c) == 'p'||
                    userInput.charAt(c) == 'q'|| userInput.charAt(c) == 'r'|| userInput.charAt(c) == 's'|| userInput.charAt(c) == 't'||
                    userInput.charAt(c) == 'v'|| userInput.charAt(c) == 'w'|| userInput.charAt(c) == 'x'|| userInput.charAt(c) == 'y' || userInput.charAt(c) == 'z')

                consonants++;
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

    }
}


