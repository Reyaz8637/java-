import java.util.*;
public class methodOverloading {
    // static int max(int x,int y){
    //     return x>y?x:y;
    // }
    // static int max(int x,int y,int z){
    //     return x>y && x>z?x:(y>z?y:z);
    // }
    // static float max(float x,float y){
    //     return x>y?x:y;
    // }
    // public static void main(String[] args) {
    //     System.out.println(max(10,5363,6));
    // }

    // "FINDING AREA"//
    // static double area(double l,double b){
    //     return l*b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(area(4,5));
    // }


//     static double area(double r){
//     return Math.PI*r*r;}

// public static void main(String[] arg){
//     System.out.println(area(5));}


    // static int reverse(int n){
    //     int rev=0;
    //     while (n>0) {
    //         int r=n%10;
    //         rev=rev*10+r;
    //         n=n/10;
    //     }return rev;
    //     }
    //     public static void main(String[] arg){
    //         System.out.println(reverse(237));
    // }

    // //REVERSE OF AN ARRAY//
    static int [] reverse(int A[]){
        int B[]=new int[10];
        for(int i=A.length-1,j=0;i>A.length;i--,j++){
            B[j]=A[i];
        }return B;
        // for (int x : B) {
        //     System.out.println(B+",");
        // }
    
    }public static void main(String[] args) {
       int A[]={0,1,2,3,4,5,6,7,8,9};
       
      reverse(A);
       
    }

    // # VALIDIATE NAME AND AGE//

//    static boolean validiate(String name){
//         return name.matches("[a-zA-Z\\s]+");
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String n;
//         System.out.println("enter name:");
//         n=sc.next();
//         System.out.println(validiate(n));
//     }

}
