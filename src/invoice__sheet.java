public class invoice__sheet implements Interface__services{
    private Integer id;
    private String Name;
    private String brand ;
    private Integer price;
    private Integer IVA_rate;

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

    @Override
    public Integer getIVA_services() {
        return null;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIVA_rate() {
        return IVA_rate;
    }

    public void setIVA_rate(Integer IVA_rate) {
        this.IVA_rate = IVA_rate;
    }
    }
