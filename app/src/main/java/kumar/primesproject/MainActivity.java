package kumar.primesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    int i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2 =(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int flag = 0;
                String res = e3.getText().toString();
                for (int i = num1; i <= num2; i++) {
                    flag = 0;
                    for (int j = 2; j < num1; j++) {
                        if (i % j == 0) {
                            flag = 1;
                            j = num1;
                        }
                    }
                    if(flag==0)
                        e3.setText(e3.getText().toString()+" " + i);
                }

            }
        });
    }
}
