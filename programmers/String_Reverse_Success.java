package programmers;

import java.util.*;
public class String_Reverse_Success {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static int[] solution(long n)
    {
        int[] answer=new int[String.valueOf(n).length()];
        int element=0;
        int number=0;

        while(n!=0)
        {
            element= (int)(n%10);
            answer[number++]= element;
            n /= 10;
        }

        return answer;
    }

}
