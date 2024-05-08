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


}

