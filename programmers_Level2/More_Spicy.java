package programmers_Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class More_Spicy {
    public static void main(String[] args) {
        int[] scoville={1,2,3,9,10,12};
        int k=7;
        System.out.println(solution(scoville, k));
    }
    public static int solution(int[] scoville, int k){
        PriorityQueue<Integer> temp = new PriorityQueue<>();
        int answer=0;

        for(int number: scoville){  //우선순위 큐 temp에 scoville배열을 넣음//
            temp.offer(number);
        }
        while(temp.peek()<k){       //우선순위 큐는 자동으로 오름차순이 되어 바로 peek을 하면 제일 작은 수가 나옴//
            if(temp.size()==1){     //k보다 큰값이 안나오면 반복문이 계속돌면서 결국 숫자 하나만 남게 되므로 -1출력//
                return -1;
            }
            int a=temp.poll();      //제일 작은수를 꺼내고 temp에서 삭제//
            int b= temp.poll();     //두번째 작은수를 꺼내고 temp에서 삭제//
            int c= a+ b*2;          //스코빌지수 공식적용//
            temp.offer(c);          //적용값을 temp에 집어넣으면 자동으로 오름차순 됨//
            answer++;               //반복문 실행되면 answer++
        }
        return answer;
    }
}
