import java.util.LinkedList;
import java.util.Scanner;

public class HealthyVegetables {
    public static void main(String[] args) {
        LinkedList<String> vegetables = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of healthy vegetables you want to add:");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the names of the healthy vegetables:");
        for (int i = 0; i < count; i++) {
            System.out.print("Vegetable " + (i + 1) + ": ");
            vegetables.add(scanner.nextLine());
        }

        System.out.println("Current list of healthy vegetables: " + vegetables);

        System.out.println("Enter a vegetable to add at the beginning:");
        String firstVegetable = scanner.nextLine();
        vegetables.addFirst(firstVegetable);
        System.out.println("List after adding at the beginning: " + vegetables);

        System.out.println("Enter the index of the vegetable to remove (0 to " + (vegetables.size() - 1) + "):");
        int removeIndex = scanner.nextInt();
        scanner.nextLine();
        if (removeIndex >= 0 && removeIndex < vegetables.size()) {
            vegetables.remove(removeIndex);
            System.out.println("List after removal: " + vegetables);
        } else {
            System.out.println("Invalid index");
        }

        System.out.println("Enter the index of the vegetable to retrieve (0 to " + (vegetables.size() - 1) + "):");
        int getIndex = scanner.nextInt();
        scanner.nextLine(); 
        if (getIndex >= 0 && getIndex < vegetables.size()) {
            String retrievedVegetable = vegetables.get(getIndex);
            System.out.println("Vegetable at index " + getIndex + ": " + retrievedVegetable);
        } else {
            System.out.println("Invalid index");
        }

        int size = vegetables.size();
        System.out.println("Size of the linked list: " + size);

        scanner.close();
    }
}

