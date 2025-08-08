public class Nestedloop {
    public static void main(String arg[]){
        for(int i=1;i<=7;i++){
            for(int j=1;j<=8;j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println("");
        }
    }
}
