package tech.mr.calculator__demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private EditText editText1;
   private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnequal,btnclear,btndot;
   private float val1,val2;
   boolean doadd,dosub,domul,dodiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.edittext);
        btn1 = (Button)findViewById(R.id.one);
        btn2 = (Button)findViewById(R.id.two);
        btn3 = (Button)findViewById(R.id.three);
        btn4 = (Button)findViewById(R.id.four);
        btn5 = (Button)findViewById(R.id.five);
        btn6 = (Button)findViewById(R.id.six);
        btn7 = (Button)findViewById(R.id.seven);
        btn8 = (Button)findViewById(R.id.eight);
        btn9 = (Button)findViewById(R.id.nine);
        btn0 = (Button)findViewById(R.id.zero);
        btnadd = (Button)findViewById(R.id.add);
        btnsub = (Button)findViewById(R.id.subtract);
        btnmul = (Button)findViewById(R.id.multiply);
        btndiv = (Button)findViewById(R.id.divide);
        btnequal = (Button)findViewById(R.id.equals);
        btnclear = (Button)findViewById(R.id.Clear);
        btndot = (Button)findViewById(R.id.dot);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "1";
                editText1.setText(str2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "2";
                editText1.setText(str2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "3";
                editText1.setText(str2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "4";
                editText1.setText(str2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "5";
                editText1.setText(str2);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "6";
                editText1.setText(str2);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "7";
                editText1.setText(str2);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "8";
                editText1.setText(str2);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "9";
                editText1.setText(str2);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + "0";
                editText1.setText(str2);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText1.getText().toString();
                String str2 = str1 + ".";
                editText1.setText(str2);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    val1 = Float.parseFloat(editText1.getText() + "");
                    doadd = true;
                    editText1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    val1 = Float.parseFloat(editText1.getText() + "");
                    dosub = true;
                    editText1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    val1 = Float.parseFloat(editText1.getText() + "");
                    domul = true;
                    editText1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1 == null) {
                    editText1.setText("");
                } else {
                    val1 = Float.parseFloat(editText1.getText() + "");
                    dodiv = true;
                    editText1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(editText1.getText() + "");
                if (doadd) {
                    editText1.setText(val1 + val2 + "");
                    doadd = false;
                }

                if (dosub) {
                    editText1.setText(val1 - val2 + "");
                    dosub = false;
                }

                if (domul) {
                    editText1.setText(val1 * val2 + "");
                    domul = false;
                }

                if (dodiv) {
                    editText1.setText(val1 / val2 + "");
                    dodiv = false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
            }
        });


    }
}
