package com.example.admin.demoviewpager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.demoviewpager.R;

/**
 * Created by Admin on 21/4/2018.
 */

public class CategoryFragment extends Fragment implements View.OnClickListener {

    private TextView tvCate1;
    private TextView tvCate2;
    private TextView tvCate3;
    private TextView tvCate4;
    private TextView tvCate5;
    private TextView tvCate6;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tvCate1 = view.findViewById(R.id.tvCate1);
        tvCate2 = view.findViewById(R.id.tvCate2);
        tvCate3 = view.findViewById(R.id.tvCate3);
        tvCate4 = view.findViewById(R.id.tvCate4);
        tvCate5 = view.findViewById(R.id.tvCate5);
        tvCate6 = view.findViewById(R.id.tvCate6);
        tvCate1.setOnClickListener(this);
        tvCate2.setOnClickListener(this);
        tvCate3.setOnClickListener(this);
        tvCate4.setOnClickListener(this);
        tvCate5.setOnClickListener(this);
        tvCate6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvCate1:
                Toast.makeText(getContext(), tvCate1.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCate2:
                Toast.makeText(getContext(), tvCate2.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCate3:
                Toast.makeText(getContext(), tvCate3.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCate4:
                Toast.makeText(getContext(), tvCate4.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCate5:
                Toast.makeText(getContext(), tvCate5.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvCate6:
                Toast.makeText(getContext(), tvCate6.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
