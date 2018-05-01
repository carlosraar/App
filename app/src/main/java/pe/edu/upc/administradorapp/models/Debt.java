package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Debt {

    private int id;
    private String service;
    private Double amountDetail;

    public Debt() {
    }

    public Debt(int id, String service, Double amountDetail, String status) {
        this.id = id;
        this.service = service;
        this.amountDetail = amountDetail;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public Debt setId(int id) {
        this.id = id;
        return this;
    }

    public String getService() {
        return service;
    }

    public Debt setService(String service) {
        this.service = service;
        return this;
    }

    public Double getAmountDetail() {
        return amountDetail;
    }

    public Debt setAmountDetail(Double amountDetail) {
        this.amountDetail = amountDetail;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Debt setStatus(String status) {
        this.status = status;
        return this;
    }

    private String status;


}
