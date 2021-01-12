package programmers;

import java.util.*;
public class Descending_The_Number {
    public static void main(String[] args) {
        int n=118372;
        System.out.println(solution(n));
    }
    public static long solution(long n)
    {
        String temp = String.valueOf(n);  //int를 string으로//
        String answer_temp="";      //내림차순 답을 받을 stirng//
        char[] temp_temp=temp.toCharArray();  //int에서 string으로 형변환 한 것을 char로 바꿈//
        Arrays.sort(temp_temp);     //char에서 오름차순정렬//
        for(int i=temp_temp.length-1; i>=0; i--)    //오름차순 정렬을 for문으로 끝에서부터 answer_temp에 담기//
        {
            answer_temp +=temp_temp[i];
        }
        long answer=Long.parseLong(answer_temp);    //내림차순된 answer_temp를 long으로 변환//
        return answer;
    }
}
