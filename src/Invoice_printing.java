public class Invoice_printing implements Interface__invoice{

    private Integer id;
    private Integer date;
    private Integer id_client;
    private Integer tax_base;
    private Integer total;
    private Integer Cif__Nif;
    private String direction;
    private String population;
    private  String province;

    public Integer getCif__Nif() {
        return Cif__Nif;
    }

    public void setCif__Nif(Integer cif__Nif) {
        Cif__Nif = cif__Nif;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public Integer getdate() {
        return null;
    }

    @Override
    public Integer getid_client() {
        return null;
    }

    @Override
    public Integer getid() {
        return null;
    }

    @Override
    public String getpopulation() {
        return null;
    }

    @Override
    public String getprovince() {
        return null;
    }


    public Integer date() {
        return null;
    }


    public Integer id_client() {
        return null;
    }


    public Integer id() {
        return null;
    }


    public String population() {
        return null;
    }


    public String province() {
        return null;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        province = province;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Integer getTax_base() {
        return tax_base;
    }

    public void setTax_base(Integer tax_base) {
        this.tax_base = tax_base;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public Integer getCode() {
        return null;
    }
}
