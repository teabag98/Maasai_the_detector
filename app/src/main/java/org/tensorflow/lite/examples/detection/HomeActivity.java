package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.detectButton)
    Button mDetectButton;
    @BindView(R.id.uploadButton) Button mUploadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        mUploadButton.setOnClickListener(this);
        mDetectButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v == mDetectButton){

            Intent intent = new Intent(HomeActivity.this, DetectorActivity.class);
            startActivity(intent);
        }
     else if(v == mUploadButton){
         Intent intent= new Intent(HomeActivity.this, GoogleVision.class);
         startActivity(intent);
        }

    }
}
