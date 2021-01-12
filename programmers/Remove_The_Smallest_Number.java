package programmers;

import java.util.*;

public class Remove_The_Smallest_Number {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr)
    {
        if(arr.length==1)       //값이 하나면 -1
        {
            int[] answer={-1};
            return answer;
        }

        int min=arr[0];     //제일 작은 값 추출//
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }

        int[] answer= new int[arr.length-1];        //배열크기선언, 제일 작은값이 빠져야 되니까 arr-1//
        int number=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==min)
                continue;
            answer[number++]=arr[i];
        }
        return answer;
    }
}
