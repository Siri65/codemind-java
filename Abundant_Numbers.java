import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}