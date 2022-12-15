package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

       //A~Z
       for (int i=65; i<=90;i++){
           System.out.println((char)i+" ");
       }
        System.out.println();
        System.out.println("---------------------");

        for (char i='A'; i<='Z'; i++){
            System.out.println(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char i= 'a'; i<='z'; i++){
            System.out.println(i + " ");
        }
        for(int a=1;(int)a<11; a++){
            System.out.println("Welcome Java World");

        }
        for (char i='Z'; i>='A'; i--){
            System.out.println(i+ " ");
        }
        for (char i= 1; i<=40000; i++){
            System.out.print(i + " ");}

    }
}
