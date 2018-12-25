package myapp.test.nilabhra.com.vollyjsontest;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by nilabhra on 12/25/2018.
 */

public class ListViewAdapter extends ArrayAdapter<DataObject> {
    private List<DataObject> listObject;
    private Context myContext;

    public ListViewAdapter(List<DataObject> listObject , Context myContext) {
        super(myContext, R.layout.list_items, listObject);
        this.listObject = listObject;
        this.myContext = myContext;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(myContext);

        View listViewItem = inflater.inflate(R.layout.list_items, null, true);

        TextView textName = (TextView) listViewItem.findViewById(R.id.name);
        TextView textEmail = (TextView) listViewItem.findViewById(R.id.email);
        TextView textPhone = (TextView) listViewItem.findViewById(R.id.phone);

        DataObject dataObject = listObject.get(position);

        textName.setText(dataObject.getName());
        textEmail.setText(dataObject.getEmail());
        textPhone.setText(dataObject.getPhone());

        return listViewItem;
    }
}