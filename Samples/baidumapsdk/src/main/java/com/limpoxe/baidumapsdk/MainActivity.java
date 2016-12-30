package com.limpoxe.baidumapsdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (true) {//如果appkey是使用宿主的packageName注册的
            SDKInitializer.initialize(FakeUtil.fakeContext(getApplication()));
        } else {//如果appkey是使用插件的packageName注册的
            SDKInitializer.initialize(getApplication());
        }

        setContentView(R.layout.activity_main);

        mMapView = (MapView) findViewById(R.id.bmapView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapView.onPause();
    }
}
