package programmers;

import java.util.Arrays;

public class Uniform {
    public static void main(String[] args) {
        int n = 5;
        int[] lost={2,4};
        int[] reserve={1,3,5};
        System.out.println(solution(n, lost, reserve));

    }
    public static int solution(int n, int[] lost, int[] reserve){
        int same=0;
        int count=0;
        for(int i=0; i< lost.length; i++){          //잃어버린 사람과 2개가지고있는 사람이 같으면 신경안써도 되므로 -1로 만들어줌//
            for(int j=0; j< reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    same++;
                    break;
                }
            }
        }
        for(int i=0; i< lost.length; i++){          //2개 가지고있는 사람과 -1 +1한 값이 잃어버린 사람에 있으면 -1해줌//
            for(int j=0; j< reserve.length; j++){
                if(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1){
                    count++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }

        return n- lost.length + same + count;       //이게 핵심이다
    }
}
