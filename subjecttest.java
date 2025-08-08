// class circle{
//     public double radius;
//     public double area(){
//         return Math.PI*radius*radius;
//     }
//     public double perimeter(){
//         return 2*Math.PI*radius;
//     }
//     public double circumference(){
//         return perimeter();
//     }
// }
// public class Oops {
//     public static void main(String[] args) {
//         circle c1=new circle();
//         circle c2=new circle();
//         c1.radius=2;
//         c2.radius=4;
//         System.out.println("area :"+c1.area());
//         System.out.println("perimeter:"+c1.perimeter());
//         System.out.println("circumference:"+c1.circumference());
//         System.out.println("area2:"+c2.area());
//         System.out.println("perimeter: "+c2.perimeter());
//         System.out.println("circumference:"+c2.circumference());
//     }
// }
//   DIMENSIONS OF RECTANGLE//

// class rectangle{
//     double length;
//     double breadth;
//     public double area(){
//         return length*breadth;
//     }
//     public double perimeter(){
//         return 2*(length + breadth);
//     }
//     public boolean issquare(){
//         return length==breadth;
//        }
    
// }
//         public class rectangleTest{
//             public static void main(String args[]){
//                 rectangle r1=new rectangle();
//                 r1.length=2;
//                 r1.breadth=2;
//                 System.out.println(r1.area());
//                 System.out.println(r1.perimeter());
//                 System.out.println(r1.issquare());
//             }
//         }
    // DIMENSION OF CYCLINDER//

