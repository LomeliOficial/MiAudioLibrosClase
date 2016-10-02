package com.example.chema_pc.miaudiolibrosclase.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.chema_pc.miaudiolibrosclase.R;
import com.example.chema_pc.miaudiolibrosclase.SelectorAdapter;
import com.example.chema_pc.miaudiolibrosclase.modelo.DAOBookInfo;

/**
 * Created by Chema-pc on 26/09/2016.
 */
public class SelectorFragment extends Fragment {
    AppCompatActivity activity;
    GridView gridView;
    SelectorAdapter adaptador;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity =
                (AppCompatActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View inflatedViev = inflater.inflate(R.layout.fragment_selector_layout, container, false);

        gridView = (GridView)inflatedViev.findViewById(R.id.gridView);

        adaptador = new SelectorAdapter(activity, DAOBookInfo.getAllBooks());

        gridView.setAdapter(adaptador);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return inflatedViev;

    }
}
