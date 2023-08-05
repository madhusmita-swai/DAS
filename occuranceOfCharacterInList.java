import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occuranceOfCharacterInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Welcome", "to", "the", "java", "world");
        Map<Character, Long> charFrequency = words.stream().flatMap(x->x.chars().mapToObj(c->(char)c)).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charFrequency);
    }
}
