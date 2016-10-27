/**
 * Created by Mathurs on 10/26/16.
 */
public class H_Index {
    public int hIndex(int[] citations) {

        //O(n) solution
        int length = citations.length;
        int[] arr = new int[length + 1];

        for (int i = 0; i < length; i++) {
            if (citations[i] >= length)
                arr[length]++;
            else
                arr[citations[i]]++;
        }

        int total = 0;

        for (int i = length; i > 0; i--) {
            total += arr[i];
            if (total >= i)
                return i;
        }

        return 0;
    }

    public int hIndex1(int[] citations){
        // O(n square ) solution

        int h = 0;

        if(citations == null || citations.length == 0)
            return h;

        for(int i = 0 ; i < citations.length ; i++){
            int count = 0;
            for(int n = 0 ; n < citations.length ; n++){
                if(citations[n] > h)
                    count++;
            }
            if(count > h)
                h++;
        }

        return h;
    }
}
