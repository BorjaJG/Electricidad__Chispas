public class autonomous implements Interface__Cliente {

    private String DNI;
    private String name;
    private String surbname1;
    private String Surbname2;
    private Integer mobile;
    private String landline;
    private String town;





    public String getSurbname2() {
        return Surbname2;
    }

    public void setSurbname2(String surbname2) {
        Surbname2 = surbname2;
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



    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }



    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurbname1() {
        return surbname1;
    }

    public void setSurbname1(String surbname1) {
        this.surbname1 = surbname1;
    }





}