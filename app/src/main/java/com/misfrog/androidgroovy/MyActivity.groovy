package com.misfrog.androidgroovy;

import android.app.Activity;
import android.os.Bundle
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem
import android.widget.Toast
import groovy.transform.CompileStatic;

@CompileStatic
public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            def hello = { lang ->
                def toast = Toast.makeText(this, "Hello ${lang}!", Toast.LENGTH_LONG)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
            hello("Groovy")
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
