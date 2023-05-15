import java.util.*;

public class Day12 {

    // Check if a numberr is Odd or Even

    /*
     * public static void oddEven(int n) {
     * int bitMask = 1;
     * if ((n & bitMask) == 0) {
     * System.out.println(n + " is a even Number");
     * } else {
     * System.out.println(n + " ia a odd Number");
     * }
     * }
     * 
     * public static void main(String[] args) {
     * oddEven(5);
     * oddEven(8);
     * }
     * 
     */

    // Get Ith Bit

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set Ith Bit

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear Ith Bit

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    // Update Ith Bit

    public static int updateIthBit(int n, int i, int newBit) {
        // first approch
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

        /*
         * // second approch
         * n = clearIthBit(n, i);
         * int BitMask = newBit << i;
         * return n | Bitmask;
         */
    }

    // Clear Last Ith Bit

    public static int clearLIBit(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    // Clear Range of Bit

    public static int clearRangeBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // Question 1 -- Check if a number is a power of 2 or not ?

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    // Question 2 -- Count the set Bits in a number ?

    public static int countSetBits(int n) {

        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) { // check LSB
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    // Question 3 -- Fast Exponention

    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB

                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 3));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLIBit(15, 2));

        System.out.println(clearRangeBit(15, 2, 7));
        // question 1
        System.out.println(isPowerOfTwo(8));

        // question 2
        System.out.println(countSetBits(10));

        // question 3
        System.out.println(FastExpo(3, 5));
    }
}
