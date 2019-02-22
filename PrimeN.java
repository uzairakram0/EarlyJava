import java.util.*;

public class PrimeN{
	public static void main(String[] args){
	//Scanner in = new Scanner(System.in);


    //System.out.printf("Enter an integer: ");
    //int N = in.nextInt();
    for(int j=1; true; j++)
    {
        boolean PrimeNumber = true;
        for (int i=2; i<j; i++)
        {
            if (j % i == 0)
            {
                PrimeNumber = false;
            }
        }

        if (PrimeNumber)
        {
		System.out.printf("%d is prime.\n", j);
        }
    }
}
    
}
