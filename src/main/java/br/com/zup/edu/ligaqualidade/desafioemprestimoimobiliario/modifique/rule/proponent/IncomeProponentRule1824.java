package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer.LineAnalyzer;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;

import java.util.List;

public class IncomeProponentRule1824 implements Rule {
    public boolean check(List<String> lines) {
        boolean check = true;
        for (String line : lines) {
            check = check && LineAnalyzer.isProponentIncomeValid2450(line) != null ? LineAnalyzer.isProponentIncomeValid2450(line) : true;
        }
        return check;
    }
}