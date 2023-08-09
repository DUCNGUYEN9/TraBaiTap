package bai2;

public class XeTai extends PhuongTienGiaoThong {
    private String trongTai;

    public XeTai() {
    }

    public XeTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, String trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }
}
