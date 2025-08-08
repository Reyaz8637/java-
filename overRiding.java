// class Super{
//     public void display(){
//         System.out.println("super class display");
//     }
// }
// class sub extends Super{
//     public void display(){
//         System.out.println("sub class display");
//     }
// }
// class overRiding{
//     public static void main(String[] args) {
//         Super su=new sub();
        
//         su.display();
        
//     }
// }
   
// class TV{
//     public void switchON(){System.out.println("tv is siwtch on ");}
//     public void changeChannel(){System.out.println("TV channel changed");}}
// class smartTV extends TV{
//     public void switchON(){System.out.println("smartTV switchON");}
//     public void changeChannel(){System.out.println("smartTV channelChanged");}
//     public void browse(){System.out.println("SmartTv browser");}}
// class overRiding{
//     public static void main(String[] args) {
//         TV t=new smartTV();
//         t.switchON();
//         t.changeChannel();   
//     }  
// }

class car{
      void carStart(){System.out.println("car started");}
      void changegear(){System.out.println("gear is changed");}
      void accelerate(){System.out.println("car accelerate");}}
class luxarycar extends car{
    public void changegear(){System.out.println("luxary gear changed");}
    public void openroof(){System.out.println("roof opend");}}
class overRiding{
   public static void main(String[] args) {
    car c=new luxarycar();
    c.carStart();
    c.changegear();
    c.accelerate();
    // c.openroof();
   }
}
    // DYNAMIC METHOD DISPATCH//
// class Super{
//     public void meth1(){System.out.println("meth1");}
//     public void meth2(){System.out.println("meth2");}}
// class Sub{
//     public void meth2(){System.out.println("meth()2");}
//     public void meth3(){System.out.println("meth3");}}
// class overRiding{
//     public static void main(String[] args) {
//         Super s=new Sub();
//         // s.meth1();
//         s.meth1();
//         s.meth2();
//     }
// }