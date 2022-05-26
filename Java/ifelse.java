import java.util.Scanner;
class ifelse
{
        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);

                System.out.println("enter first number");
                int a = sc.nextInt();

                System.out.println("enter b");
                int b = sc.nextInt();

                if (a>b)
                {
                        System.out.println("Number"+a+"is greater than"+b);

                }

                else if (a < b)
                {
                        System.out.println("Number"+a+"is less than"+b );
                }

                else if (a == b)
                {
                        System.out.println("Number"+a+"is equal to"+b);
                }
        }
}
