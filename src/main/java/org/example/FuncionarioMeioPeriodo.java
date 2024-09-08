package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, 0);  // Salário base não se aplica para meio período.
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: " + valorPorHora);
        System.out.println("Salário Total: " + calcularSalario());
    }
}