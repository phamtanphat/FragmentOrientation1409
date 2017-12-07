package com.ptp.phamtanphat.fragmentorientation1409;

import android.app.ListActivity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 7/12/2017.
 */

public class Fragment_List_Sinhvien extends ListFragment {

    ArrayList<Sinhvien> mangsinhvien;
    SinhvienAdapter sinhvienAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mangsinhvien = new ArrayList<>();
        mangsinhvien.add(new Sinhvien("Nguyen Van Teo","11A1","nvt11a1@gmail.com","Ben Tre"));
        mangsinhvien.add(new Sinhvien("Nguyen Van Ti","11A1","nvt11a1@gmail.com","Ca Mau"));
        mangsinhvien.add(new Sinhvien("Nguyen Van Loi","11A2","nvl11a2@gmail.com","Tp Ho Chi Minh"));
        mangsinhvien.add(new Sinhvien("Bui Van Tuan","11A2","bvt11a2@gmail.com","Lang Son"));
        mangsinhvien.add(new Sinhvien("Do Nhat Linh","11A3","dnl11a3@gmail.com","Tan Binh"));
        mangsinhvien.add(new Sinhvien("Nguyen Thi Hue","11A3","nth11a3@gmail.com","Go Vap"));
        mangsinhvien.add(new Sinhvien("Tran Van Manh","11A4","tvm11a1@gmail.com","Phu Yen"));
        mangsinhvien.add(new Sinhvien("Le Quoc Dung","11A4","lqd11a1@gmail.com","Son La"));
        mangsinhvien.add(new Sinhvien("Truong Kim Nhat","11A5","tkn11a1@gmail.com","Phu Tho"));
        mangsinhvien.add(new Sinhvien("Le Nguyen Tu","11A5","lnt11a1@gmail.com","Cao Lanh"));
        sinhvienAdapter = new SinhvienAdapter(getActivity(),android.R.layout.simple_list_item_1,mangsinhvien);
        setListAdapter(sinhvienAdapter);
        return inflater.inflate(R.layout.fragment_list_sinhvien,container,false);
    }
}
