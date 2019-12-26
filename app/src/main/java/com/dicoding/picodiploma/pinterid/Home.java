package com.dicoding.picodiploma.pinterid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home extends Fragment{

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

       CardView CardViewScan =  view.findViewById(R.id.CardViewScan);
       CardViewScan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), Scan.class);
               startActivity(intent);
           }
       });

       CardView CardViewPickUpCode = view.findViewById(R.id.CardViewPickUpCode);
       CardViewPickUpCode.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), PickUpCode.class);
               startActivity(intent);
           }
       });

        CardView CardViewVoucher = view.findViewById(R.id.CardViewVoucher);
        CardViewVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Voucher.class);
                startActivity(intent);
            }
        });

        CardView CardViewCetakCloud = view.findViewById(R.id.CardViewCetakCloud);
        CardViewCetakCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CetakCloud.class);
                startActivity(intent);
            }
        });

        CardView CardViewUploadFile = view.findViewById(R.id.CardViewUploadFile);
        CardViewUploadFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UploadFile.class);
                startActivity(intent);
            }
        });

       CardView CardViewPayment = view.findViewById(R.id.CardViewPayment);
       CardViewPayment.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), Payment.class);
               startActivity(intent);
           }
       });

        return view;
    }

}
