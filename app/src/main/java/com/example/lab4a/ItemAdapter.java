package com.example.lab4a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<Item> itemList;

    public ItemAdapter(Context context, int idLayout, ArrayList<Item> itemList) {
        this.context = context;
        this.idLayout = idLayout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
            return  itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context)
                .inflate(idLayout, viewGroup, false);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvProvided = (TextView) view.findViewById(R.id.tvProvided);
        ImageView imageView = (ImageView) view.findViewById(R.id.logo);
        final Item item = itemList.get(i);

            tvName.setText(item.getProductName());
            tvProvided.setText(item.getProvided());
            int idLanguage = item.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.ca_nau_lau);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.ga_bo_toi);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.hieu_long_con_tre);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.lanh_dao_gian_don);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.xa_can_cau);
                    break;

                default:
                    break;
            }



        return view;
    }

}
