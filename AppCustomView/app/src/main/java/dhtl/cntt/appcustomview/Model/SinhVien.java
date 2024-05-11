package dhtl.cntt.appcustomview.Model;

public class SinhVien {

    private String masv;
    private String tensv;
    private String gt;
    private int hinhanh;

    public SinhVien(String masv, String tensv, String gt, int hinhanh) {
        this.masv = masv;
        this.tensv = tensv;
        this.gt = gt;
        this.hinhanh = hinhanh;
    }

    public SinhVien(String masv, String tensv, String gt) {
        this.masv = masv;
        this.tensv = tensv;
        this.gt = gt;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMasv() {
        return masv;
    }

    public String getTensv() {
        return tensv;
    }

    public String getGt() {
        return gt;
    }

    public int getHinhanh() {
        return hinhanh;
    }
}
