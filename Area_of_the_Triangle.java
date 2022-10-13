import java.util.*;
import java.lang.*;
class Demo
{
    public static void main(String args[])
    {
        double a,b,c,ar,s,p;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        ar=(s*(s-a)*(s-b)*(s-c));
        p=Math.pow(ar,0.5);
        System.out.printf("%.2f",p);
    }
}