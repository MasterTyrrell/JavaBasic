package collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet<Object>();
        set.add(new B());

        set.add(new A());
        System.out.println(set.size());
    }
}
