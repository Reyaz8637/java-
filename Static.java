// class HondaCity{
//     static int x=20;
//     int y=10;
//     void show(){System.out.println(y+" "+x);}
//     static void display(){System.out.println(x);}
// }
// public class Static {
//     public static void main(String[] args) {
//         HondaCity h=new HondaCity();
//         h.x=100;
//         h.y=200; 
//         h.show();
//         HondaCity h1=new HondaCity();
//         h1.display();
//         h1.show();
//     }
// }
 
//  DEMO //

 class test{
    static {System.out.println("block 1");}
    static {System.out.println("block 2");} }

    public class Static{
    public static void main(String[] args) {
       
        System.out.println("main");
        test t=new test();
       }  
    }

