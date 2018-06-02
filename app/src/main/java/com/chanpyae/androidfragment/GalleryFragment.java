package com.chanpyae.androidfragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.easyandroidanimations.library.ExplodeAnimation;
import com.easyandroidanimations.library.FlipHorizontalToAnimation;

public class GalleryFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.gallery_fragment,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */
        ImageView simpleImageView = (ImageView) v.findViewById(R.id.imageView2);
        simpleImageView.setImageResource(R.drawable.ic_gallery_img);

//      simpleImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//           public void onClick(View view) {
//               Toast.makeText(getActivity().getApplicationContext(),"Click on Gallery",Toast.LENGTH_SHORT).show();
//           }
//       });
        //new ExplodeAnimation(simpleImageView).animate();

        new FlipHorizontalToAnimation(simpleImageView)
                .setFlipToView(simpleImageView)
                .setInterpolator(new LinearInterpolator())
                .animate();
        return v;


    }
}
