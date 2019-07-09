package c346.rp.edu.sg.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class EmployeeListAdapter extends ArrayAdapter {

    Context mContext;
    ArrayList<Employee> employeeArrayList;
    int layout_id;
    LayoutInflater inflater;

    public EmployeeListAdapter(Context context, int layout_id, ArrayList<Employee> employeeArrayList) {
        super(context, layout_id, employeeArrayList);
        this.mContext = context;
        this.layout_id = layout_id;
        this.employeeArrayList = employeeArrayList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(layout_id, null);

        TextView name, title, salary;

        name = convertView.findViewById(R.id.nameTv);
        title = convertView.findViewById(R.id.titleTv);
        salary = convertView.findViewById(R.id.salaryTv);

        name.setText(employeeArrayList.get(position).getName());
        title.setText(employeeArrayList.get(position).getTitle());
        salary.setText(employeeArrayList.get(position).getSalary());

        return convertView;
    }
}
