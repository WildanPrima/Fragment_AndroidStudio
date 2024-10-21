package com.example.komunikasifwp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentAListener {

    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment_container_a, fragmentA);
        fragmentTransaction.add(R.id.fragment_container_b, fragmentB);

        fragmentTransaction.commit();
    }

    @Override
    public void onButtonClicked(String message) {
        fragmentB.updateTextView(message);
    }
}
