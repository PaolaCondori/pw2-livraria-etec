public class CriaLivro {
    public static void main(String[] args) {
        //instanciação
        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.setAutor("J. K. Rowling");
        Editora bloomPublishing = new Editora();
        bloomPublishing.nome = "Bloomsbury Publishing";
        bloomPublishing.site = "www.bloomsbury.com.br";
        primeiroLivro.setEditora(bloomPublishing);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        primeiroLivro.setValor(20);
        //primeiroLivro.tipoCapa = TipoCapaEnum.PERSONALIZADA;
        primeiroLivro.exibir();


        Livro segundoLivro = new Livro(TipoCapaEnum.PERSONALIZADA);
        segundoLivro.setTitulo("A menina que roubava livros");
        segundoLivro.setAutor("Markus Zusak");
        Editora intrinseca = new Editora();
        intrinseca.nome = "Intrínseca";
        intrinseca.site = "www.intrinseca.com.br";
        segundoLivro.setEditora(intrinseca);
        primeiroLivro.setTipoCapa(TipoCapaEnum.DURA);
        segundoLivro.setValor(12);
        //segundoLivro.tipoCapa = TipoCapaEnum.DURA;
        segundoLivro.exibir();
    }
}