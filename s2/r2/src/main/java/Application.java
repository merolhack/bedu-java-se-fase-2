/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int counter = 0;
        int option = 0;

        ICommand incrementOneCommand = new IncrementOneCommand();
        ICommand incrementTenCommand = new IncrementTenCommand();
        ICommand multiplyCommand = new MultiplyCommand();

        List<ICommand> myCounters = new ArrayList<>();
    
        while (option != 5) {
            System.out.println("\nCurrent value: " + counter);
            System.out.println("Choose an option:");
            System.out.println("1. Increment the counter by one");
            System.out.println("2. Multiply the counter by two");
            System.out.println("3. Increment the counter by ten");
            System.out.println("4. Undo the last change");
            System.out.println("5. Exit");

            option = sc.nextInt();
    
            switch (option) {
                case 1:
                    // counter += 1;
                    counter = incrementOneCommand.execute(counter);
                    myCounters.add(incrementOneCommand);
                break;
                case 2:
                    // counter *= 2;
                    counter = multiplyCommand.execute(counter);
                    myCounters.add(multiplyCommand);
                break;
                case 3:
                    // counter += 10;
                    counter = incrementTenCommand.execute(counter);
                    myCounters.add(incrementTenCommand);
                break;
                case 4:
                    if (myCounters.size() > 0) {
                        // Calculate index of last element
                        int index = myCounters.size() - 1;
                        // Get the element of the list
                        ICommand lastCommand = myCounters.get(index);
                        if (lastCommand != null) {
                            counter = lastCommand.unExecute(counter);
                        }
                        // Delete last element by passing index
                        myCounters.remove(index);
                    } else {

                    }
                break;
            }
        }
    }
}