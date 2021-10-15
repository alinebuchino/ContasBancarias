package classes;

import java.util.ArrayList;

public class DadosClientes {

    public static ArrayList<DadosClientes> vetor_clientes = new ArrayList<>();

    public int numeroConta;

    public String nomeCliente;
       
    public String cpf;
    public String telefone;
    public String cidade;
    public String estado;
    
    public double saldo;

    public DadosClientes() {
    }

    public static ArrayList<DadosClientes> getVetor_clientes() {
        return vetor_clientes;
    }

    public static void setVetor_clientes(ArrayList<DadosClientes> vetor_clientes) {
        DadosClientes.vetor_clientes = vetor_clientes;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
