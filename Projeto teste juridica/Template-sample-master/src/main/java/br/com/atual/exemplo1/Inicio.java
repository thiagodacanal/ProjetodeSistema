package br.com.atual.exemplo1;

/**
 * Created by Ton on 04/03/2015.
 */
public class Inicio {


    public static void main(String[] args) {
        System.out.println("Teste salvando");

        DaoPessoaFisica daoFisica = new DaoPessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        pf.setId(0);
        pf.setNome("Ana");
        pf.setCpf("04251217985");
        daoFisica.salvar(pf);

        DaoPessoaJuridica daoJuridica = new DaoPessoaJuridica();
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(0);
        pj.setNome("Joao");
        pj.setCnpj("04251217000189");
        daoJuridica.salvar(pj);

        DaoCliente daoCliente = new DaoCliente();
        Cliente cliente = new Cliente();
        cliente.setId(0);
        cliente.setNome("Cliente legal");
        cliente.setNumeroCliente(123);

        daoCliente.salvar(cliente);


    }

}
