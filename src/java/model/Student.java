/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author XuanDinh
 */
public class Student extends BaseModel {

    private int IdStudent;
    private String Mssv;
    private Lop lopid;
    private boolean Diemdanh;
    private String Name;

    public Student() {
    }

    public Student(int IdStudent, String Mssv, boolean Diemdanh, String Name) {
        this.IdStudent = IdStudent;
        this.Mssv = Mssv;
        this.Diemdanh = Diemdanh;
        this.Name = Name;
    }

    public Student(int IdStudent, String Mssv, Lop lopid, boolean Diemdanh, String Name) {
        this.IdStudent = IdStudent;
        this.Mssv = Mssv;
        this.lopid = lopid;
        this.Diemdanh = Diemdanh;
        this.Name = Name;
    }

    public int getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(int IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String Mssv) {
        this.Mssv = Mssv;
    }

    public Lop getLopid() {
        return lopid;
    }

    public void setLopid(Lop lopid) {
        this.lopid = lopid;
    }

    public boolean isDiemdanh() {
        return Diemdanh;
    }

    public void setDiemdanh(boolean Diemdanh) {
        this.Diemdanh = Diemdanh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}
