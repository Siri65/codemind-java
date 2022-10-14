import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int rev=0,n,rem=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
    }
}