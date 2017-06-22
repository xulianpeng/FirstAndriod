package com.example.xulianpeng.firstandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.graphics.Color;
import android.content.Intent;


public class TwoActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //遇到了第一个Bug 其控件的布局  不能叠加起来 否则 会影响其点击等属性 刚开始 布局时 先布局了 textview  然后又布局了button button叠加在
        bt = (Button)findViewById(R.id.button6xlp);
        bt.setBackgroundColor(Color.GREEN);

        bt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                bt.setBackgroundColor(Color.GRAY);
                bt.setScaleY(1.5f);
                bt.setTextIsSelectable(true);
                bt.setTextColor(Color.CYAN);
                Toast.makeText(TwoActivity.this,"这是什么鬼啊啦啦啦啦",Toast.LENGTH_SHORT).show();


                 Intent intent = new Intent(TwoActivity.this,FourActivity.class);
                startActivity(intent);
            }
        });



    }
}
