import java.util.Arrays;
import java.util.Scanner;

public class array
{
    public static void main(String[] args) {
        Scanner s=new scanner(system.in);
        system.out.ptrintln("Enter size of the array");
        int size=s.nextInt();
        String[] names=new string[size];
        for(int i=0;i<size;i++){
            System.out.println("enter"+i+"index value");
            names[i]=s.next();

        }
        System.out.println(Arrays.toString(names));
    }
}