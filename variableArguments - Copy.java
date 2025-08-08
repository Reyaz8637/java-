public class variableArguments {
    // static void showlist(int start,String...A){
    //     for(int i=0;i<A.length;i++){
    //         System.out.println(start+"."+A[i]);
    //         start++;
    //     }
    // }
    // public static void main(String []args) {
    // //    show(0,1,2,3); 
    //       showlist(5,"jhlfw","jkl","ehbwef","hjgefwhj");
    // }

    // FINDING MAX VALUE//

        // static int max(int...A){
        //         if(A.length==0)return Integer.MIN_VALUE;
        //         int max=A[0];
        //         for(int i=1;i<A.length;i++)
        //         if(A[i]>max)max=A[i];
        //         return max;
        // }public static void main(String[] args) {
        //     System.out.println(max());
        //     System.out.println(max(10,23));
        //     System.out.println(max(203,7683));
        // }
        // FINDING SUM OF ELEMENTS//

        // static int sum(int...A){
        //     int s=0;
        //     for(int i=0;i<A.length;i++)
        //     s=s+A[i];
        //     return s;
        // }
        // public static void main(String[] args) {
        //     System.out.println(sum(1,2,3,4));
        // }

        // DISCOUNT CALCULATION//

        static double discount(double...p){
            double s=0;
            for(int i=0;i<p.length;i++){
                s=s+p[i];
            }
            if(s<500)
                return s*0.10;
            else if(s>=500 && s<1000)return s*0.15;
            else return s*0.20;
        }public static void main(String[] args) {
            System.out.println(discount(50,100,200,150));
            System.out.println(discount(100,20,30,50));
            System.out.println(discount(1100,1100,1100));
        }
}
