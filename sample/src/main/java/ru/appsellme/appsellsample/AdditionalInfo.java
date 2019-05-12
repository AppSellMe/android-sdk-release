package ru.appsellme.appsellsample;

import com.google.gson.annotations.SerializedName;

public class AdditionalInfo {
    @SerializedName("user_name")
    private String userName = "";

    @SerializedName("user_age")
    private int usrAge = 0;

    public AdditionalInfo(String userName, int usrAge) {
        this.userName = userName;
        this.usrAge = usrAge;
    }

    public String getUserName() {
        return userName;
    }

    public int getUsrAge() {
        return usrAge;
    }
}
