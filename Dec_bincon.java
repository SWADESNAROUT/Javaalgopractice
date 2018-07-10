import java.util.*;
public class Dec_bincon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int no = sc.nextInt();
        int quot,i=1;
        int mod[] = new int[50];

        quot = no;
        for(i=1; quot != 0 ;i++)
        {
            mod[i] = quot%2;
            quot = quot/2;

          //  System.out.println(mod[i]);
        }
        for(int j =i-1; j>0; j--)
        {
            System.out.print(mod[j]);
        }

    }
}
