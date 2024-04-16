package br.com.etechoracio.livraria.model;

public class Editora {
    private String nome;
    private String site;
    void exibir(){
        System.out.println("br.com.etechoracio.livraria.model.Editora: " + nome);
        System.out.println("Site editora: " + site);
    }
    public void setNomeEditora(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
