/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valemobi;

/**
 *
 * @author Thiago Mascarenhas
 */
public class mercadoria {
    private String codigo_mercadoria;
    private String tipo_de_mercadoria;
    private String nome_da_mercadoria;
    private String quantidade;
    private String preço;
    private int tipo_negocio;

    public mercadoria() {
    }

    public mercadoria(String codigo_mercadoria, String tipo_de_mercadoria, String nome_da_mercadoria, String quantidade, String preço, int tipo_negocio) {
        this.codigo_mercadoria = codigo_mercadoria;
        this.tipo_de_mercadoria = tipo_de_mercadoria;
        this.nome_da_mercadoria = nome_da_mercadoria;
        this.quantidade = quantidade;
        this.preço = preço;
        this.tipo_negocio = tipo_negocio;
    }
    
    


      

    /**
     * @return the codigo_mercadoria
     */
    public String getCodigo_mercadoria() {
        return codigo_mercadoria;
    }

    /**
     * @param codigo_mercadoria the codigo_mercadoria to set
     */
    public void setCodigo_mercadoria(String codigo_mercadoria) {
        this.codigo_mercadoria = codigo_mercadoria;
    }

    /**
     * @return the tipo_de_mercadoria
     */
    public String getTipo_de_mercadoria() {
        return tipo_de_mercadoria;
    }

    /**
     * @param tipo_de_mercadoria the tipo_de_mercadoria to set
     */
    public void setTipo_de_mercadoria(String tipo_de_mercadoria) {
        this.tipo_de_mercadoria = tipo_de_mercadoria;
    }

    /**
     * @return the nome_da_mercadoria
     */
    public String getNome_da_mercadoria() {
        return nome_da_mercadoria;
    }

    /**
     * @param nome_da_mercadoria the nome_da_mercadoria to set
     */
    public void setNome_da_mercadoria(String nome_da_mercadoria) {
        this.nome_da_mercadoria = nome_da_mercadoria;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preço
     */
    public String getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(String preço) {
        this.preço = preço;
    }

    /**
     * @return the tipo_negocio
     */
    public int getTipo_negocio() {
        return tipo_negocio;
    }

    /**
     * @param tipo_negocio the tipo_negocio to set
     */
    public void setTipo_negocio(int tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }

   
    
}
