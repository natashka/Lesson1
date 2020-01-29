import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiPredicate;

public class Task1 {

//    static public void main (String [] args) {
//        BiPredicate<Set<String>, String> isIllegalString = (set, str) -> {
//            Set<String> set2 = new HashSet<>(Arrays.asList(str.split("")));
//            if (!set.containsAll(set2)) return true;
//            return false;
//        };
//        System.out.println(isIllegalString.test(Set.of("a", "b"), "vg"));
//    }

     public boolean predicate(Set<String> setOfStrings, String s) {
        BiPredicate<Set<String>, String> isIllegalString = (set, str) -> {
            Set<String> set2 = new HashSet<>(Arrays.asList(str.split("")));
            if (!set.containsAll(set2)) return true;
            return false;
        };
        return isIllegalString.test(setOfStrings, s);
    }
}
