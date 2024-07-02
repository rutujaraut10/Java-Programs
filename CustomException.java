
import java.util.Scanner;

public class CustomException {
    int age;
    String name;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
    }
    public void validate()
    {
        if(age>=3)
        {
            System.out.println("You have grown to up to take decision");
        }
        else{
            throw new ArithmeticException("You are lucky!!!!");
        }
    }

    public static void main(String[] args) {
        CustomException obj = new CustomException();
        obj.accept();
        obj.validate();
    }
}
