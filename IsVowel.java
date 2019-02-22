import java.util.*;

public class IsVowel{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

        System.out.printf("Enter a single Letter: ");
		String s = in.next();

		if (s.length() != 1)
		{
            System.out.println("invalid input.");
			System.exit(0);     //Exit System.
		}

		String vowels = "aeiouAEIOU";
		int result = vowels.indexOf(s);

		if (result != -1)
		{
			System.out.printf("%s is a vowel.\n", s);
		}
		else
		{
			System.out.printf("%s is not a vowel.\n", s);
		}
	}
}
