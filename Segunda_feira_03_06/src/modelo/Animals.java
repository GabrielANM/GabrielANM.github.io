package modelo;

public class Animals {

    private String nome;
    private int idade;
    private String dono;

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Animals(String nome, int idade, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;

    }

    protected boolean animalEhMamifero() {
        return true;



    }

}
