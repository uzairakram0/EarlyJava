import java.util.*;

public class RanNum{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        while (true){
        
        int pick = rand.nextInt(101);     //Between Zero and Hundred
        int attempt = 1;
        
        while (true)
        {
            System.out.printf("Attempt %d: Pick a number: ", attempt);
            int guess = in.nextInt();
            
            if (guess == pick)
            {
                System.out.printf("Correct!!!\n");
                break;
            }
            else if (guess < pick)
            {
                System.out.printf("Go higher.\n");
            }
            else if (guess > pick)
            {
                System.out.printf("Go Lower.\n");
            }
            attempt++;
        }
        }
    }
}
