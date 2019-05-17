

package super_biblioteca;

import java.util.Scanner;

/**
 *
 * @author mrber
 */
public class Alunos extends Usuario{
    private int matricula;
    
    public Alunos(int matricula){
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
        System.out.println("Digite a matricula:");
        this.setMatricula(matricula);
    }

    
    
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Matricula: "+this.getMatricula());
    }
    
}
