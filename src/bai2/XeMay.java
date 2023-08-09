package bai2;

public class XeMay extends PhuongTienGiaoThong {
    private float congSuat;

    public XeMay() {
    }

    public XeMay(float congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, float congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }
}
