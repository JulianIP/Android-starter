package h.jpandullo.mapapptest.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import h.jpandullo.mapapptest.Models.ModelReciclerItem;
import h.jpandullo.mapapptest.R;

public class RecyclerItemAdapter extends RecyclerView.Adapter<RecyclerItemAdapter.RecyclerItemHolder>  {
    ArrayList<ModelReciclerItem> items;

    public RecyclerItemAdapter(ArrayList<ModelReciclerItem> list) {
        this.items = list;
    }

    @Override
    public RecyclerItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_list,null,false);
        return new RecyclerItemHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerItemHolder holder, int position){
        holder.txtNombre.setText(items.get(position).nombre);
        holder.txtDescripcion.setText(items.get(position).descripcion);
    }

    public int getItemCount(){
        return items.size();
    }

    public class RecyclerItemHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtDescripcion;

        public RecyclerItemHolder(View itemView){
            super(itemView);
            txtNombre = itemView.findViewById(R.id.textNombre);
            txtDescripcion = itemView.findViewById(R.id.textDescripcion);
        }
    }
}
