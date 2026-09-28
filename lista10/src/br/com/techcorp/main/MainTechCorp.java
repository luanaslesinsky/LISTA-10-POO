package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionario;

public class MainTechCorp {

    public static void main(String[] args) {
        ControleDeAcesso controle = new ControleDeAcesso();

        // f1 e f2 sao objetos diferentes na memoria, mas representam a mesma matricula
        Funcionario f1 = new Funcionario("T-001", "Alice", "Analista");
        Funcionario f2 = new Funcionario("T-001", "Alice Duplicada", "Analista");

        System.out.println("--- Teste da Catraca ---");
        controle.registrarPassagem(f1);
        controle.registrarPassagem(f2);
        System.out.println("As duas passagens foram registradas normalmente no historico.");

        System.out.println("\n--- Teste da Sala Segura ---");
        controle.concederAcessoSala(f1); // deve liberar
        controle.concederAcessoSala(f2); // deve emitir o aviso de duplicidade
    }
}
