package day16_ForLoopStringPractice;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i =='C'){
                continue;//skip the 'C' character and continue 'D'
            }

            System.out.print(i);
        }
        System.out.println("-------------------------");
        for (int i = 0; i <10 ; i++) {
            if (i %2 != 0){//skip odd numbers
                continue;
            } System.out.print(i);
        }

        System.out.println("-------------------------");
        for (int i = 0; i <11 ; i++) {//skip the even numbers
            if (i %2==0){
                continue;

            }System.out.print(i);
        }
    }
}
