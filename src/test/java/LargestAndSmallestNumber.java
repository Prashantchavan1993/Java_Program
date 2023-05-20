import java.util.Arrays;

public class LargestAndSmallestNumber {




        public static void main(String[] args) {

            int numbers[] = { 60, 80, -100, -45, 6000, 495 };
            int largest = numbers[0];
            int smallest = numbers[0];
            // Time Complexity is O(n), because we are using one for loop only
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                } else if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            System.out.println("\n given array is:" + Arrays.toString(numbers));
            System.out.println("largest number is:" + largest);
            System.out.println("smallest number is:" + smallest);

        }

    }


