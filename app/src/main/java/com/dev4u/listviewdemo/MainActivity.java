package com.dev4u.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lvData;
    TextView tvSelection;
    Button btnCustomListView;
    String[] arrData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCustomListView=(Button) findViewById(R.id.btnCustomListView);
        btnCustomListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomListVIewActivity.class));
            }
        });

        //0. Lấy đối tượng textview từ file xml bằng id
        tvSelection = (TextView) findViewById(R.id.tvSelection);
        // 1. Lấy đối tượng listview từ file xml bằng id
        lvData = (ListView) findViewById(R.id.lvData);
        // 2. Khởi tạo dữ liệu cho mảng được hiển thị
        arrData = new String[]{"Item1", "Item2", "Item3", "2Dev4U"};
        // 3. Khởi tạo adapter
        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arrData);
        // 4. Đưa adapter vào listview
        lvData.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        // 5. Hiển thị vị trí và giá trị của phần tử được chọn trong ListView lên TextView
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //đối số position là vị trí phần tử trong mảng String được khởi tạo (arrData)
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvSelection.setText("Vị trí : " + position + " ; Giá trị: " + arrData[position]);
            }
        });
    }

}
