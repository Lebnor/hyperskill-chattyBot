package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {

        greet("Bot", "2020"); 
        remindName();
        guessAge();
        count();
        // ...
        test();

        end();
    }
     
    // greeting header message
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    // getting your name
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    // getting your age
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    // perform count upto your given number
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }

    }

    // a one-option question to test you
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the best programming language?");
        System.out.println("1. Perl");
        System.out.println("2. Python");
        System.out.println("3. Java");
        System.out.println("4. C#");
        while (true) {
            int guess = scanner.nextInt();
            if (guess == 3) {
                break;
            } else {
                System.out.println("Please, try again");
            }
        }
        
    }

    // ending message
    static void end() {
        System.out.println("Congratulations, have a nice day!"); 
    }
}
