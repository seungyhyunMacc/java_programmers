package programmers_Level2;

public class Skill_Tree {
    public static void main(String[] args) {
        String skill="CBD";
        String[] skill_tree={"AZE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_tree));

    }
    public static int solution(String  skill, String[] skill_tree)
    {
        int answer=0;
        for(int i=0; i<skill_tree.length;i++){
            boolean flag = true;
            String [] skills = skill_tree[i].split("");
            int cnt =0;
            for(int j=0;j<skills.length;j++){
                if(cnt < skill.indexOf(skills[j])){
                    flag = false;
                    break;
                }
                else if(cnt == skill.indexOf(skills[j]))
                    cnt++;
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }


}
