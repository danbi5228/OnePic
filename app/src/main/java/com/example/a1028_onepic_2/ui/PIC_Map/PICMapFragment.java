package com.example.a1028_onepic_2.ui.PIC_Map;

import android.content.res.Resources;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.a1028_onepic_2.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MapStyleOptions;


public class PICMapFragment extends Fragment
        implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener{
    private static final String TAG = PICMapFragment.class.getSimpleName();

//    private PICMapViewModel dashboardViewModel;
    private MapView mapView = null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_picmap, container, false);

        mapView = (MapView)layout.findViewById(R.id.map);
        mapView.getMapAsync(this) ;

        return layout;
    }
    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onLowMemory();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //액티비티가 처음 생성될 때 실행되는 함수

        if(mapView != null)
        {
            mapView.onCreate(savedInstanceState);
        }
    }

    // 37.548927, 126.965692
    // 37.561728, 126.987228
    // 37.548303, 126.963895
    // 37.557960, 126.982323



    @Override
    public void onMapReady(GoogleMap googleMap) {
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            getActivity(), R.raw.style_json));

            if (!success) {
                Log.e(TAG,"Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }

        LatLng SEOUL1 = new LatLng(37.56, 126.97);
        LatLng SEOUL2 = new LatLng(37.548927, 126.965692);
        LatLng SEOUL3 = new LatLng(37.561728, 126.987228);
        LatLng SEOUL4 = new LatLng(37.548303, 126.963895);
        LatLng SEOUL5 = new LatLng(37.557960, 126.982323);
        googleMap.setPadding(0, 0, 0, 150);

        googleMap.addMarker(new MarkerOptions()
                .position(SEOUL1)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher_tmp_wantpic)));
        googleMap.addMarker(new MarkerOptions()
                .position(SEOUL2)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher_tmp_wantpic)));
        googleMap.addMarker(new MarkerOptions()
                .position(SEOUL3)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher_tmp_wantpic)));
        googleMap.addMarker(new MarkerOptions()
                .position(SEOUL4)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher_tmp_wantpic)));
        googleMap.addMarker(new MarkerOptions()
                .position(SEOUL5)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher_tmp_wantpic)));

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL1));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(13));

        googleMap.setOnMarkerClickListener(this);
    }


    // 마커 클릭시 이미지 상세정보 dialog 띄우기
    @Override
    public boolean onMarkerClick(Marker marker){
        final Dialog image_dialog = new Dialog(getActivity(),R.style.image_dialog_style);
        image_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        image_dialog.setContentView(R.layout.image_dialog);
        image_dialog.setTitle("Custom dialog");
        TextView tv = (TextView) image_dialog.findViewById(R.id.image_dialog_text);
        tv.setText("Hello. This is a Custom Dialog !");

        // 다이얼로그 뒷 배경 검게 변하지 않도록!
        image_dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        image_dialog.show();

        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        Window window = image_dialog.getWindow();
        int x = (int)(width * 0.8f);
        int y = (int)(height * 0.7f);

        window.setLayout(x,y);
        return true;
    }

}