package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:      01234567891011
         String result = ""; // contain reverse version of str
/*
         result +=str.charAt(11);
         result +=str.charAt(10);
         result +=str.charAt(9);
         result +=str.charAt(8);
         result +=str.charAt(7);
         result +=str.charAt(6);
         result +=str.charAt(5);
         result +=str.charAt(4);
         result +=str.charAt(3);
         result +=str.charAt(2);
         result +=str.charAt(1);
         result +=str.charAt(0);
*/

        for (int i=str.length()-1;i>=0;i--){//i:idex numbers of str(starting last index to index 0)
            result +=str.charAt(i);//adding each character to result
        }
        System.out.println(result);
    }
}
