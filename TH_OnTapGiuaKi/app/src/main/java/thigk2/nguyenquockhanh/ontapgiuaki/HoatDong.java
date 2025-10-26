package thigk2.nguyenquockhanh.ontapgiuaki;

public class HoatDong {
    String mainContent, subContent, images;

    public HoatDong(String mainContent, String images, String subContent) {
        this.mainContent = mainContent;
        this.images = images;
        this.subContent = subContent;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public String getSubContent() {
        return subContent;
    }

    public void setSubContent(String subContent) {
        this.subContent = subContent;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
