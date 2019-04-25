package sg.edu.rp.dmsd.sgholidaysv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvHoliday;

    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        lvHoliday = (ListView) this.findViewById(R.id.ListViewHoliday);


        Intent i = getIntent();
        String year = i.getStringExtra("holiday");

        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday("Chinese New Year", true));
        holiday.add(new Holiday("Good Friday", false));


        aa = new HolidayAdapter(this, R.layout.layout2,holiday);
        lvHoliday.setAdapter(aa);
    }
}
