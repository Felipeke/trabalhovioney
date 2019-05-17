/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_biblioteca;

/**
 *
 * @author mrber
 */
public class Funcionarios extends Usuario {
    private int codfunX;
    private int codfunR;
    private int codfunB;

    
    public Funcionarios(){
        System.out.println("Interface de cadastro de Funcionário:  ");
    }
        
    public int getCodfunX() {
        return codfunX;
    }

    public void setCodfunX(int codfunX) {
        this.codfunX = codfunX;
    }

    public int getCodfunR() {
        return codfunR;
    }

    public void setCodfunR(int codfunR) {
        this.codfunR = codfunR;
    }

    public int getCodfunB() {
        return codfunB;
    }

    public void setCodfunB(int codfunB) {
        this.codfunB = codfunB;
    }
    

       
}
