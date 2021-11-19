/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.dao;

import com.mycompany.eaut_app.helpers.DatabaseHelper;
import com.mycompany.eaut_app.model.BangDiem;
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
public class BangDiemDao {
    //<------insert-------->

    public boolean insert(BangDiem bd) throws Exception {

        String sql = "INSERT INTO dbo.BangDiem(MaSV,TiengAnh,LTHDT,GDTC) values(?,?,?,?)";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, bd.getMaSV());
            pstm.setFloat(2, bd.getTiengAnh());
            pstm.setFloat(3, bd.getLTHDT());
            pstm.setFloat(4, bd.getGDTC());

            return pstm.executeLargeUpdate() > 0;
        }
    }

    public boolean update(BangDiem bd) throws Exception {

        String sql = " UPDATE [dbo].[BangDiem]"
                + " SET [TiengAnh] = ? ,[LTHDT] = ? ,[GDTC] = ?"
                + " WHERE [MaSV] = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(4, bd.getMaSV());
            pstm.setFloat(1, bd.getTiengAnh());
            pstm.setFloat(2, bd.getLTHDT());
            pstm.setFloat(3, bd.getGDTC());

            return pstm.executeLargeUpdate() > 0;
        }
    }

    public boolean deleteByMaSv(String maSv) throws Exception {

        String sql = " delete from bangdiem"
                + " WHERE [MaSV] = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maSv);

            return pstm.executeLargeUpdate() > 0;
        }
    }

    public BangDiem findByMaSv(String maSv) throws Exception {
        String sql = " select * from bangdiem WHERE [MaSV] = ?";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maSv);

            try (ResultSet rs = pstm.executeQuery();) {
                if (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMa(rs.getInt("Ma"));
                    bd.setMaSV(rs.getString("maSV"));
                    bd.setTiengAnh(rs.getFloat("tienganh"));
                    bd.setLTHDT(rs.getFloat("LTHDT"));
                    bd.setGDTC(rs.getFloat("GDTC"));

                    return bd;
                }
            }
        }
        return null;
    }

    public List<BangDiem> findAll() throws Exception {
        String sql = " select * from bangdiem ";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {

            try (ResultSet rs = pstm.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    createBangDiem(rs, list);

                }
                return list;
            }
        }
    }

    private void createBangDiem(final ResultSet rs, List<BangDiem> list) throws SQLException {
        BangDiem bd = new BangDiem();
        bd.setMa(rs.getInt("Ma"));
        bd.setMaSV(rs.getString("maSV"));
        bd.setTiengAnh(rs.getFloat("tienganh"));
        bd.setLTHDT(rs.getFloat("LTHDT"));
        bd.setGDTC(rs.getFloat("GDTC"));
        list.add(bd);
    }

    public List<BangDiem> findTop(int top) throws Exception {
        String sql = " select top "+ top +" *, (TiengAnh + LTHDT + GDTC)/3 as DTB"
                + " from BangDiem order by dtb desc";
        try (
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {

            try (ResultSet rs = pstm.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    createBangDiem(rs, list);

                }
                return list;
            }
        }
    }

}
