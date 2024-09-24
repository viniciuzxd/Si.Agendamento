package Interfaces;

import Entidades.Medico;

public interface IPilhaMedico {
    void empilhar(Medico medico);
    Medico desempilhar();
    Medico topo();
    int tamanho();
}