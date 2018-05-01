package pe.edu.upc.administradorapp.models;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Departament {


    private int id;
    private double debtAmount;
    private Debt debt;

    public Departament(int id, double debtAmount, Debt debt) {
        this.id = id;

        this.debtAmount = debtAmount;
        this.debt = debt;
    }

    public Departament() {
    }

    public int getId() {
        return id;
    }

    public Departament setId(int id) {
        this.id = id;
        return this;
    }



    public double getDebtAmount() {
        return debtAmount;
    }

    public Departament setDebtAmount(double debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    public Debt getDebt() {
        return debt;
    }

    public Departament setDebt(Debt debt) {
        this.debt = debt;
        return this;
    }


   























}
