import java.util.*;

public class Mtable{
    
	public static void main(String[] args){
        while(true){
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter an integer: ");
        int N = in.nextInt();
	for (int i=1; i<=N; i++)
	{
		for (int j=1; j<=N; j++)
		{
			System.out.printf("%3d ", i*j);
		}
		System.out.printf("\n");
	}
        }
}
}
