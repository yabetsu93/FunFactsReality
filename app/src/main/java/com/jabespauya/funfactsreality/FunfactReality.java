package com.jabespauya.funfactsreality;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class FunfactReality extends AppCompatActivity {

    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private Button mShowfactbutton;
    private TextView mFacttextView;
    private RelativeLayout mRelativelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact_reality);

        //assign view
        mFacttextView =(TextView) findViewById(R.id.factTextView);
        mShowfactbutton = (Button) findViewById(R.id.showfunButton);
        mRelativelayout = (RelativeLayout) findViewById(R.id.RelativeLayout1);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String facts = mFactbook.getFact();
                String colors = mColorWheel.getColors();

                mFacttextView.setText(facts);
                mRelativelayout.setBackgroundColor(Color.parseColor(colors));
                mShowfactbutton.setTextColor(Color.parseColor(colors));
                System.gc();
            }
        };

        mShowfactbutton.setOnClickListener(listener);
    }
}
