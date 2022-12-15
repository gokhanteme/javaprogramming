package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        int k = 1;
        while (k<=10){
            System.out.println(k);
            k ++;
        }
        System.out.println("-------------------");
        int j = 1;
        do {
            System.out.println(j);
            j ++;
        }while (j <=10);
    }
}
