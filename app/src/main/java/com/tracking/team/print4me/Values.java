package com.tracking.team.print4me;

public class Values {

    public String printType, paperType, paperSize, paperGSM, banding,name, location, mobile, emailID, pay, moreDetails, PDFurl;

    public Integer paperNumber;

    public Double totalPrice;

    public static Values obj = new Values();

    Values(){

    }

    public Values(String printType, String paperType, String paperSize, String paperGSM, String banding, String name, String location, String mobile, String emailID, String pay, String moreDetails, String PDFurl, Integer paperNumber, Double totalPrice) {
        this.printType = printType;
        this.paperType = paperType;
        this.paperSize = paperSize;
        this.paperGSM = paperGSM;
        this.banding = banding;
        this.name = name;
        this.location = location;
        this.mobile = mobile;
        this.emailID = emailID;
        this.pay = pay;
        this.moreDetails = moreDetails;
        this.PDFurl = PDFurl;
        this.paperNumber = paperNumber;
        this.totalPrice = totalPrice;
    }

    public String getPDFurl() {
        return PDFurl;
    }

    public void setPDFurl(String PDFurl) {
        this.PDFurl = PDFurl;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public String getPaperGSM() {
        return paperGSM;
    }

    public void setPaperGSM(String paperGSM) {
        this.paperGSM = paperGSM;
    }

    public String getBanding() {
        return banding;
    }

    public void setBanding(String banding) {
        this.banding = banding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }

    public Integer getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(Integer paperNumber) {
        this.paperNumber = paperNumber;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static Values getObj() {
        return obj;
    }

    public static void setObj(Values obj) {
        Values.obj = obj;
    }
}
