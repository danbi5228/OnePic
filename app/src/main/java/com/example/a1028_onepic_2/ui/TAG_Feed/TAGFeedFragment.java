package com.example.a1028_onepic_2.ui.TAG_Feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a1028_onepic_2.R;


public class TAGFeedFragment extends Fragment
    implements SearchView.OnQueryTextListener {
             private TAGFeedViewModel TAGFeedViewModel;

    public TAGFeedFragment()
    {
        // required
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        TAGFeedViewModel =
                ViewModelProviders.of(this).get(TAGFeedViewModel.class);

        View root = inflater.inflate(R.layout.fragment_tagfeed, container, false);
        final TextView textView = root.findViewById(R.id.tmp_tagfeed_title);
        TAGFeedViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                RotateAnimation rotate = (RotateAnimation) AnimationUtils.loadAnimation(getContext(), R.anim.rotate_tagfeed_title);
                textView.setAnimation(rotate);
            }
        });
        ImageView tmp_v = root.findViewById(R.id.tmp_searchView);
        ImageView tmp_main = root.findViewById(R.id.tagfeed_mainimage);
        ImageView iv_1 = root.findViewById(R.id.tagfeed_image1);
        ImageView iv_2 = root.findViewById(R.id.tagfeed_image2);
        ImageView iv_3 = root.findViewById(R.id.tagfeed_image3);
        ImageView iv_4 = root.findViewById(R.id.tagfeed_image4);
        ImageView iv_5 = root.findViewById(R.id.tagfeed_image5);

        tmp_v.setImageResource(R.drawable.tmp_searchview);
        tmp_v.setScaleType(ImageView.ScaleType.FIT_XY);
        tmp_main.setImageResource(R.drawable.tmp_main);
        tmp_main.setScaleType(ImageView.ScaleType.FIT_XY);
        iv_1.setImageResource(R.drawable.image_1);
        iv_1.setScaleType(ImageView.ScaleType.FIT_XY); // imageView 크기에 맞춰서 늘리기
        iv_2.setImageResource(R.drawable.image_2);
        iv_2.setScaleType(ImageView.ScaleType.FIT_XY);
        iv_3.setImageResource(R.drawable.image_3);
        iv_3.setScaleType(ImageView.ScaleType.FIT_XY);
        iv_4.setImageResource(R.drawable.image_4);
        iv_4.setScaleType(ImageView.ScaleType.FIT_XY);
        iv_5.setImageResource(R.drawable.image_5);
        iv_5.setScaleType(ImageView.ScaleType.FIT_XY);

        return root;


    }


    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }
}



////    private TAGFeedViewModel TAGFeedViewModel;
//    private GoogleMap mMap;
//    static FrameLayout first;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//
//    @Override
//    public void onMapReady(final GoogleMap googleMap) {
//
//        mMap = googleMap;
//
//        LatLng SEOUL = new LatLng(37.56, 126.97);
//
////        MarkerOptions markerOptions = new MarkerOptions();
////        markerOptions.position(SEOUL);
////        markerOptions.title("서울");
////        markerOptions.snippet("한국의 수도");
////
//        mMap.addMarker(new MarkerOptions()
//                        .position(SEOUL)
//                        .title("서울")
//                        .snippet("한국의 수도"));
//
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
//        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
//    }
//
//    @Nullable
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        TAGFeedViewModel =
////                ViewModelProviders.of(this).get(TAGFeedViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_TAGFeed, container,false);
//        first = root.findViewById(R.id.map);
////        final TextView textView = root.findViewById(R.id.text_home);
////        TAGFeedViewModel.getText().observe(this, new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });
//        return root;
//    }
//
