package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {

    // RN02: precisa manter a ordem cronologica e aceitar repeticoes -> ArrayList
    private List<Funcionario> historicoCatraca = new ArrayList<>();

    // RN03: precisa impedir duplicatas de matricula, ordem nao importa -> HashSet
    // (funciona por causa do equals/hashCode da Funcionario, baseado na matricula)
    private Set<Funcionario> autorizadosSalaSegura = new HashSet<>();

    public void registrarPassagem(Funcionario f) {
        historicoCatraca.add(f);
    }

    public void concederAcessoSala(Funcionario f) {
        boolean inserido = autorizadosSalaSegura.add(f);
        if (inserido) {
            System.out.println("Acesso liberado para a Sala Segura");
        } else {
            System.out.println("Aviso: Matricula ja registrada na sala. Acesso nao permitido.");
        }
    }
}
