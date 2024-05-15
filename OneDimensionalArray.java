import java.util.Arrays;

public class OneDimensionalArray {
    private int[] array;

    // Constructor to initialize the array
    public OneDimensionalArray(int size) {
        array = new int[size];
        Arrays.fill(array, Integer.MIN_VALUE); // Fill array with MIN_VALUE
    }

    // Method to insert a value at a specified index
    public void addValue(int index, int value) {
        try {
            if (array[index] == Integer.MIN_VALUE) {
                array[index] = value;
                System.out.println("Value " + value + " inserted at index " + index);
            } else {
                System.out.println("Index " + index + " is already filled.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }

    // Method to get the value at a specific index
    public void getValue(int index) {
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }

    // Method to remove a value at a specific index or reset the entire array
    public void removeValue(int index, boolean resetAll) {
        if (resetAll) {
            Arrays.fill(array, Integer.MIN_VALUE);
            System.out.println("All values in the array have been reset.");
        } else {
            try {
                array[index] = Integer.MIN_VALUE;
                System.out.println("Value at index " + index + " has been reset.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds: " + e.getMessage());
            }
        }
    }

    // Method to search for a value in the array
    public void findValue(int value) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Value " + value + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Value " + value + " not found in the array.");
        }
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        OneDimensionalArray myArray = new OneDimensionalArray(5);
        System.out.println();
        myArray.addValue(0, 100);
        myArray.addValue(1, 200);
        myArray.addValue(2, 300);
        myArray.addValue(3, 400);
        myArray.addValue(4, 500);
        System.out.println();

        System.out.println("Array: " + Arrays.toString(myArray.array));
        System.out.println();

        myArray.getValue(0);
        myArray.getValue(1);

        myArray.removeValue(1, false);
        System.out.println("Array after removing value at index 1: " + Arrays.toString(myArray.array));
        System.out.println();

        myArray.removeValue(0, true);
        System.out.println("Array after resetting all values: " + Arrays.toString(myArray.array));
        System.out.println();

        myArray.addValue(0, 1000);
        myArray.addValue(1, 2000);
        System.out.println();
        myArray.findValue(1000);
        System.out.println();
        myArray.findValue(2000);
        System.out.println();
        myArray.findValue(3000);
        System.out.println();
    }
}
