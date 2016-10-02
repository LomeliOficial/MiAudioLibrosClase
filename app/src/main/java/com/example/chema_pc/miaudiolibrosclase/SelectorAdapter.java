package com.example.chema_pc.miaudiolibrosclase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chema_pc.miaudiolibrosclase.modelo.BookInfo;

import java.util.List;

/**
 * Created by Chema-pc on 15/09/2016.
 */
public class SelectorAdapter extends BaseAdapter
{
    LayoutInflater layoutInflater;
    List<BookInfo> _lst;

    public SelectorAdapter(Context ctx, List<BookInfo> lst) {
        this._lst = lst;
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return _lst.size();
    }

    @Override
    public Object getItem(int position) {
        return _lst.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ImageView imageView1;
        TextView titulo;

        BookInfo itemBook = _lst.get(position);

        View viewItem = view;
        if(view==null)
        {
            viewItem = layoutInflater.inflate(R.layout.elemento_selector,null);
        }

        titulo = (TextView)viewItem.findViewById(R.id.txtTitulo);
        titulo.setText(itemBook.getNombre());

        imageView1 = (ImageView)viewItem.findViewById(R.id.imageView1);
        imageView1.setImageResource(itemBook.getResourceImg());
        imageView1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        return viewItem;
    }
}
