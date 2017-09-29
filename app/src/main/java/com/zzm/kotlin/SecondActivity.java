package com.zzm.kotlin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ZhongZiMing on 2017/9/28.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView tv_second = findViewById(R.id.tv_second);

        Button bt_second = findViewById(R.id.bt_second);

        // java 调用 kotlin
        bt_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.Companion.toast("Java调用了kotlin方法", Toast.LENGTH_SHORT);
            }
        });

    }
}
