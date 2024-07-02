import java.util.Scanner;

public class customexp1 {
    public static void check(int a) {
        {
            if(a<18)
            {
                throw new ArithmeticException("You are not eligible for voting");
            }
            else
            {
                System.out.println("It's your right to vote");
            }
        }

    }

    public static void main(String[] args) {
        customexp1 obj=new customexp1();
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter your age");
        int age = sc.nextInt();
        obj.check(age);
    }
}
