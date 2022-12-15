package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);
        System.out.println(num + 1);//124
        System.out.println(str + 1);// 1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);// double
        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "maybe";

        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z =Double.valueOf(s3);
        System.out.println(z);
        System.out.println("----------------------------------");

// isDigit()
        char ch1 = '+';
        boolean r2 = Character.isDigit(ch1);
// isLetter()
        boolean r3 = Character.isLetter(ch1);
// special char
        boolean r4 =!Character.isLetterOrDigit(ch1);
// uppercase
boolean r5 =Character.isUpperCase(ch1);

//lowercase
 boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        System.out.println("---------------------------------");
        
        String s = "ab1cd2efg3hi4";
        
        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }

        System.out.println("sum = " + sum);

    }
}
/*
Wrapper classes:
        1. parse methods: converts String to primitive
        2. valueOf methods: converts String to wrapper class
 */

/*
PasswordValidation:
Write a program that can verify if a password is a strong password.
Characteristics of strong passwords are:
1. Password MUST be at least have 8 characters long, and
should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lower case letter
4. Password should at least contain one special
characters
5. Password should at least contain a digit
 */