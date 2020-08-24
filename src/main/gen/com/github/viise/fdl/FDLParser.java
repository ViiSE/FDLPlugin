// This is a generated file. Not intended for manual editing.
package com.github.viise.fdl;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.viise.fdl.psi.FDLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FDLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // NAME ' '* operations ' '* literalAny ' '* SEMI
  public static boolean expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && expressions_1(b, l + 1);
    r = r && operations(b, l + 1);
    r = r && expressions_3(b, l + 1);
    r = r && literalAny(b, l + 1);
    r = r && expressions_5(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, EXPRESSIONS, r);
    return r;
  }

  // ' '*
  private static boolean expressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "expressions_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean expressions_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "expressions_3", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean expressions_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "expressions_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // number | STRING | TRUE | FALSE | NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = number(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal | NAME
  public static boolean literalAny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalAny")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_ANY, "<literal any>");
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | FLOAT | HEX
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER, "<number>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, HEX);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ADD | SUB | DIV | MUL | ASSIGN
  public static boolean operations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATIONS, "<operations>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rules*
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    while (true) {
      int c = current_position_(b);
      if (!rules(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // varRules | expressions | COMMENT
  public static boolean rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULES, "<rules>");
    r = varRules(b, l + 1);
    if (!r) r = expressions(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR ' '* NAME ' '* ASSIGN ' '* literalAny ' '* SEMI
  public static boolean varRule1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule1")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && varRule1_1(b, l + 1);
    r = r && consumeToken(b, NAME);
    r = r && varRule1_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && varRule1_5(b, l + 1);
    r = r && literalAny(b, l + 1);
    r = r && varRule1_7(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, VAR_RULE_1, r);
    return r;
  }

  // ' '*
  private static boolean varRule1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule1_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule1_3", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule1_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule1_5", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule1_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule1_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VAR ' '* NAME ' '* ASSIGN ' '* literalAny ' '* operations ' '* literalAny ' '* SEMI
  public static boolean varRule2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && varRule2_1(b, l + 1);
    r = r && consumeToken(b, NAME);
    r = r && varRule2_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && varRule2_5(b, l + 1);
    r = r && literalAny(b, l + 1);
    r = r && varRule2_7(b, l + 1);
    r = r && operations(b, l + 1);
    r = r && varRule2_9(b, l + 1);
    r = r && literalAny(b, l + 1);
    r = r && varRule2_11(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, VAR_RULE_2, r);
    return r;
  }

  // ' '*
  private static boolean varRule2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_3", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_5", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule2_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_7", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule2_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_9", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean varRule2_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule2_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule2_11", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // varRule1 | varRule2
  public static boolean varRules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRules")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = varRule1(b, l + 1);
    if (!r) r = varRule2(b, l + 1);
    exit_section_(b, m, VAR_RULES, r);
    return r;
  }

}
