package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password ="Cydeo1990@";
boolean isStrongPassword =isStrongPassword(password);
        System.out.println("isStrongPassword = " + isStrongPassword);
    }


    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false ;// has upper case
        boolean r3 = false ;// has lower case
        boolean r4 = false ;// has special case
        boolean r5 = false ;// has digit case

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else {
                r4 = true;//special char
            }
            /*
            if (r2 && r3 && r4 && r5){ // optional
                break;
            }

            */
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        return  isStrongPassword;
    }
}
