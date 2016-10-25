import java.util.*;

/**
 * Created by Mathurs on 10/16/16.
 */
public class topKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new LinkedList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : nums) {
            if (map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }

        List<Integer> result = new ArrayList<Integer>();

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {

            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry entry : map.entrySet()) {
            queue.add(entry);
            if (queue.size() > k)
                queue.remove();
        }

        for (Map.Entry i : queue) {
            System.out.println("Key = " + i.getKey() + "  Value = "+ i.getValue());
        }
        return null;
    }

    public static void main(String[] args){
        topKFrequent(new int[] {9,9,9,9,9,9,9,9,9,9,1,1,1,2,2,3,3,3,3,3,5,5,5,6,6,6,7,7,7,7}, 2);
    }

}
