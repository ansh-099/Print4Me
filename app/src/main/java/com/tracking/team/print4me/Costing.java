package com.tracking.team.print4me;

public class Costing {

    Double sizeA4, sizeA3, colorBlack, colored, gsm80, gsm120, gsm300, papertypeGlossy
            ,papertypeMatt, papertypeSticker, papertypeDoubleSided, bandingStaple, bandingWire, bandingNone;

    Costing(){
    }

    public Costing(Double sizeA4, Double sizeA3, Double colorBlack, Double colored, Double gsm80, Double gsm120, Double gsm300, Double papertypeGlossy, Double papertypeMatt, Double papertypeSticker, Double papertypeDoubleSided, Double bandingStaple, Double bandingWire, Double bandingNone) {
        this.sizeA4 = sizeA4;
        this.sizeA3 = sizeA3;
        this.colorBlack = colorBlack;
        this.colored = colored;
        this.gsm80 = gsm80;
        this.gsm120 = gsm120;
        this.gsm300 = gsm300;
        this.papertypeGlossy = papertypeGlossy;
        this.papertypeMatt = papertypeMatt;
        this.papertypeSticker = papertypeSticker;
        this.papertypeDoubleSided = papertypeDoubleSided;
        this.bandingStaple = bandingStaple;
        this.bandingWire = bandingWire;
        this.bandingNone = bandingNone;
    }

    public Double getSizeA4() {
        return sizeA4;
    }

    public void setSizeA4(Double sizeA4) {
        this.sizeA4 = sizeA4;
    }

    public Double getSizeA3() {
        return sizeA3;
    }

    public void setSizeA3(Double sizeA3) {
        this.sizeA3 = sizeA3;
    }

    public Double getColorBlack() {
        return colorBlack;
    }

    public void setColorBlack(Double colorBlack) {
        this.colorBlack = colorBlack;
    }

    public Double getColored() {
        return colored;
    }

    public void setColored(Double colored) {
        this.colored = colored;
    }

    public Double getGsm80() {
        return gsm80;
    }

    public void setGsm80(Double gsm80) {
        this.gsm80 = gsm80;
    }

    public Double getGsm120() {
        return gsm120;
    }

    public void setGsm120(Double gsm120) {
        this.gsm120 = gsm120;
    }

    public Double getGsm300() {
        return gsm300;
    }

    public void setGsm300(Double gsm300) {
        this.gsm300 = gsm300;
    }

    public Double getPapertypeGlossy() {
        return papertypeGlossy;
    }

    public void setPapertypeGlossy(Double papertypeGlossy) {
        this.papertypeGlossy = papertypeGlossy;
    }

    public Double getPapertypeMatt() {
        return papertypeMatt;
    }

    public void setPapertypeMatt(Double papertypeMatt) {
        this.papertypeMatt = papertypeMatt;
    }

    public Double getPapertypeSticker() {
        return papertypeSticker;
    }

    public void setPapertypeSticker(Double papertypeSticker) {
        this.papertypeSticker = papertypeSticker;
    }

    public Double getPapertypeDoubleSided() {
        return papertypeDoubleSided;
    }

    public void setPapertypeDoubleSided(Double papertypeDoubleSided) {
        this.papertypeDoubleSided = papertypeDoubleSided;
    }

    public Double getBandingStaple() {
        return bandingStaple;
    }

    public void setBandingStaple(Double bandingStaple) {
        this.bandingStaple = bandingStaple;
    }

    public Double getBandingWire() {
        return bandingWire;
    }

    public void setBandingWire(Double bandingWire) {
        this.bandingWire = bandingWire;
    }

    public Double getBandingNone() {
        return bandingNone;
    }

    public void setBandingNone(Double bandingNone) {
        this.bandingNone = bandingNone;
    }
}
