package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leve2_Develop_Function {
    public static void main(String[] args) {
        int[] progresses={93, 30, 55};
        int[] speeds={1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> temp_days = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            temp_days.add(cnt);
            cnt = 0;
        }
        ArrayList<Integer>new_answer= new ArrayList<>();
        while(!temp_days.isEmpty())
        {
            int n=1;
            for(int i=1; i<temp_days.size(); i++)
            {
                if(temp_days.get(i)<=temp_days.get(0))
                {
                    n++;
                    temp_days.remove(i--);
                }
                else
                    break;
            }
            temp_days.remove(0);
            new_answer.add(n);
        }
        int[] answer= new int[new_answer.size()];
        for(int i=0; i< new_answer.size(); i++)
        {
            answer[i]=new_answer.get(i);
        }

        return answer;
    }
}
