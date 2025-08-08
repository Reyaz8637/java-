import java.util.*;
public class SwtchStudentchlng {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter day number:");
        // int day=sc.nextInt();
        // switch (day) {
        //     case 1:System.out.println("monday");
        //         break;
        //     case 2:System.out.println("tuesday");
        //             break;
        //     case 3:System.out.println("wednesday");
        //             break;
        //     default:System.out.println("inavalid");
        //         break;
        // }

        // "FINDING MONTHS BY NUMBER"
            // System.out.println("enter number:");
            // int num=sc.nextInt();
            // switch (num) {
            //     case 1:System.out.println("jan");
            //         break;
            //     case 2:System.out.println("feb");
            //         break;
            //     case 3:System.out.println("march");
            //         break;
            //     case 4:System.out.println("april");
            //         break;
            //     case 5:System.out.println("may");
            //         break;
            //     case 6:System.out.println("june");
            //         break;
            //     case 7:System.out.println("july");
            //         break;
            //     case 8:System.out.println("aug");
            //         break;
            //     case 9:System.out.println("sept");
            //         break;
            //     case 10:System.out.println("act");
            //         break;
            //     case 11:System.out.println("nov");
            //         break;
            //     case 12:System.out.println("dec");
            //         break;
                
                // default:
                //     break;
            // }

            // "FINDING INTEGER NUMBERS IN WORDS"

            // System.out.println("enter number:");
            // int num=sc.nextInt();
            // switch(num){
            //     case 1:System.out.println("one");
            //             break;
            //     case 2:System.out.println("two");
            //            break;
            //     case 3:System.out.println("three");
            //             break;
            //     default:System.out.println("inavalid");
            // }

            // "FINDING DOMAIN OF A WEBSITE"

            // System.out.println("enter website:");
            // String domain=sc.next();
            // String ext=domain.substring(domain.lastIndexOf(".")+1);
            // switch(ext){
            //     case "com":System.out.println("commercial");
            //                 break;
            //     case "org":System.out.println("organize");
            //                 break;
            //     case "gov":System.out.println("government");
            //                 break;
            //     default:System.out.println("invalid");
            //     break;
            // }

            // "FINDING MENU OPTION"

            System.out.println("MENU");
            System.out.println("ADD");
            System.out.println("SUB");
            System.out.println("MUL");
            System.out.println("DIV");
            System.out.println("ENTER TWO NUMBERS:");
            int x=sc.nextInt();
            int y=sc.nextInt();
            sc.nextLine();
            System.out.println("enter option in words:");
            String option=sc.next();
            option=option.toUpperCase();
            switch(option){
                case "ADD":System.out.println("ADDITION IS "+(x+y));
                            break;
                case "SUB":System.out.println("SUBTRACTION IS "+(x-y));
                            break;
                case "MUL":System.out.println("MULTIPLICATION IS "+(x*y));
                            break;
                case "DIV":System.out.println("RATIO IS "+(x/y));
                            break;
                default:System.out.println("invalid ");
            }


    }
}
