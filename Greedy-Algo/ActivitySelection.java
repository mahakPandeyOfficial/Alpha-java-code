import java.util.*;
public class ActivitySelection {
    public static void activitySelection(int start[], int end[], int n)
    {
        //sorting 
        int activities[][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        
        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        //first activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        
        for(int i = 1; i<n ; i++){
            if(activities[i][1] >= lastEnd){
                //activity select karo
                maxAct++;
                ans.add(activities[i][0]); //index add
                lastEnd = activities[i][2]; 
            }
        }
        
        //print
        System.out.println("Max Activity : " + maxAct);
        for(int i = 0; i<ans.size() ; i++){
            System.out.print("A" + ans.get(i) + "  ") ;
        }
System.out.println();
    }

public static void main(String[] args){
    int [] start = {1,3,0,5,8,5};
    int [] end = {2,4,6,7,9,9};
    int n = 6;

    activitySelection(start, end, n);
}
}
