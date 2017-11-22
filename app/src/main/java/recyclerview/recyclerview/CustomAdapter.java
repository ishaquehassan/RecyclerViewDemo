package recyclerview.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 11/11/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    ArrayList<Contact> contacts;
    ItemClickListener itemClickListener;

    public CustomAdapter(ArrayList<Contact> contacts, ItemClickListener itemClickListener) {
        this.contacts = contacts;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        RecyclerViewHolder myViewHolder = new RecyclerViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        final Contact contact = contacts.get(position);
        holder.nameTv.setText(contact.getName());
        holder.phoneTv.setText(contact.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onItemClick(contact,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
