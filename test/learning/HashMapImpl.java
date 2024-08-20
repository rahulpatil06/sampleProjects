package test.learning;
class Entry<K,V>{
        K key;
        V val;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        int prime = 13;
        int mul = 11;
        if(key !=null){
            int hasCode = prime *mul + key.hashCode();
            return  hasCode;
        }
        return 0;
    }
}
public class HashMapImpl {
    public static void main(String args[]){

    }
}
