import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, String> myHashMap = new HashMap<Character, String>();
    myHashMap.put('A', "Albatross");
    myHashMap.put('B', "Bobcat");
    myHashMap.put('C', "Cat");
    myHashMap.put('D', "Duck");
    myHashMap.put('E', "Elephant");
    myHashMap.put('F', "Ferret");
    myHashMap.put('G', "Guinea Pig");

        System.out.println(myHashMap);
        System.out.println(myHashMap.get('G'));
    }
}