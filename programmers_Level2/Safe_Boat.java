package programmers_Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Safe_Boat {
    public static void main(String[] args) {
        int[] people={70,80,50};
        int limit=100;
        System.out.println(solution(people, limit));
    }
    public static int solution(int[] people, int limit){
        Arrays.sort(people);
        int answer=0;
        int index= people.length-1;
        int j=0;

        for(int i= index; j<=i; i--){           //최대 2명이 탈수있다고 파악하는게 전제
            if(people[i]+people[j]>limit)       //더 태울수없기 때문에 answer++해줘야함//
                answer++;
            else{
                answer++;       //어차피 2명이 탔기때문에 크든 작든 answer++해줘야함//
                j++;            //다음값 비교해야하므로 j++//
            }
        }
        return answer;
    }
}
