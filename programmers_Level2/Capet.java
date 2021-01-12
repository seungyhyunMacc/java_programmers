package programmers_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Capet {
    public static void main(String[] args) {
        int brown = 18;
        int yellow = 6;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        List<Integer> temp_answer = new ArrayList<>();
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0)
                temp_answer.add(i);
        }
        //약수 찾는거//
        int[] answer= new int[2];
        int a = temp_answer.size();
        int num = 0;
            for(int i= answer.length-1; i>=0; i--){
                if(a %2==0){
                    answer[i]=temp_answer.get(a/2+num-1);       //중간값 넣는거
                    num++;
                }
                else if(a%2==1){
                    answer[i]= temp_answer.get(a/2);
                }
            }
        return answer;
    }
}
