package programmers_Level2;

import java.util.HashSet;
import java.util.Set;

public class Pocketmon {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums){
        Set<Integer> temp_answer= new HashSet<>();

        for(int i=0; i< nums.length; i++){
            temp_answer.add(nums[i]);
        }
        int size= temp_answer.size();
        if(size> nums.length/2)             //3,1,2,4처럼 서로 각각 다르면 최대 담을 수 있는 양이 nums/2니까//
            return nums.length/2;
        else
            return size;
    }
}
