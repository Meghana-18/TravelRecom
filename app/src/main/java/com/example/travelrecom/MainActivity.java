package com.example.travelrecom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainRelLayout;
    GridLayout optionsGridLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionsGridLayout= (GridLayout) findViewById(R.id.optionsGridLayout);

        setToggleEvent(optionsGridLayout);
    }

    private void setToggleEvent(GridLayout optionsGridLayout) {

        for(int i=0; i<optionsGridLayout.getChildCount(); i++)
        {
            final CardView cardview= (CardView) optionsGridLayout.getChildAt(i);

            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(cardview.getCardBackgroundColor().getDefaultColor() == getResources().getColor(R.color.miniblue))
                    {
                        cardview.setCardBackgroundColor(Color.parseColor("#fcbf1e"));
                        Toast.makeText(MainActivity.this, "Selected", Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                        cardview.setCardBackgroundColor(Color.parseColor("#4f81c7"));
                        Toast.makeText(MainActivity.this, "Unselected", Toast.LENGTH_SHORT).show();
                        }
                    }
            })
            ;
        }
    }
}