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
public class Orgao {
    Long id;
    String codorgao;
    String nomeorgao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodorgao() {
        return codorgao;
    }

    public void setCodorgao(String codorgao) {
        this.codorgao = codorgao;
    }

    public String getNomeorgao() {
        return nomeorgao;
    }

    public void setNomeorgao(String nomeorgao) {
        this.nomeorgao = nomeorgao;
    }
}
