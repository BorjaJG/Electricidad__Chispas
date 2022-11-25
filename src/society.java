public class society implements Interface__Cliente{
    private String CIF;
    private String name;
    private Integer mobile;
    private String landline;
    private String town;


    public Integer getMobile() {
        return mobile;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }


    @Override
    public String getDNI() {
        return null;
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getsurbname1() {
        return null;
    }

    @Override
    public String getSurbname2() {
        return null;
    }

    @Override
    public Integer getmobile() {
        return null;
    }

    @Override
    public String getlandline() {
        return null;
    }

    @Override
    public String gettown() {
        return null;
    }

    @Override
    public String CIF() {
        return null;
    }
}
