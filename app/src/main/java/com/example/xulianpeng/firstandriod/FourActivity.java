package com.example.xulianpeng.firstandriod;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.Window;
public class FourActivity extends AppCompatActivity implements OnClickListener {

    //全局变量的声明
    Button firstBt;
    Button secondBt;

    EditText editText1;

    ImageView myImageView;

    Button custormBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //隐藏标题栏  貌似模拟机 上此方法无效 不知道 真机上是否也是如此
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_four);

        firstBt = (Button) findViewById(R.id.button7);
        firstBt.setOnClickListener(this);

        secondBt = (Button) findViewById(R.id.button8);
        secondBt.setOnClickListener(this);

        editText1 = (EditText)findViewById(R.id.edittextFour);

        myImageView = (ImageView)findViewById(R.id.imageViewFour);

        custormBt = (Button) findViewById(R.id.button9);
        custormBt.setOnClickListener(this);

    }

    //实现一个功能 点击按钮 获取到 editText的内容 然后 通过 Toast展示出来
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button7:
                firstBt.setTextColor(Color.GREEN);

//获取到 edittext的输入内容
                String inputText = editText1.getText().toString();

                Toast.makeText(FourActivity.this,inputText,Toast.LENGTH_SHORT).show();

                myImageView.setImageResource(R.drawable.textimage); //图片的命名 必须是 小写的


                Intent intent1 = new Intent(FourActivity.this,FirstListViewActivity.class);
                startActivity(intent1);

                break;
            case R.id.button8:
                secondBt.setBackgroundColor(Color.CYAN);

                Intent intent = new Intent(FourActivity.this,TwoActivity.class);
                startActivity(intent);
                break;
            case R.id.button9:

                Intent intent2 = new Intent(FourActivity.this,SecondListViewActivity.class);
                startActivity(intent2);
        }
    }
}
