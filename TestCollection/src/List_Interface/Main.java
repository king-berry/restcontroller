package List_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args ){
//        TestArrayList testArrayList = new TestArrayList();
//        testArrayList.addAnimal();
//        testArrayList.disPlayArray();

//        TestLinkedList testLinkedList = new TestLinkedList();
//        testLinkedList.addLinked();
//        testLinkedList.disPlayLinked();

//        TestVector testVector = new TestVector();
//        testVector.addVector();
//        testVector.disPlayVector();

        TestStack testStack = new TestStack();
        testStack.addStack();
        testStack.disPlayStack();
    }
}
class TestArrayList{
    List<String> animalArray = new ArrayList<String>();
    public void addAnimal(){
        animalArray.add("array dog");
        animalArray.add("array cat");

        animalArray.add(1, "human");

        // lấy phần tử ở vị trí xác định
        System.out.println(animalArray.get(1));

        // kiểm tra phần tử ở đầu và cuối list
        System.out.println("if dog first: " + animalArray.indexOf("array dog"));
        System.out.println("if dog first: " + animalArray.lastIndexOf("array cat"));

    }
    public void disPlayArray(){
        for (String animal : animalArray) {
            System.out.println(animal);
        }
        Iterator<String> iterator = animalArray.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}

class TestLinkedList{
    List<String> animalLinked = new LinkedList<String>();
    public void addLinked(){
        animalLinked.add("linked dog");
        animalLinked.add("linked cat");
        animalLinked.add("linked monkey");

        // kiểm tra
        System.out.println("if linked dog exist: " + animalLinked.contains("linked dog"));

        //thay đổi
        System.out.println("change cat into: " + animalLinked.set(1, "linked big cat"));

        // lấy kích thước mảng
        System.out.println("linked array size: " + animalLinked.size());


    }


    public void disPlayLinked(){
        for(String animal : animalLinked){
            System.out.println(animal);
        }

        Iterator<String> iterator = animalLinked.iterator();
        while(iterator.hasNext()){
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}
class TestVector{
    List<String> animalVector = new Vector<>();
    public void addVector(){
        animalVector.add("vector Cat");
        animalVector.add("vector dog");

        // lấy kích thước
        System.out.println(animalVector.size());
        // kiểm tra tồn tại 1 phần tử
        System.out.println(animalVector.contains("vector dog"));
        // kiểm tra phần tử đầu cuối
        System.out.println("first string " + animalVector.indexOf("vector Cat"));
        System.out.println("last string " + animalVector.lastIndexOf("vector dog"));
    }
    public void disPlayVector(){
        for(String animal : animalVector){
            System.out.println(animal);
        }

        Iterator<String> iterator = animalVector.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}
class TestStack{
    List<String> animalStack = new Stack<>();
    public void addStack(){
        animalStack.add("vector Cat");
        animalStack.add("vector dog");
    }
    public void disPlayStack(){
        for(String animal : animalStack){
            System.out.println(animal);
        }

        Iterator<String> iterator = animalStack.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}