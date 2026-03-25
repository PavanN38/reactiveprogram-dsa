import java.util.HashMap;

public class Testing {

    public static void main(String[] args) {

        String word = "GOOGLE";

        HashMap<String, Integer> wordCount = new HashMap<>();

        wordCount.put(null, 11);
        wordCount.put("A", 10);
        wordCount.put("B", 10);
        wordCount.put("C", 10);
        wordCount.put("D", 10);

        wordCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));


    }


}

