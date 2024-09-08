package org.example;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, cpf, 0);  // Salário base não se aplica para estagiários.
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
        System.out.println("Bolsa Auxílio: " + bolsaAuxilio);
        System.out.println("Salário Total: " + calcularSalario());
    }
}