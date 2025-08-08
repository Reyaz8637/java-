public class WrapperClass {
    // Integer i=new Integer(10);
    // Integer a=10;
    // Integer b=Integer.valueOf(10);
    // byte d=15;
    // byte h=byte.valueOf("15");
    // byte bb;
    // byte e=byte.valueOf(bb);
    // short s=short.valueOf(2132);
    // float f=12.3f;
    // float g=float.valueOf("12.5");
    // double d1=double.vlaueOf(123.24);
    // character c=character.valueOf('A');
    // Boolean b1=Boolen.valueOf("true");
    public static void main(String[] args) {
        
    // int m1=15;
    // Integer m2=m1;
    // Integer m3=15;
    // System.out.println(m2.equals(m3));}

    // Integer m3=Integer.valueOf("A7",16);
    // System.out.println(m3);
    //  System.out.println(Integer.toBinaryString(12));}

    //STRING,STRING BUFFER,STRING BUILDER//
    String s1=new String("hello");
    StringBuffer s2=new StringBuffer("hello");//thread safe//
    StringBuilder s3=new StringBuilder("hello");//not thread safe//
    s1.concat("world");
    s2.append("world");
    s3.append("world");
    System.out.println(s1); 
    System.out.println(s2);
    System.out.println(s3);
    }
}
