/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_biblioteca;

    import java.util.Scanner;
public class Livros {
    
    private int codigo;
    private String autor;
    private String descricao;
    private String nomedolivro;
    private String status;
   
    
    public Livros(int codigo, String autor, String descricao, String nomedolivro, String status) {
        this.codigo = codigo;
        this.autor = autor;
        this.descricao = descricao;
        this.nomedolivro = nomedolivro;
        this.status = status;
    }
    public Livros(){
        Scanner ler = new Scanner(System.in);
        Scanner digitar = new Scanner(System.in);
        System.out.println("Informe o codigo:");
        this.codigo = digitar.nextInt();
        System.out.println("Digite o nome do livro: ");
        this.nomedolivro = ler.nextLine();
        System.out.println("Informe o nome do autor: ");
        this.autor = ler.nextLine();
        System.out.println("Digite a descrição do livro: ");
        this.descricao = ler.nextLine();
        this.status = "disponivel";
        
        
    }
   
    public int getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomedolivro() {
        return nomedolivro;
    }

    public void setNomedolivro(String nomedolivro) {
        this.nomedolivro = nomedolivro;
    }
    
}
