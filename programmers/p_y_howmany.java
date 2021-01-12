package programmers;

public class p_y_howmany {
    public static void main(String args[])
    {
        System.out.println(solution("pPoooYy"));
    }
    public static boolean solution(String s)
    {
        int count_P=0;
        int count_Y=0;
        char[] new_answer = s.toCharArray();
        for(int a = 0; a<s.length(); a++)
        {
            if (new_answer[a] == 'p' || new_answer[a] == 'P') {
                count_P++;
            }
        }
        for(int b=0; b<s.length(); b++)
        {
            if (new_answer[b] == 'y' || new_answer[b] == 'Y')
            {
                count_Y++;
            }

        }
        if(count_P == count_Y)
            return true;
        else
            return false;
    }
}
