package com.example.daniel.w6d3_homework2.fragmentmenu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.w6d3_homework2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    private TextView textView;

    private String title;
    private int page;

    public FragmentTwo() {
        // Required empty public constructor
    }

    public static FragmentTwo newInstance(int page, String title){
        FragmentTwo fragmentTwo = new FragmentTwo();
        Bundle args = new Bundle();
        args.putInt("fTwo", page);
        args.putString("titleTwo", title);
        fragmentTwo.setArguments(args);

        return fragmentTwo;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        page = getArguments().getInt("fTwo", 1);
        title = getArguments().getString("titleTwo");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_two, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView)getView().findViewById(R.id.fft_textVw);
        textView.setText(page + " - " + title);

        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragmenttwo_menu, menu);
        //super.onCreateOptionsMenu(menu, inflater);
    }
}
