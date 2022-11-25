public class service_record implements Interface__services{
    private  Integer  id;
    private String Name;
    private Integer price;
    private Integer IVA_services;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getid() {
        return null;
    }

    public String getName() {
        return Name;
    }

    @Override
    public Integer getprice() {
        return null;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIVA_services() {
        return IVA_services;
    }

    @Override
    public String getCIF() {
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

    public void setIVA_services(Integer IVA_services) {
        this.IVA_services = IVA_services;
    }





}
