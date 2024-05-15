package entities;

public class Password {

    private String password;
    private int defaultPasswordLength = 8;


    public Password (){

    }

    public Password (String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    protected String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$*!abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setChangePassword(String newpassword) {
        this.password = newpassword;
    }
}
