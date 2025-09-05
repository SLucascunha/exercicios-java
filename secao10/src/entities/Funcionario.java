package entities;

import java.util.List;

public class Funcionario {
    private int id;
    private String name;
    private double salario;

    public Funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += salario * porcentagem / 100;
    }

    public static Funcionario buscarPorId(List<Funcionario> funcionarioList, int id) {
        for (Funcionario funcionario : funcionarioList) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }
}
