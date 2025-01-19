package lab3hm2.arrayhandler;
import java.util.Arrays;
//Ramesha Javed
public class ArrayHandler {
    private int[] array;
    public ArrayHandler(int[] array) {
        this.array = array;
    }
    public void splitArrayAtKey(int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] part1 = Arrays.copyOfRange(array, 0, index);
            int[] part2 = Arrays.copyOfRange(array, index, array.length);
            System.out.println("Array Part 1: " + Arrays.toString(part1));
            System.out.println("Array Part 2: " + Arrays.toString(part2));
        } else {
            System.out.println("Key not found in the array.");
        }
    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60};
        ArrayHandler handler = new ArrayHandler(myArray);
        int keyToSearch = 40;
        handler.splitArrayAtKey(keyToSearch);
    }
}
