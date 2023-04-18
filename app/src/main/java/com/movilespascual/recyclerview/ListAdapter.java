package com.movilespascual.recyclerview;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListaElementos> misDatos;
    private LayoutInflater myInflater;
    private Context myContext;
    RelativeLayout sms;


    public ListAdapter(List<ListaElementos> itemList, Context context) {
        this.misDatos = itemList;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    //public void setItems(List<ListaElementos> items){ misDatos= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, city, status, mail, Letra;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mail = itemView.findViewById(R.id.mailTextView);
            iconImage = itemView.findViewById(R.id.iconoImageView);
            name = itemView.findViewById(R.id.nameTextView);
            city = itemView.findViewById(R.id.cityTextView);
            status = itemView.findViewById(R.id.statusTextView);
            Letra = itemView.findViewById(R.id.initial);
            sms=itemView.findViewById(R.id.mensaje);
        }

        void bindData(final ListaElementos item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            mail.setText("Correo: " + item.getMail());
            name.setText(item.getName());
            city.setText("Ciudad: " +item.getCiudad());
            status.setText("Estado: " +item.getEstado());
            Letra.setText(item.getLetra());
            sms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onCreate(item);
                }
            });
        }

        protected void onCreate(ListaElementos item ) {

            Intent intent = new Intent(myContext, Mensaje.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("ciudad",item.getCiudad());
            intent.putExtra("estado",item.getEstado());
            intent.putExtra("mail", item.getMail());
            myContext.startActivity(intent);
        }

    }

}
