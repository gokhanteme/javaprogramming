package day32_Constructors;

public class LifeTest {
    public static void main(String[] args) {

        Life myLife =new Life();

        myLife.startLife();


        while (!myLife.makeSuccess()){
            myLife.tryAgain();
            if (myLife.death()){
                break;
            }
            if (myLife.age++==100){
                myLife.isDead=true;
            }


        }
    }
}
