package br.com.etechoracio.livraria.model;

public class Kindle extends Livro{
    private String marcaDAgua;

    @Override
    public void aplicarDesconto(double percentual){
        if(percentual > 0.1){
            System.out.println("Desconto não pode ser maior que 10%");
        }else{
            super.aplicarDesconto(percentual);
        }
    }

    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }
}
