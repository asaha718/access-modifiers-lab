import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Garage anugsGarage = new Garage(); 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Add a car to the list"); 
            String userCarInput = scanner.nextLine();
            
            anugsGarage.addCar(userCarInput); 

            System.out.println(anugsGarage.getCars());
        }
        

    }
}
