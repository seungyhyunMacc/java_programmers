package programmers;

public class Handle_Word
{
    public static void main(String[] args)
    {
        System.out.println(solution("a234"));
    }
    public static boolean solution(String s)
    {
        if(s.length()==4||s.length()==6)
        {
            char[] answer = s.toCharArray();
            for (int i = 0; i < answer.length; i++)
            {
                if (answer[i] >= 'a' && answer[i] <= 'z')
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}
