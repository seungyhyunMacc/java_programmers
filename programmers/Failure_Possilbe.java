package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Failure_Possilbe {
    public static void main(String[] args) {
        int N=8;
        int[] stages={1,2,5,1,5,1};
        System.out.println(Arrays.toString(solution(N, stages)));
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] temp = new double[N];
        double[] cnt = new double[N];
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 0;
        }
        int find = 0;
        int length = stages.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    find++;
                }
            }
            if (find == 0)
                cnt[i] = 0;
            else
            {
                cnt[i] = (double) find / length;
                length -= find;
                find = 0;
            }
        }
        List<Double> list = new ArrayList<>();
        for(Double i : cnt) list.add(i);
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++)
        {
            for(int j=0; j<cnt.length; j++)
            {
                if(list.get(i)==cnt[j])
                {
                    answer[i]=j+1;
                    break;
                }
            }
        }
        for(int i=0; i< answer.length-1; i++)
        {
            for(int j=i+1; j<answer.length; j++)
            {
                if(answer[i]==answer[j])
                    answer[j] =answer[j]+j-i;
            }
        }
        return answer;
    }}
