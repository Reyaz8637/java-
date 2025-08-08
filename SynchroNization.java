// MULTITHREADING USING MONITOR//
public class myData {
    public void diaplay(String str){
        for(int i=0;i<str.length();i++){
            system.out.println(str.charAt(i));
        }
    }
}
class myThread1 extends Thread{
    myData d;
    public myThread1(myData d){
        this.d=d;
    }
    public void run(){
        d.diaplay("Hello World");   
    }   
}
class myThread2 extends Thread{
    myData d;
    public myThread2(myData d){
        this.d=d;
    }
    public void run(){
        d.diaplay("welcome");   
    }   
}
public class SynchroNization{
    public static void main(String[] args) {
        myData data=new myData();
        myThread1 t1=new myThread1(data);
        myThread2 t2=new myThread2(data);
        t1.start();
        t2.start();
    }
}   
