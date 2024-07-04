import java.util.*;
public class Alpha{
    public static void main(String[]args){
       int size=6;
       
       for(int i=0;i<=size;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)('a'+j)+" ");
        }
        System.out.println();
       }
    }
}
/*OUTPUT */
/*
  a
  a b
  a b c 
  a b c d
  a b c d e
  a b c d e f
  a b c d e f g
 */