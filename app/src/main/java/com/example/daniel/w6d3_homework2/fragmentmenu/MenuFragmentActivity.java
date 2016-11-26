package com.example.daniel.w6d3_homework2.fragmentmenu;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.daniel.w6d3_homework2.R;

public class MenuFragmentActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fragment);

        viewPager = (ViewPager) findViewById(R.id.amf_viewPager);
        fragmentPagerAdapter = new MenuFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(fragmentPagerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.fom_fragOne:
                Toast.makeText(this, "Menu One", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
