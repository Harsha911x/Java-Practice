import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0]= new Question(1,"size of int", new String[]{"2", "3", "4", "8"},"4");
        questions[1]= new Question(2,"size of double", new String[]{"9", "3", "4", "8"},"8");
        questions[2]= new Question(3,"size of float", new String[]{"8", "3", "4", "8"},"3");
        questions[3]= new Question(4,"size of String", new String[]{"0", "3", "4", "8"},"0");
        questions[4]= new Question(5,"size of long", new String[]{"3", "3", "4", "8"},"4");

    }

    Result res = new Result();

    public void displayQuestions(){
        for(Question q : questions){
            //System.out.println(q);
            System.out.println("Question "+q.getId()+": "+q.getQuestion());
            printOptions(q.id);
        }

        res.displayResults(questions.length);
    }

    public void printOptions(int id){
        System.out.println(Arrays.toString(questions[id - 1].getOpt()));
        System.out.println("Enter the answer");
        Scanner sc =new Scanner(System.in);
        String x = sc.next();
        if(x.equals(questions[id - 1].getAnswer())) {
            System.out.println("Right Answer");
            res.score++;
        }
        else{
            System.out.println("Wrong Answer");
        }
        System.out.println("**************************************************");
    }



}
