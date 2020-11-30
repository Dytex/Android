package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends Activity_abstract{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity3);

        Button myButton = findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    public void addFromVariable(View view) {
        Activity_abstract.Nombre ++;
    }

    public void retreveFromVariable(View view) {
        Activity_abstract.Nombre --;
    }

    public void displayNumber(View view) {
        TextView myDataField = findViewById(R.id.myNumber);
        myDataField.setText(Integer.toString(Activity_abstract.Nombre));
    }
}
