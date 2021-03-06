package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;

import java.util.List;

public class IncomeProponentRule50 implements Rule {
    public boolean check(List<String> lines) {
        boolean check = true;
        for (String line : lines) {
            check = check && LineAnalyzer.isProponentIncomeValid50(line) != null ? LineAnalyzer.isProponentIncomeValid50(line) : true;
        }
        return check;
    }
}