import entities.Email;
import entities.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // solicita os dados para o usuario
        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lName = sc.nextLine();

        Email email = new Email(fName, lName); // instancia o objeto email
        Password password = new Password(); // instancia o objeto senha

        System.out.print("Enter the capacity of MailBox(mb): "); // solicita a capacidade da caixa de email
        int cap = sc.nextInt();

        email.setCapMailBox(cap);

        System.out.println(email.toShowInfo()); // exibe as informações do e-mail criado

        // pergunta ao usuário se deseja alterar o e-mail ou a senha
        System.out.println();
        System.out.println("Do you want to change your email or password? (y/n)");
        char res = sc.next().charAt(0);

        if (res == 'Y' || res == 'y'){ // se a resposta for 'Y' ou 'y', prossegue com a alteração
            System.out.println("What do you want to change?\n" +
                    "1 - Email\n" +
                    "2 - Password\n" +
                    "3 - Both\n ");
            int change = sc.nextInt();
            if(change == 1){
                System.out.println("Enter your new email: ");
                sc.nextLine(); // limpa o buffer
                String newEmail = sc.nextLine();
                email.setAlternativeEmail(newEmail);
            } else if(change == 2 ){
                System.out.println("Enter your new password: ");
                sc.nextLine(); // limpa o buffer
                String newPassword = sc.nextLine();
                password.setChangePassword(newPassword);
            } else {
                System.out.println("Enter your new email: ");
                sc.nextLine(); // limpa o buffer
                String newEmail = sc.nextLine();
                email.setAlternativeEmail(newEmail);

                System.out.println("Enter your new password: ");
                String newPassword = sc.nextLine();
                password.setChangePassword(newPassword);

            }

            // exibe as informações atualizadas do e-mail
            System.out.println();
            System.out.println("UPDATE DATES: \n" + email.toShowInfo());

        }



    }
}