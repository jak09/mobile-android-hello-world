package fr.qme.betarray.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import fr.qme.betarray.R;

public class MenuActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_menu);
    }
    
    public void onClickCreateBetArray(View view) {
        Intent intent = new Intent(this, BetArrayActivity.class);
        startActivity(intent);
    }
    
}
