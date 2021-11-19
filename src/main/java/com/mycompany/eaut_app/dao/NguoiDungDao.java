/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.dao;

import com.mycompany.eaut_app.helpers.DatabaseHelper;
import com.mycompany.eaut_app.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author trieuquangsang
 */
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws  Exception{
        String sql = " select tenDangNhap, matKhau, vaiTro from NguoiDung"
                + "  where tenDangNhap=? and matKhau = ?";
        try(
                Connection con = DatabaseHelper.opConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ) {
            pstm.setString(1, tenDangNhap);
            pstm.setString(2, matKhau);
            try(ResultSet rs = pstm.executeQuery();){
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaiTro"));
                    return nd;
                }
        } 
    }
        return null;
    }
}
