package co.trzcinski.showandhidinguielement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    public void show(View view){
        textView.setVisibility(View.VISIBLE);
    }
    public void hide(View view){

        textView.setVisibility(View.INVISIBLE);
    }
    public void gone(View view){

        textView.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);


    }
}
