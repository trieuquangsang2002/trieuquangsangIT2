/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.model;

/**
 *
 * @author trieuquangsang
 */
public class BangDiem {
    private int ma;
    private String MaSV;
    private float TiengAnh ,LTHDT,GDTC;

    public BangDiem() {
    }

    public BangDiem(int ma, String MaSV, float TiengAnh, float LTHDT, float GDTC) {
        this.ma = ma;
        this.MaSV = MaSV;
        this.TiengAnh = TiengAnh;
        this.LTHDT = LTHDT;
        this.GDTC = GDTC;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public float getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(float TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public float getLTHDT() {
        return LTHDT;
    }

    public void setLTHDT(float LTHDT) {
        this.LTHDT = LTHDT;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
    
    
}
