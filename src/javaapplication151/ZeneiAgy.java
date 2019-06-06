/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication151;

/**
 *
 * @author Gergő
 */
public class ZeneiAgy {
    
    private Integer ado;
    private Integer idotartam;
    private String eloado;
    private String cim;
    private Integer kezdido;

    public ZeneiAgy(Integer ado, Integer idotartam, String eloado, String cim, Integer kezdido) {
        this.ado = ado;
        this.idotartam = idotartam;
        this.eloado = eloado;
        this.cim = cim;
        this.kezdido = kezdido;
    }

    public Integer getAdo() {
        return ado;
    }

    public Integer getIdotartam() {
        return idotartam;
    }

    public String getEloado() {
        return eloado;
    }

    public String getCim() {
        return cim;
    }

    public Integer getKezdido() {
        return kezdido;
    }
    
    
}
