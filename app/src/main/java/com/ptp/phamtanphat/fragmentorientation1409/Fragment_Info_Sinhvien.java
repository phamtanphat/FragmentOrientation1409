package com.ptp.phamtanphat.fragmentorientation1409;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 7/12/2017.
 */

public class Fragment_Info_Sinhvien extends Fragment {
    TextView txttensv,txtlopsv,txtemail,txtdiachi;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_info_sinhvien,container,false);
        txtdiachi = view.findViewById(R.id.textviewdiachisv);
        txtemail = view.findViewById(R.id.textviewemailsv);
        txtlopsv = view.findViewById(R.id.textviewlopsv);
        txttensv = view.findViewById(R.id.textviewtensv);
        return view;
    }
    public void GetDataSetText(Sinhvien sinhvien){
        txttensv.setText(sinhvien.getTensv());
        txtlopsv.setText(sinhvien.getLop());
        txtemail.setText(sinhvien.getEmail());
        txtdiachi.setText(sinhvien.getDiachi());
    }
}
