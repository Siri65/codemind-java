import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int x;
        int s=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            s=s+i;
        }
        System.out.print(s);
    }
}