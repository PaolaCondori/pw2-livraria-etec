package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.Editora;

public class Livro {
    //Pascal case - Classes
    //Camel case - atributos
    private String titulo;
    private String resumo;
    protected double valor;
    private String autor;
    private Editora editora;
    private TipoCapaEnum tipoCapa;
    private int paginas;
    public void exibir(){
        System.out.println("\n---------------- " +
                "Detalhes do livro" + " ----------------");
        System.out.println("Título: " + titulo);
        System.out.println("Resumo: " + resumo);
        System.out.println("Valor: "  + formatarValor(valor));
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Quantidade de páginas: " + paginas);
        editora.exibir();
        System.out.println("Taxa de envio: " + formatarValor(getTaxaEnvio()));
        System.out.println("Desconto: " + formatarValor(valor * 0.15));
    }
    double getTaxaEnvio(){
        return valor * 0.05;
    }
    String formatarValor(double param){
        return String.format("R$ %.2f", param);
    }

    //sobrecarga: é possível a criação de dois ou mais métodos com mesmo nome desde que tenham diferentes parâmetros
    // isso serve também aos métodos construtores ou construtores
    public Livro() {
        System.out.println("\nConstruindo um livro......");
        tipoCapa = TipoCapaEnum.COMUN;
    }

    public Livro(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
    void cobrarCapa(){
        if (tipoCapa == TipoCapaEnum.DURA) {
            valor += 5;
        }
        else if (tipoCapa == TipoCapaEnum.PERSONALIZADA) {
            valor += 10;
        }
    }
    public void aplicarDesconto(double percentual){
        if(percentual > 0.2){
            System.out.println("Desconto não pode ser maior que 20%!");
        }else{
            valor = valor - valor * percentual;
        }
    }

    public void aplicarDesconto(){
        aplicarDesconto(0.15);
    }
    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    public void setValor(double valor) {
        this.valor = valor;
        cobrarCapa();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}

