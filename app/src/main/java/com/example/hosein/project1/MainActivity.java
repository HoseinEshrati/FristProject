package com.example.hosein.project1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btnad);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);



    }
});






    }
}
