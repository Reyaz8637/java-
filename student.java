public class student {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
         int i =str.indexOf("@");
         System.out.println(i);
         String uname = str.substring(0,i);
         System.out.println("username:" +uname);
         String domain=str.substring(i++,str.length());
         System.out.println("domainname:" +domain);
         int j= str.indexOf(".");
         String name=domain.substring(0,j);
         System.out.println(name.equals("gmail"));
}
}