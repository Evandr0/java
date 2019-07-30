/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5_banco;

/**
 *
 * @author ev047953
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String getDono;
    

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);            
        } else if(t == "CP"){
            this.setSaldo(150);
        }
    }
    
    
    public void fecharConta(){        
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, saldo diferente de zero");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, saldo diferente de zero");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        
    }
    public void depositar(float valor){
        if (this.status == true){
            //this.saldo = valor + this.saldo;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar. Conta inativa");
        }
    }
    public void sacar(float valor){
        if (this.getStatus()) {
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Conta inativa");
        }
        
    }
    public void pagaMensal(String cc){
        if (this.getTipo() == "CC"){
            this.sacar(20);
        }else{
            this.sacar(12);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}

