package com.finan.orcamento;

import org.springframework.context.ApplicationContext;
import com.finan.orcamento.repositories.service.OrcamentoService;
import com.finan.orcamento.model.OrcamentoProxy;
import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.controller.OrcamentoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainClass.class, args);

        OrcamentoService orcamentoService = context.getBean(OrcamentoService.class);
        Long id = 8L;
        OrcamentoModel orcamentoModel = orcamentoService.buscaId(id);

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoModel);
        System.out.println("Valor desconto antes = " + proxy.getDescontoOrcamento());
        System.out.println("Valor desconto depois= " + proxy.getDescontoOrcamento());

        System.out.println("chamada sem ter o proxy envolvido");
        System.out.println("Valor do Orcamento = "+ orcamentoModel.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ orcamentoModel.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = "+ orcamentoModel.getQtdItens());
        System.out.println();

        System.out.println("_____________________________________");

        System.out.println("Primeira vez chamando o Orcamento");
        System.out.println("valor orcamento = " + proxy.getValorOrcamento());
        System.out.println("desconto orcamento = " + proxy.getDescontoOrcamento());
        System.out.println("qtdItens = " + proxy.getQtdItens());
        System.out.println("_____________________________________");

        System.out.println("Segunda vez(sem delay)");
        System.out.println("valor orcamento = " + proxy.getValorOrcamento());
        System.out.println("desconto orcamento = " + proxy.getDescontoOrcamento());
        System.out.println("qtdItens = " + proxy.getQtdItens());
        System.out.println("_____________________________________");

        System.out.println("Terceira vez(sem delay)");
        System.out.println("valor orcamento = " + proxy.getValorOrcamento());
        System.out.println("desconto orcamento = " + proxy.getDescontoOrcamento());
        System.out.println("qtdItens = " + proxy.getQtdItens());
        System.out.println("_____________________________________");
    }
}


