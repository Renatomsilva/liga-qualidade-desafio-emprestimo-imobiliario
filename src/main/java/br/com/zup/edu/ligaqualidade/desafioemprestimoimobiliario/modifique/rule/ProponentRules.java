package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.proponent.*;

import java.util.ArrayList;
import java.util.List;

public class ProponentRules {

    public static List<Rule> getRules() {
        List<Rule> rules = new ArrayList<Rule>();

        rules.add(new TwoProponentsRule());
        rules.add(new OnlyOnePrincipalProponentRule());
        rules.add(new AgeProponentRule());
        rules.add(new IncomeProponentRule1824());
        rules.add(new IncomeProponentRule2450());
        rules.add(new IncomeProponentRule50());


        return rules;
    }

}
