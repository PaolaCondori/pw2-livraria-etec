package br.com.etechoracio.livraria.test;//Criação de pacotes(packages) -> domínio de trás pra frente
        //ex: www.etechoracio.com.br -> br.com.etechoracio.{nome do projeto}.{tipo de package}


import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.Livro;


public class CriaLivro {
    public static void main(String[] args) {
        //instanciação
        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.setAutor("J. K. Rowling");
        Editora bloomPublishing = new Editora();
        bloomPublishing.setNomeEditora("Bloomsbury Publishing");
        bloomPublishing.setSite("www.bloomsbury.com.br");
        primeiroLivro.setEditora(bloomPublishing);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        primeiroLivro.setValor(20);
        //primeiroLivro.tipoCapa = br.com.etechoracio.livraria.enums.TipoCapaEnum.PERSONALIZADA;
        primeiroLivro.exibir();

        Livro segundoLivro = new Livro(TipoCapaEnum.PERSONALIZADA);
        segundoLivro.setTitulo("A menina que roubava livros");
        segundoLivro.setAutor("Markus Zusak");
        Editora intrinseca = new Editora();
        intrinseca.setNomeEditora("Intrínseca");
        intrinseca.setSite("www.intrinseca.com.br");
        segundoLivro.setEditora(intrinseca);
        segundoLivro.setTipoCapa(TipoCapaEnum.DURA);
        segundoLivro.setValor(12);
        //segundoLivro.tipoCapa = br.com.etechoracio.livraria.enums.TipoCapaEnum.DURA;
        segundoLivro.exibir();

        Kindle terceiroLivro = new Kindle();
        terceiroLivro.setTitulo("Harry Potter 2");
        terceiroLivro.setAutor("J. K. Rowling");
        terceiroLivro.setEditora(bloomPublishing);
        terceiroLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        terceiroLivro.setValor(20);
        terceiroLivro.setMarcaDAgua("Beijocas");
        //primeiroLivro.tipoCapa = br.com.etechoracio.livraria.enums.TipoCapaEnum.PERSONALIZADA;
        terceiroLivro.exibir();
        System.out.println("Maraca D´água: " + terceiroLivro.getMarcaDAgua());
    }
}