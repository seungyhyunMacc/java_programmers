package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class The_Test {
    public static void main(String[] args) {
        int[] answers={1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
    }
    public static int[] solution(int[] answers) {
        int[] result = {};
        int[] player1 = {1, 2, 3, 4, 5};
        int[] player2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] player3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1=0, cnt2=0, cnt3=0;

        for(int i=0; i< answers.length; i++)
        {
            if(player1[i% player1.length]==answers[i]) cnt1++;
            if(player2[i% player2.length]==answers[i]) cnt2++;
            if(player3[i% player3.length]==answers[i]) cnt3++;
        }

        int max=Math.max(Math.max(cnt1, cnt2), cnt3);

        ArrayList<Integer> list= new ArrayList<>();
        if(max==cnt1) list.add(1);
        if(max==cnt2) list.add(2);
        if(max==cnt3) list.add(3);

        result = new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            result[i]= list.get(i);
        }
        return result;
    }
}
