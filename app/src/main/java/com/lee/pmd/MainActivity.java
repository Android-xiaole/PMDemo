package com.lee.pmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AdapterViewFlipper adapter_view_flipper;
    private MyAdapter adapter;
    private List<String> datas = new ArrayList<>();
    private String titles[] = {"韦德","詹姆斯","安东尼","保罗"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI(){
        adapter_view_flipper = findViewById(R.id.adapter_view_flipper);
        datas.addAll(Arrays.asList(titles));
        adapter = new MyAdapter(datas);
        adapter_view_flipper.setAdapter(adapter);
    }
}
