/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ngay;

/**
 *
 * @author XuanDinh
 */
public class NgayDB extends DBContext<Ngay> {

    @Override
    public ArrayList<Ngay> list() {
        ArrayList<Ngay> ngay = new ArrayList<>();
        try {
            String sql = "SELECT Idngay,Ngay\n"
                    + "  FROM Ngay";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ngay n = new Ngay(
                        rs.getInt("Idngay"), 
                        rs.getString("Ngay"));
                ngay.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NgayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ngay;
    }

    @Override
    public Ngay get(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Ngay model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