// class cyclinder{
//     public double radius;
//     public double heigth;
//     public double lidarea(){
//         return Math.PI*radius*radius;
//     }
//     public double circumference(){
//         return 2*Math.PI*radius;
//     }
//     public double totalsurfacearea(){
//         return 2*lidarea()+circumference()*heigth;
//     } 
//     public double volume(){
//         return lidarea()*heigth;
//     }
// }
//     public class cylindertest{
//         public static void main(String[] args) {
//             cyclinder c=new cyclinder();
//             c.radius=2;
//             c.heigth=3;
//             System.out.println("lidarea:"+c.lidarea());
//             System.out.println("circumference:"+c.circumference());
//             System.out.println("total araea:"+c.totalsurfacearea());
//             System.out.println("volume: "+c.volume());
//         }
//     }
        //  ABOUT STUDENTS//
        // class student{
        //    public int rollno;
        //    public String name;
        //    public String course;
        //    public int m1,m2,m3;
        //    public int total(){
        //         return m1+m2+m3;
        //    }
        //    public float avg(){
        //     return (float)total()/3;
        //    }
        //    public char grade(){
        //     if(avg()>=60)return 'A';
        //     else return 'B';

        //    }
        //    public String details(){
        //     return "roll no:"+rollno+"\n"+"name:"+name+"\n"+"course:"+course;
        //    }
        //         }
        //     public class studenttest{
        //         public static void main(String[] args) {
        //             student s=new student();
        //             s.rollno=1;
        //             s.name="reyaz";
        //             s.course="ece";
        //             s.m1=70;
        //             s.m2=58;
        //             s.m3=90;
        //             System.out.println("total:"+s.total());
        //             System.out.println("average:"+s.avg());
        //             System.out.println("course:"+s.details());
        //         }
        //     }

        // DATA HIDING//
            
        //     class rectangle{
        //         private double length;
        //         private double breadth;
        //         public double getlength(){
        //             return length;
        //         }
        //         public void  setlength(double l){
        //             if(l>0)
        //             length=l;
        //         }
        //         public double getbreadth(){
        //             return breadth;
        //         }
        //         public void setbreadth(double b){
        //             if(b>0)
        //             breadth=b;
        //         }
        //         public double area(){
        //             return length*breadth;
        //         }
        //         public double perimeter(){
        //             return 2*(length+breadth);
        //         }
        //         public boolean issquare(){
        //             if(length==breadth)return true;
        //             else return false;
        //         } 
        //     }
        //    public  class rectangleTest{
        //         public static void main(String[] args) {
        //             rectangle r=new rectangle();
        //             r.setlength(-10.5);
        //             r.setbreadth(-5.5);
        //             System.out.println("area:"+r.area());
        //             System.out.println("perimeter:"+r.perimeter());
        //             System.out.println("is it a square:"+r.issquare());
        //             System.out.println("length:"+r.getlength());
        //             System.out.println("breadth:"+r.getbreadth());
        //         }
        //     }

        // CONSTRUCTORS//

        // class cyclinder{
        //     private int radius;
        //     private int heigth;
        //     public int getRadius(){
        //         return radius;
        //     }
        //     public int getHeight(){
        //         return heigth;
        //     }
        //     public void setRadius(int r){
        //         if(r>0)
        //         radius=r;
        //     }
        //     public void setHeight(int h){
        //         if(h>0)
        //         heigth=h;
        //     }
        //     public cyclinder(){
        //         radius=1;
        //         heigth=2;
        //     }
        //     public cyclinder(int r,int h){
        //             radius=r;
        //             heigth=h;
        //     }
        //     public double lidarea(){
        //         return Math.PI*radius*radius;
        //     }
        //     public double volume(){
        //         return lidarea()*heigth;
        //     }
             
        // }
        // public class cyclindertest{
        //         public static void main(String[] args) {
        //             cyclinder c=new cyclinder();
        //             // c.setHeight(3);
        //             // c.setRadius(4);
        //             System.out.println("lidarea:"+c.lidarea());
        //             System.out.println("volume:"+c.volume());
        //         }
        // }

        // PRODUCT AND CUSTOMER//
    
    //     class product{
    //         private String itemno;
    //         private String name;
    //         private double price;
    //         private int quantity;
    //         public String getitemno(){
    //                 return itemno;
    //         }
    //         public String getname(){
    //             return name;
    //         }
    //         public double getprice(){
    //             return price;
    //         }
    //         public int getquantity(){
    //             return quantity;
    //         }
    //          public void setprice(double p){
    //              price=p;
    //         }
    //         public void setquantity(int qty){
    //              quantity=qty;
    //         }
    //         public product(String itm){
    //             itemno=itm;
    //         }
    //         public product(String itm,String nam){
    //             itemno=itm;
    //             name=nam;
    //         }
    //         public product(String itm,String nam,double prce,int qty ){
    //                 itemno=itm;name=nam;price=prce;quantity=qty;
    //         }
    //     }
    //    public class PRODUCTtest{
    //         public static void main(String[] args) {
    //             product[] p=new product[3];
    //             p[0]=new product("itemno","name");
    //             p[1]=new product("itemno","name",double price);
                
    //         }
    //     }
            
        // COSTUMER PROBLEM//

        // class COSTUMER{
        //     private String name;
        //     private String costID;
        //     private String address;
        //     private String phoneno;
        //     public String getname(){
        //         return name;
        //     }
        //     public String getcostId(){
        //         return costID;
        //     }
        //     public String getaddress(){
        //         return address;
        //     }
        //     public String getphoneno(){
        //         return phoneno;
        //     }
        //     public void setaddress(String add){
        //         address=add;
        //     }
        //     public void setphoneno(String phn){
        //             phoneno=phn;
        //     }
        //     public COSTUMER(String nam,String costid){
        //        name=nam;
        //        costID=costid;
        //     }
        // }
        //     public class costumerTest{
        //         public static void main(String[] args) {
        //             COSTUMER[] c=new COSTUMER[3];

        //         }
        //     }
        
        // SUBJECT PROBLEM//

        class subject{
            private String subId;
            private String subname;
            private int minmarks;
            private int marksobt;
            public void subject(String subID,String subname,int minmarks,int marksobt){
                this.subId=subId;
                this.subname=subname;
                this.minmarks=minmarks;
                this.marksobt=marksobt;
            }
            public String getsubId(){
                return subId;
            }
            public String getsubname(){
                return subname;
            }
            public int getmacmarks(){
                return minmarks;
            }
            public int getmarksobt(){
                return marksobt;
            }
            public void setmaxmarks(int mm){
                minmarks=mm;
            }
            public void setmarksobt(int mo){
                marksobt=mo;
            }
            public boolean isqualified(int m){
                return m>=minmarks;
            }
            public class subjecttest{
                public static void main(String[] args) {
                    subject subs[]=new subject[3];
                    // subs[0]=new subject("s01","ds",40);
                }
            }
        }
        