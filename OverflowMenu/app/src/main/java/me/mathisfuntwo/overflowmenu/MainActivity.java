package me.mathisfuntwo.overflowmenu;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		RelativeLayout mainView = (RelativeLayout)findViewById(R.id.mainView);

		switch(item.getItemId()) {
			case R.id.menuRed:
				if(item.isChecked()) {
					item.setChecked(false);
				}
				else {
					item.setChecked(true);
				}
				mainView.setBackgroundColor(Color.RED);
				return true;
			case R.id.menuGreen:
				if(item.isChecked()) {
					item.setChecked(false);
				}
				else {
					item.setChecked(true);
				}
				mainView.setBackgroundColor(Color.GREEN);
				return true;
			case R.id.menuYellow:
				if(item.isChecked()) {
					item.setChecked(false);
				}
				else {
					item.setChecked(true);
				}
				mainView.setBackgroundColor(Color.YELLOW);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}
