/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_biblioteca;

import java.util.Scanner;

/**
 *
 * @author mrber
 */
public class Professores extends Usuario{
    private int siap;

    public Professores(){
    Scanner ler = new Scanner(System.in);
    Scanner digitar = new Scanner(System.in);
    System.out.println("Digite o nome: ");
    this.setNome(ler.nextLine());
    System.out.println("Digite o Cpf: ");
    this.setCpf(ler.nextLine());
    System.out.println("Digite o e-mail: ");
    this.setEmail(ler.nextLine());
    System.out.println("Digite a idade: ");
    this.setIdade(digitar.nextInt());
    System.out.println("Digite o siap:");
    this.setSiap(digitar.nextInt());
    }
    public void EditaProfessor(){
        int novosiap;
        String novonome;
        int novoidade;
        String novoemail;
        String novocpf;
        
        Scanner dig = new Scanner(System.in);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o novo SIAP: ");
        this.setSiap(dig.nextInt());
        System.out.println("Digite o novo nome: ");
        this.setNome(leitura.nextLine());
        System.out.println("Digite o novo Cpf: ");
        this.setCpf(leitura.nextLine());
        System.out.println("Digite o novo dado da idade: ");
        this.setIdade(dig.nextInt());
        System.out.println("Digite o novo dado do email: ");
        this.setEmail(leitura.nextLine());
    }

    public int getSiap() {
        return siap;
    }

    public void setSiap(int siap) {
        this.siap = siap;
    }
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Siap: "+this.getSiap());
    }
}
