package oop.example;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote?");
        String quote = input.nextLine();

        System.out.print("Who said it?");
        String person = input.nextLine();

        System.out.printf(person + " says," + "\"%s\"", quote);
    }
}
