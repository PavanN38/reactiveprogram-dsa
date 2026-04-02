import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 2, 4, 1, 5);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List list1 = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey()).toList();
        System.out.println(list1);

    }


}

