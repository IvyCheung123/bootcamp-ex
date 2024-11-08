import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    // System.out.print("Input an index for inserting the value: ");
    System.out.print("Input a Index Position: ");
    int indexPosition = input.nextInt();

    // System.out.print("Input the value: ");
    System.out.print("Input a new Value: ");
    int newValue = input.nextInt();

    input.close();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...
    int[] newArr = new int[my_array.length];

    for (int i = my_array.length - 1; i > indexPosition; i--) { // 9 8 7 6 5 4 3 ... 0
      my_array[i] = my_array[i - 1];
    }

    my_array[indexPosition] = newValue;
    newArr = my_array;

    System.out.println("New Array: " + Arrays.toString(newArr));
    
  }
}