package com.crc.medicamentos;

import android.content.Context;
import android.os.TestLooperManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Medicamento> {

    private List<Medicamento> mList;
    private Context mContext;
    private int resourceLayout;



    public ListAdapter(@NonNull Context context, int resource, List<Medicamento> objects) {
        super(context, resource, objects);

        this.mList = objects;
        this.mContext = context;
        this.resourceLayout = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null)
            view = LayoutInflater.from(mContext).inflate(R.layout.item_med,null);

        Medicamento medicamento = mList.get(position);

        ImageView imagen = view.findViewById(R.id.fotoMed);
        imagen.setImageResource(medicamento.getImagen());

        TextView nombre = view.findViewById(R.id.txtNombre);
        nombre.setText(medicamento.getNombre());

        TextView cantidad = view.findViewById(R.id.txtCantidad);
        cantidad.setText(medicamento.getCantidad());



        return view;
    }



}
