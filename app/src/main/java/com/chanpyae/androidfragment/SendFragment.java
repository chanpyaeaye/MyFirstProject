package com.chanpyae.androidfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.SlideInUnderneathAnimation;

public class SendFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.send_fragment,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */
        ImageView simpleImageView = (ImageView) v.findViewById(R.id.img_Send);
        simpleImageView.setImageResource(R.drawable.send);

//        simpleImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(),"Click on Send",Toast.LENGTH_SHORT).show();
//            }
//        });
        new SlideInUnderneathAnimation(simpleImageView)
                .setDirection(Animation.DIRECTION_DOWN)
                .animate();
        return v;


    }
}
