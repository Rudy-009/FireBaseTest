package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.memberifosetting).setOnClickListener(onClickListener);
    }
    @Override
    public void onStart() {
        super.onStart();
    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) { //클릭된 위젯의 id를 이용
            switch (v.getId()) {
                case R.id.memberifosetting:
                    startMemberInfoSetting();
                    break;
            }
        }
    };
    private void startMemberInfoSetting(){
        Intent intent = new Intent(this, MemberInfoSetting.class);
        startActivity(intent);
    }
}
