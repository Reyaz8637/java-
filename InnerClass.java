// NESTED INNER CLASS//
// class outer{
//     int x=10;
//     inner i =new inner();
//     class inner{
//         int y=20; 
//         public void innerDisplay(){System.out.println(x+" "+y);} 
//     }
//     public void outerDisplay(){
//         // inner i=new inner();
//         i.innerDisplay();
//         System.out.println(i.y);}}
// public class InnerClass {
//     public static void main(String[] args) {
//         outer o=new outer();
//         o.outerDisplay();
//     }
// }

// // LOCAL INNER CLASS//
// class Outer{
//     public void display(){
//         class Inner{
//             public  void show(){
//                 System.out.println("hello");}}
//         Inner i=new Inner();
//         i.show();}}
//         class InnerClass{
//             public static void main(String[] args) {
//                 Outer o=new Outer();
//                 o.display();
//             }
//         }

// ANONYMOUS OBJECT//
// abstract class My{
//     abstract public void show();}
//     class Outer{
//         public void display(){
//             new My() {
//             public void show(){System.out.println("hello");}}.show();
//             // m.show();     
//             }}
//     class InnerClass{
//         public static void main(String[] args) {
//             Outer o=new Outer();
//             o.display();
//         }
//     } 
    // // DEMO INTERFACE//
    //  interface My{
    //  public void show();}
    //     class Outer{
    //         public void display(){
    //             My m=new My() {
    //             public void show(){System.out.println("hello");}};
    //             m.show();     
    //             }}
    //     class InnerClass{
    //         public static void main(String[] args) {
    //             Outer o=new Outer();
    //             o.display();
    //         }
    //     } 

    // STATIC INNER CLASS//
//     class Outer{
//         int x=10;
//         static int y=20;
//         static class Inner{
//             public void display(){System.out.println(y);}}
//     }
// public class InnerClass{
//     public static void main(String[] args) {
//         Outer.Inner m=new Outer.Inner();
//         m.display();
        
//     }
// }