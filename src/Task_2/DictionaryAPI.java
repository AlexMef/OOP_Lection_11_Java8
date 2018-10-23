package Task_2;

public class DictionaryAPI {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.add(1, "Vasilij");
        myDictionary.add(2, "Sergej");
        myDictionary.add(3, "Stepan");
        myDictionary.displayAll();
        try {
            System.out.println(myDictionary.get(4));
        } catch (IndexOutOfBoundsException ex){
            System.out.println("index is out of bounds");
        }
        System.out.println(myDictionary.size());
    }
}
