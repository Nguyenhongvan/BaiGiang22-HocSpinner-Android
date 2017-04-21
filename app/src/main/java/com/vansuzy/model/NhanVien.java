package com.vansuzy.model;

/**
 * Created by keeps on 4/21/2017.
 */

public class NhanVien {
    private String tenNhanVien;
    private String thuBatDauCongTac;
    private int soNgayCongTacDuKien;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, String thuBatDauCongTac, int soNgayCongTacDuKien) {
        this.tenNhanVien = tenNhanVien;
        this.thuBatDauCongTac = thuBatDauCongTac;
        this.soNgayCongTacDuKien = soNgayCongTacDuKien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getThuBatDauCongTac() {
        return thuBatDauCongTac;
    }

    public void setThuBatDauCongTac(String thuBatDauCongTac) {
        this.thuBatDauCongTac = thuBatDauCongTac;
    }

    public int getSoNgayCongTacDuKien() {
        return soNgayCongTacDuKien;
    }

    public void setSoNgayCongTacDuKien(int soNgayCongTacDuKien) {
        this.soNgayCongTacDuKien = soNgayCongTacDuKien;
    }

    @Override
    public String toString() {
        return this.tenNhanVien + "\n Bắt đầu đi công tác vào thứ [ " + this.thuBatDauCongTac + "]" + "\n Số ngày công tác dự kiến = " + this.soNgayCongTacDuKien;
    }
}
