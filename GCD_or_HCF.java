import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int a,b,h=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=a||i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
            }
        }
        System.out.print(h);
    }
}