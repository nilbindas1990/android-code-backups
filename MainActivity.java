package myapp.test.nilabhra.com.vollyjsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String url = "https://webqueuesolution.com/samples/projects/sandip/android_development/test_api/read.php";

    ListView listview;

    List<DataObject>  myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);
        myList = new ArrayList<>();

        getTheList();
    }

    private getTheList() {

    }
}
