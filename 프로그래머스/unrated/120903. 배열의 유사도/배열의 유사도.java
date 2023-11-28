import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> AList = Arrays.asList(s1);
        List<String> BList = Arrays.asList(s2);

        List<String> result = AList.stream()
                .filter(o -> BList.stream()
                .anyMatch(Predicate.isEqual(o))).collect(Collectors.toList());

        
        return result.size();
    }

}
