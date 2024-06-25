import java.util.LinkedList;
import java.util.ArrayList;
public class Reverse{
    public static void main(String[]args){
        LinkedList<Integer> num=new LinkedList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num2.addAll(num.reversed());
        System.out.println("The reversed elements are:");
        for(int i =0;i<num2.size();i++){
            System.out.println(num2.get(i));
        }
    }
}
/* OUTPUT
     The reversed elements are:
     40
     30
     20
     10
 */