public class SinhVien {
    private int msv;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String  diaChi;
    private int diemTB;

    public SinhVien() {
    }

    public SinhVien(int msv) {
        this.msv = msv;
    }

    public SinhVien(int msv, String hoTen, int tuoi, String gioiTinh, String diaChi, int diemTB) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "msv=" + msv +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}
