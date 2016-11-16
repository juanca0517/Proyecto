/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.serializer;

import co.edu.uniandes.piladsl.services.PilaGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PilaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PilaGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PilaGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMARule())
			return getCOMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOSPTOSRule())
			return getDOSPTOSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIGUALRule())
			return getIGUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLLAVEDRule())
			return getLLAVEDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLLAVEIRule())
			return getLLAVEIToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPTOCOMARule())
			return getPTOCOMAToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMA: 
	 * 	',';
	 */
	protected String getCOMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal DOSPTOS: 
	 * 	':';
	 */
	protected String getDOSPTOSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal IGUAL: 
	 * 	'=';
	 */
	protected String getIGUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal LLAVED: 
	 * 	'}';
	 */
	protected String getLLAVEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal LLAVEI: 
	 * 	'{';
	 */
	protected String getLLAVEIToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal PTOCOMA: 
	 * 	';';
	 */
	protected String getPTOCOMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}