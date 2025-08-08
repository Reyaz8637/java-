import java.util.Scanner;
public class ExceptionHandling {

    // public static void main(String[] args) {
    //     int a,b,c;
    //      Scanner sc=new Scanner(System.in);
    //      System.out.println("enter a,b values");
    //      a=sc.nextInt();
    //      b=sc.nextInt();
    //     try{
    //     c=a/b;
    //     System.out.println("Result: "+c);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("denominator should not be zero,try again");
    //     }
    //     System.out.println("bye");
    // }

    // // NESTED CATCH BLOCKS//
    // public static void main(String[] args) {
    //     int A[]={10,20,30,40,0};
        // try{
        // int c=A[0]/A[1];
        // System.out.println("Result: "+c);
        // System.out.println(A[5]);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("deniminator should not be zero,try again");
    //     }
    //     catch(ArrayIndexOutOfBoundsException e){
    //         System.out.println("Index is invalid");
    //     }
    //     System.out.println("bye");
    // }

    // NESTED TRY BLOCKS//
    // public static void main(String[] args) {
    //         int A[]={10,20,30,40,0};
    //         try{
    //             int c=A[0]/A[4];
    //             System.out.println("Result: "+c);
    //             try{
    //                 System.out.println(A[5]);
    //             }
    //             catch(ArrayIndexOutOfBoundsException e){
    //                 System.out.println("Index is invalid");
    //             }
    //         } 
    //         catch(ArithmeticException e){
    //             System.out.println("deniminator should not be zero,try again");
    //         }
    //         System.out.println("bye");
    // }

    // CHECKED AND UNCHECKED EXCEPTIONS//
   
    // static void fun1(){
    //     try{
    //     System.out.println(10/0);
    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //         e.printStackTrace();
    //     }
    // }
    // static void fun2(){
        
    //     fun1();
    // }
    // static void fun3(){
    //     fun2();
    // }
    // public static void main(String[] args) {
    //     fun3();
    // }

    // THROW AND THROWS //
    // static int meth1(){
    //     return 10/0;
    // }
    // static void meth2(){
    //     meth1();
    // }
    // static void meth3(){
    //     meth2();
    // }
    // public static void main(String[] args) {
    //     try{
    //         meth3();
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
        
    // }
      
    // DEMO 1//
    
    // static int area(int l,int b) throws Exception
    // {
    //     if(l<0||b<0)
    //     throw new Exception();
    //     return l*b;
    // }
    // static void meth1()throws Exception{
    //     System.out.println(area(5,-10));
    // }
    // public static void main(String[] args) //throws Exception//
    //  {
    //     try{  
    //     meth1();}
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
    // DEMO 2//
    
    // class NegativeDimensionException extends Exception{
    //     public  String toString(){
    //         return "Dimensios of a rectangle cannot be negative";
    //     }
    // }
    // public class ExceptionHandling {
    // static int area(int l,int b) throws NegativeDimensionException
    // {
    //     if(l<0||b<0)
    //     throw new NegativeDimensionException();
    //     return l*b;
    // }
    // static void meth1()throws NegativeDimensionException{
    //     System.out.println(area(5,-10));
    // }
    // public static void main(String[] args) //throws Exception//
    //  {
    //     try{  
    //     meth1();}
    //     catch(NegativeDimensionException e){
    //         System.out.println(e);
    //     }
    // }

    // FINALLY BLOCK//

    public static void main(String[] args) throws Exception{

        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("final msg");
        }
        
    }
}