import java.lang.*;
import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        float tmp,f;
        Scanner sc=new Scanner(System.in);
        tmp=sc.nextFloat();
        f=((tmp*9)/5)+32;
        System.out.printf("%.2f",f);
    }
}