package br.com.infnet.rodrigo_loureiro_pb_tp4.mock;

import br.com.infnet.rodrigo_loureiro_pb_tp4.model.produto.Produto;
import br.com.infnet.rodrigo_loureiro_pb_tp4.model.produto.ProdutoReal;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

public class MockProduto {
    public static HashMap<UUID, Produto> gerarProdutos() {
        HashMap<UUID, Produto> produtos = new HashMap<>();

        UUID id1 = UUID.fromString("e5256b50-c2ab-42d4-8c00-232cce1cda8b");
        produtos.put(id1, new ProdutoReal.Builder()
                .id(id1)
                .nome("Teclado Gamer")
                .descricao("Teclado mecânico com RGB")
                .preco(new BigDecimal("250.00"))
                .quantidade(10)
                .build());

        UUID id2 = UUID.randomUUID();
        produtos.put(id2, new ProdutoReal.Builder()
                .id(id2)
                .nome("Mouse")
                .descricao("Mouse sem fio")
                .preco(new BigDecimal("120.00"))
                .quantidade(20)
                .build());

        UUID id3 = UUID.randomUUID();
        produtos.put(id3, new ProdutoReal.Builder()
                .id(id3)
                .nome("Monitor")
                .descricao("Monitor 24 polegadas Full HD")
                .preco(new BigDecimal("900.00"))
                .quantidade(5)
                .build());

        return produtos;
    }
}
