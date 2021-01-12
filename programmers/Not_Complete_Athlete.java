package programmers;

import java.util.Arrays;

public class Not_Complete_Athlete {
    public static void main(String[] args) {
        String[] participant={"leo", "kiki", "eden"};
        String[] completion={"eden", "kiki"};
    }
    public static String solution(String[] participant, String[] completion)
    {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        for(i=0; i< completion.length; i++)
        {
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }
        return participant[i];  //participant수가 5이고 completion수가 4이면 마지막 5가 답이니 i는 0으로 초기화 되지 않고 i=5//
    }
}
