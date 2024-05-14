package Map_Interface;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        TestEnumMap testEnumMap = new TestEnumMap();
        testEnumMap.displayEnumMap();

        TestHashMap testHashMap = new TestHashMap();
        testHashMap.displayHashMap();
    }
}
class TestHashMap{
    Map<Integer, String> map = new HashMap<>();

    public void displayHashMap(){
        map.put(5, "Anna");
        map.put(1, "John");
        map.put(7, "Chris");
        map.put(4, "Ryan");

        //Sử dụng Map.Entry
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }

        //Thêm 1 phần tử trùng key
        map.put(4, "Scarlett");
        System.out.println("Thêm phần tử trùng key: ");
        System.out.println(map);

        //Loại bỏ phần tử
        map.remove(5);
        System.out.println("Map sau khi loại bỏ phần tử: ");
        System.out.println(map);
    }
}
class TestEnumMap{
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public void displayEnumMap(){
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);

        enumMap.put(Day.MONDAY, "First day of the week");
        enumMap.put(Day.TUESDAY, "Second day of the week");

        System.out.println(enumMap);
    }
}
