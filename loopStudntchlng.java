import java.util.*;
public class loopStudntchlng {
    public static void main(String arg[]){
        // int i=1;
        // while(i<100){
        //     System.out.println(i);
        //     i=i*2;
        // }

        // do{
        //     System.out.println(i);
        //     i=i*2;
        // }while(i<100);

        // "FOR LOOP"
        
        // for(i=1;i<=10;i++){
        //     System.out.println(i);
        // }

        // for(i=10;i>=0;i--){
        //     System.out.println(i);
        // }

        // int i=0;
        // for(;i<10;i++){
        //     System.out.println(i);
        // }

        // int i=1;
        // for(;i<10;){
        //     System.out.println(i);
        //     i++;
        // }
        // "INFINITE LOOP"

        // int i=1;
        // for(;;){
        //     System.out.println(i);
        //     i++;
        // }

        // for(int i=0,j=1;i<=20;i++,j=j*2){
        //     System.out.println(i+" "+j);
            
        // }

        // "TABLE"

        Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number:");
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+"x"+i+"="+n*i);
        // }

        // "SUM OF NATURAL NUMBERS"

        // System.out.println("enter number of terms:");
        // int n=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        //     System.out.println("sum of"+n+"number is "+sum);
        // }

        // "FACORIAL OF NUMBERS"
        // System.out.println("ENTER A NUMBER:");
        // int n=sc.nextInt();
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        //     System.out.println("fact of "+n+" is " +fact);
        // }

        // "FINDING DIGITS"

        // System.out.println("enter a number:");
        // int n=sc.nextInt();
        // while (n>0) {
        //    int r=n%10;
        //     n=n/10;
        //     System.out.println(r);
        // }

        // "COUNTING OF NUMBERS"
        // System.out.println("enter a number:");
        // int n=sc.nextInt();
        // int count=0;
        // while (n>0) {
        //     n=n/10;
        //     count++;
        // }System.out.println(count);

        // "ARMSTRONG NUMBERS"

        // System.out.println("ENTER A NUMBER:");
        // int n=sc.nextInt();
        // int sum=0;
        // int m=n;
        // while (n>0) {
        //     int r=n%10;
        //     sum=sum+r*r*r;
        //     n=n/10;
        // }System.out.println(sum);
        // if (m==sum) {
        //     System.out.println("yes, it is a armstrong number");
        // }else{
        //     System.out.println("not a armstrong number");
        // }

        // "REVERSE OF A NUMBER"

        // System.out.println("enter a number:");
        // int n=sc.nextInt();
        // int rev=0;
        // int r;
        // while (n>0) {
        //     r=n%10;
        //     rev=rev*10+r;
        //     n=n/10;
        // }System.out.println(rev);
        
        // "PALINDROM NUMBER"
        
        // System.out.println("enter number:");
        // int n=sc.nextInt();
        // int m=n;
        // int rev=0,r;
        // while (n>0) {
        //     r=n%10;
        //     rev=rev*10+r;
        //     n=n/10;
        // }if (rev==m) {
        //     System.out.println("palindrome number");
        // }else{
        //     System.out.println("not a palindrome number");
        // }

            // "DIPLAYING REVERSE OF NUMBER IN WORDS"

            // System.out.println("enter a number:");
            // int n=sc.nextInt();
            // String str="";
            // while (n>0) {
            //     int r=n%10;
            //     n=n/10;
            //     str=str+r;
            // }System.out.println(str);
            // char c;
            // for(int i=str.length()-1;i>=0;i--){
               
            //      c=str.charAt(i);
            
            // switch (c) {
            //     case 0:System.out.println("zero ");
            //             break;
            //     case 1:System.out.println("one ");
            //             break;
            //     case 2:System.out.println("two ");
            //             break;
            //     case 3:System.out.println("three ");
            //             break;
            //     case 4:System.out.println("four ");
            //             break;
            //     case 5:System.out.println("five ");
            //             break;
            //     case 6:System.out.println("six ");
            //             break;
            //     case 7:System.out.println("seven ");
            //             break;
            //     case 8:System.out.println("eight ");
            //             break;
            //     case 9:System.out.println("nine ");
            
            //     default:
            //         break;}
            // }

            // "DIPLAYING AP"

            // System.out.println("enter initial point:");
            // int a=sc.nextInt();
            // System.out.println("enter common diffrence:");
            // int d=sc.nextInt();
            // System.out.println("enter number of terms:");
            // int n=sc.nextInt();
            // for(int i=0;i<n;i++){
            //     System.out.print(a+",");
            //     a=a+d;
            // }

            // "FINDING GP SERIES"
            // System.out.println("enter initial term:");
            // int a=sc.nextInt();
            // System.out.println("enter common ratio:");
            // int r=sc.nextInt();
            // System.out.println("enter number of terms:");
            // int n=sc.nextInt();
            // for(int i=0;i<n;i++){
            //     System.out.print(a+",");
            //     a=a*r;
            // }
 
            // "FINDING FIBONACCI SERIES"

            
            System.out.println("Enter number of terms rqd:");
            int n=sc.nextInt();
            int a=0,b=1,c;
            System.out.print(a+","+b+",");
            for(int i=0;i<n-2;i++){
                c=a+b;
                System.out.print(c+",");
                a=b;
                b=c;
            }

        
    }
}
