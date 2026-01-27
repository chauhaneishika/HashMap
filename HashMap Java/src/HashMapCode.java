import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> { //generics
        private class Node {
            K key;
            V value;

            private Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("Unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) { //0 to N-1
           int bi = key.hashCode();
           return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++) {
                if(ll.get(i).key == key) {
                    return i; //di
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<oldBucket.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<ll.size(); j++ ) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1

            if(di == -1) { //key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { //key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0) {
                //rehashing
            }
        }
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1

            if(di == -1) { //key doesn't exist
                return false;
            } else { //key exists
                return true;
            }
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); //di = -1

            if(di == -1) { //key doesn't exist
                return null;
            } else { //key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet() {
            return null;
        }
    }
}
