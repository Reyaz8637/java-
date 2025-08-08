1mport java.util.Scanner;

public class arry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int A[]=new int[10];
        // int B[]={1,2,3,5,8};
        // int[] C;
        // C=new int[10];
        // B[2]=10;
        // for(int i=0;i<A.length;i++){
        //     System.out.println(A[i]);
        // }
        
        // for(int i=0;i<B.length;i++){
        //     System.out.print(B[i]+",");
        //     B[i]++;
        // }for(int x:B){
        //     System.out.println(x);
        // }

        // STUDENT CHALLENGE //
        // int A[]={1,3,5,6};
        // int sum=0;
        // for(int i=0;i<A.length;i++){
        //     sum=sum+A[i];
        // }System.out.println(sum);

        // "FINDING ELEMENT AT A INDEX //"

        // int A[]={1,4,56,67,8,7,6,5,4};
        // System.out.println("enter the key:");
        // int key=sc.nextInt();
        // for(int i=0;i<A.length;i++){
        //     if (A[i]==key) {
        //         System.out.println(i);
        //         System.exit(0);   
        //     }
               
        // } System.out.println("not found");

        // "FINDING MAXIMUM NUMBER //"

        // int A[]={1,4,56,7,78,8,7};
        // int max=A[0];
        // for(int i=0;i<A.length;i++){
        //     if (A[i]>max) {
        //         max=A[i];
        //     }
        // }System.out.println("Maximum number of this array is "+max);

        // "FINDING SECOND LARGEST NUMBER" // 

        // int A[]={3,54,6,7,6,54,87};
        // int max1=A[0];
        // int max2=A[0];
        // for(int i=0;i<A.length;i++){
        //     if (A[i]>max1) {
        //         max2=max1;
        //         max1=A[i];
        //     }else if(A[i]>max2){
        //         max2=A[i];
        //     }
        // }System.out.println(max1);
        // System.out.println(max2);

        // "FINDING LEFT ROTATION OF AN ARRAY //"

        // int A[]={1,2,3,4,5,6,7,8,9,10};
        // for(int x:A){
        //     System.out.print(x+",");
        // }
        // int temp=A[0];
        // for(int i=1;i<A.length;i++){
        //     A[i-1]=A[i];
        // }System.out.println("");
        // A[A.length-1]=temp;
        // for(int x:A){
        //     System.out.print(x+",");
        // }

        // int A[]={1,2,3,4,5,6,7,8,9,10};
        // for(int x:A){
        //     System.out.print(x+",");
        // }
        // int index=0;
        // int temp=A[10];
        // for(int i=10;i>index;i--){
        //     A[i]=A[i-1];
        // }System.out.println("");
        // A[0]=temp;
        // for(int x:A){
        //     System.out.print(x+",");
        // }

        // INSERTING AN ELEMENT IN AN ARRAY //

        // int A[]= new int[10];
        // A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;A[5]=6;
        // int n=6;
        // for(int i=0;i<n;i++){
        //     System.out.print(A[i]+",");
        // }System.out.println("");
        // int x=20;
        // int index=2;
        // for(int i=n;i>index;i--){
        //     A[i]=A[i-1];
        // }A[index]=x;
        // for(int i=0;i<n;i++){
        //     System.out.print(A[i]+",");
        // }

        // DELETING AN ELEMENT //

        // int A[]= new int[10];
        // A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;A[5]=6;
        // int n=6;
        // for(int i=0;i<n;i++){
        //     System.out.print(A[i]+",");
        // }System.out.println("");
        // int index=1;
        // for(int i=n;i>index;i--){
        //     A[i-1]=A[i];
        // }for(int i=0;i<n;i++){
        //     System.out.print(A[i]+",");
        // }System.out.println("");
        // "INCOMPLETE QUESTION"//
        
        // "COPING AN ARRAY"//

        // int A[]={0,1,2,3,4,5,6,7,8,9};
        // int B[]=new int[10];
        // for(int i=0;i<A.length;i++){
        //     B[i]=A[i];
        // }
        // for(int x:B){
        //     System.out.print(x+",");
        // }

        // "REVERSE COPYING AN ARRAY"//

        int A[]={0,1,2,3,4,5,6,7,8,9};
        int B[]=new int[10];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }for (int x : B) {
            System.out.print(x+",");
        }

        // "INCREASING SIZE OF AN ARRAY"//

        // int A[]={0,1,2,3,4};
        // System.out.println(A.length);
        // int B[]=new int[2*A.length];
        // System.out.println(B.length);
        // for(int i=0;i<A.length;i++){
        //     B[i]=A[i];
        // }
        //  A=B;
        //  B=null;
        // for (int x : A) {
        //     System.out.print(x+",");
            
        // }System.out.println("");
        // System.out.println(A.length);

    }
    
}
