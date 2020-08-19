package com.gamecodeschool.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variables
    private ArrayList<String>  mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://media.kasperskycontenthub.com/wp-content/uploads/sites/67/2020/03/04203957/0DSC04881-1024x683.jpg");
        mNames.add("Victoria Falls");

        mImageUrls.add("https://www.blackpast.org/wp-content/uploads/Downtown_Lusaka_Zambia_2013.jpg");
        mNames.add("Lusaka");

        mImageUrls.add("https://imgix.bustle.com/inverse/c4/be/fb/00/20ea/41ce/b60b/ebec74090634/a-different-but-no-less-sexy-kudu.jpeg?w=710&h=945.088888888889&auto=format%2Ccompress&cs=srgb&q=70&fit=max&crop=faces&dpr=2");
        mNames.add("Kudu");

        mImageUrls.add("https://afripost.net/wp-content/uploads/2016/06/Zambia_Freedom-Statue_.jpg");
        mNames.add("Freedom");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/4/4c/Kenneth_Kaunda_1983-03-30.jpg");
        mNames.add("KK");

        mImageUrls.add("https://www.pngitem.com/pimgs/m/222-2229564_disneygermnrodrguez1-makinigermnrodrguez1-makini-from-the-lion-guard-hd.png");
        mNames.add("Makini");

        mImageUrls.add("https://previews.123rf.com/images/standrets/standrets1712/standrets171200154/91277348-blue-ice-and-cracks-on-the-surface-of-the-ice-frozen-lake-in-winter-mountains-it-is-snowing-the-hill.jpg");
        mNames.add("Frozen Lake");

        mImageUrls.add("https://www.pandotrip.com/wp-content/uploads/2014/12/White-Sands-980x735.jpg");
        mNames.add("White Sand Desert");

        mImageUrls.add("https://ewscripps.brightspotcdn.com/dims4/default/bf1fd34/2147483647/strip/true/crop/640x360+0+33/resize/1280x720!/quality/90/?url=https%3A%2F%2Fmediaassets.thedenverchannel.com%2Fphoto%2F2012%2F10%2F09%2FRMNP-Dream-Lake-At-Sunrise-28963628_280930_ver1.0_640_480.jpg");
        mNames.add("Rocky Mountain National Park");

        mImageUrls.add("https://washington-org.s3.amazonaws.com/s3fs-public/styles/gallery_full/public/kickinitwithkk_-instagram-1744-ig-yes-mydccool-waterfront.jpg?itok=HD05XBFt");
        mNames.add("Tourist");

        mImageUrls.add("https://thumbs.dreamstime.com/z/mahahual-caribbean-beach-costa-maya-mahahual-caribbean-beach-pier-costa-maya-mayan-mexico-102612424.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://www.hurtigruten.co.uk/globalassets/photos/about-hurtigruten/cities-and-hotels-no/trondheim/p1090351atrondheim-1.jpg?width=1240&height=522&center=0.45,0.56&transform=DownResizeCrop");
        mNames.add("Trondheim");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}





