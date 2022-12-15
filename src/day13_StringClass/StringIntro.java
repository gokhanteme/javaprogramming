package day13_StringClass;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Java";
        String name1 = "Java";
        String name2 = "Java";
        String name3 = "Java";

        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);

        System.out.println("---------------------------------");

        String str = "Wooden Spoon";
        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spon");

        System.out.println(str.equals(str1));

        System.out.println(str1.equals(str2));


    }

}
