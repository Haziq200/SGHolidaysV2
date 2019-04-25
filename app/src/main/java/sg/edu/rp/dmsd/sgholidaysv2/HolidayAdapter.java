package sg.edu.rp.dmsd.sgholidaysv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private Context context;
    private ArrayList<Holiday> holidays;
    private TextView tvDate;
    private TextView tvHolName;
    private ImageView ivHoliday;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        holidays = objects;

        this.context = context;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.layout2, parent, false);

        tvHolName = rowView.findViewById(R.id.textViewHolidayName);

        tvDate = rowView.findViewById(R.id.textViewDate);

        ivHoliday = rowView.findViewById(R.id.imageViewHoliday);


        Holiday currentHoliday = holidays.get(position);

        tvHolName.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getName());

        if (currentHoliday.isProg()) {
            ivHoliday.setImageResource(R.drawable.cny);
        } else {
            ivHoliday.setImageResource(R.drawable.newyear);
        }
        return rowView;
    }

    {
    }
}
