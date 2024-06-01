/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class KhachSan extends Nguoi{    
    private int soNgayTheu;
    private String loaiPhong;

    public KhachSan(String hoTen, int tuoi, String CMND, int soNgayTheu, String loaiPhong) {
        super(hoTen, tuoi, CMND);
        this.soNgayTheu = soNgayTheu;
        this.loaiPhong = loaiPhong;
    }

    public int getSoNgayTheu() {
        return soNgayTheu;
    }

    public void setSoNgayTheu(int soNgayTheu) {
        this.soNgayTheu = soNgayTheu;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    @Override
    public String toString() {
        return "Khách Hàng:"+ "Họ và tên: " + hoTen + ", Tuổi: " + tuoi + ", CMND: " + CMND + ", Số ngày thêu: " + soNgayTheu + ",  Loại Phòng: " + loaiPhong;
    }

    public int getSoNgayThue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
