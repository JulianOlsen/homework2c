import java.io.IOException;
import java.util.Scanner;

public class homework2c {
    public static void main (String[] args) throws IOException {
        int ran = (int)(Math.random()*15)+1;
        
        System.out.println("guess an integer number between 1 and 15 which the computer chose");
        System.out.println("you have 1 chances");
        System.out.println("this is a very hard game mode");
        
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();

        
        if (x<=15 && x>=1){
            if (x<ran){
                System.out.println("too small");
                System.out.println("shame the number was " +ran);
            }
            else if(x>ran){
                System.out.println("too big");
                System.out.println("shame the number was " +ran);
            }
            else if(ran==x){
                System.out.println("correct answer");
            }
        }  
    }   
}

