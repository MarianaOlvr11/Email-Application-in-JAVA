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

        System.out.print("Enter the capacity of MailBox: ");
        int cap = sc.nextInt();

        email.setCapMailBox(cap);

        System.out.println(email.toShowInfo());

        System.out.println();
        System.out.println("Do you want to change your email or password? (y/n)");
        char res = sc.next().charAt(0);

        if (res == 'Y' || res == 'y'){
            System.out.println("What do you want to change?\n" +
                    "1 - Email\n" +
                    "2 - Password\n" +
                    "3 - Both\n ");
            int change = sc.nextInt();
            if(change == 1){
                System.out.println("Enter your new email: ");
                sc.nextLine();
                String newEmail = sc.nextLine();
                email.setAlternativeEmail(newEmail);
            } else if(change == 2 ){
                System.out.println("Enter your new password: ");
                sc.nextLine();
                String newPassword = sc.nextLine();
                email.setChangePassword(newPassword);
            } else {
                System.out.println("Enter your new email: ");
                sc.nextLine();
                String newEmail = sc.nextLine();
                email.setAlternativeEmail(newEmail);

                System.out.println("Enter your new password: ");
                String newPassword = sc.nextLine();
                email.setChangePassword(newPassword);

            }
            System.out.println();
            System.out.println("UPDATE DATES: \n" + email.toShowInfo());

        }



    }
}