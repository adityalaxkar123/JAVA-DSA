import java.util.LinkedList;

public class hahMapImplementation {

    public static class hashMap<k , v>{//generics
    public static final int default_Capacity = 4;
    public static final float load_Factor = 0.75f;
    private class Node{
        k key;
        v value;
        Node(k key,v value){
            this.key = key;
            this.value = value;
        }
    }

    private int n;
    private LinkedList<Node>[] buckets;

    private void initBuckets(int N){// n - size of bucket array
    buckets = new LinkedList[N];
        for (int i = 0; i < N ; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    hashMap(){
        initBuckets(default_Capacity);
    }

    private int hashFunc(k key){
        int hc = key.hashCode();

        return Math.abs(hc) % buckets.length;
    }

    public int size(){ // returns the elements in the map

        return n;
    }

    private int searchInBucket(LinkedList<Node> ll,k key){
        for (int i = 0; i < ll.size() ; i++) {
            if(ll.get(i).key == key){
                return i;
            }
        }
        return -1;

    }

    private void rehash(){
        LinkedList<Node>[] oldBuckets = buckets;
        initBuckets(oldBuckets.length * 2);
        n = 0;
        for(var bucket : oldBuckets){
            for(var node : bucket){
                put(node.key,node.value);
            }
        }
    }

    public void put(k key,v value){
    int bi = hashFunc(key);
    LinkedList<Node> currBucket = buckets[bi];
    int ele = searchInBucket(currBucket,key);
    if(ele == -1){
        Node nn = new Node(key,value);
        currBucket.add(nn);
        n++;
    }else {
        Node currNode = currBucket.get(ele);
        currNode.value = value;
    }
    if(n >= buckets.length * load_Factor){
        rehash();
    }
    }

    public v get(k key){
    int bi = hashFunc(key);
    LinkedList<Node> currBucket = buckets[bi];
    int ele = searchInBucket(currBucket,key);
    if(ele != -1){
        return currBucket.get(ele).value;
    }
    return null;
    }

    public v remove(k key){
    int bi = hashFunc(key);
    LinkedList<Node> currBucket = buckets[bi];
    int ele = searchInBucket(currBucket,key);
    if(ele != -1){
        v value = currBucket.get(ele).value;
        currBucket.remove(ele);
        n--;
        return value;
    }
    return null;
    }

    public int capacity(){
        return buckets.length;
    }

    public float load(){
        return (n*1.0f)/buckets.length;
    }

    }

    public static void main(String[] args) {
     hashMap<String ,Integer> mp = new hashMap<>();
     mp.put("a",1);
     mp.put("b",2);
     mp.put("c",3);
     System.out.println(mp.size());
     mp.put("c",30);
        System.out.println(mp.get("c"));
        System.out.println(mp.get("college"));
//        System.out.println(mp.remove("c"));
//        System.out.println(mp.remove("c"));
        System.out.println(mp.size());
    mp.put("d",63);
    mp.put("e",74);
        System.out.println(mp.get("d"));
        System.out.println(mp.get("e"));
        System.out.println(mp.size());
        System.out.println(mp.capacity());
        System.out.println(mp.load());
    }
}
