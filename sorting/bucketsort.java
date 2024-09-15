package sorting;
import java.util.ArrayList;
import java.util.Collections;
public class bucketsort {

    static void print(float a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static void bucketSort(float []a){
        int n=a.length;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int)a[i]*n;
            
            buckets[bucketIdx].add(a[i]);
        }
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        int idx=0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                a[idx++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
       float[]a = {0.5f,0.4f,0.3f,0.2f,0.1f};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        bucketSort(a);
        print(a);
    }
}
