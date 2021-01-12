package programmers_Level2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tupple {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }
    public static int[] solution(String s){
        s= s.substring(1, s.length()-1);            // 맨 앞과 맨 뒤 {, }를 없애준다//
        if(s.contains("{"))                         // {가 있으면 없앤다
            s= s.replace("{","");
        String[] temp=s.split("}");           // }를 기준으로 자른다 2 ,2,1  ,2,1,3  ,2,1,3,4//
        for(int i=0; i<temp.length; i++){
            if(temp[i].charAt(0)==',')
                temp[i]=temp[i].substring(1,temp[i].length());      //2 2,1  2,1,3  2,1,3,4
        }

        Comparator<String> temp_help= new Comparator<String>() {        //길이가 짧은거부터 순서대로 정렬 #중요함#//
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Arrays.sort(temp, temp_help);           //Comparator 정렬 적용///

        ArrayList<String> temp_answer= new ArrayList<>();           //답 넣는건 list가 편해서//

        for(int i=0; i<temp.length; i++){
            String[] temp_temp=temp[i].split(",");          // 2 2,1  2,1,3  2,1,3,4를 ,기준으로 자름//
            for(int j=0; j<temp_temp.length; j++){
                if(!temp_answer.contains(temp_temp[j]))
                    temp_answer.add(temp_temp[j]);
            }
        }
        int[] answer= new int[temp_answer.size()];

        for(int i=0; i< answer.length; i++){
            answer[i]= Integer.parseInt(temp_answer.get(i));        //ArrayList니까 .get사용//
        }
        return answer;
    }
}
