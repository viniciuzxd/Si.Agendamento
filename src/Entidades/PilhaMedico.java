package Entidades;

import java.util.ArrayList;
import java.util.List;

public class PilhaMedico {
    private List<Medico> pilha;

    public PilhaMedico() {
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

    public static void main(String[] args) {
        PilhaMedico pilha = new PilhaMedico();

        Medico medico1 = new Medico("Dr. Silva", "123456");
        Medico medico2 = new Medico("Dr. Santos", "654321");

        pilha.empilhar(medico1);
        pilha.empilhar(medico2);

        System.out.println("Médico no topo: " + pilha.topo().getNome());

        Medico desempilhado = pilha.desempilhar();
        System.out.println("Médico desempilhado: " + desempilhado.getNome());

        System.out.println("Médico no topo agora: " + pilha.topo().getNome());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}