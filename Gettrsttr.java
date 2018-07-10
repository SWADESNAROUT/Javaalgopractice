public class Gettrsttr
{
    public static void main(String args[])
    {
        Setget obj = new Setget();
        obj.setNoofempl(45);
        System.out.println(obj.getNoofempl());

    }
}

class Setget
{
    private int noofempl = 0;

    public void setNoofempl(int x)
    {
        noofempl = x;
    }
    public int getNoofempl()
    {
        return noofempl;
    }
}

