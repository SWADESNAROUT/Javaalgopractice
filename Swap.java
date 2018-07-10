import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+ "\t"+ "b:"+b);

    }
}
