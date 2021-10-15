package classes;

import static classes.DadosClientes.vetor_clientes;
import javax.swing.JOptionPane;

public class MetodosAcoes {

    public void salvar(DadosClientes x) { //Salva dados na ArrayList
        x.vetor_clientes.add(x);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso",
                "Cadastro de Clientes", 1);
    }

    //Busca dados na ArrayList
    //Busca pelo nome e retorna o cliente em um arraylist
    //Retorna um null se não achar o cliente
    public DadosClientes busca(String nome) {

        DadosClientes cliente = null;

        try {
            for (int i = 0; i < DadosClientes.vetor_clientes.size(); i++) {
                DadosClientes d = new DadosClientes();
                //Verifica se contém uma sequência de um texto no nome do cliente
                //Contains verifica se o nome procurado contém a sequência acima.
                if (DadosClientes.vetor_clientes.get(i).getNomeCliente().toLowerCase().contains(nome.toLowerCase().trim())) {
                    return cliente = d.vetor_clientes.get(i);
                }
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + err, "", 1);
        }
        return cliente;
    }

    public double entradaTotal(Double qtdentrada, DadosClientes cliente) { //Depositar na ArrayList

        //Pegando saldo atual e adicionando a entrada
        double saldoAtual = 0;
        try {
            cliente.setSaldo(cliente.getSaldo() + qtdentrada);
            saldoAtual = cliente.getSaldo();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + err, "", 1);
        }

        return saldoAtual;

    }

    public double saidaTotal(double qtdesaida, DadosClientes cliente) { // Sacar da ArrayList
        double saldoAtual = 0;
        try {
            cliente.setSaldo(cliente.getSaldo() - qtdesaida);
            saldoAtual = cliente.getSaldo();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + err, "", 1);
        }
        return saldoAtual;
    }

    public void alterar(DadosClientes dadoscli) {

        for (int i = 0; i < DadosClientes.vetor_clientes.size(); i++) {

            if (vetor_clientes.get(i).getNumeroConta() == dadoscli.getNumeroConta()) {

                vetor_clientes.get(i).setNomeCliente(dadoscli.getNomeCliente());
                vetor_clientes.get(i).setNumeroConta(dadoscli.getNumeroConta());
                vetor_clientes.get(i).setCpf(dadoscli.getCpf());
                vetor_clientes.get(i).setCidade(dadoscli.getCidade());
                vetor_clientes.get(i).setEstado(dadoscli.getEstado());
                vetor_clientes.get(i).setTelefone(dadoscli.getTelefone());

                JOptionPane.showMessageDialog(null, "Alteração OK!!", "Aviso", 1);
            }
        }
    }

}
