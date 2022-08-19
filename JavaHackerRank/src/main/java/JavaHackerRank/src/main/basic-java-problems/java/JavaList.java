import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int qu=sc.nextInt();
        for(int i=0;i<qu;i++){
            String ins=sc.next();
            if(ins.equals("Insert")){
                int index=sc.nextInt();
                int num=sc.nextInt();
                list.add(index,num);
            }
            else if(ins.equals("Delete")){
                int rem=sc.nextInt();
                list.remove(rem);
            }

        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
