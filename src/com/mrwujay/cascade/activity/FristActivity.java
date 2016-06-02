package com.mrwujay.cascade.activity;

import com.mrwujay.cascade.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FristActivity extends Activity{
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		tv = (TextView) findViewById(R.id.tv);
	}
	
	public void click(View v){
		Intent intent = new Intent(this,MainActivity.class);
//		startActivity(intent);
		startActivityForResult(intent, 100);
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		Toast.makeText(this,"aaaa",0).show();
//		data.putExtra("Provice", mCurrentProviceName);
//		data.putExtra("City", mCurrentCityName);
//		data.putExtra("District", mCurrentDistrictName);
//		data.putExtra("ZipCode", mCurrentZipCode);
		String p = data.getStringExtra("Provice");
		String c = data.getStringExtra("City");
		String d = data.getStringExtra("District");
		String z = data.getStringExtra("ZipCode");
		
		tv.setText(p+"----"+c+"------"+d+"------"+z);
	}

}
