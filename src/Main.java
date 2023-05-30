import java.util.*;

public class Main {
    private  static  final List<Integer> nums = new ArrayList<>(List.of(1,1,2,3,4,4,5,5,6,7));
    private  static  final List<String> words = new ArrayList<>(List.of("abc","abc","abc","abcd","abcd","abcde"));

    public static void main(String[] args) {
        task1(nums);
        System.out.println("===========");
        task2(nums);
        System.out.println("===========");
        task3(words);
        System.out.println("===========");
        task4(words);
        System.out.println("===========");

    }
    private static void task1(List<Integer> nums) {
        for (int num: nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    private static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (int num: nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    private static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    private static void task4(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)){
                int wordsCount = wordsMap.get(word) +1;
                wordsMap.put(word,wordsCount);
            } else {
                wordsMap.put(word,1);
            }
        }
        System.out.println(wordsMap);
    }
}