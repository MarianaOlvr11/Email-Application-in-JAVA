package entities;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String departament;
    private int capMailBox;





    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.departament = setDepartament();
        System.out.println("DEPARTAMENT: " + this.departament);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        System.out.println("Your Email: " + firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+this.departament +".company.com");
    }



    private String setDepartament(){
        System.out.print("DEPARTAMENT CODES: \n 1 - Sales\n 2 - Development\n 3 - Accounting\n 4 - None. \n Chose a code: ");
        Scanner sc = new Scanner(System.in);
        int codeDepartament = sc.nextInt();

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

    private String password;
    private int defaultPasswordLength = 8;


    public String getPassword() {
        return password;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$*!abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }


}




