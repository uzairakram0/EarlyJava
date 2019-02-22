import java.util.*;

public class Circle{

	public static void main(String[] args){
	Scanner in = new Scanner (System.in);

        while(true){
	System.out.printf("Enter the radius: ");
	double radius = in.nextDouble();
	double circumfrence = 2 * Math.PI * radius;
	double area = Math.PI * Math.pow(radius,2);
	System.out.println("Circumfrence: "+ circumfrence);
	System.out.println("Area: " + area);
        }
	}
}
