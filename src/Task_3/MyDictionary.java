package Task_3;

import java.util.HashMap;
import java.util.Map;

class MyDictionary<TKey, TValue> {
    private HashMap<TKey, TValue> map = new HashMap<>();

    void add(TKey key, TValue value){
        map.put(key, value);
    }

    TValue get(TKey key) throws IndexOutOfBoundsException{
        if (map.get(key) != null) {
            return map.get(key);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    void displayAll(){
        for (Map.Entry<TKey, TValue> current : map.entrySet()) {
            System.out.println(current.getKey() + "\t" + current.getValue());
        }
    }

    int size(){
        return map.size();
    }

}
