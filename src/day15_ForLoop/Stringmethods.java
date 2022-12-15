package day15_ForLoop;

public class Stringmethods {

    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r2 = str.isBlank();
        System.out.println(r2);

        String str2 = "Cydeo";
        boolean r3 = str2.isBlank();
        System.out.println(r3);


        System.out.println("----------------------------");

        String s1 = "CYDEO",
                s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yES".equalsIgnoreCase("Yes"));

        System.out.println("-----------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean hasJava4       = sentence.contains("Java")||sentence.contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava3);
        System.out.println(hasJava4);
        System.out.println("---------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        /*in order to ignore sensitive we first create the lower/upper case
         version of string and then compare it lower case or upper case

         */
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
