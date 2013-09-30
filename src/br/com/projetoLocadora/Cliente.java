package br.com.projetoLocadora;


public class Cliente extends Pessoa {
    
    private double saldoDisponivel;

    public Cliente() {
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "saldoDisponivel=" + saldoDisponivel + '}';
    }
}
