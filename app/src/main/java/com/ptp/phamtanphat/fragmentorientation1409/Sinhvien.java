package com.ptp.phamtanphat.fragmentorientation1409;

/**
 * Created by KhoaPhamPC on 7/12/2017.
 */

public class Sinhvien {
    private String Tensv;
    private String Lop;
    private String Email;
    private String Diachi;

    public Sinhvien(String tensv, String lop, String email, String diachi) {
        Tensv = tensv;
        Lop = lop;
        Email = email;
        Diachi = diachi;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String tensv) {
        Tensv = tensv;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
