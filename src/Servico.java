public class Servico {
    int idServico;
    float preco;
    String descricao;
    String forma_pagamento;

    public int getIdServico() {
        return this.idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getForma_pagamento() {
        return this.forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
}
