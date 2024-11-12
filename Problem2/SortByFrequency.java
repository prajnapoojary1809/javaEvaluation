package Problem2;

import java.util.*;

public class SortByFrequency {
        public static void main(String[] args) {
            int[] arr = {12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};
            int[] sortedArr = sortByFrequency(arr);
            System.out.println(Arrays.toString(sortedArr));
        }

        public static int[] sortByFrequency(int[] arr) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            list.sort((a, b) -> {
                int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
                if (freqCompare == 0) {
                    return Integer.compare(a, b);
                }
                return freqCompare;
            });

            int[] sortedArr = new int[arr.length];
            for (int i = 0; i < list.size(); i++) {
                sortedArr[i] = list.get(i);
            }

            return sortedArr;
        }
    }


