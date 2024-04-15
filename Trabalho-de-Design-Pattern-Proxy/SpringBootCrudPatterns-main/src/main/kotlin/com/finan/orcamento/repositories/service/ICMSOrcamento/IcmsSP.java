package com.finan.orcamento.repositories.service.ICMSOrcamento;

import java.math.BigDecimal;

public class IcmsSP implements IcmsStrategy{
    @Override
    public BigDecimal calcular(BigDecimal valorOrcamento) {
        return valorOrcamento.multiply(new BigDecimal("0.12"));
    }
}