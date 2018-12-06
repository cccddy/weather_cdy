package com.example.dell.miniweather;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.dell.app.MyApplication;
import com.example.dell.bean.City;

import java.util.ArrayList;
import java.util.List;

public class SelectCity extends Activity implements View.OnClickListener{

    private ImageView mBackBtn;
    private ListView cityList;
    private EditText searchCity;
    private ImageView searchBtn;

    private List<City> mCityList;
    private MyApplication myApplication;
    private ArrayList<String> mArrayList;
    private String updateCityCode = "-1";
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_city);

        //mBackBtn=(ImageView)findViewById(R.id.title_back);
        //mBackBtn.setOnClickListener(this);

        findViewById(R.drawable.contact_search_box_edittext_keyword_background);

        myApplication = (MyApplication)getApplication();
        mCityList = myApplication.getCityList();
        mArrayList = new ArrayList<String>();
        for(int i=0;i< mCityList.size();i++){
            String No_ = Integer.toString(i+1);
            String number = mCityList.get(i).getNumber();
            String provinceName = mCityList.get(i).getProvince();
            String cityName = mCityList.get(i).getCity();
            Log.d("test", "cityname");
            mArrayList.add("No."+No_+":"+number+"-"+provinceName+"-"+cityName);
        }

        cityList = (ListView) findViewById(R.id.title_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SelectCity.this,android.R.layout.simple_list_item_1,mArrayList);
        cityList.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                updateCityCode = mCityList.get(position).getNumber();
                Log.d("update citycode:",updateCityCode);
            }
        };
        cityList.setOnItemClickListener(itemClickListener);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.title_back:
                //在finish之前将兰州的城市代码传递给startActivityForResult
                Intent i = new Intent();
                i.putExtra("cityCode",updateCityCode);
                setResult(RESULT_OK,i);
                Log.d("citycode:",updateCityCode);
                finish();
                break;
            default:
                break;
        }
    }


}
