public class MyHashMap<K,V>{
    private static final int INITIAL_sIZE = 16; //size will be this
    private static final int MAX_CAPACITY = 30;  //size will be 2 to the power of this

    public Entry[] hashTable; //ek element entry type ka hoga

    public MyHashMap(){
        hashTable = new Entry[INITIAL_sIZE] //direct initial size ajayeg
    }

    public MyHashMap(int capacity){
        int tableSize = tableSizeFor(capacity); //capacity formulation
        hashTable = new Entry[tableSize]; //initialization
    }

    final int tableSize(int capacity){ //computing the next bigger power of 2 if it is not the power of 2, less than the to the power of max_capacity
        int n = capacity-1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;
        return (n<0)?1:(n>=MAX_CAPACITY)?MAX_CAPACITY:n+1;  

    }

    class Entry<K,V>{
        public K Key;
        public V value;
        public Entry next;

        Entry(K k, V v){
            this.key = k;
            this.value = v;
        }

    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if (node==null){
            Entry newNode = new Entry(key,value);
            hashTable[hashCode] = newNode;
        }
        else{
            Entry previousNode = node;
            while(node!=null){
                if (node.key==key){
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            previousNode.next = newNode;
        }

    }

    public V get(K key){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];
        while(node!=null){
            if (node.key.equals(key)){
                return (V) node.value;
            }
            node = node.next
        }
        return null;
    }
}