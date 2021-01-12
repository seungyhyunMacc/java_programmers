package programmers;

import java.util. *;
public class Knumber {
    public static void main(String[] args) {
        int[] array={1,5,2,6,3,7,4};
        int[][] commands={{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
    public static int[] solution(int[] array, int[][] commands){
        int[] answer= new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int start=commands[i][0];
            int end=commands[i][1];
            int exact=commands[i][2];
            int[] temp= new int[end-start+1];
            int index=0;
            for(int j=start-1; j<end; j++){
                temp[index++]=array[j];
            }
            Arrays.sort(temp);
            answer[i]=temp[exact-1];
        }
        return answer;
    }
}
