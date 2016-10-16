package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Mathurs on 10/11/16.
 */
public class BoxStackingProblem{

    public static int boxStackingProblem(Box[] arr){

        int n = arr.length;

        Box[] rot = new Box[3*n];

        int index = 0;
        for(int i = 0 ;  i < n ; i ++){
            rot[index++] = arr[i];

//            rot[index].h = arr[i].l;
//            rot[index].l = Math.max(arr[i].h , arr[i].w);
//            rot[index++].w = Math.min(arr[i].h , arr[i].w);

            rot[index++] = new Box(Math.max(arr[i].h , arr[i].w) , Math.min(arr[i].h , arr[i].w) , arr[i].l);

//            rot[index].h = arr[i].w;
//            rot[index].l = Math.max(arr[i].h , arr[i].l);
//            rot[index++].w = Math.min(arr[i].h , arr[i].l);

            rot[index++] = new Box(Math.max(arr[i].h , arr[i].l), Math.min(arr[i].h , arr[i].l) , arr[i].w);
        }

        n = 3*n;

        int M[] = new int[n];

        for(int i = 0 ; i < n ; i ++)
            M[i] = rot[i].h;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(rot[i].w < rot[j].w && rot[i].l < rot[j].l && M[i] < M[j]+rot[i].h)
                    M[i] = M[j]+rot[i].h;
            }
        }

        int max = 0;
        for(int i = 0 ; i < n ; i ++)
            max =  Math.max(M[i] , max);

        return max;
    }


    public static void main(String[] args){
        Box arr[] = { new Box(4, 6, 7), new Box(1, 2, 3), new Box(4, 5, 6), new Box(10, 12, 32) };

        System.out.println("Max height = " + boxStackingProblem(arr));
    }

    static class Box{
        int l = 0;
        int w = 0;
        int h = 0;

        public Box(int l, int w, int h) {
            this.l = l;
            this.w = w;
            this.h = h;
        }
    }
}