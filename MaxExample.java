import java.util.Scanner;

public class MaxExample {
    public static void main(String[] args) {
       
    int arr[] = new int[5];
    int i,max;
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter five numbers: ");

    for(i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }

    max=arr[0];                                     
    for(i=0;i<5;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }                                          
    System.out.println("The maximum value is: " +max);                                        
}  
}
