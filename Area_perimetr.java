import java.util.*;
public class Area_perimetr
{
    private static final double radius = 7.5;
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double area = 3.14 * (radius * radius);
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);

    }
}
