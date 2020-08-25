/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.viise.fdl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.viise.fdl.psi.FDLTypes;
import com.intellij.psi.TokenType;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>FDL.flex</tt>
 */
class FDLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;
  public static final int START_STRING = 4;
  public static final int STOP_STRING = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1,  1,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 17376 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1"+
    "\21\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\21\1\25\1\57\1\60\5\21\2\25\1\61"+
    "\7\21\1\25\1\62\20\21\1\25\1\63\1\21\1\64\13\25\1\65\1\25\1\66\22\21\1\67"+
    "\1\70\4\21\1\71\11\21\1\72\1\73\1\74\1\75\1\21\1\76\2\21\1\77\3\21\1\100\2"+
    "\21\1\101\10\21\123\25\1\102\7\25\1\103\1\104\12\25\1\105\15\25\1\106\6\21"+
    "\1\25\1\107\u0582\21\1\110\u017f\21");

  /* The ZZ_CMAP_Y table has 4672 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\7\1\10\1\11\1\13\1\14"+
    "\3\0\1\15\1\16\1\17\1\20\2\21\1\22\3\21\1\22\71\21\1\23\1\21\1\24\1\25\1\26"+
    "\1\27\2\25\16\0\1\30\1\31\1\32\1\33\2\21\1\34\11\21\1\35\21\21\1\36\1\37\24"+
    "\21\1\40\3\21\1\22\1\41\1\40\4\21\1\42\1\43\4\0\1\44\1\45\1\25\3\21\2\46\1"+
    "\25\1\47\1\50\1\0\1\51\5\21\1\52\3\0\1\53\1\54\13\21\1\55\1\44\1\56\1\57\1"+
    "\0\1\60\1\25\1\61\1\62\3\21\3\0\1\63\12\21\1\64\1\0\1\65\1\25\1\0\1\66\3\21"+
    "\1\52\1\67\1\20\2\21\1\64\1\70\1\71\1\72\2\25\3\21\1\73\1\21\1\46\6\25\2\21"+
    "\1\30\1\74\2\25\1\75\5\0\1\76\6\21\1\77\2\0\1\100\1\21\1\101\1\0\1\40\1\21"+
    "\1\102\1\103\1\104\2\21\1\105\1\106\1\107\1\110\1\111\1\61\1\112\1\101\1\0"+
    "\1\113\1\114\1\115\1\116\1\104\2\21\1\105\1\117\1\120\1\121\1\122\1\123\1"+
    "\124\1\125\1\0\1\126\1\25\1\115\1\35\1\34\2\21\1\105\1\127\1\107\1\44\1\130"+
    "\1\131\1\25\1\101\1\0\1\41\1\132\1\115\1\103\1\104\2\21\1\105\1\127\1\107"+
    "\1\110\1\122\1\125\1\112\1\101\1\0\1\41\1\25\1\133\1\134\1\135\1\136\1\114"+
    "\1\134\1\21\1\137\1\140\1\141\1\142\1\25\1\125\1\0\1\25\1\41\1\143\1\30\1"+
    "\105\2\21\1\105\1\21\1\144\1\145\1\141\1\146\1\46\1\101\1\0\2\25\1\102\1\30"+
    "\1\105\2\21\1\105\1\147\1\107\1\145\1\141\1\146\1\32\1\101\1\0\1\150\1\25"+
    "\1\143\1\30\1\105\4\21\1\151\1\145\1\152\1\153\1\42\1\101\1\0\1\25\1\37\1"+
    "\154\1\21\1\22\1\37\2\21\1\34\1\155\1\22\1\156\1\157\1\0\1\125\1\0\1\160\1"+
    "\25\1\40\5\21\1\161\1\162\1\163\1\164\1\0\1\165\4\25\1\166\1\167\1\170\1\40"+
    "\1\171\1\172\1\161\1\173\1\174\1\47\1\0\1\175\4\25\1\131\2\25\1\165\1\0\1"+
    "\165\1\176\1\177\1\21\1\40\3\21\1\26\1\43\1\0\1\145\1\200\1\0\1\43\3\0\1\201"+
    "\1\202\7\25\5\21\1\52\1\0\1\203\1\0\1\165\1\64\1\204\1\205\1\206\1\207\1\21"+
    "\1\210\1\211\1\0\1\47\4\21\1\35\1\17\5\21\1\212\51\21\1\135\1\22\1\135\5\21"+
    "\1\135\4\21\1\135\1\22\1\135\1\21\1\22\7\21\1\135\10\21\1\213\4\25\2\21\2"+
    "\25\12\21\2\74\1\40\114\21\1\103\2\21\1\40\2\21\1\46\11\21\1\134\1\21\1\131"+
    "\1\21\1\30\1\214\1\25\2\21\1\214\1\25\2\21\1\215\1\25\1\21\1\30\1\216\1\25"+
    "\6\21\1\217\3\0\1\220\1\221\1\0\1\165\3\25\1\222\1\0\1\165\13\21\1\25\1\223"+
    "\4\21\1\224\10\21\1\74\1\25\3\21\1\22\1\0\1\2\1\0\1\2\1\125\1\0\3\21\1\74"+
    "\1\26\1\25\5\21\1\113\3\21\1\24\1\0\1\165\4\25\2\21\1\163\1\2\6\21\1\200\1"+
    "\164\3\0\1\110\1\0\1\165\1\0\1\165\1\42\1\25\1\0\1\47\10\25\1\225\5\21\1\217"+
    "\1\0\1\225\1\113\1\0\1\165\1\25\1\226\1\2\1\25\1\227\3\21\1\100\1\206\1\0"+
    "\1\66\4\21\1\64\1\0\1\2\1\25\4\21\1\217\2\0\1\25\1\0\1\230\1\0\1\66\3\21\1"+
    "\74\1\21\1\131\10\25\1\231\2\0\1\232\1\233\1\165\30\21\7\0\1\234\42\21\2\74"+
    "\4\21\2\74\1\21\1\235\3\21\1\74\6\21\1\30\1\174\1\236\1\26\1\237\1\113\1\21"+
    "\1\26\1\236\1\26\1\25\1\226\3\25\1\240\1\25\1\42\1\131\1\25\1\241\1\25\1\145"+
    "\1\0\1\41\1\42\2\25\1\21\1\26\4\21\2\25\1\0\1\201\1\242\1\0\1\243\1\25\1\244"+
    "\1\37\1\155\1\245\1\27\1\246\1\21\1\247\1\250\1\251\2\25\5\21\1\131\116\25"+
    "\5\21\1\22\5\21\1\22\20\21\1\26\1\252\1\253\1\25\4\21\1\35\1\17\7\21\1\42"+
    "\1\25\1\61\2\21\1\22\1\25\10\22\4\0\5\25\1\42\72\25\1\250\3\25\1\40\1\210"+
    "\1\245\1\26\1\40\11\21\1\22\1\254\1\40\12\21\1\212\1\250\4\21\1\22\1\40\12"+
    "\21\1\22\2\25\3\21\1\46\6\25\170\21\1\74\11\25\75\21\1\46\2\25\21\21\1\26"+
    "\10\25\5\21\1\74\41\21\1\26\2\21\1\0\1\253\2\25\5\21\1\163\1\75\1\255\3\21"+
    "\1\64\12\21\1\165\3\25\1\42\1\21\1\37\14\21\1\104\3\21\1\22\1\21\7\25\1\42"+
    "\1\21\1\256\1\257\2\21\1\52\2\25\1\131\6\21\1\113\1\25\1\66\5\21\1\217\1\0"+
    "\1\47\1\25\1\0\1\165\2\0\1\66\1\260\1\0\1\66\2\21\1\64\1\47\2\21\1\163\1\0"+
    "\1\2\1\25\3\21\1\26\1\76\5\21\1\52\1\0\1\243\1\42\1\0\1\165\1\261\1\21\1\0"+
    "\1\262\5\21\1\100\1\164\1\25\1\257\1\263\1\0\1\165\2\21\1\22\1\264\6\21\1"+
    "\205\1\265\1\224\2\25\1\266\1\21\1\52\1\267\1\25\3\270\1\25\2\22\5\21\1\212"+
    "\1\74\1\25\16\21\1\52\1\271\1\0\1\165\64\21\1\113\1\25\2\21\1\22\1\272\5\21"+
    "\1\113\40\25\55\21\1\74\15\21\1\24\4\25\1\22\1\25\1\272\1\273\1\21\1\105\1"+
    "\22\1\174\1\274\15\21\1\24\3\25\1\272\54\21\1\74\2\25\10\21\1\37\6\21\5\25"+
    "\1\21\1\26\2\0\2\25\2\0\1\114\2\25\1\250\3\25\1\41\1\30\20\21\1\275\1\241"+
    "\1\25\1\0\1\165\1\40\2\21\1\116\1\40\2\21\1\46\1\276\12\21\1\22\3\37\1\277"+
    "\1\300\2\25\1\301\1\21\1\147\2\21\1\22\2\21\1\302\1\21\1\74\1\21\1\74\4\25"+
    "\17\21\1\46\10\25\6\21\1\26\20\25\1\303\20\25\3\21\1\26\6\21\1\131\1\25\1"+
    "\243\3\25\4\21\1\25\1\250\3\21\1\46\4\21\1\64\1\304\3\21\1\74\4\21\1\113\1"+
    "\21\1\245\5\25\23\21\1\74\1\0\1\165\4\21\1\113\4\21\1\113\5\21\1\25\6\21\1"+
    "\113\23\25\46\21\1\22\1\25\2\21\1\74\1\25\1\21\23\25\1\74\1\105\4\21\1\35"+
    "\1\305\2\21\1\74\1\25\2\21\1\22\1\25\3\21\1\22\10\25\2\21\1\306\1\25\2\21"+
    "\1\74\1\25\3\21\1\24\10\25\7\21\1\276\10\25\1\307\1\75\1\147\1\40\2\21\1\113"+
    "\1\121\4\25\3\21\1\26\3\21\1\26\4\25\1\21\1\40\2\21\1\310\3\25\6\21\1\74\1"+
    "\25\2\21\1\74\1\25\2\21\1\46\1\25\2\21\1\24\15\25\11\21\1\131\6\25\6\21\1"+
    "\46\1\25\6\21\1\46\41\25\1\227\6\21\1\0\1\164\3\25\1\125\1\0\1\25\1\61\1\227"+
    "\5\21\1\0\1\311\2\25\3\21\1\131\1\0\1\165\1\227\3\21\1\163\1\0\1\145\1\0\2"+
    "\25\4\21\1\312\1\25\1\227\5\21\1\52\1\0\1\313\1\314\1\0\1\315\4\25\2\21\1"+
    "\34\2\21\1\217\1\0\1\202\10\25\1\22\1\246\1\21\1\35\1\21\1\131\5\21\1\163"+
    "\1\0\1\304\1\0\1\165\1\143\1\103\1\104\2\21\1\105\1\127\1\107\1\110\1\122"+
    "\1\142\1\250\1\101\2\201\21\25\6\21\1\200\1\0\1\203\1\46\1\0\1\165\4\25\6"+
    "\21\2\0\1\316\1\25\1\0\1\165\24\25\5\21\1\163\1\47\1\0\1\243\2\25\1\263\4"+
    "\25\6\21\2\0\1\317\1\25\1\0\1\165\4\25\5\21\1\52\1\0\1\25\1\0\1\165\6\25\3"+
    "\21\1\320\1\0\1\2\1\0\1\165\54\25\10\21\1\0\1\165\1\25\1\42\40\25\1\100\1"+
    "\227\4\21\1\52\1\321\1\61\1\25\1\100\1\76\4\21\1\237\1\210\1\0\1\165\4\25"+
    "\7\21\1\131\40\25\1\21\1\105\3\21\1\163\1\164\1\0\1\131\1\25\1\0\1\165\2\25"+
    "\1\37\3\21\1\322\2\0\1\43\1\164\11\25\1\22\1\34\4\21\1\323\1\324\1\211\1\25"+
    "\1\0\1\165\24\25\63\21\1\24\14\25\15\21\1\22\2\25\30\21\1\113\27\25\5\21\1"+
    "\22\72\25\10\21\1\22\67\25\7\21\1\131\3\21\1\22\1\0\1\165\14\25\3\21\1\74"+
    "\1\201\1\25\6\21\1\164\1\25\1\113\1\25\1\0\1\165\1\272\2\21\1\250\2\21\56"+
    "\25\10\21\1\26\1\25\1\100\4\0\1\164\1\25\1\61\1\227\1\21\10\25\1\24\3\25\75"+
    "\21\1\26\2\25\36\21\1\46\41\25\43\21\1\22\12\25\61\21\1\113\40\25\15\21\1"+
    "\46\1\21\1\26\1\21\1\131\1\21\1\325\1\2\127\25\1\326\1\327\2\0\1\330\1\2\3"+
    "\25\1\331\22\25\1\314\67\25\12\21\1\30\10\21\1\30\1\332\1\333\1\21\1\334\1"+
    "\147\7\21\1\35\1\335\2\30\3\21\1\336\1\174\1\37\1\105\51\21\1\74\3\21\1\105"+
    "\2\21\1\212\3\21\1\212\2\21\1\30\3\21\1\30\2\21\1\22\3\21\1\22\3\21\1\105"+
    "\3\21\1\105\2\21\1\212\1\337\14\0\1\164\1\226\5\0\1\201\1\303\1\25\1\340\2"+
    "\25\1\226\1\43\1\0\52\25\1\164\2\0\1\341\1\342\1\304\72\25\30\21\1\26\1\25"+
    "\1\164\5\25\10\21\1\217\1\304\1\0\1\165\24\25\1\147\3\21\1\166\1\40\1\212"+
    "\1\343\1\244\1\344\1\166\1\235\1\166\2\212\1\124\1\21\1\34\1\21\1\113\1\345"+
    "\1\34\1\21\1\113\50\25\32\21\1\22\5\25\106\21\1\26\1\25\33\21\1\74\120\21"+
    "\1\24\1\25\146\21\1\131\3\25\3\21\1\74\74\25\1\123\3\25\14\0\20\25\36\0\2"+
    "\25");

  /* The ZZ_CMAP_A table has 1840 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\23\1\24\1\22\2\24\1\22\6\23\4\0\1\24\1\0\1\20\1\0\1\4\2\0\1\21\2\0\1\35"+
    "\1\33\1\30\1\34\1\31\1\36\1\16\11\17\1\32\1\27\1\0\1\32\3\0\1\1\3\3\1\7\1"+
    "\11\5\4\1\10\1\4\1\2\3\4\1\12\1\5\1\6\1\14\1\15\1\4\1\13\2\4\4\0\1\4\1\13"+
    "\2\4\1\25\1\0\1\26\1\0\6\23\1\37\2\23\2\0\4\4\4\0\1\4\2\0\1\23\7\0\1\4\4\0"+
    "\1\4\5\0\17\4\1\0\2\4\4\0\4\4\16\0\5\4\7\0\1\4\1\0\1\4\1\0\5\4\1\0\2\4\2\0"+
    "\4\4\1\0\1\4\6\0\1\4\1\0\3\4\1\0\1\4\1\0\4\4\1\0\13\4\1\0\3\4\1\0\5\23\2\0"+
    "\6\4\1\0\7\4\1\0\1\4\15\0\1\4\1\0\15\23\1\0\1\23\1\0\2\23\1\0\2\23\1\0\1\23"+
    "\3\4\5\0\6\23\5\0\1\4\4\0\3\23\1\0\1\23\3\0\3\4\7\23\4\0\2\4\1\23\13\4\1\0"+
    "\1\4\7\23\2\4\2\23\1\0\4\23\2\4\2\23\3\4\2\0\1\4\7\0\1\23\1\4\1\23\6\4\3\23"+
    "\2\0\11\4\3\23\1\4\6\0\2\23\6\4\4\23\2\4\2\0\2\23\1\4\11\23\1\4\3\23\1\4\5"+
    "\23\2\0\1\4\3\23\4\0\6\4\6\0\10\23\6\4\3\23\1\4\2\23\1\4\7\23\2\4\2\23\2\0"+
    "\2\23\1\4\3\23\1\0\10\4\2\0\2\4\2\0\6\4\1\0\7\4\1\0\1\4\3\0\4\4\2\0\1\23\1"+
    "\4\7\23\2\0\2\23\2\0\3\23\1\4\5\0\2\4\1\0\5\4\7\0\2\4\4\0\3\23\1\0\6\4\4\0"+
    "\2\4\1\0\2\4\1\0\2\4\1\0\2\4\2\0\1\23\1\0\5\23\4\0\2\23\2\0\3\23\3\0\1\23"+
    "\7\0\4\4\1\0\1\4\7\0\4\23\3\4\1\23\2\0\1\4\1\0\2\4\1\0\3\4\2\23\1\0\3\23\2"+
    "\0\1\4\10\0\1\4\6\23\2\0\1\23\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4"+
    "\1\0\4\4\4\0\5\23\3\0\3\23\1\0\4\23\2\0\1\4\6\0\5\23\1\0\5\4\3\0\1\4\7\23"+
    "\1\0\2\23\5\0\2\23\1\0\4\4\1\0\3\4\1\0\2\4\5\0\3\4\2\23\1\4\3\23\1\0\4\23"+
    "\1\4\5\0\3\4\1\23\2\0\2\23\1\0\7\4\1\0\1\4\4\0\1\23\4\0\6\23\1\0\1\23\3\0"+
    "\2\23\4\0\1\4\1\23\2\4\7\23\4\0\10\4\10\23\1\0\2\23\7\0\2\4\1\0\1\4\2\0\2"+
    "\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\3\4\2\23\1"+
    "\0\2\23\1\4\2\0\5\4\1\0\1\4\1\0\2\23\2\0\4\4\5\0\1\23\1\0\1\23\1\0\1\23\4"+
    "\0\2\23\5\4\10\23\11\0\1\23\1\0\7\23\1\4\2\23\4\4\3\23\1\4\3\23\2\4\7\23\3"+
    "\4\4\23\5\4\14\23\1\4\1\23\3\4\1\0\7\4\2\0\3\23\2\4\3\23\3\0\2\4\2\23\4\0"+
    "\1\4\1\0\2\23\4\0\4\4\10\23\3\0\1\4\3\0\2\4\1\23\5\0\4\23\1\0\5\4\2\23\2\4"+
    "\1\23\1\4\5\0\5\23\3\4\3\0\10\23\5\4\2\23\3\0\3\4\3\23\1\0\5\23\4\4\1\23\4"+
    "\4\3\23\2\4\3\23\1\0\5\23\1\0\1\4\1\0\1\4\1\0\1\4\1\0\1\4\2\0\3\4\1\0\6\4"+
    "\2\0\2\4\2\24\5\23\5\0\1\4\4\0\1\23\3\0\4\23\11\0\1\4\4\0\1\4\1\0\5\4\2\0"+
    "\1\4\1\0\4\4\1\0\3\4\2\0\4\4\5\0\5\4\4\0\1\4\4\0\4\4\3\23\2\4\5\0\2\23\2\0"+
    "\3\4\6\23\1\0\3\4\1\23\3\4\1\23\4\4\1\23\4\4\3\0\1\4\1\0\1\4\2\0\5\4\1\23"+
    "\2\4\2\23\5\4\1\0\4\4\2\23\4\0\1\4\3\23\2\4\1\23\5\4\2\23\3\0\3\4\4\0\3\4"+
    "\2\23\2\0\6\4\1\0\3\23\1\0\2\23\5\0\5\4\5\0\1\4\1\23\3\4\1\0\2\4\1\0\7\4\2"+
    "\0\1\23\6\0\2\4\2\0\3\4\3\0\2\4\3\0\2\4\2\0\3\23\4\0\3\4\1\0\2\4\1\0\1\4\5"+
    "\0\1\23\2\0\3\23\5\0\1\4\3\0\1\4\2\0\4\4\1\0\2\4\2\0\1\4\3\23\1\0\2\23\1\0"+
    "\5\4\2\23\1\0\3\23\2\0\1\23\2\0\3\4\1\23\2\0\1\4\1\0\1\23\4\4\5\0\3\23\3\0"+
    "\2\23\1\4\1\0\1\4\3\0\4\23\2\4\1\0\1\4\1\23\3\0\1\4\3\0\2\4\3\0\5\23\1\4\4"+
    "\23\3\0\6\23\1\4\6\23\3\0\1\23\1\0\2\23\1\0\1\23\2\4\3\0\2\23\6\0\5\23\3\0"+
    "\6\23\2\0\3\23\2\0\4\23\4\0\1\4\2\0\2\4\2\0\4\4\1\0\4\4\1\0\1\4\1\0\6\4\2"+
    "\0\5\4\1\0\4\4\1\0\4\4\2\0\2\23\4\0\1\23\3\0\1\23\2\0\7\23\1\0\2\23\1\0\2"+
    "\23\1\0\1\4\1\0\1\4\5\0\1\4\1\0\1\4\1\0\3\4\1\0\3\4\1\0\3\4");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\3\2\2\3\2\1\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\3\1\1\13"+
    "\2\2\3\0\1\14\2\0\2\15\3\0\1\2\1\16"+
    "\1\17\2\20\3\0\1\21\1\22\1\23\1\0\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\100\0\100\0\100\0\100"+
    "\0\100\0\100\0\u0180\0\u01a0\0\u01c0\0\u01e0\0\100\0\u0200"+
    "\0\u0220\0\u0240\0\u0260\0\u0100\0\100\0\u0120\0\u0160\0\100"+
    "\0\u0280\0\u02a0\0\u02c0\0\u02e0\0\u0300\0\140\0\u0240\0\100"+
    "\0\u0320\0\u0340\0\u0360\0\u0380\0\140\0\100\0\100\0\u03a0"+
    "\0\100";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\13\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\3\1\13\1\14\1\3\1\15\1\16\1\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\13\2\3\1\24"+
    "\3\3\1\25\2\3\1\26\4\3\1\7\1\10\2\3"+
    "\1\13\1\3\1\13\3\3\1\16\2\3\1\20\1\21"+
    "\1\22\1\27\1\13\41\0\17\4\3\0\1\4\13\0"+
    "\1\4\1\0\4\4\1\30\12\4\3\0\1\4\13\0"+
    "\1\4\1\0\1\31\16\4\3\0\1\4\13\0\1\4"+
    "\13\0\1\32\15\0\1\33\24\0\2\10\11\0\1\33"+
    "\6\0\20\34\1\35\17\34\21\36\1\35\16\36\22\0"+
    "\1\13\1\0\1\13\12\0\1\13\26\37\1\40\11\37"+
    "\36\0\1\41\15\0\1\42\35\0\1\43\26\0\1\44"+
    "\37\0\6\4\1\45\10\4\3\0\1\4\13\0\1\4"+
    "\1\0\11\4\1\46\5\4\3\0\1\4\13\0\1\4"+
    "\1\0\1\47\1\0\1\47\3\0\1\47\1\0\1\47"+
    "\4\0\2\47\36\0\1\50\1\51\20\0\22\41\1\0"+
    "\15\41\10\0\1\52\43\0\1\53\33\0\1\54\30\0"+
    "\4\4\1\55\12\4\3\0\1\4\13\0\1\4\16\0"+
    "\2\51\30\0\1\56\36\0\1\57\35\0\1\60\41\0"+
    "\1\61\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[960];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\11\1\6\11\4\1\1\11\2\1\3\0"+
    "\1\11\2\0\1\11\1\1\3\0\3\1\1\11\1\1"+
    "\3\0\1\1\2\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FDLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 21: break;
          case 2: 
            { yybegin(YYINITIAL); return FDLTypes.NAME;
            } 
            // fall through
          case 22: break;
          case 3: 
            { yybegin(YYINITIAL); return FDLTypes.INTEGER;
            } 
            // fall through
          case 23: break;
          case 4: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 24: break;
          case 5: 
            { yybegin(YYINITIAL); return FDLTypes.SEMI;
            } 
            // fall through
          case 25: break;
          case 6: 
            { yybegin(YYINITIAL); return FDLTypes.COMMA;
            } 
            // fall through
          case 26: break;
          case 7: 
            { yybegin(YYINITIAL); return FDLTypes.ASSIGN;
            } 
            // fall through
          case 27: break;
          case 8: 
            { yybegin(YYINITIAL); return FDLTypes.ADD;
            } 
            // fall through
          case 28: break;
          case 9: 
            { yybegin(YYINITIAL); return FDLTypes.SUB;
            } 
            // fall through
          case 29: break;
          case 10: 
            { yybegin(YYINITIAL); return FDLTypes.MUL;
            } 
            // fall through
          case 30: break;
          case 11: 
            { yybegin(YYINITIAL); return FDLTypes.DIV;
            } 
            // fall through
          case 31: break;
          case 12: 
            { yybegin(YYINITIAL); return FDLTypes.STRING;
            } 
            // fall through
          case 32: break;
          case 13: 
            { yybegin(YYINITIAL); return FDLTypes.COMMENT;
            } 
            // fall through
          case 33: break;
          case 14: 
            { yybegin(YYINITIAL); return FDLTypes.VAR;
            } 
            // fall through
          case 34: break;
          case 15: 
            { yybegin(YYINITIAL); return FDLTypes.HEX;
            } 
            // fall through
          case 35: break;
          case 16: 
            { yybegin(YYINITIAL); return FDLTypes.FLOAT;
            } 
            // fall through
          case 36: break;
          case 17: 
            { yybegin(YYINITIAL); return FDLTypes.USES;
            } 
            // fall through
          case 37: break;
          case 18: 
            { yybegin(YYINITIAL); return FDLTypes.NULL;
            } 
            // fall through
          case 38: break;
          case 19: 
            { yybegin(YYINITIAL); return FDLTypes.TRUE;
            } 
            // fall through
          case 39: break;
          case 20: 
            { yybegin(YYINITIAL); return FDLTypes.FALSE;
            } 
            // fall through
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
