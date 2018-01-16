import java.util.*;
class csInterview
{
	public static void main(String[] args)
	{
        String s ="Mr   John Smith";
        String[] words = s.split("([\\W\\s]+)");
        StringBuilder sentence = new StringBuilder();
        for (int i=0;i<words.length;i++)
        {
            sentence.append(words[i]);
            if (i<words.length-1){
                sentence.append("%20");
            }
        }
        System.out.println(sentence.toString());
	}
}
	