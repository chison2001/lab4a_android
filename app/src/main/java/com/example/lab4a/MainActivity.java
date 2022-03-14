package com.example.lab4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> itemList;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =  findViewById(R.id.listView);
        itemList = new ArrayList<>();
        itemList.add(new Item(1, "Ca nấu lẩu, nấu mì mini...", "Shop Devang"));
        itemList.add(new Item(2, "Đồ chơi dạng mô hình ", "Shop Thê giới đồ chơi"));
        itemList.add(new Item(3, "1KG gà bơ tỏi...", "Shop LTD Food"));
        itemList.add(new Item(4, "Hiểu lòng con trẻ", "Shop Minh Long book"));
        itemList.add(new Item(5, "Lãnh đạo đơn giản", "Shop Minh Long book"));
        itemList.add(new Item(6, "Xe cần cẩu đa năng", "Shop Thế giới đồ chơi "));


        ItemAdapter adapter = new ItemAdapter(this, R.layout.item_custom_list_view, itemList);
        listView.setAdapter(adapter);
    }
}