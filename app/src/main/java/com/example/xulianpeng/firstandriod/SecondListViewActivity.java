package com.example.xulianpeng.firstandriod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondListViewActivity extends AppCompatActivity {

    private List<FruitModel> fruitList = new ArrayList<FruitModel>();


    private String newsArr[] = {"互联网产品中的情感化设计", "有效导向社交产品的商业价值", "移动开发者：得90后者得天下",
            "用户体验：从App的加载页面说开去", "用扁平化的界面设计吸引用户", "实体与数字世界的交集",
            "网络社区用户成长的5个思考模式", "十大值得关注的传统企业电商", "2013年十大热点技术发展趋势", "了解产品的开发环节：环形设计论",
            "客户忠诚度的四个层次", "在手机背面贴张'纸'就能轻松充电", "互联网公司是怎样激发你的消费欲望的", "高效工作的信息搜集及管理术"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_list_view);

        initFruits(); // 初始化水果数据

        FruitAdpter adapter1 = new FruitAdpter(SecondListViewActivity.this,
                R.layout.second_listcell, fruitList);

        ListView listView1 = (ListView) findViewById(R.id.list_view2);
        listView1.setAdapter(adapter1);

    }


    private void initFruits() {
        FruitModel apple = new FruitModel("Apple", R.drawable.textimage);
        fruitList.add(apple);
        FruitModel banana = new FruitModel("Banana", R.drawable.textimage);
        fruitList.add(banana);
        FruitModel orange = new FruitModel("Orange", R.drawable.textimage);
        fruitList.add(orange);
        FruitModel watermelon = new FruitModel("Watermelon", R.drawable.textimage);
        fruitList.add(watermelon);
        FruitModel pear = new FruitModel("Pear", R.drawable.textimage);
        fruitList.add(pear);
        FruitModel grape = new FruitModel("Grape", R.drawable.textimage);
        fruitList.add(grape);
        FruitModel pineapple = new FruitModel("Pineapple", R.drawable.textimage);
        fruitList.add(pineapple);
        FruitModel strawberry = new FruitModel("Strawberry", R.drawable.textimage);
        fruitList.add(strawberry);
        FruitModel cherry = new FruitModel("Cherry", R.drawable.textimage);
        fruitList.add(cherry);
        FruitModel mango = new FruitModel("Mango", R.drawable.textimage);
        fruitList.add(mango);
    }
}


//创建 装配数组的 装配器

