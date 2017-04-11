package com.example.sw_center_02.application6;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText Etname;
    EditText Etmenu1;
    EditText Etmenu2;
    EditText Etmenu3;
    EditText Ethomepage;
    EditText etTel;
    Button btnCancel;
    Button btnAdd;
    Data[] data;
    int catNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText Etname = (EditText)findViewById(R.id.etname);
        final EditText Etmenu1 = (EditText)findViewById(R.id.etmenu1);
        final EditText Etmenu2 = (EditText)findViewById(R.id.etmenu2);
        final EditText Etmenu3 = (EditText)findViewById(R.id.etmenu3);
        final EditText EtTel = (EditText)findViewById(R.id.ette1);
        final EditText Ethomepage = (EditText)findViewById(R.id.etaddr);
        Button btnCancel = (Button)findViewById(R.id.btnCancel);
        Button btnAdd = (Button)findViewById(R.id.btnAdd);

        data[catNum] = new Data();
        Intent intent = getIntent();
        catNum = intent.getIntExtra("number", 0);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Etname.getText().toString().replace("", "").equals("") || Etmenu1.getText().toString().replace("", "").equals("") || Etmenu2.getText().toString().replace("", "").equals("")
                        || Etmenu3.getText().toString().replace("", "").equals("") || EtTel.getText().toString().replace("", "").equals("") || Ethomepage.getText().toString().replace("", "").equals("")){
                    Toast.makeText(getBaseContext(), "값을 입력해주세요", Toast.LENGTH_SHORT);
                }
                else{
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    data[catNum].setName(Etname.getText().toString());
                    data[catNum].setMenu(new String[]{Etmenu1.getText().toString(), Etmenu2.getText().toString(), Etmenu3.getText().toString()});
                    data[catNum].setTel(EtTel.getText().toString());
                    data[catNum].setHomepage(Ethomepage.getText().toString());
                    data[catNum].setCategoryNum(catNum);

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                    Calendar calendar = Calendar.getInstance();
                    String today = sdf.format(calendar.getTime());
                    data[catNum].setDate(today);
                    intent.putExtra("name", data[catNum].getName());
                    intent.putExtra("menu", data[catNum].getMenu());
                    intent.putExtra("tel", data[catNum].getTel());
                    intent.putExtra("name", data[catNum].getName());
                    intent.putExtra("name", data[catNum].getName());
                    intent.putExtra("name", data[catNum].getName());
                    setResult(RESULT_OK);
                    finish();
                }
            }
        });
    }
}
