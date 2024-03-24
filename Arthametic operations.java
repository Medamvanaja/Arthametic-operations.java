import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("");
            System.out.println("enter the two numbers to perform operations");
            System.out.println("enter the first number:");
            int x=s.nextInt();
            System.out.println("enter the second number:");
            int y=s.nextInt();
            System.out.println("chose the operation you want to do:");
            System.out.println("choose 1 for addition");
            System.out.println("choose 2 for subtraction");
            System.out.println("choose 3 for multiplication");
            System.out.println("choose 4 for division");
            System.out.println("choose 5 for modulus");
            System.out.println("choose 6 for exit ");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add=x+y;
                System.out.println("result="+add);
                break;
                case 2:
                    int sub;
                    sub=x-y;
                    System.out.println("result="+sub);
                    break;
                case 3:
                    int mul;
                    mul=x*y;
                    System.out.println("result=" +mul);
                    break;
                    case 4:
                        float div;
                        div=x/y;
                        System.out.println("result=" +div);
                        break;
                        case 5:
                            int mod;
                            mod=x%y;
                            System.out.println("result=" +mod);
                            break;
                            case 6:
                                System.exit(0);
                            
                            
            }
        }     
    }
}
