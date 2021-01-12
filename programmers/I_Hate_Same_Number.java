package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class I_Hate_Same_Number {
    public static void main(String args[]){
        int []arr={1,2,3,4,4,4,3,5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> new_answer = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
                new_answer.add(arr[i]);
        }
        new_answer.add(arr[arr.length-1]);
        answer = new int[new_answer.size()];
        for (int i = 0; i < new_answer.size(); i++) {
            answer[i] = new_answer.get(i);
        }
        return answer;
    }
}
