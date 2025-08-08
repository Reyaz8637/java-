import java.lang.*;
import java.util.*;
public class cuboid{
	public static void main(String arg[]){
	int length,breadth,height;
	int totalArea,volume;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of lenght,breadth and height");
	length=sc.nextInt();
	breadth=sc.nextInt();
	height=sc.nextInt();
	 totalArea=length*breadth+length*height+breadth*height;
	System.out.println("area"+totalArea);}
}