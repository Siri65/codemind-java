import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        int h,sp,s;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        sp=sc.nextInt();
        s=sc.nextInt();
        if(h>50 && sp>60 && s>100)
        {
            System.out.print("10");
        }
        else if(h>50 && sp>60)
        {
            System.out.print("9");
        }
        else if(sp>60 && s>100)
        {
            System.out.print("8");
        }
        else if(h>50 && s>100)
        {
            System.out.print("7");
        }
        else if(h>50 || sp>60 || s>100)
        {
            System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
    }
}