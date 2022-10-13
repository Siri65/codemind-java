import java.util.*;
class Demo
{
    public static void main(String args[])
    {
        char n;
        Scanner sc=new Scanner(System.in);
        n=sc.next().charAt(0);
        switch(n)
        {
            case 'V':System.out.print("Violet");break;
            case 'I':System.out.print("Indigo");break;
            case 'B':System.out.print("Blue");break;
            case 'G':System.out.print("Green");break;
            case 'Y':System.out.print("Yellow");break;
            case 'O':System.out.print("Orange");break;
            case 'R':System.out.print("Red");break;
            case 'v':System.out.print("Violet");break;
            case 'i':System.out.print("Indigo");break;
            case 'b':System.out.print("Blue");break;
            case 'g':System.out.print("Green");break;
            case 'y':System.out.print("Yellow");break;
            case 'o':System.out.print("Orange");break;
            case 'r':System.out.print("Red");break;
            default:System.out.print("-1");
        }
    }
}