package com.example.mvvmandroid.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private static final Float usd_to_eu_rate = 0.74F;
    private String dollarText = "";

    private MutableLiveData<String> result = new MutableLiveData<String>();
    //Now that the result variable is contained in a mutable LiveData instance

    public void setAmount(String value) {
        this.dollarText = value;
//        result.setValue(Float.valueOf(dollarText)*usd_to_eu_rate);
        result.setValue(dollarText +" say hi hungpein");
    }
    public MutableLiveData<String> getResult()
    {
        return result;
    }
}