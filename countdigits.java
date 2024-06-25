
import java.util.*;
public class countdigits {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if(num ==0){
            System.out.print("1");
        }
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);

        }
   }
    /*       OR WE CAN USE TYPE CASTING METHOD
    *************************************************
     * int num = sc.nextInt();
     * String n = Integer.toString(num);
     * System.out.println(n.length());
     */

/*
 * OUTPUT
 * 67
 * 2
 */