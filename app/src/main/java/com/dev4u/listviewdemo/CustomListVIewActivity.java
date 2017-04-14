package com.dev4u.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class CustomListVIewActivity extends AppCompatActivity {

    //Các hình ảnh của từng Item trong ListView
    public static int[] imgAvatar = {R.drawable.birthday, R.drawable.newyear,
            R.drawable.valentine, R.drawable.gmn, R.drawable.ngvn, R.drawable.pnvn,
            R.drawable.qtpn, R.drawable.gn, R.drawable.noel, R.drawable.smile};
    //Nội dung của từng Item trong ListView
    public static String[] tvNoiDung = {"Sinh nhật", "Chúc mừng năm mới",
            "Valentine", "GoodMorning", "Nhà giáo Việt Nam", "Ngày Phụ nữ Việt Nam",
            "Quốc tế phụ nữ", "Chúc ngủ ngon", "Noel", "Giải trí"};

    ListView lvCustomListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        //get ListView theo ID từ layout xml
        lvCustomListView = (ListView) findViewById(R.id.lvCustomListView);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
        lvCustomListView.setAdapter(new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar));
    }
}
