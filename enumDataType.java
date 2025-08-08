enum Dept{
    CS("john","Block A"),IT("raju","Block B"),CIVIL("sham","Block C"),ECE("Reyaz","Block C");
    // private Dept(){
    //     System.out.println(this.name());
    // }
    String head;
    String location;


    private Dept(String head ,String loc){
        this.head=head;
        this.location=loc;
    }
    public String getHead(){
        return head;
    }
    public String getLocation(){
        return location;
    }
 }
 public class enumDataType {
    public static void main(String[] args){
        Dept d=Dept.CS;
        // d.display();
        // System.out.println(d.valueOf("ECE"));

        // Dept list[]=Dept.values();
        // for(Dept x:list)
        // System.out.println(x);


        // switch (d) {
        // case CS:System.out.println("Head:john\nBlock:A");
        // break;
        // case IT:System.out.println("Head:Smith\nBlock:B");
        // break;
        // case CIVIL:System.out.println("Head: David\nBlock:C");
        // break;
        // case ECE:System.out.println("Head:Reyaz\nBlock:D");
        // break;
        // }
        System.out.println(d.getHead());
        System.out.println(d.getLocation());
    }
}
