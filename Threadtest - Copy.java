// THREAD CLASS MULTITHRADING//

//  class mythread extends Thread{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
// }
// public class MultiThreading {
//     public static void main(String[] args) {
//         mythread m=new mythread();
//         m.start();
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//         }
//     }
// }
//  SINGLE CLASS MULTHREADING//
// public class MultiThreading extends Thread{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+ "hello");
//             i++;
//         }
//     }
//     public static void main(String[] args) {
//         MultiThreading m=new MultiThreading();
//         m.start();
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//             i++;
//         }
//     }
// }
// RUNNABLE INTERFACE MULTITHREADING IN SINGLE CLASS //
//  public class MultiThreading implements Runnable{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
//     public static void main(String[] args) {
//         MultiThreading m=new MultiThreading();
//         Thread th=new Thread(m);
//         th.start();
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//             i++;
//         }
//     }
//  }
// RUNNABLE INTERFACE MULTITHREADING IN SEPARATE CLASSES/DIFFERENT CLASSES //
//  class myRunnable implements Runnable{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+"hello");
//             i++;
//         }
//     }
//  }
//  public class MultiThreading{
//     public static void main(String[] args) {
//         myRunnable m=new myRunnable();
//         Thread t=new Thread(m);
//         t.start();  
//         int i=1;
//         while(true){
//             System.out.println(i+"world");
//             i++;
//         }
//     }
//  }

// DAEMON THREADS//
class myThread extends Thread{
    public void run(){
        int count=1;
        while (true) {
            System.out.println(count++);
        }
    }
}
public class Threadtest{
    public static void main(String[] args) throws Exception {
        myThread t=new myThread();
        t.setDaemon(true); 
        t.start();
        

    }   
}