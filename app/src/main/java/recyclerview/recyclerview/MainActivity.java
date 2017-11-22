package recyclerview.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements ItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myRecycler);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        contacts.add(new Contact("Ishaq","03452993669"));
        CustomAdapter adapter = new CustomAdapter(contacts,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClick(Contact contact, int position) {
        Log.e("Contact at "+position,contact.toString());
    }
}
