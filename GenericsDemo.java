// public class GenericsDemo{
//     public static void main(String[] args) {
//         object obj=new String("hello");
//         // obj=new Integer(10);
//         String str=(String)obj;
//         System.out.println(str);
//     }
// }

// DEMO OF GENERICS //
public class GenericsDemo{
    public static void main(String[] args) {
        obj[0]="hi";
        obj[1]=bye;
        obj[2]=new Integer(10);
        String str;
        for(int i=0;i<3;i++){
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}