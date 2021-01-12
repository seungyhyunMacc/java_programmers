package programmers;

import java.lang.reflect.Array;
import java.util.*;

public class Divide_Available {
    public static void main(String args[]){
        int []arr={3,2,8};
        int divisor=10;
        System.out.println(Arrays.toString(solution(arr,divisor)));
    }
    public static int[] solution(int[] arr, int divisor) {
        int []answer ={};
        ArrayList<Integer> new_answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%divisor==0)
            {
                new_answer.add(arr[i]);
            }

        }
        if(new_answer.isEmpty()) {
            new_answer.add(-1);
            answer = new int[new_answer.size()];
            for (int i = 0; i < new_answer.size(); i++) {
                answer[i] = new_answer.get(i);
            }
        }
        else {
            answer = new int[new_answer.size()];
            for (int i = 0; i < new_answer.size(); i++) {
                answer[i] = new_answer.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}
