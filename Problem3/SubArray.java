package Problem3;

public class SubArray {

        public static void main(String[] args) {

            int[] arr ={12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};

            int maxSum = Integer.MIN_VALUE;
            int startIndex = 0;

            for (int i = 0; i <= arr.length - 4; i++) {
                int currentSum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                }
            }

            System.out.println("Sum of sub-array from index " + startIndex + " to " + (startIndex + 3) + " = " + maxSum);
        }
    }

