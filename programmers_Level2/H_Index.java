package programmers_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class H_Index {
    public static void main(String[] args) {
        int[] citations={3,0,6,1,5};
        System.out.println(solution(citations));
    }
    public static int solution(int[] citations){
        Arrays.sort(citations);
        List<Integer> temp = new ArrayList<>();
        int temp_number=0;
        int answer=0;
        for(int i=0; i<=citations[citations.length-1]; i++){        //숫자를 하나씩 비교한다 0부터 배열의 높은 수까지//
            for(int j=0; j<citations.length; j++){
                if(i <=citations[j]){                   //3번이상 인용의 경우 비교값이 3보다 크거나 같아야하므로//
                    temp_number += 1;
                }
            }                                           //인용된 논문과 인용수가 같아야하므로//
            if(i==temp_number||i<=temp_number){         //0,1,1을 했을때 1이 2개가 되어 답에서 제외되지만 1번이상 인용 1편이상이므로//
                temp.add(i);
            }
            temp_number=0;
        }
        answer= Collections.max(temp);
        return answer;
    }
}
