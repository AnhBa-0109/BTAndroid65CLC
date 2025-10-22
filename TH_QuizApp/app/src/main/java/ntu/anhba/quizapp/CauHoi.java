package ntu.anhba.quizapp;

public class CauHoi {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String quession;
    int c_answer;
    int w_answer1;
    int w_answer2;
    int w_answer3;

    // Tạo lớp phải có contructor, get, set

    public CauHoi(int id, String quession, int w_answer3, int w_answer2, int c_answer, int w_answer1) {
        this.id = id;
        this.quession = quession;
        this.w_answer3 = w_answer3;
        this.w_answer2 = w_answer2;
        this.c_answer = c_answer;
        this.w_answer1 = w_answer1;
    }

    public String getQuession() {
        return quession;
    }

    public void setQuession(String quession) {
        this.quession = quession;
    }

    public int getW_answer3() {
        return w_answer3;
    }

    public void setW_answer3(int w_answer3) {
        this.w_answer3 = w_answer3;
    }

    public int getW_answer2() {
        return w_answer2;
    }

    public void setW_answer2(int w_answer2) {
        this.w_answer2 = w_answer2;
    }

    public int getW_answer1() {
        return w_answer1;
    }

    public void setW_answer1(int w_answer1) {
        this.w_answer1 = w_answer1;
    }

    public int getC_answer() {
        return c_answer;
    }

    public void setC_answer(int c_answer) {
        this.c_answer = c_answer;
    }
}
