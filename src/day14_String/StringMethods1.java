package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "      Java    Prorramming      ";
        str = str.trim();
        System.out.println("str = " + str);

        String str2 = "Java Programming Language";
        int n1 = str2.indexOf("ge");
        System.out.println("n1 = " + n1);
        int n2 = str2.lastIndexOf("g");
        System.out.println("n2 = " + n2);
        int n3 = str2.lastIndexOf("i");
        System.out.println("n3 = " + n3);

        int n4 = str2.lastIndexOf("e") + 1;
        System.out.println("n4 = " + n4);


    }

    public static class FormatFullName {
        public static void main(String[] args) {

            String firstName ="cyDEo",
                    lastNmae = "SCHOOL";

            firstName =firstName.substring(0,1).toUpperCase() +firstName.substring(1).toLowerCase();
            System.out.println(firstName);

            firstName = ("" +firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
            System.out.println(firstName);

            lastNmae =lastNmae.substring(0,1).toUpperCase() +lastNmae.substring(1).toLowerCase();
            System.out.println(lastNmae);
        }
    }
}
