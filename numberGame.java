package codSoftTask;
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        int score=0;
        int num = rNum.random();
        rNum.guess(num,score);
    }

    public static class rNum {
        public static int random() {
            int num;
            Random r = new Random();
            num = r.nextInt(100);
            return num;
        }

        public static void guess(int num,int score) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Number:");
                int nbr = sc.nextInt();
                if (nbr == num) {
                    score+=1;
                    System.out.println("Correct Guess");
                    System.out.println("Total Attempts:"+ score);
                    System.out.println("______Enter 1 to Play Again and 2 to exit______");
                    int ip = sc.nextInt();
                    score=0;
                    if (ip == 1) {
                        int x=random();
                        guess(x,score);
                    }else{
                        System.out.println("Total Attempt:"+score);
                    }
                }
                else if (nbr > num) {
                    score+=1;
                    System.out.println("Guessed number is greater.");
                    if (i == 2) {
                        playAgain(num,score);
                    }
                }
                else {
                    score+=1;
                    System.out.println("Guessed number is lesser.");
                    if (i == 2) {
                        playAgain(num,score);
                        }
                    }
                }
            }

        }
        public static void playAgain(int x,int y){
            Scanner sc = new Scanner(System.in);
            System.out.println("______Enter 1 to Play Again and 2 to exit______");
            int ip = sc.nextInt();
            if (ip == 1) {
                rNum.guess(x, y);
            }else{
                System.out.println("Total Attempt:"+y);
            }
    }
}

