package Repositorios;

import Interfaces.IPilhaMedico;
import Entidades.Medico;
import java.util.ArrayList;
import java.util.List;

public class RpilhaMedico implements IPilhaMedico {
    private List<Medico> pilha;

    public RpilhaMedico() {
        pilha = new ArrayList<>();
    }

    public void empilhar(Medico medico) {
        pilha.add(medico);
    }

    public Medico desempilhar() {
        if (pilha.isEmpty()) {
            return null;
        }
        return pilha.remove(pilha.size() - 1);
    }

    public Medico topo() {
        if (pilha.isEmpty()) {
            return null;
        }
        return pilha.get(pilha.size() - 1);
    }

    public int tamanho() {
        return pilha.size();
    }
}
