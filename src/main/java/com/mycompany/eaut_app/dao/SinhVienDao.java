/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.dao;

import com.mycompany.eaut_app.helpers.DatabaseHelper;
import com.mycompany.eaut_app.model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trieuquangsang
 */
public class SinhVienDao {
    //<------insert-------->

    public boolean insert(SinhVien sv) throws Exception {
        String sql = "INSERT INTO dbo.SinhVien (MaSV ,HoTen ,Email ,SDT ,GIoiTinh ,DiaChi)"
                + "  values(?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, sv.getMaSV());
            pstm.setString(2, sv.getHoTen());
            pstm.setString(3, sv.getEmail());
            pstm.setString(4, sv.getSDT());
            pstm.setInt(5, sv.getGIoiTinh());
            pstm.setString(6, sv.getDiaChi());
            return pstm.executeUpdate() > 0;
        }
    }

    //<------update-------->
    public boolean update(SinhVien sv) throws Exception {

        String sql = "UPDATE dbo.SinhVien"
                + "  SET HoTen = ? ,Email = ? ,SDT = ?,GIoiTinh = ? ,DiaChi = ?"
                + "  where MaSV = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(6, sv.getMaSV());
            pstm.setString(1, sv.getHoTen());
            pstm.setString(2, sv.getEmail());
            pstm.setString(3, sv.getSDT());
            pstm.setInt(4, sv.getGIoiTinh());
            pstm.setString(5, sv.getDiaChi());
            return pstm.executeUpdate() > 0;
        }
    }
     
   //<------delete------->
    public boolean delete(String maSV) throws Exception {

        String sql = " delete from sinhvien"
                   + " where MaSV = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ) {
            pstm.setString(1, maSV);
            
            return pstm.executeUpdate() > 0;
        }
    }
     //<------findByid------->
    public SinhVien findByid(String maSV) throws Exception {

        String sql = "select * from sinhvien where maSV = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ) {
            pstm.setString(1, maSV);
            try(ResultSet rs = pstm.executeQuery()) {
                if(rs.next()){
                    SinhVien sv = createSv(rs);
                    return sv;
                }
        }
        return null;
    }
    }

    private SinhVien createSv(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSV(rs.getString("maSV"));
        sv.setHoTen(rs.getString("hoTen"));
        sv.setEmail(rs.getString("email"));
        sv.setSDT(rs.getString("SDT"));
        sv.setGIoiTinh(rs.getInt("gioiTinh"));
        sv.setDiaChi(rs.getString("diaChi"));
        return sv;
    }
    
        public List<SinhVien> findAll() throws Exception {

        String sql = "select * from sinhvien";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ) {
            try(ResultSet rs = pstm.executeQuery()) {
                List<SinhVien> list = new ArrayList<SinhVien>();
                while(rs.next()){
                    SinhVien sv = createSv(rs);
                    list.add(sv);
                }
                return list;
        }
    }
    }
}
