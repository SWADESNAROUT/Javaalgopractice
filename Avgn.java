import java.util.*;
public class Avgn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        float sum=0;
        for (int i =0;i < n ;i++)
        {
            int no = sc.nextInt();
            sum = sum + no;
        }
        float avg = sum/n;
        System.out.println("avg:" + avg);

    }
}
