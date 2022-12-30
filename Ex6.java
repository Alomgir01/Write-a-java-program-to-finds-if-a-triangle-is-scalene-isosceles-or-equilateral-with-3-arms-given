import java.util.Scanner;
public class Ex6
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Input 3 arms of a triangle:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        {
            if(a==b || b==c || c==a)
            {
                System.out.print("This is a Isosceles triangle.");
            }
            else if(a==b && b==c && a==c)
            {
                System.out.print("This is a equilateral triangle.");
            }
            else if (a!=b && b!=c && c!=a)
            {
                System.out.println("This is a scalene triangle.");
            }
            else
            {
                System.out.print("Not a triangle.");
            }

        }
    }
}
