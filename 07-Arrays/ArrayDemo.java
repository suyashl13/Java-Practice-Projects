public class ArrayDemo {
    public static void main(String[] args) {
        // Declaration of simple array.
        int[] numberArray = {1,2,3,4,5};

        // Assigning new values 
        numberArray[2] = 1;

        // Printing Elements in array
        for (int i : numberArray) {
            System.out.println("Array element: " + i);
        }

        // Another Way of declaration
        int [][] twoDimentionalArray = new int[4][4];

        // Multiplication of rows and columns.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimentionalArray[i][j] = i*j;
            }
        }

        // Print 2D Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDimentionalArray[i][j] + " ");
            }
            System.out.println();
        }

        // Just Fill Random values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimentionalArray[i][j] = (int) (Math.random() * 100);
            }
        }

        // Printing 2D Array using foreach loop.
        for (int[] is : twoDimentionalArray) {
            for (int is2 : is) {
                System.err.print(is2 + "\t");
            }
            System.out.println();
        }

        // Example of Jagged Array.
        int [][] nums = new int[3][]; // Arrays inside main array has variable size.

        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] is : nums) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }
    }
}
