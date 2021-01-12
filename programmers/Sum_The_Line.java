package programmers;

import java.util.Arrays;

public class Sum_The_Line {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{2,3}};
        int[][] arr2={{3,4},{5,6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));  //이건 2차원이라 deepToString써야함//
    }
    public static int[][] solution(int[][] arr1, int[][] arr2)
    {
        int[][] answer= arr1;
        for(int i=0; i<arr1.length; i++)        //행 길이//
        {
            for(int j=0; j<arr1[i].length; j++)     //열 길이//
            {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
