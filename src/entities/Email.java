package entities;

import java.util.Scanner;

public class Email {

    private String firstName; // variavel para guardar o primeiro nome
    private String lastName; // variavel para guardar o sobrenome
    private String departament; // variavel para guardar o departamento
    private int capMailBox; // variavel para guardar a capacidade da caixa de email em megaBytes(mb)
    private String email; // variavel para guardar o email
    private String password; // variavel para guardar senha




    // // construtor da classe Email que recebe o primeiro e o último nome
    public Email(String firstName, String lastName) {

        this.firstName = firstName; // atribui o primeiro nome recebido à variável de instância
        this.lastName = lastName; // atribui o último nome recebido à variável de instância
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName); // exibe uma mensagem indicando a criação do e-mail

        this.departament = setDepartament(); // chama o método setDepartament para definir o departamento
        System.out.println("DEPARTAMENT: " + this.departament); // exibe o departamento escolhido

        Password password = new Password(); // instancia a classe Password

        this.password = password.randomPassword(8); // gera uma senha aleatória de 8 caracteres
        System.out.println("Your password is: " + this.password); // mostra a senha gerada




        System.out.println("Your Email: " + firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+this.departament +".company.com"); //mostra o email
        email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+this.departament +".company.com"; // gera o endereço de e-mail e o atribui à variável email
    }


    // metodo privado para definir o departamento com base na entrada do usuário
    private String setDepartament(){
        System.out.print("DEPARTAMENT CODES: \n 1 - Sales\n 2 - Development\n 3 - Accounting\n 4 - None. \n Chose a code: ");
        Scanner sc = new Scanner(System.in);
        int codeDepartament = sc.nextInt(); // solicita ao usuário para escolher um código de departamento

        // estrutura switch para atribuir o departamento com base no código fornecido
        switch (codeDepartament){
            case 1:
                return departament = "sales";
            case 2:
                return departament = "dev";
            case 3:
                return departament = "acc";
            case 4:
                return departament = "";
        }
        return setDepartament();
    }

    // metodo público para definir a capacidade da caixa de e-mail
    public void setCapMailBox(int capacity) {
        this.capMailBox = capacity;
    }

    // metodo público para definir um e-mail alternativo
    public void setAlternativeEmail(String altemail) {
        this.email = altemail;
    }

    // metodo público para exibir informações do e-mail
    public String toShowInfo(){
        // retorna uma string formatada com o nome, e-mail e capacidade da caixa de e-mail
        return "\n DISPLAY NAME: " + firstName + " " + lastName
                + "\nCOMPANY EMAIL: " + email
                +"\nMAILBOX CAPACITY: " + capMailBox +"mb";
    }

}




