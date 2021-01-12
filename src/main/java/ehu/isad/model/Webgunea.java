package ehu.isad.model;

public class Webgunea {


    private int CMS;
    private String version;
    private String md5;
    private String path;

    public Webgunea( String version, String md5) {
        this.CMS = 1;
        this.version = version;
        this.md5 = md5;
        this.path = "README";
    }

    public int getCMS() {
        return CMS;
    }

    public void setCMS(int CMS) {
        this.CMS = CMS;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
