package com.example.android.inclassassignment06_linga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mFriName,mFriAge,mFriInfo;
    CheckBox mEatSweets;
    RadioGroup g1;
    String canDrinkAlcohol;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViewControls();

        g1 =(RadioGroup) findViewById(R.id.radioGroup);
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.adult_radioButton){
                    canDrinkAlcohol = "Yes!!!";
                }
                if(checkedId==R.id.minor_radioButton){
                    canDrinkAlcohol = "Not yet!!!";
                }
            }
        });
    }


    private void intializeViewControls(){
        mFriName = findViewById(R.id.friNmae);
        mFriAge = findViewById(R.id.friAge);
        mFriInfo = findViewById(R.id.friInfo);
        mEatSweets = findViewById(R.id.sweets_checkBox);

        findViewById(R.id.submit_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String friName = mFriName.getText().toString();
        int friAge = Integer.valueOf(mFriAge.getText().toString());
        String friInfo = mFriInfo.getText().toString();
        boolean eatSweets = mEatSweets.isChecked();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        Friend mFriend = new Friend(friName,friInfo,friAge,eatSweets,canDrinkAlcohol);
        intent.putExtra(Keys.FRIEND,mFriend);

        startActivity(intent);
    }



}

