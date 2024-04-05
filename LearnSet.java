import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Shiwani", 42));
        set.add(new Student("Anuj", 34));
        set.add(new Student("Babbar", 35));
        set.add(new Student("Kunal", 23));

        System.out.println(set);
    }
}
