package com.example.android.udacitymiwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // bind view
        TextView mTvNumbers = findViewById(R.id.numbers);
        TextView mTvFamilyMembers = findViewById(R.id.family);
        TextView mTvColors = findViewById(R.id.colors);
        TextView mTvPhrases = findViewById(R.id.phrases);

        //attach on click listener to view
        mTvNumbers.setOnClickListener(new View.OnClickListener() {
            // above in the parameter, we create a new anonymous subclass of View.OnClickListener
            // and calling its constructor.
            // then we can implement its method (because it is interface) using { } after constructor.
            // In summary, we implemented a interface abstract method inside a new object
            // inside setOnClickListener parameter.
            @Override
            public void onClick(View view) {
                // create a new intent to open the {@link NumbersActivity}
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });

        mTvFamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(intent);
            }
        });

        mTvColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });

        mTvPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });


    }

}