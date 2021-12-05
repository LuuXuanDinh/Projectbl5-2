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
public class Ngay extends BaseModel{
     private int Idngay;
    private String Ngay;

    public Ngay() {
    }

    public Ngay(int Idngay, String Ngay) {
        this.Idngay = Idngay;
        this.Ngay = Ngay;
    }

    public int getIdngay() {
        return Idngay;
    }

    public void setIdngay(int Idngay) {
        this.Idngay = Idngay;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }
    
    
    
}
