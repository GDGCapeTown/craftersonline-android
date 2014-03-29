package com.gdgcapetown;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.graphics.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		ListView listView = (ListView)findViewById(R.id.mainMenuListView);

		final ArrayAdapter adapter = new ComfortArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		adapter.add(getResources().getString(R.string.editInfo));
		adapter.add(getResources().getString(R.string.addProduct));
		adapter.add(getResources().getString(R.string.editProduct));
		adapter.add(getResources().getString(R.string.removeProduct));
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, final View view,
										int position, long id) {
					switch(position){
						case 0:
							final String item = (String) parent.getItemAtPosition(position);
							Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT).show();
							break;
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
					}

				}

			});
		setBackground();
    }

	@Override
	private void setBackground(){
		View view = this.getWindow().getDecorView();
		int orientation = getResources().getConfiguration().orientation;
	}

	private class ComfortArrayAdapter<T> extends ArrayAdapter<T> {

		public ComfortArrayAdapter(Activity activity, int view){
			super(activity, view);
		}

		public ComfortArrayAdapter(Activity activity, int view, List items){
			super(activity, view, items);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = (TextView)super.getView(position, convertView, parent);
			tv.setTextColor(Color.BLACK);
			return tv;
		}
	}
}
