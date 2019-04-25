package sg.edu.rp.dmsd.sgholidaysv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSecular;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        lvSecular = findViewById(R.id.ListViewSecular);

        al = new ArrayList<String>();
        al.add("Secular");

        lvSecular.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String pos = al.get(position);
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("holiday",pos);
                startActivity(i);
            }
        });

        aa = new ArrayAdapter<>(this, R.layout.activity_main, al);
        lvSecular.setAdapter(aa);
    }
}
