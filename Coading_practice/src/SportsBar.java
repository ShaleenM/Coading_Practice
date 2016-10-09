import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Mathurs on 9/21/16.
 */
public class SportsBar {

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        int n = Integer.parseInt(line);

        Schedule[] schedules = new Schedule[n];
        for(int i = 0 ; i < n ; i++){
            String line1 = stdin.nextLine();
            schedules[i] = new Schedule(Integer.parseInt(line1.split(" ")[0].trim()), Integer.parseInt(line1.split(" ")[1].trim()));
        }

        java.util.Arrays.sort(schedules, new Comparator<Schedule>() {
            public int compare(Schedule o1, Schedule o2) {
                return o1.start < o2.start ? -1 : o1.start > o2.start ? 1 : 0;
            }
        });

        int i = 0;
        int j = 0;
        int maxCount = 0;
        int count = 0;
        while(i < schedules.length && j < schedules.length){
            if(schedules[i].start <= schedules[j].end ){
                i++;
                count++;
            }
            else if(schedules[i].start > schedules[j].end ){
                j++;
                count--;
            }

            maxCount = count > maxCount ? count : maxCount;
        }

        System.out.print("maxCount" + maxCount);
    }
}

class Schedule{
    int start;
    int end;

    public Schedule(int start, int end){
        this.start = start;
        this.end = end;
    }
}
