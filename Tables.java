import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int n,r,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        for(int i=0;i<=r;i++)
        {
            if(i%2!=0)
            {
                p=n*i;
                System.out.print(n+" "+"x"+" "+i+" "+"="+" "+p);
                System.out.print("
");
            }
        }
    }
}