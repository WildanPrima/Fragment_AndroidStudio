package com.example.komunikasifwp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private TextView textView;

    public FragmentB() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = view.findViewById(R.id.textView_fragment_b);
        return view;
    }

    public void updateTextView(String message) {
        if (textView != null) {
            textView.setText(message);
        }
    }
}
