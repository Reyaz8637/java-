import java.lang.*;
import java.util.Scanner;
class traingle{
	public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
	int a,b,c;
	float s;
	double area;
	
	System.out.println("enter a and b and c ");
	a=sc.nextInt();
	
	b=sc.nextInt();
	
	c=sc.nextInt();
	s=(a+b+c)/2f;
	System.out.println("s is" +s);
 	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 System.out.println(+area);}
}
