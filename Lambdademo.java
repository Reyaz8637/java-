// @FunctionalInterface
// interface Mylambda{
//     public void display();
// } 
// public class Lambdademo{
//     public static void main(String[] args) {
//         Mylambda m=()->{System.out.println("hello world");};
//         m.display();
//     }
// }

// PARAMETERS IN LAMBDA EXPRESSION//
// @FunctionalInterface
// interface Mylambda{
//     public void display(String str);
// } 
// public class Lambdademo{
//     public static void main(String[] args) {
//         Mylambda m=(s)->{System.out.println(s);};
//         m.display("hello world");
//     }
// } 

// CHANGE OF PARAMETERS IN LAMBDA EXPRESSION//

// @FunctionalInterface
// interface Mylambda{
//     public int add(int a,int b);
// } 
// public class Lambdademo{
//     public static void main(String[] args) {
//         Mylambda m=(a,b)->a+b;
//         System.out.println(m.add(20,30));
//     }
// } 

// METHOD REFERENCE IN LAMBDA EXPRESSION//

// @FunctionalInterface
// interface Mylambda{
//     public void display(String str);
// } 
// public class Lambdademo{
//     public static void main(String[] args) {
//         Mylambda ml=System.out::println;
//         ml.display("hello");
//     }
// } 

 

 