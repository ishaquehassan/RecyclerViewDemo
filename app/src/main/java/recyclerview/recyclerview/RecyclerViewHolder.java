package recyclerview.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 11/11/2017.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    TextView nameTv;
    TextView phoneTv;


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.nameTv);
        phoneTv = itemView.findViewById(R.id.phoneTv);
    }
}
