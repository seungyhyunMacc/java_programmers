package programmers_Level2;

import java.util.Stack;

public class Pick_The_Doll {
    public static void main(String[] args) {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves={1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer=0;
        Stack<Integer> temp_answer= new Stack<>();
        for(int i=0; i< moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]>0){
                    if(!temp_answer.empty()&&temp_answer.peek()==board[j][moves[i]-1]){
                        temp_answer.pop();      //비어있을때 방지 그리고 넣고 바로 비교 같으면 넣지 않고 기존에 있는거 삭제//
                        board[j][moves[i]-1]=0;
                        answer +=2;
                        break;
                    }
                    else{
                        temp_answer.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1]=0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
