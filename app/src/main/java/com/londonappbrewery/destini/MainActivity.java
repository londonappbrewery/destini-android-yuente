package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mCurrentState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mCurrentState = R.string.T1_Story;
        mStoryTextView.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentState == R.string.T1_Story || mCurrentState == R.string.T2_Story){
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mCurrentState = R.string.T3_Story;
                }
                else if (mCurrentState == R.string.T3_Story){
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                    mCurrentState = R.string.T6_End;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentState == R.string.T1_Story){
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mCurrentState = R.string.T2_Story;
                }
                else if (mCurrentState == R.string.T3_Story){
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                    mCurrentState = R.string.T5_End;
                }
                else if (mCurrentState == R.string.T2_Story){
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setText("");
                    mButtonBottom.setText("");
                    mCurrentState = R.string.T4_End;
                }
            }
        });

    }
}
