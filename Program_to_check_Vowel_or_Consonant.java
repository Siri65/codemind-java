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
            case 'A':System.out.print("Vowel");break;
            case 'E':System.out.print("Vowel");break;
            case 'I':System.out.print("Vowel");break;
            case 'O':System.out.print("Vowel");break;
            case 'U':System.out.print("Vowel");break;
            case 'a':System.out.print("Vowel");break;
            case 'e':System.out.print("Vowel");break;
            case 'i':System.out.print("Vowel");break;
            case 'o':System.out.print("Vowel");break;
            case 'u':System.out.print("Vowel");break;
            default:System.out.print("Consonant");
        }
    }
}