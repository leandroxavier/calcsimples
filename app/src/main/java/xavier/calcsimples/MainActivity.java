package xavier.calcsimples;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void op(View view){
        Log.d("Teste","passei por aqui");
        EditText edt = (EditText) findViewById(R.id.tex1);
        EditText edt2 = (EditText) findViewById(R.id.tex2);
        TextView txt =(TextView) findViewById(R.id.textView4);

        String valor1 = edt.getText().toString();
        String valor2 = edt2.getText().toString();
        int x =  Integer.parseInt(valor1);
        int y = Integer.parseInt(valor2);

        Log.d("Teste","valor1: " + valor1 + " valor2: " + valor2);

        String a = view.getTag().toString();

        if(a.equals("soma")){
           int r = x+y;
            String re ="O resultado é "+ r;
            txt.setText(re);

        }
        if(a.equals("sub")){
           int r = x-y;
            String re ="O resultado é "+ r;
            txt.setText(re);

        }
        if(a.equals("mul")){
            int r = x*y;
            String re ="O resultado é "+ r;
            txt.setText(re);

        }
        if (a.equals("div")) {

            if(y!=0){
               double r = x/y;
                String re ="O resultado é "+ r;
                txt.setText(re);

            }else{
               int  r=0;
                String re ="O resultado é "+ r;
                txt.setText(re);

            }
        }


    }

}
