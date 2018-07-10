import java.util.Scanner;
//passing by values
public class Method1
{
        public static void average(int x, int y, int z)
    {
        Scanner sc = new Scanner(System.in);
        double avg =(x+y+z)/3;
        System.out.println("average=" + avg);

    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        average(x,y,z);

    }
}
