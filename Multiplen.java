
import java.util.*;
public class Multiplen
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = sc.nextInt();

    for(int i =1; i<=10 ;i++)
    {
        int mul = (n * i) ;
        System.out.println(n+ "*"+ i +"="+ mul);
    }
    }

}
