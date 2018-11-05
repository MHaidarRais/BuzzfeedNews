package com.rais.haidar.buzzfeeds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView detailAuthor1,detailTitle1,detailDeskripsi1,detailDate1,detailName1;
    ImageView detailImage1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailAuthor1.findViewById(R.id.detailAuthor);
        detailTitle1.findViewById(R.id.detailTitle);
        detailDeskripsi1.findViewById(R.id.detailDeskripsi);
        detailDate1.findViewById(R.id.detailDate);
        detailName1.findViewById(R.id.detailName);
        detailImage1.findViewById(R.id.detailImage);

        String detailAuthor = getIntent().getStringExtra("detailAuthor");
        String detailTitle = getIntent().getStringExtra("detailTitle");
        String detailDeskripsi = getIntent().getStringExtra("detailDeskripsi");
        String detailDate = getIntent().getStringExtra("detailDate");
        String detailName = getIntent().getStringExtra("detailName");

        detailAuthor1.setText(detailAuthor);
        detailTitle1.setText(detailTitle);
        detailDeskripsi1.setText(detailDeskripsi);
        detailDate1.setText(detailDate);
        detailName1.setText(detailName);

        Glide.with(this)
                .load(MainActivity.WebUrl+getIntent().getStringExtra("detailGambar"))
                .placeholder(R.mipmap.ic_launcher)
                .into(detailImage1);
    }
}
