package com.example.uas_akb_10118457_fixxxxxxx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;

public class PagerActivity extends AppCompatActivity {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    private pagerAdapter pagerAdapter;
    private LinearLayout layout_view_pager;
    private MaterialButton buttonViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);
        getSupportActionBar().hide();

        layout_view_pager = findViewById(R.id.layoutOnboardingIndicators);
        buttonViewPager = findViewById(R.id.buttonOnboardingAction);

        setupViewPagerItems();

        ViewPager2 viewPager2 = findViewById(R.id.onboardingViewPager);
        viewPager2.setAdapter(pagerAdapter);

        setupViewPagerIndicator();
        setCurrentIndicator(0);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicator(position);
            }
        });

        buttonViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void setupViewPagerItems(){
        List<Itempager> viewPagerItems = new ArrayList<>();

        Itempager first = new Itempager();
        first.setTitle("Vacation");
        first.setImage(R.drawable.ic_suitcases);

        Itempager second = new Itempager();
        second.setTitle("Photo");
        second.setImage(R.drawable.ic_photo);

        Itempager third = new Itempager();
        third.setTitle("Fashion");
        third.setImage(R.drawable.ic_fashion);

        viewPagerItems.add(first);
        viewPagerItems.add(second);
        viewPagerItems.add(third);

        pagerAdapter = new pagerAdapter(viewPagerItems);
    }

    private void setupViewPagerIndicator(){
        ImageView[] indicators = new ImageView[pagerAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for(int i = 0; i < indicators.length; i++){
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layout_view_pager.addView(indicators[i]);
        }
    }

    private void setCurrentIndicator(int index){
        int childCount = layout_view_pager.getChildCount();
        for(int i = 0; i < childCount; i++){
            ImageView imageView = (ImageView) layout_view_pager.getChildAt(i);
            if(i == index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.indicator_active)
                );
            }else {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.indicator_inactive)
                );
            }
        }
        buttonViewPager.setText("Get Started!");
    }
}