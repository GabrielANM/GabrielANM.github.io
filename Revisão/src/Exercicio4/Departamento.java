package Exercicio4;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void setFuncionarios(boolean add) {
    }

    public void remover (Integer numero, List<Funcionario> funcionarios) {
        funcionarios.remove(numero);
    }

    public void adicionar (Funcionario funcionario, List<Funcionario> funcionarios) {
        funcionarios.add(funcionario);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}
