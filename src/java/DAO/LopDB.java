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
import model.Lop;
import model.Ngay;
import model.Slot;

/**
 *
 * @author XuanDinLoph
 */
public class LopDB extends DBContext<Lop> {

    @Override
    public ArrayList<Lop> list() {
        ArrayList<Lop> lop = new ArrayList<>();
        try {
            String sql = "SELECT Idlop,Lop,Ngayid,Slotid\n"
                    + "  FROM Lop";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ngay n = new Ngay(
                        rs.getInt("Idngay"),
                        rs.getString("Ngay"));
                Slot sl = new Slot(
                        rs.getInt("Idslot"),
                        rs.getString("Slot"));
                Lop l = new Lop();
                l.setIdlop(rs.getInt("Idlop"));
                l.setLop(rs.getString("Lop"));
                l.setNgayid(n);
                l.setSlotid(sl);
                lop.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LopDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lop;
    }

    @Override
    public Lop get(Lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Lop model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
