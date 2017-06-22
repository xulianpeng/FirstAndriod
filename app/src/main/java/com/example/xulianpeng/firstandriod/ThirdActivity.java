package com.example.xulianpeng.firstandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {

    private ListView myListView = null;
    private String newsArr[] = { "互联网产品中的情感化设计", "有效导向社交产品的商业价值", "移动开发者：得90后者得天下",
            "用户体验：从App的加载页面说开去", "用扁平化的界面设计吸引用户", "实体与数字世界的交集",
            "网络社区用户成长的5个思考模式", "十大值得关注的传统企业电商", "2013年十大热点技术发展趋势","了解产品的开发环节：环形设计论",
            "客户忠诚度的四个层次","在手机背面贴张'纸'就能轻松充电","互联网公司是怎样激发你的消费欲望的","高效工作的信息搜集及管理术" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ThirdActivity.this, android.R.layout.simple_list_item_1,newsArr);

        myListView = (ListView) findViewById(R.id.list_view3);
        myListView.setAdapter(adapter);
    }
}
