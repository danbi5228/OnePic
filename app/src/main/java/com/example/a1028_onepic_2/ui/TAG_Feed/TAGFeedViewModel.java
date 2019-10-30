package com.example.a1028_onepic_2.ui.TAG_Feed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TAGFeedViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TAGFeedViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}