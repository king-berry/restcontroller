package Set_Interface;

import java.util.HashSet;
import java.util.EnumSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        TestHashSet testHashSet = new TestHashSet();
        testHashSet.displayHashSet();
    }
}
class TestHashSet{
    Set<String> name = new HashSet<>();
    public void displayHashSet(){
        name.add("tèo0");
        name.add("tèo0");
        name.add("tèo1");
        name.add("tèo2");
        name.add("tèo3");
        name.add("tèo4");
        name.add("tèo5");
        // trả về hashcode
        System.out.println(name.hashCode());

        //xóa phần tử
        System.out.println(name.remove("tèo2"));
        System.out.println(name);

    }
}
class TestEnumSet{
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public void displayEnumSet(){
        Set<Days> set1 = EnumSet.of(Days.MONDAY, Days.TUESDAY);
        System.out.println(set1);

        Set<Days> set2 = EnumSet.allOf(Days.class);
        System.out.println(set2);

        Set<Days> set3 = EnumSet.noneOf(Days.class);
    }
}