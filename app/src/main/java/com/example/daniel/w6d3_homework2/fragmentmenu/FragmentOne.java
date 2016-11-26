package com.example.daniel.w6d3_homework2.fragmentmenu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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
public class FragmentOne extends Fragment {

    private static final String TAG = "FragmentOneTAG_";

    private TextView textView;

    private String title;
    private int page;

    public FragmentOne() {
        // Required empty public constructor
    }

    public static FragmentOne newInstance(int page, String title){
        FragmentOne fragmentOne = new FragmentOne();
        Bundle args = new Bundle();
        args.putInt("fOne", page);
        args.putString("titleOne", title);
        fragmentOne.setArguments(args);

        Log.d(TAG, "newInstance: ");

        return fragmentOne;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: ");

        page = getArguments().getInt("fOne", 0);
        title = getArguments().getString("titleOne");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ");

        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView) getView().findViewById(R.id.ffo_textVw);
        textView.setText(page + " - "+title);

        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragmentone_menu, menu);
        //super.onCreateOptionsMenu(menu, inflater);
    }
}
