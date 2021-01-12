package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Choose_The_Two_Number_And_Sum {
    public static void main(String[] args) {
        int[] numbers={2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));
    }
    public static int[] solution(int[] numbers)
    {
        List<Integer> list = new ArrayList<>();     //list변수를 만듬//
        for(int i=0; i<numbers.length-1; i++)   // 5가지가 있으면 4번째부턴 5번째와 더하고 끝//
        {
            for(int j=i+1; j<numbers.length; j++)   //5가지가 있으면 1번째부턴 2번째부터와 더해야
            {
                int temp = numbers[i]+numbers[j];
                if(list.indexOf(temp)<0)        //숫자 중복 확인함, 중복아니면 -1반환//
                    list.add(temp);
            }
        }
        int[] answer= new int[list.size()];     //위치바꾸니까 되네;;//
        for(int i=0; i<list.size(); i++)
        {
            answer[i]= list.get(i);     //get을 이용해서 answer에다가 집어넣음//
        }
        Arrays.sort(answer);
        return answer;
    }
}
