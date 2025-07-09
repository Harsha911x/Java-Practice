import java.util.Arrays;

class Question {
    int id;
    String question;
    String[] opt;
    String answer;

   Question(int id, String question, String[] opt, String answer) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOpt() {
        return opt;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt=" + Arrays.toString(opt) +
                ", answer='" + answer + '\'' +
                '}';
    }
}
