package com.chanpyae.androidfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.easyandroidanimations.library.FoldAnimation;
import com.easyandroidanimations.library.FoldLayout;
import com.easyandroidanimations.library.TransferAnimation;

import java.lang.annotation.Target;

public class ToolsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.tools_fragment,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */
        ImageView simpleImageView = (ImageView) v.findViewById(R.id.img_Tool);
        simpleImageView.setImageResource(R.drawable.baseline_settings_black_18dp);

//       simpleImageView.setOnClickListener(new View.OnClickListener() {
//           @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity().getApplicationContext(),"Click on Tools",Toast.LENGTH_SHORT).show();
//           }
//       });

        new FoldAnimation(simpleImageView).setNumOfFolds(10)
                .setOrientation(FoldLayout.Orientation.VERTICAL).animate();

        return v;


    }
}
