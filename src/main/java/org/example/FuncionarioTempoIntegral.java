package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonusPercentual;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonusPercentual) {
        super(nome, cpf, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * bonusPercentual / 100);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus Percentual: " + bonusPercentual);
        System.out.println("Salário Total: " + calcularSalario());
    }
}