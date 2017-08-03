package com.khackathon.noobnoob.earlyview.requestreviewer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/*
생성자:길경완
생성일자:2017_08_03

내용:
UMl 기준으로 만들었으나 수정가능.
____________________________________________________________________________________________________



 */
public class RequestReviewer implements Parcelable {

    int requestReviewerID;

    String requestReviewerName;

    public String getRequestReviewerTitle() {
        return requestReviewerTitle;
    }

    public void setRequestReviewerTitle(String requestReviewerTitle) {
        this.requestReviewerTitle = requestReviewerTitle;
    }

    String requestReviewerTitle;
    String requestReviewerContent;
    int companyID;//외래키
    String companyName;
    Date requestReviewerDate;
    boolean requestReviewerSuccess;

    public int getRequestReviewerID() {
        return requestReviewerID;
    }

    public void setRequestReviewerID(int requestReviewerID) {
        requestReviewerID = requestReviewerID;
    }

    public String getRequestReviewerName() {
        return requestReviewerName;
    }

    public void setRequestReviewerName(String requestReviewerName) {
        this.requestReviewerName = requestReviewerName;
    }

    public String getRequestReviewerContent() {
        return requestReviewerContent;
    }

    public void setRequestReviewerContent(String requestReviewerContent) {
        this.requestReviewerContent = requestReviewerContent;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getRequestReviewerDate() {
        return requestReviewerDate;
    }

    public void setRequestReviewerDate(Date requestReviewerDate) {
        this.requestReviewerDate = requestReviewerDate;
    }

    public boolean isRequestReviewerSuccess() {
        return requestReviewerSuccess;
    }

    public void setRequestReviewerSuccess(boolean requestReviewerSuccess) {
        this.requestReviewerSuccess = requestReviewerSuccess;
    }








    @Override
    public int describeContents() {
        return 0;
    }

    public RequestReviewer (Parcel in) {
        /*
            int RequestReviewerID;
    String requestReviewerName;
    String requestReviewerContent;
    int companyID;//외래키
    String companyName;
    Date requestReviewerDate;
    boolean requestReviewerSuccess;

         */
        requestReviewerID=in.readInt();
        requestReviewerName=in.readString();
        requestReviewerTitle=in.readString();
        requestReviewerContent=in.readString();
        companyID=in.readInt();
        companyName=in.readString();


    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
    public static final Creator<RequestReviewer> CREATOR = new Creator<RequestReviewer>() {
        @Override
        public RequestReviewer createFromParcel(Parcel in) {
            return new RequestReviewer(in);
        }

        @Override
        public RequestReviewer[] newArray(int size) {
            return new RequestReviewer[size];
        }
    };

}
