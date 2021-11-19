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
public class SinhVien {
    private String MaSV,HoTen ,Email ,SDT ,DiaChi;
    private int GIoiTinh;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String HoTen, String Email, String SDT, String DiaChi, int GIoiTinh) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.Email = Email;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.GIoiTinh = GIoiTinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGIoiTinh() {
        return GIoiTinh;
    }

    public void setGIoiTinh(int GIoiTinh) {
        this.GIoiTinh = GIoiTinh;
    }
    
    
          
}
