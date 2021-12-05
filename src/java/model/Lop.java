/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author XuanDinh
 */
public class Lop extends BaseModel {

    private int Idlop;
    private String Lop;
    private Ngay Ngayid;
    private Slot Slotid;

    public Lop() {
    }

    public Lop(int Idlop, String Lop, Ngay Ngayid, Slot Slotid) {
        this.Idlop = Idlop;
        this.Lop = Lop;
        this.Ngayid = Ngayid;
        this.Slotid = Slotid;
    }

    public int getIdlop() {
        return Idlop;
    }

    public void setIdlop(int Idlop) {
        this.Idlop = Idlop;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public Ngay getNgayid() {
        return Ngayid;
    }

    public void setNgayid(Ngay Ngayid) {
        this.Ngayid = Ngayid;
    }

    public Slot getSlotid() {
        return Slotid;
    }

    public void setSlotid(Slot Slotid) {
        this.Slotid = Slotid;
    }
    
}
