package ntu.anhba.quizzapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<CauHoi> listQuession;
    TextView quessions;
    Button nut1, nut2, nut3, nut4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link
        listQuession = new ArrayList<CauHoi>();
        quessions = findViewById(R.id.quession);
        nut1 = findViewById(R.id.btnNut1);
        nut2 = findViewById(R.id.btnNut2);
        nut3 = findViewById(R.id.btnNut3);
        nut4 = findViewById(R.id.btnNut4);


        //Thêm câu hỏi
        CauHoi quession1 = new CauHoi(1,"1 + 1", 1, 4, 2,3);
        CauHoi quession2 = new CauHoi(2, "2 + 2", 1, 3, 4,2);
        CauHoi quession3 = new CauHoi(3, "33 + 36", 40, 60, 69,100);
        listQuession.add(quession1);
        listQuession.add(quession2);
        listQuession.add(quession3);

        //Random đáp án
        int DANN = new Random().nextInt(4) + 1;
        int CHNN = new Random().nextInt(listQuession.size());


        // Lấy câu hỏi
        quessions.setText(listQuession.get(CHNN).getQuession());


        if(DANN == 1){ //Đáp án đúng ở nút 1
            nut1.setText(String.valueOf(listQuession.get(CHNN).getC_answer()));
            nut2.setText(String.valueOf(listQuession.get(CHNN).getW_answer1()));
            nut3.setText(String.valueOf(listQuession.get(CHNN).getW_answer2()));
            nut4.setText(String.valueOf(listQuession.get(CHNN).getW_answer3()));
        }
        if(DANN == 2){ //Đáp án đúng ở nút 2
            nut2.setText(String.valueOf(listQuession.get(CHNN).getC_answer()));
            nut1.setText(String.valueOf(listQuession.get(CHNN).getW_answer1()));
            nut3.setText(String.valueOf(listQuession.get(CHNN).getW_answer2()));
            nut4.setText(String.valueOf(listQuession.get(CHNN).getW_answer3()));
        }
        if(DANN == 3){ //Đáp án đúng ở nút 3
            nut3.setText(String.valueOf(listQuession.get(CHNN).getC_answer()));
            nut2.setText(String.valueOf(listQuession.get(CHNN).getW_answer1()));
            nut1.setText(String.valueOf(listQuession.get(CHNN).getW_answer2()));
            nut4.setText(String.valueOf(listQuession.get(CHNN).getW_answer3()));
        }
        if(DANN == 4){ //Đáp án đúng ở nút 4
            nut4.setText(String.valueOf(listQuession.get(CHNN).getC_answer()));
            nut2.setText(String.valueOf(listQuession.get(CHNN).getW_answer1()));
            nut3.setText(String.valueOf(listQuession.get(CHNN).getW_answer2()));
            nut1.setText(String.valueOf(listQuession.get(CHNN).getW_answer3()));
        }
    }

}