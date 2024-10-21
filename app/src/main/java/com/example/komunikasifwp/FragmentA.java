package com.example.komunikasifwp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    private OnFragmentAListener mListener;

    public interface OnFragmentAListener {
        void onButtonClicked(String message);
    }

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActivity() instanceof OnFragmentAListener) {
            mListener = (OnFragmentAListener) getActivity();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button button = view.findViewById(R.id.button_fragment_a);
        button.setOnClickListener(v -> {
            if (mListener != null) {
                mListener.onButtonClicked("Hello from FragmentA");
            }
        });
        return view;
    }
}
