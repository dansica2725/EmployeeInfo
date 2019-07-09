package c346.rp.edu.sg.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Employee> employeeList = new ArrayList<>();
    ListView employeeLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeLv = findViewById(R.id.employeeLv);

        employeeList.add(new Employee("John", "Software Technical Leader", "3400.0"));
        employeeList.add(new Employee("May", "Programmer", "2200.0"));

        EmployeeListAdapter adapter = new EmployeeListAdapter(MainActivity.this, R.layout.employee_custom_lv, employeeList);
        employeeLv.setAdapter(adapter);

    }
}
