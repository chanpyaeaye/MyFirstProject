package com.chanpyae.androidfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.AnimationListener;
import com.easyandroidanimations.library.RotationAnimation;

public class TestFramLayoutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.testframe,container,false);

       ImageView simpleImageView = (ImageView) v.findViewById(R.id.cpimg);
       simpleImageView.setImageResource(R.mipmap.pyaepyae);

        simpleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Click on Frame Layout",Toast.LENGTH_SHORT).show();
            }
        });
//        new RotationAnimation(simpleImageView)
//                .setPivot(RotationAnimation.PIVOT_TOP_LEFT)
//                .setListener(new AnimationListener() {
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        //
//                        // mPlayView.setVisibility(View.VISIBLE);
//                    }
//                }).animate();

        return v;
    }
}