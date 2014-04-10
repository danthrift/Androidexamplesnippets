package com.danthrift.buttons11;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.textentrylayout);
		
		Button chkCmd = (Button) findViewById(R.id.bResults);
		ToggleButton passTog = (ToggleButton)findViewById(R.id.tbPassword);
		EditText input = (EditText) findViewById(R.id.etCommands);	
		TextView tv = (TextView) findViewById(R.id.textView1);
		
		
		///////////////////////Set up onclick listener
		passTog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		} );
		
		chkCmd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	
	}
	
	
	

	
	
	
	
}
