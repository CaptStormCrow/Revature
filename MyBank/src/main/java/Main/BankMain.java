package Main;

import java.util.Scanner;

public class BankMain {
    private static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Welcome to The Bank!");
        String userInput = "";
        while(!userInput.equals("logout")){
            System.out.println("Select an option:");
            userInput = scan.next();
        }
    }
}
