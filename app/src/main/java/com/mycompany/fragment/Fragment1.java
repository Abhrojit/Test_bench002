package com.mycompany.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Abhrojit on 9/2/2015.
 */
public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_fragment1,container,false);
    }

}
