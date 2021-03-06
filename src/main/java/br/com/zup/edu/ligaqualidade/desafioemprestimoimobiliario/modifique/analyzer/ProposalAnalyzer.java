package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.analyzer;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.enums.BASE_COLUMNS;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.ProponentRules;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.ProposalRules;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.rule.Rule;
import java.util.ArrayList;
import java.util.List;

public class ProposalAnalyzer {
    public static boolean analyse(List<String> lines, ArrayList<String> proposalsApproved) {
        List<Rule> rules = new ArrayList<Rule>();
        rules.addAll(ProposalRules.getRules());
        rules.addAll(ProponentRules.getRules());

        boolean check = true;
        for (Rule rule : rules) {
            check = check && rule.check(lines);
        }
        if(check)
            proposalsApproved.add(lines.get(0).toString().split(",")[BASE_COLUMNS.PROPOSAL_ID.ordinal()] );
        return check;
    }

}
