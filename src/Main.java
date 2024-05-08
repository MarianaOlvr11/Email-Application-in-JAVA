import entities.Email;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lName = sc.nextLine();

        Email email = new Email(fName, lName);


    }
}