import java.util.Random;

public class RSP {
    public static void main(String[] args){
        String[] hands={"Rock","Paper","Scissors"};
        Random r=new Random();
        String hand=hands[r.nextInt(3)];
        System.out.println("COM:"+hand);
        if(args[0].equals("Rock")) ProgA(hand);
        if(args[0].equals("Paper")) ProgB(hand);
        if(args[0].equals("Scissors")) ProgC(hand);
    }

    public static void ProgA(String judge){
        if(judge.equals("Rock")) System.out.printf("Draw");
        if(judge.equals("Paper"))  System.out.printf("You Lose");
        if(judge.equals("Scissors"))  System.out.printf("You win");
    }

    public static void ProgB(String judge){
        if(judge.equals("Rock"))  System.out.printf("You win");
        if(judge.equals("Paper"))  System.out.printf("Draw");
        if(judge.equals("Scissors"))  System.out.printf("You lose");
    }

    public static void ProgC(String judge){
        if(judge.equals("Rock"))  System.out.printf("You lose");
        if(judge.equals("Paper"))  System.out.printf("You win");
        if(judge.equals("Scissors"))  System.out.printf("Draw");
    }
}