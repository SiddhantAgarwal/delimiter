package com.example.delimiter;

import android.R.string;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.example.delimiter.SimpleIntentService;
public class MainActivity extends Activity implements OnItemSelectedListener{
	
	Spinner car;
	TextView tv;
	CharSequence text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = (Spinner) findViewById(R.id.carriers);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this, R.array.carriers, android.R.layout.simple_spinner_item);
     // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        car.setAdapter(adapter);
        car.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        text = parent.getItemAtPosition(pos).toString();
    	tv = (TextView) findViewById(R.id.tv);
    	CharSequence cmp="Docomo";
  
    		try{
    		Uri call = Uri.parse("tel:"+Uri.encode("*")+"111"+Uri.encode("#"));
    		Intent surf = new Intent(Intent.ACTION_CALL, call); 
    		startService(surf);tv.setText(text);
    		}
    		catch(Exception ex)
    		{
    			tv.setText("Error"+ex);
    		}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
