package thigk1.nguyenquockhanh;

public class CongTrinh {
    String maincontent, ngaydang, image;

    public CongTrinh(String maincontent, String ngaydang, String image) {
        this.maincontent = maincontent;
        this.ngaydang = ngaydang;
        this.image = image;
    }

    public String getMaincontent() {
        return maincontent;
    }

    public void setMaincontent(String maincontent) {
        this.maincontent = maincontent;
    }

    public String getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(String ngaydang) {
        this.ngaydang = ngaydang;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
