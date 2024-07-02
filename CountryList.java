import java.util.ArrayList;
import java.util.Scanner;

public class CountryList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("How many countries do you wnat to add:");
        count=sc.nextInt();

        ArrayList<String> country = new ArrayList<String>();
        System.out.println("Enter the names of the countries:");
        sc.nextLine();

        for(int i=0;i<=count;i++) {
            System.out.println("Country" + i );
            String Country = sc.nextLine();
            country.add(Country);

        }
        System.out.println(country);
        }
    
}

