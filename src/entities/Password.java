package entities;

public class Password {

    private String password; // variavel para armazenar a senha


    // construtor padrão da classe Password
    public Password (){

    }


    // metodo protegido para gerar uma senha aleatória
    protected String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$*!abcdefghijklmnopqrstuvwxyz"; // define o conjunto de caracteres possíveis para a senha
        char[] password = new char[length]; // cria um vetor de caracteres para armazenar a senha

        // laço para preencher o vetor de senha com caracteres aleatórios do conjunto
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random()*passwordSet.length()); // gera um indice aleatório
            password[i] = passwordSet.charAt(random); // atribui o caractere do índice aleatório ao array de senha
        }
        return new String(password); // retorna a senha como uma String
    }

    // metodo para alterar a senha
    public void setChangePassword(String newpassword) {
        this.password = newpassword;
    }
}
