package com.talentotech.energies.Entities;

public class Energy {
    private int type_energy_id;
    private String energy_name;

    public Energy(int type_energy_id, String energy_name) {
        this.type_energy_id = type_energy_id;
        this.energy_name = energy_name;
    }

    public int getType_energy_id() {
        return type_energy_id;
    }

    public void setType_energy_id(int type_energy_id) {
        this.type_energy_id = type_energy_id;
    }

    public String getEnergy_name() {
        return energy_name;
    }

    public void setEnergy_name(String energy_name) {
        this.energy_name = energy_name;
    }
}