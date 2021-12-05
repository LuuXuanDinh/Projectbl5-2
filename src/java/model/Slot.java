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
public class Slot extends BaseModel {

    private int Idslot;
    private String Slot;

    public Slot() {
    }

    public Slot(int Idslot, String Slot) {
        this.Idslot = Idslot;
        this.Slot = Slot;
    }

    public int getIdslot() {
        return Idslot;
    }

    public void setIdslot(int Idslot) {
        this.Idslot = Idslot;
    }

    public String getSlot() {
        return Slot;
    }

    public void setSlot(String Slot) {
        this.Slot = Slot;
    }
    
}
