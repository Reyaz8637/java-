public class methodprct {
    // static int max(int x,int y){
    //     if(x>y)
    //     return x;
    //     else
    //     return y;
    // }
    // public static void main(String arg[]){
    //     int a=10,b=4;
    //     // methodprct mp=new methodprct();//
    //     // System.out.println(mp.max(a,b));//
    //     System.out.println(max(a, b));

    // }
    // static void inc(int x){
    //     x++;
    //     System.out.println(x);
    // }public static void main(String[] args) {
    //     int a=10,b=15;
    //     inc(a);
    //     System.out.println(a);
    // }

    // PASSING OBJECTS// 
    // static void change(int A[],int index,int value){
    //     A[index]=value;
    // }
    // public static void main(String[] args) {
    //     int A[]={1,2,3,6,7};
    //     change(A,2,6);
    //     for (int x : A) {
    //         System.out.println(x);
    //     }
    // }

    // FINDING PRIME NUMBERS//

    // static boolean isprime(int n){
    //     for(int i=2;i<n/2;i++){
    //         if(n%i==0)
    //         return false;
    //     }return true;
         
    // }
    // public static void main(String[] args){
           
    //     System.out.println(isprime(91));

    // }

    // "FINDING GCD/HCF"//

    static int gcd(int m,int n){
        while (m!=n) {
            if(m>n)
             m=m-n;
            else n=n-m;
        }return m;
    }public static void main(String[]arg){
        
        System.out.println(gcd(35,56));
    }

}