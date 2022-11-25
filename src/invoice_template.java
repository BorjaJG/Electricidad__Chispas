public class invoice_template implements Interface__invoice{


    private Integer id;
    private Integer date;
    private Integer id_client;
    private Integer tax_base;
    private Integer total;
    private Integer id_product;
    private Integer service;


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

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }


    @Override
    public Integer getCif__Nif() {
        return null;
    }

    @Override
    public String getDirection() {
        return null;
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
    public Integer gettax_base() {
        return null;
    }

    @Override
    public Integer gettotal() {
        return null;
    }

    @Override
    public Integer getid_product() {
        return null;
    }

    @Override
    public Integer getservice() {
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

    @Override
    public Integer getCode() {
        return null;
    }
}
