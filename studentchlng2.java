import java.util.*;
public class studentchlng2 {
    public static void main(String args[]){
        // int n;
        // System.out.println("enter a number:");
        Scanner sc =new Scanner(System.in);
        // n=sc.nextInt();
        // if(n%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
        // int age;
        // System.out.println("Enter age:");
        // age=sc.nextInt();
        // if(age>=14 && age<=55){
        //     System.out.println("young");
        // }
        // else{
        //     System.out.println("not young");
        // }
        // "GRADE OBTAINING"
        // int m1,m2,m3;
        // System.out.println("enter m1:");
        // m1=sc.nextInt();
        // System.out.println("enter m2:");
        // m2=sc.nextInt();
        // System.out.println("enter m3:");
        // m3=sc.nextInt();
        //  int total=m1+m2+m3;
        //  int avg=total/3;
        //  if(avg<=70 && avg>60){
        //     System.out.println("A");}
         
        //  else if(avg<=60 && avg>50){
        //     System.out.println("B");
        //  }
        //  else if(avg<=50 && avg>40){
        //     System.out.println("c");
        //  }
        //  else if(avg<=40 && avg>30){
        //     System.out.println("f");
        //  }
        //  else{
        //     System.out.println("f");
        //  }
        
        // "RADIX OF A NUMBER"
        // System.out.println("ENTER NUMBER:");
        // String num=sc.next();
        // if(num.matches("[01]+")){
        //     System.out.println("binary radix=2");
        // }
        // else if(num.matches("[0-9]+")){
        //     System.out.println("decimal radix=10");
        // }
        // else if(num.matches("[0-7]")){
        //     System.out.println("oct radix=8");
        // }
        // else if(num.matches("[0-9A-F]")){
        //     System.out.println("hex radix=16");
        // }
        // else{
        //     System.out.println("not a number");
        // }
            // "FINDING DAYS BY NUMBERS"

            // System.out.println("enter number:");
            // int x=sc.nextInt();
            // if(x==1){
            //     System.out.println("monday");
            // }
            // else if(x==2){
            //     System.out.println("tuesday");
            // }
            // else if(x==3){
            //     System.out.println("wednesday");
            // }
            // else if(x==4){

            //     System.out.println("thursday");
            // }
            // else if(x==5){
            //     System.out.println("friday");
            // }
            // else if(x==6){
            //     System.out.println("saturday");
            // }
            // else if(x==7){
            //     System.out.println("sunday");
            // }
            // else{
            //     System.out.println("invalid day number");
            // }
            // "FINDING TYPE OF WEBSITE AND PROTOCOL USED"

            System.out.println("enter url:");
            String url=sc.next();
             String protocol=url.substring(0,url.indexOf(":"));
            if (protocol.equals("http")) {
                System.out.println("hyper text transfer protocol");
            }else if (protocol.equals("ftp")) {
                System.out.println("file transfer protocol");
            }else{
                System.out.println("other");
            }
          
            String type=url.substring(url.lastIndexOf(".")+1);
            if(type.equals("com")){
                System.out.println("commercial website");
            }else if(type.equals("net")){
                    System.out.println("network website");
            }else if(type.equals("org")){
                System.out.println("organisation website");
            }
            

    }
}
