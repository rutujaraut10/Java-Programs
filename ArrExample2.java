import java.util.Scanner;

public class ArrExample2 {
    public static void main(String[] args) {
       
    int arr[] = new int[5];
    int i,j,temp;
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter five numbers: ");
   
    for(i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
    
     /* Soryting using bubble sort
     67 54 34 43 87 
     54 67 34 43 87
     34 67 54 43 87 */

    for (i=0;i<5;i++) 
    {
        for (j=i+1;j<5;j++)
        {
            if(arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for(i=0;i<5;i++)
    {
        System.out.println(arr[i]);
    }
    }
}
