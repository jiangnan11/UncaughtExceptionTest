package com.example.lihao.uncaughtexceptiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.itgoyo.logtofilelibrary.LogToFileUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.tv_test)
    TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        LogToFileUtils.init(this); //初始化

        LogToFileUtils.write("sample text");//写入日志
    }

    @OnClick(R.id.tv_test)
    public void onViewClicked() {
        String s = null;
        s.toString();  //抛出NullPointException
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.d("Sandy", "I am a sub thread");
//                String s = null;
//                s.toString();  //抛出NullPointException
//            }
//        }, "sub  thread");
//        thread.start();
    }
}
