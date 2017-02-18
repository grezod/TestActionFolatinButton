package iii.org.tw.testactionfolatinbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import static android.R.attr.action;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //**
        //final View actionB = findViewById(R.id.action_b);


        //*好像不能增加複數按鈕**
        /*
        FloatingActionButton actionC = new FloatingActionButton(getBaseContext());
        actionC.setTitle("Hide/Show Action above++++");
        actionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                Toast.makeText(MainActivity.this,"yo",Toast.LENGTH_LONG).show();
            }
        });
        */

        //**
        //*可以抓到按鈕*

       FloatingActionButton actionB = (FloatingActionButton)findViewById(R.id.action_b);
        actionB.setTitle("456");
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"B",Toast.LENGTH_SHORT).show();

            }
        });
        FloatingActionButton actionA = (FloatingActionButton)findViewById(R.id.action_a);
        actionA.setTitle("123");
        actionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"A",Toast.LENGTH_SHORT).show();

            }
        });

        //**
        //**


        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);

        //**


        //*可以抓到按鈕*
        /*
       FloatingActionButton actionB = (FloatingActionButton)findViewById(R.id.action_b1);
        actionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
        //**
    }
}
