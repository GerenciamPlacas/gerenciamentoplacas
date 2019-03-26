package com.projeto.gerenciamentoplacas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.gerenciamentoplacas.domain.Placa;

@Repository
public interface PlacaRepository extends JpaRepository<Placa, Integer>{//Interface capaz de operações de acesso a dados. Permite fazer busca, salvar, alterar, deletar,várias opera~ções de acesso a dados referentes ao objetos Placas, q/ está mapeado c/ a tabela Placas, no banco de dados.
}
