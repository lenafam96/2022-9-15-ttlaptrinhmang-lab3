/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocsinh_ui;

/**
 *
 * @author minhc
 */
public class HocSinh {
    private String Mahs;
    private String Hoten;
    private float DiemToan;
    private float DiemViet;

    public HocSinh() {
        this.Mahs = "";
        this.Hoten = "";
        this.DiemToan = 0;
        this.DiemViet = 0;
    }

    public HocSinh(String Mahs, String Hoten, float DiemToan, float DiemViet) {
        this.Mahs = Mahs;
        this.Hoten = Hoten;
        this.DiemToan = DiemToan;
        this.DiemViet = DiemViet;
    }

    public String getMahs() {
        return this.Mahs;
    }

    public String getHoten() {
        return this.Hoten;
    }

    public float getDiemToan() {
        return this.DiemToan;
    }

    public float getDiemViet() {
        return this.DiemViet;
    }

    public void setMahs(String Mahs) {
        this.Mahs = Mahs;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public void setDiemToan(float DiemToan) {
        this.DiemToan = DiemToan;
    }

    public void setDiemViet(float DiemViet) {
        this.DiemViet = DiemViet;
    }
}
