import java.lang.reflect.Array;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
    taskSet taskSet = new taskSet();

    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a1, Integer a2) {
            return a2-a1;
        }
    };

    taskTreeSet taskTreeSet = new taskTreeSet(comparator);

    for (int i = 0; i < 5; i++) {
        taskSet.add(new Random().nextInt(8));
        taskTreeSet.add(new Random().nextInt(8));
    }


    System.out.println(taskSet.contains(5));
    System.out.println(Arrays.toString(taskSet.toArray()));
    Iterator<Integer> iterator = taskTreeSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + ", ");
    }
    System.out.println();
    System.out.println(taskSet.getItem(2));

    }
}


class taskSet {
    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num){
        return hashMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);
    }

    public Object[] toArray() {
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

}

class taskTreeSet {
    private Comparator<Integer> comparator;

    public taskTreeSet(Comparator<Integer> comp) {
        comparator = comp;
    }

    private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);

    static final Object OBJECT = new Object();

    public boolean add(int num){
        return treeMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num) {
        return treeMap.containsKey(num);
    }

    public Object[] toArray() {
        return treeMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return treeMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

}