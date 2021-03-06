package com.example.activity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {


        private Integer counter = 0;
        private Integer limit = 10;
        public static final String TAG = "StartActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate");
        }

        public void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            if (savedInstanceState != null &&
                    savedInstanceState.containsKey("counter")) {
                counter = savedInstanceState.getInt("counter");
            }
            resetUI();
            Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
            Log.d(TAG, "onRestoreInstanceState");
        }

        public void onRestart() {
            super.onRestart();
            Log.d(TAG, "onRestart");
            Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
        }

        public void onStart() {
            super.onStart();
            Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
            Log.d(TAG, "onStart");
            resetUI();
        }

        public void onResume() {
            super.onResume();
            Log.d(TAG, "onResume");
            Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
        }

        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("counter", counter);
            Log.d(TAG, "onSaveInstanceState");
            Toast.makeText(this, "onSaveInstance()", Toast.LENGTH_LONG).show();
        }

        public void onPause() {
            super.onPause();
            Log.d(TAG, "onPause");
            Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
        }

        public void onStop() {
            super.onStop();
            Log.d(TAG, "onStop");
            Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
        }

        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "Destroye");
            Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
        }

        private void resetUI() {
            ((TextView) findViewById(R.id.textView)).setText(counter.toString());
            Log.d(TAG, "resetUI");
            Toast.makeText(this, "ResetUI()", Toast.LENGTH_LONG).show();
        }


        public void onButtonAdd(View view) {
            counter++;
            TextView counterView = (TextView) findViewById(R.id.textView);
            counterView.setText(Integer.toString(counter));
        }

    }


