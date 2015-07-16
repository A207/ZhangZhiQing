
package com.zhang.admin.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(calcBMI);
    };
    private OnClickListener calcBMI = new OnClickListener() {
        public void onClick(View view) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText) findViewById(R.id.Height);
            EditText fieldweight = (EditText) findViewById(R.id.Weight);

            double height = Double.parseDouble(fieldheight.getText().toString()) / 100;
            double weight = Double.parseDouble(fieldweight.getText().toString());
            double BMI = weight / (height * height);
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Your BMI is:"+ nf.format(BMI));

            TextView fieldsuggest = (TextView) findViewById(R.id.suggest);
            if (BMI < 16) {
                fieldsuggest.setText(R.string.weight1);
            } else if (BMI >= 16&&BMI<18.5) {

                fieldsuggest.setText(R.string.weight2);
            } else if (BMI >= 18.5&&BMI<25) {

                fieldsuggest.setText(R.string.weight3);
            } else if (BMI >= 25&&BMI<30) {

                fieldsuggest.setText(R.string.weight4);
            } else if (BMI >= 30&&BMI<35) {

                fieldsuggest.setText(R.string.weight5);
            } else if (BMI >= 35&&BMI<40) {

                fieldsuggest.setText(R.string.weight6);
            } else {
                fieldsuggest.setText(R.string.weight7);
            }

        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}