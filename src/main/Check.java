import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Check {

    /*
     * 用来检查用户结果的正确性.
     */
    public static Map<String,String> Check(String checked,String answer) throws IOException{
        Map<String,String> m = new HashMap<String,String>();
        String error = "";
        String correct = "";
        int errornum = 0;
        int correctnum = 0;

        String str1 = "";
        String str2 = "";

//		checked = "D:\\资料\\1.txt";
//		answer = "D:\\资料\\2.txt";
        File checkedfile=new File(checked);
        FileInputStream input1=new FileInputStream(checkedfile);
        BufferedReader reader1=new BufferedReader(new InputStreamReader(input1));

        File answerfile=new File(answer);
        FileInputStream input2=new FileInputStream(answerfile);
        BufferedReader reader2=new BufferedReader(new InputStreamReader(input2));


        while((str1=reader1.readLine())!=null&&(str2=reader2.readLine())!=null){
            if(!str1.trim().equals(str2.trim())){
//				System.out.println(str1);
                String[] str = str1.split("\\.");
                error = error + str[0]+ ",";
                errornum ++ ;
            }else {
//				System.out.println(str1);
                String[] str = str1.split("\\.");
                correct = correct + str[0] + ",";
                correctnum ++;
            }

        }

        if(error.equals("")){
            error = "Wrong: " + errornum + "";
        }else {
            error = "Wrong: " + errornum + "(" + error.substring(0,error.length()-1) + ")";
        }
        if(correct.equals("")){
            correct = "Correct: " + correctnum + "";
        }else {
            correct = "Correct: " + correctnum + "("+correct.substring(0, correct.length()-1)+")";
        }
//		System.out.println(error);
//		System.out.println(correct);
        m.put("wrong", error);
        m.put("correct", correct);
        return m;
    }

}