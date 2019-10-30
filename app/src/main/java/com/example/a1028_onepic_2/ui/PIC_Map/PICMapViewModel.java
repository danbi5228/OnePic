package com.example.a1028_onepic_2.ui.PIC_Map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PICMapViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PICMapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}