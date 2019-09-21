/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JucelinoAlmeida
 */
public class Cargo {
    
    Long id;
    String codcargo;
    String nomecargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodcargo() {
        return codcargo;
    }

    public void setCodcargo(String codcargo) {
        this.codcargo = codcargo;
    }

    public String getNomecargo() {
        return nomecargo;
    }

    public void setNomecargo(String nomecargo) {
        this.nomecargo = nomecargo;
    }
    
    
}
