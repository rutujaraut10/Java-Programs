
import java.util.Scanner;
// Array is linear data structure which can hold elements of same kind
public class ArrExample {
   public static void main(String[] args) {
       
    int arr[] = new int[5];
    int i,min;
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter five numbers: ");

    for(i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }

    min=arr[0];                                     
    for(i=0;i<5;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
    }                                          
    System.out.println("The minimum value is: " +min);                                        
    
    /* 67 54 34 43 87
     min=arr[0]=67   
     67<67=false  
     arr[1]=54  
     54<67=ture 
     min=54
     arr[2]=34
     34<54
     min=34 */

   } 
}
