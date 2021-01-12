package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Level2_Bridge {
    public static void main(String[] args) {
        int bridge=2;
        int weight=10;
        int[]  truck_weight={7,4,5,6};
        System.out.println(solution(bridge, weight, truck_weight));
    }
    public static int solution(int bridge, int weight, int[] truck_weight)
    {
        int answer=0;

        Queue<Integer> q = new LinkedList<>();
        int max=0;
        for(int w : truck_weight)       //w가 끝나는 순간 이 프로그램도 끝?
        {
            while(true)
            {
                if(q.isEmpty())
                {
                    q.add(w);
                    max += w;
                    answer++;
                    break;
                }
                else if(q.size()==bridge)
                {
                    max -= q.poll();        //poll하면 7,0 0이 있는데 7이 없어지니까 사이즈가 1이지 않나 0이 남아있으니까?----해결
                }
                else
                {
                    if(max +w > weight)
                    {
                        q.add(0);
                        answer++;
                    }
                    else
                    {
                        q.add(w);
                        max+=w;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+ bridge;
    }
}
