// abstract class Super{
//     public Super(){System.out.println("super constructor");}
//     public void meth1(){System.out.println("meth1");}
//     abstract public void meth2();}
// class Sub extends Super{
//     public void meth2(){System.out.println("meth2");}
// }
// public class AbstractClass {
//     public static void main(String[] args) {
//        Super s=new Sub();
//        s.meth1();
//        s.meth2();
//     }
// }
abstract  class shape{
    abstract double perimeter();
    abstract double area();}
class circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;}
    public double area(){
        return Math.PI*radius*radius;}}
class rectangle extends shape{
    double length;double breadth;
    public double area(){
        // length=l;breadth=b;
        return length*breadth;}
    public double perimeter(){
         return 2*(length+breadth);
    }
    }   
public class AbstractClass{
    public static void main(String[] args) {
        circle c=new circle();
        c.radius=2;
        System.out.println(c.perimeter());
        System.out.println(c.area());
        rectangle r=new rectangle();
        r.length=1;
        r.breadth=2;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        shape s=c;
        System.out.println(s.area());
        shape S=r;
        System.out.println(S.area());
    }
}     
