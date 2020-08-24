// This is a generated file. Not intended for manual editing.
package com.github.viise.fdl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.viise.fdl.impl.*;

public interface FDLTypes {

  IElementType EXPRESSIONS = new FDLElementType("EXPRESSIONS");
  IElementType LITERAL = new FDLElementType("LITERAL");
  IElementType LITERAL_ANY = new FDLElementType("LITERAL_ANY");
  IElementType NUMBER = new FDLElementType("NUMBER");
  IElementType OPERATIONS = new FDLElementType("OPERATIONS");
  IElementType RULES = new FDLElementType("RULES");
  IElementType VAR_RULES = new FDLElementType("VAR_RULES");
  IElementType VAR_RULE_1 = new FDLElementType("VAR_RULE_1");
  IElementType VAR_RULE_2 = new FDLElementType("VAR_RULE_2");

  IElementType ADD = new FDLTokenType("ADD");
  IElementType ASSIGN = new FDLTokenType("ASSIGN");
  IElementType COMMENT = new FDLTokenType("COMMENT");
  IElementType DIV = new FDLTokenType("DIV");
  IElementType FALSE = new FDLTokenType("FALSE");
  IElementType FLOAT = new FDLTokenType("FLOAT");
  IElementType HEX = new FDLTokenType("HEX");
  IElementType INTEGER = new FDLTokenType("INTEGER");
  IElementType MUL = new FDLTokenType("MUL");
  IElementType NAME = new FDLTokenType("NAME");
  IElementType NULL = new FDLTokenType("NULL");
  IElementType SEMI = new FDLTokenType("SEMI");
  IElementType STRING = new FDLTokenType("STRING");
  IElementType SUB = new FDLTokenType("SUB");
  IElementType TRUE = new FDLTokenType("TRUE");
  IElementType VAR = new FDLTokenType("VAR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXPRESSIONS) {
        return new FDLExpressionsImpl(node);
      }
      else if (type == LITERAL) {
        return new FDLLiteralImpl(node);
      }
      else if (type == LITERAL_ANY) {
        return new FDLLiteralAnyImpl(node);
      }
      else if (type == NUMBER) {
        return new FDLNumberImpl(node);
      }
      else if (type == OPERATIONS) {
        return new FDLOperationsImpl(node);
      }
      else if (type == RULES) {
        return new FDLRulesImpl(node);
      }
      else if (type == VAR_RULES) {
        return new FDLVarRulesImpl(node);
      }
      else if (type == VAR_RULE_1) {
        return new FDLVarRule1Impl(node);
      }
      else if (type == VAR_RULE_2) {
        return new FDLVarRule2Impl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
