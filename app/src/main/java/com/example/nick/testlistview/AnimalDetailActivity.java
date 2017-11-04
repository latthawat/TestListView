package com.example.nick.testlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nick.testlistview.Model.Animal;

/**
 * Created by Nick on 4/11/2560.
 */

public class AnimalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        ImageView AnimalImageView = (ImageView) findViewById(R.id.AnimalImageView);
        TextView AnimalDetailTextView = (TextView) findViewById(R.id.AnimalDetail);

        Intent intent = getIntent();
        int position =intent.getIntExtra("position",0);

        AnimalData animalData = AnimalData.getsInstant();
        Animal animal = animalData.animalList.get(position);


        AnimalImageView.setImageResource(animal.pic);
        AnimalDetailTextView.setText(animal.detail);

        getSupportActionBar().setTitle(animal.name);


    }
}
