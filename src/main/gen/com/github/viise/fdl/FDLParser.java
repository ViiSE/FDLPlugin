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
  // ' '* NAME ' '* (COMMA ' '* NAME)* subWComma1*
  public static boolean condWComma1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COND_W_COMMA_1, "<cond w comma 1>");
    r = condWComma1_0(b, l + 1);
    r = r && consumeToken(b, NAME);
    r = r && condWComma1_2(b, l + 1);
    r = r && condWComma1_3(b, l + 1);
    r = r && condWComma1_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ' '*
  private static boolean condWComma1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "condWComma1_0", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean condWComma1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "condWComma1_2", c)) break;
    }
    return true;
  }

  // (COMMA ' '* NAME)*
  private static boolean condWComma1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condWComma1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condWComma1_3", c)) break;
    }
    return true;
  }

  // COMMA ' '* NAME
  private static boolean condWComma1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && condWComma1_3_0_1(b, l + 1);
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // ' '*
  private static boolean condWComma1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "condWComma1_3_0_1", c)) break;
    }
    return true;
  }

  // subWComma1*
  private static boolean condWComma1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condWComma1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subWComma1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condWComma1_4", c)) break;
    }
    return true;
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
  // number | TRUE | FALSE | STRING | NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = number(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, STRING);
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
  // varRule | expressions | usesRule | COMMENT
  public static boolean rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULES, "<rules>");
    r = varRule(b, l + 1);
    if (!r) r = expressions(b, l + 1);
    if (!r) r = usesRule(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN literalAny ' '* (operations ' '* literalAny ' '*)* (COMMA ' '* condWComma1)*
  public static boolean subWComma1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && literalAny(b, l + 1);
    r = r && subWComma1_2(b, l + 1);
    r = r && subWComma1_3(b, l + 1);
    r = r && subWComma1_4(b, l + 1);
    exit_section_(b, m, SUB_W_COMMA_1, r);
    return r;
  }

  // ' '*
  private static boolean subWComma1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_2", c)) break;
    }
    return true;
  }

  // (operations ' '* literalAny ' '*)*
  private static boolean subWComma1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subWComma1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_3", c)) break;
    }
    return true;
  }

  // operations ' '* literalAny ' '*
  private static boolean subWComma1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operations(b, l + 1);
    r = r && subWComma1_3_0_1(b, l + 1);
    r = r && literalAny(b, l + 1);
    r = r && subWComma1_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ' '*
  private static boolean subWComma1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_3_0_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean subWComma1_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_3_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_3_0_3", c)) break;
    }
    return true;
  }

  // (COMMA ' '* condWComma1)*
  private static boolean subWComma1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!subWComma1_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_4", c)) break;
    }
    return true;
  }

  // COMMA ' '* condWComma1
  private static boolean subWComma1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && subWComma1_4_0_1(b, l + 1);
    r = r && condWComma1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ' '*
  private static boolean subWComma1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subWComma1_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "subWComma1_4_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // USES ' '* NAME ' '* ASSIGN ' '* STRING ' '* SEMI
  public static boolean usesRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usesRule")) return false;
    if (!nextTokenIs(b, USES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USES);
    r = r && usesRule_1(b, l + 1);
    r = r && consumeToken(b, NAME);
    r = r && usesRule_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && usesRule_5(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && usesRule_7(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, USES_RULE, r);
    return r;
  }

  // ' '*
  private static boolean usesRule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usesRule_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "usesRule_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean usesRule_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usesRule_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "usesRule_3", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean usesRule_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usesRule_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "usesRule_5", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean usesRule_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usesRule_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "usesRule_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VAR condWComma1 ' '* SEMI
  public static boolean varRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && condWComma1(b, l + 1);
    r = r && varRule_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, VAR_RULE, r);
    return r;
  }

  // ' '*
  private static boolean varRule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varRule_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "varRule_2", c)) break;
    }
    return true;
  }

}
