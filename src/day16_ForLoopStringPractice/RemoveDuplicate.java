package day16_ForLoopStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "alabama";
        String result = "";

        for (int i = 0; i <=str.length()-1; i++) {
            String ch = ""+ str.charAt(i);
            if (!result.contains(ch)){
                result +=ch;
            }


        } System.out.println(result);
    }
}
