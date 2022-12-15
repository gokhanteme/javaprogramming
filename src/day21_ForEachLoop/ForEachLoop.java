package day21_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
String[] words = {"Java Programmig", "Cydeo School", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0)+ "" +each.charAt(each.length()-1));
        }
    }
}
