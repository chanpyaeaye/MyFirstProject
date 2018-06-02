package com.chanpyae.androidfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class SlideShowFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.slideshow_fragment,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */
        ImageView simpleImageView = (ImageView) v.findViewById(R.id.img_slideshow);
        simpleImageView.setImageResource(R.drawable.baseline_slideshow_black_18dp);

        simpleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Click on Slide Show",Toast.LENGTH_SHORT).show();
            }
        });
        return v;


    }
}
