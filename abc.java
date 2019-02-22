import java.util.*; //This imports java library
public class abc
{
	public static void main(String[]args)
	{
		System.out.println("Hello World!");
        //Strings vs Numbers
        System.out.println("6.3 + 12/7");
        System.out.println(6.3 + 12/7);
        
        //Power/ Exponent
        System.out.println(Math.pow(2,10));
        //Roots
        System.out.println(Math.sqrt(3));
        //Math functions
        int x = 0;
        System.out.println(Math.PI);
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(x));
        System.out.println(Math.tan(x));
        System.out.println(Math.log(x));
        
        /*Note
         Basic Programming
         Terminology
         method: function
         string: variable for text(array of letters)
         double: variable type floating point number
         int: variable type integer
         main class name: Main class is the blue print of the object each function/variable/object is labeled
         numerical expression: expressions of numbers
         variable: Stores a value
         decleration: initia;ize a variable
         assignment: assign value to vaiable
         newline character
         */
        
        /*Note
         Variable Types
         Five basic types
         int: integer values
         double: decimal values
         boolean: conditional value true/false
         String: array of chracters enclosed in double quotes
         char: array of characters enclosed in single quotes
         
         Types are not intercngable 2, 2.0, "2", '2' mean different thing
         However the values if valid can be converted through casting
         
         Variable names cannot be the same as the reserve words in java
         */
        
        int v1 = 2;
        double v2 = 2.0;
        boolean v3 = true;
        String v4 = "2";
        char v5 = '2';
        
        //Casting Example
        double price = 18.35;
        int dollars = (int) Math.round(price);
        dollars = (int) Math.floor(price);
        dollars = (int) Math.ceil(price);
        System.out.println("Rounded price: $"+dollars);
        
        /*Note
         Formatted output (printf)
         Format specifiers
         %d for integer
         %f for float
         %s for string
         %c for char
         %b for boolean
         
         /n for newline
         
         Space specifier
         %[Numerical Space].[Decimal Space]f
         */
        
        //Month Example
        int days1 = 31;
        String Month = "July";
        double Temprature = 85.3;
        char type = 'C';
        System.out.printf("There are %d days in %s\n", days1,Month);
        System.out.printf("Average Temprature in %s is %f degrees %c\n", Month, Temprature, type);
        boolean bool = true;
        System.out.printf("%s\n", bool);
        
        Scanner in = new Scanner(System.in);    //Create scanner object.
        /*Note
         Scanner Input
         String in.next() for a single word
         String in.nextLine() for more than one word
         Int in.nextInt()
         double in.nextDouble()
         */
        
        //Circumfrence and area of a circle
        System.out.printf("Enter the radius: ");
        double r = in.nextDouble();
        double circumfrence = 2*Math.PI*r;
        double area = Math.PI*Math.pow(r,2);
        System.out.println("Circumfrence: "+circumfrence);
        System.out.println("Area: "+ area);
        
        //Days in Weeks Example
        System.out.printf("Enter the number of weeks: ");
        int weeks = in.nextInt();
        final int Days_Per_Week = 7; //Value can't be changed, Constant variable
        int days = weeks*Days_Per_Week;
        System.out.printf("There are %d days in %d weeks.\n", days, weeks);
        
        //Average three numbers example
        System.out.printf("Enter the first number: ");
        double n1 = in.nextDouble();
        System.out.printf("Enter the second number: ");
        double n2 = in.nextDouble();
        System.out.printf("Enter the  third number: ");
        double n3 = in.nextDouble();
        double average = (n1+n2+n3)/3.0;
        System.out.printf("the average is %.2f\n",average);
        
        //Compute Gravity
        System.out.printf("Enter the first mass[kg]: ");
        double m1 = in.nextDouble();
        System.out.printf("Enter the second mass[kg]: ");
        double m2 = in.nextDouble();
        System.out.printf("Eneter the radius[m]: ");
        double rad = in.nextDouble();
        Double G = 6.694E-11;   //Gravitational constant
        Double gravity = G*m1*m2/Math.pow(r,2);
        System.out.printf("The force of gravity is %f\n", gravity);
        
        /*Note
         Strings
         string.substrings(starting, ending)
         string.charAt(position)
         
         Converting numbers to Strings
         Integer.toString
         Double.toString
         
         Upper case string.toUppercase
         Lower case string.toLowercase
         */
        
        //Print name initial
        System.out.printf("What is your first your name: ");
        String FirstName = in.next();
        System.out.printf("What is your last name: ");
        String LastName = in.next();
        String Name = FirstName + " " + LastName;
        System.out.printf("Hello %s!\n", Name);
        char first = FirstName.charAt(0);
        char second = LastName.charAt(0);
        System.out.printf("Your initials are %c%c.\n",first, second);
        
        /*Notes
         Conditionals
         Boolean is the variable type for conditionals
         Boolean can be expressed or hard codded as true or false or in the form of conditionals
         Number comparisons Symbols
         a==b
         a!=b
         a<b
         a>b
         a<=b
         a>=b
         String comparison syntax
         a.equals(b)
         a.compareTo(b) < 0     a comes before b
         a.compareTo(b) == 0    a equals b
         a.compareTo(b) > 0     a comes after b
         */
        
        //Month days
        System.out.printf("Enter the name of the month: ")
        String m = in.next;
        m = m.toLowercase;
        
        if ((m.equals("January")) || (m.equals("March")) || (m.equals["May"]) ||
            (m.equals("July")) || (m.equals("August")) || (m.equals("October")) ||
            (m.equals("December")))
        {
            System.out.println(m + " has 31 days.");
        }
        else if ((m.equals("April")) || (m.equals("June")) || (m.equals("September")) || (m.equals("November")))
        {
            System.ou.println(m + " has 30 days");
        }
        else if (m.equals("February"))
        {
            System.out.printf("%s has 28 days or 29 days.\n", m);
        }
        else
        {
            System.out.printf("%s is not a valid month.\n", m)
        }
        
        /*Note
         Loops
         Repeat instructions
         While Loops
         For Loops
         
         break statement forces the termination of the current loop
         continue statement skips the rest of the
         */
        
        //While Loop
        System.out.printf("Please enter an integer: ");
        
        int N = in.nextInt();
        
        int i = 1;
        while (i<=N)
        {
            System.out.println(N);
            i++;
        }
        
        //For loop with a string
        System.out.printf("please enter a word: ");
        String word = in.next();
        
        for (int i=0; i < word.length(); i++)
        {
            System.out.printf("%c\n", word.charAt(i));
        }
        
        }
        
	}
}
























