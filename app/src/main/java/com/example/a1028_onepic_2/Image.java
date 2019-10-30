package com.example.a1028_onepic_2;
import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;

import java.net.URL;
import java.util.Calendar;
import java.util.Random;


public class Image {
    public Uri url; // 이미지 주소
    public int url_memory; // 이미지 주소
    public double lat = 0.0;		// 위도
    public double lng = 0.0;		// 경도
    public LatLng location;
    public Calendar reg_date;    // 날짜, 시간정보
    public String writer = ""; // 작성자
    public String tag = ""; // 태그... 흠...
    boolean like=false;
    int like_cnt;
    String pic_name;

    public Image(Uri url, LatLng location, String writer, Calendar date, int url_memory, String pic_name) {

        this.url = url;
        this.location = location;
        this.url_memory = url_memory;
//        this.location = location;
        this.writer = writer;
        this.reg_date = date;
        Random generator = new Random();
        this.pic_name = pic_name;

        this.like_cnt = generator.nextInt(30) + 34;
    }

//    @Override
//    public LatLng getPosition() {
//        return location;
//    }

}
