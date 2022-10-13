import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int t,s,b,res;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        res=(512*2)*b*s*t;
        System.out.println(res);
    }
}