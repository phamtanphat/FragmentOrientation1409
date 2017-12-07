package com.ptp.phamtanphat.fragmentorientation1409;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SendData{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void RetriveData(Sinhvien sinhvien) {
        Fragment_Info_Sinhvien fragment_info_sinhvien = (Fragment_Info_Sinhvien) getFragmentManager().findFragmentById(R.id.fragmentinfosv);
        if (fragment_info_sinhvien != null && fragment_info_sinhvien.isInLayout()){
            fragment_info_sinhvien.GetDataSetText(sinhvien);
        }


    }
}
