package com.example.chema_pc.miaudiolibrosclase.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chema_pc.miaudiolibrosclase.R;
import com.example.chema_pc.miaudiolibrosclase.modelo.BookInfo;
import com.example.chema_pc.miaudiolibrosclase.modelo.DAOBookInfo;


public class DetalleFragment extends Fragment {

    public static String ARG_POSITION = "index";
    AppCompatActivity activity;

    private OnFragmentInteractionListener mListener;

    public DetalleFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflateView = inflater.inflate(R.layout.fragment_detalle, container, false);

        Bundle args = getArguments();

        if(args != null){
            int index = args.getInt(ARG_POSITION);
            setUpBookInfo (index, inflateView);
        }else{
            setUpBookInfo (0, inflateView);
        }

        return inflateView;
    }

    private void setUpBookInfo(int index, View inflateView) {

        BookInfo bookInfo = DAOBookInfo.getAllBooks().get(index);
        TextView txtTitulo = (TextView)inflateView.findViewById(R.id.textView1);
        TextView txtAutor = (TextView)inflateView.findViewById(R.id.textView2);
        ImageView img = (ImageView)inflateView.findViewById(R.id.imageView1);
        txtTitulo.setText(bookInfo.getNombre());
        txtAutor.setText(bookInfo.getAutor());
        img.setImageResource(bookInfo.getResourceImg());

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (AppCompatActivity) context;

        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            //throw new RuntimeException(context.toString()
                    //+ " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
