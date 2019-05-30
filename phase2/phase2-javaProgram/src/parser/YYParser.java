package parser;
/* A Bison parser, made by GNU Bison 3.0.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2013 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */
/* "myParser.y":1  */ /* lalr1.java:91  */



/* "myParser.java":39  */ /* lalr1.java:91  */

/* "myParser.java":41  */ /* lalr1.java:92  */

/**
 * A Bison parser, automatically generated from <tt>myParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.0";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";





  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGN = 258;
    /** Token number,to be returned by the scanner.  */
    static final int SHENASE = 259;
    /** Token number,to be returned by the scanner.  */
    static final int AKOLAD_BAZ = 260;
    /** Token number,to be returned by the scanner.  */
    static final int AKOLAD_BASTE = 261;
    /** Token number,to be returned by the scanner.  */
    static final int PARANTEZ_BAZ = 262;
    /** Token number,to be returned by the scanner.  */
    static final int PARANTEZ_BASTE = 263;
    /** Token number,to be returned by the scanner.  */
    static final int BRACKET_BAZ = 264;
    /** Token number,to be returned by the scanner.  */
    static final int BRACKET_BASTE = 265;
    /** Token number,to be returned by the scanner.  */
    static final int COLON = 266;
    /** Token number,to be returned by the scanner.  */
    static final int SEMICOLON = 267;
    /** Token number,to be returned by the scanner.  */
    static final int COMMA = 268;
    /** Token number,to be returned by the scanner.  */
    static final int INT = 269;
    /** Token number,to be returned by the scanner.  */
    static final int FLOAT = 270;
    /** Token number,to be returned by the scanner.  */
    static final int CHAR = 271;
    /** Token number,to be returned by the scanner.  */
    static final int BOOLEAN = 272;
    /** Token number,to be returned by the scanner.  */
    static final int RAVIE = 273;
    /** Token number,to be returned by the scanner.  */
    static final int AGAR = 274;
    /** Token number,to be returned by the scanner.  */
    static final int ANGAH = 275;
    /** Token number,to be returned by the scanner.  */
    static final int VAGARNA = 276;
    /** Token number,to be returned by the scanner.  */
    static final int VA_ANGAH = 277;
    /** Token number,to be returned by the scanner.  */
    static final int YA_VAGARNA = 278;
    /** Token number,to be returned by the scanner.  */
    static final int DO = 279;
    /** Token number,to be returned by the scanner.  */
    static final int WHILE = 280;
    /** Token number,to be returned by the scanner.  */
    static final int FOR = 281;
    /** Token number,to be returned by the scanner.  */
    static final int GOZINESH = 282;
    /** Token number,to be returned by the scanner.  */
    static final int END = 283;
    /** Token number,to be returned by the scanner.  */
    static final int BAZGASHT = 284;
    /** Token number,to be returned by the scanner.  */
    static final int EXIT = 285;
    /** Token number,to be returned by the scanner.  */
    static final int WHEN = 286;
    /** Token number,to be returned by the scanner.  */
    static final int UPTO = 287;
    /** Token number,to be returned by the scanner.  */
    static final int DOWNTO = 288;
    /** Token number,to be returned by the scanner.  */
    static final int MORED = 289;
    /** Token number,to be returned by the scanner.  */
    static final int VA = 290;
    /** Token number,to be returned by the scanner.  */
    static final int YA = 291;
    /** Token number,to be returned by the scanner.  */
    static final int NAGHIZ = 292;
    /** Token number,to be returned by the scanner.  */
    static final int MOSAVI = 293;
    /** Token number,to be returned by the scanner.  */
    static final int NA_MOSAVI = 294;
    /** Token number,to be returned by the scanner.  */
    static final int KUCHIKTAR = 295;
    /** Token number,to be returned by the scanner.  */
    static final int KUCHIKTAR_MOSAVI = 296;
    /** Token number,to be returned by the scanner.  */
    static final int BOZORGTAR = 297;
    /** Token number,to be returned by the scanner.  */
    static final int BOZORGTAR_MOSAVI = 298;
    /** Token number,to be returned by the scanner.  */
    static final int PLUS = 299;
    /** Token number,to be returned by the scanner.  */
    static final int MINUS = 300;
    /** Token number,to be returned by the scanner.  */
    static final int MULTIPLICATION = 301;
    /** Token number,to be returned by the scanner.  */
    static final int DIVISION = 302;
    /** Token number,to be returned by the scanner.  */
    static final int MOD = 303;
    /** Token number,to be returned by the scanner.  */
    static final int TA = 304;
    /** Token number,to be returned by the scanner.  */
    static final int REALCONST = 305;
    /** Token number,to be returned by the scanner.  */
    static final int ADADSABET = 306;
    /** Token number,to be returned by the scanner.  */
    static final int HARF = 307;
    /** Token number,to be returned by the scanner.  */
    static final int BOOLSABET = 308;
    /** Token number,to be returned by the scanner.  */
    static final int PROGRAM = 309;
    /** Token number,to be returned by the scanner.  */
    static final int MAIN = 310;
    /** Token number,to be returned by the scanner.  */
    static final int DEFAULT = 311;
    /** Token number,to be returned by the scanner.  */
    static final int VAGARNA_1 = 312;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param msg The string for the error message.
     */
     void yyerror (String msg);
  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) 
  {
    
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
  }


  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            ) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
          case 2:
  if (yyn == 2)
    /* "myParser.y":20  */ /* lalr1.java:476  */
    { System.out.println("Rule 1 : PROGRAM SHENASE declarations_list list_ravie MAIN block");};
  break;
    

  case 3:
  if (yyn == 3)
    /* "myParser.y":23  */ /* lalr1.java:476  */
    { System.out.println("Rule 2 : declarations");};
  break;
    

  case 4:
  if (yyn == 4)
    /* "myParser.y":24  */ /* lalr1.java:476  */
    { System.out.println("Rule 2 : declarations_list declarations");};
  break;
    

  case 5:
  if (yyn == 5)
    /* "myParser.y":27  */ /* lalr1.java:476  */
    { System.out.println("Rule 3 : taeen_type declarator_list");};
  break;
    

  case 6:
  if (yyn == 6)
    /* "myParser.y":30  */ /* lalr1.java:476  */
    { System.out.println("Rule 4 : INT");};
  break;
    

  case 7:
  if (yyn == 7)
    /* "myParser.y":31  */ /* lalr1.java:476  */
    { System.out.println("Rule 4 : FLOAT");};
  break;
    

  case 8:
  if (yyn == 8)
    /* "myParser.y":32  */ /* lalr1.java:476  */
    { System.out.println("Rule 4 : CHAR");};
  break;
    

  case 9:
  if (yyn == 9)
    /* "myParser.y":33  */ /* lalr1.java:476  */
    { System.out.println("Rule 4 : BOOLEAN");};
  break;
    

  case 10:
  if (yyn == 10)
    /* "myParser.y":36  */ /* lalr1.java:476  */
    { System.out.println("Rule 5 : declarator");};
  break;
    

  case 11:
  if (yyn == 11)
    /* "myParser.y":37  */ /* lalr1.java:476  */
    { System.out.println("Rule 5 : declarations_list, declarator");};
  break;
    

  case 12:
  if (yyn == 12)
    /* "myParser.y":40  */ /* lalr1.java:476  */
    { System.out.println("Rule 6 : dec");};
  break;
    

  case 13:
  if (yyn == 13)
    /* "myParser.y":41  */ /* lalr1.java:476  */
    { System.out.println("Rule 6 : dec ASSIGN meghdar_avalie");};
  break;
    

  case 14:
  if (yyn == 14)
    /* "myParser.y":44  */ /* lalr1.java:476  */
    { System.out.println("Rule 7 : dec");};
  break;
    

  case 15:
  if (yyn == 15)
    /* "myParser.y":45  */ /* lalr1.java:476  */
    { System.out.println("Rule 7 : SHENASE BRACKET_BAZ range BRACKET_BASTE");};
  break;
    

  case 16:
  if (yyn == 16)
    /* "myParser.y":46  */ /* lalr1.java:476  */
    { System.out.println("Rule 7 : SHENASE BRACKET_BAZ ADADSABET BRACKET_BASTE");};
  break;
    

  case 17:
  if (yyn == 17)
    /* "myParser.y":49  */ /* lalr1.java:476  */
    { System.out.println("Rule 8 : SHENASE TA SHENASE");};
  break;
    

  case 18:
  if (yyn == 18)
    /* "myParser.y":50  */ /* lalr1.java:476  */
    { System.out.println("Rule 8 : ADADSABET TA ADADSABET");};
  break;
    

  case 19:
  if (yyn == 19)
    /* "myParser.y":51  */ /* lalr1.java:476  */
    { System.out.println("Rule 8 : ebarat_riazi TA ebarat_riazi");};
  break;
    

  case 20:
  if (yyn == 20)
    /* "myParser.y":54  */ /* lalr1.java:476  */
    { System.out.println("Rule 9 : ebarat_sabet");};
  break;
    

  case 21:
  if (yyn == 21)
    /* "myParser.y":55  */ /* lalr1.java:476  */
    { System.out.println("Rule 9 : AKOLAD_BAZ list_ meghdar_avalie AKOLAD_BASTE");};
  break;
    

  case 22:
  if (yyn == 22)
    /* "myParser.y":58  */ /* lalr1.java:476  */
    { System.out.println("Rule 10 : ebarat_sabet COMMA list_ meghdar_avalie");};
  break;
    

  case 23:
  if (yyn == 23)
    /* "myParser.y":59  */ /* lalr1.java:476  */
    { System.out.println("Rule 10 : ebarat_sabet");};
  break;
    

  case 24:
  if (yyn == 24)
    /* "myParser.y":62  */ /* lalr1.java:476  */
    { System.out.println("Rule 11 : list_ravie ravie");};
  break;
    

  case 25:
  if (yyn == 25)
    /* "myParser.y":63  */ /* lalr1.java:476  */
    { System.out.println("Rule 11 : lambda");};
  break;
    

  case 26:
  if (yyn == 26)
    /* "myParser.y":66  */ /* lalr1.java:476  */
    { System.out.println("Rule 12 : RAVIE SHENASE parameters AKOLAD_BAZ declarations_list block AKOLAD_BASTE;");};
  break;
    

  case 27:
  if (yyn == 27)
    /* "myParser.y":69  */ /* lalr1.java:476  */
    { System.out.println("Rule 13 : PARANTEZ_BAZ declarations_list PARANTEZ_BASTE");};
  break;
    

  case 28:
  if (yyn == 28)
    /* "myParser.y":72  */ /* lalr1.java:476  */
    { System.out.println("Rule 14 : AKOLAD_BAZ statement_list AKOLAD_BASTE");};
  break;
    

  case 29:
  if (yyn == 29)
    /* "myParser.y":75  */ /* lalr1.java:476  */
    { System.out.println("Rule 15 : statement SEMICOLON");};
  break;
    

  case 30:
  if (yyn == 30)
    /* "myParser.y":76  */ /* lalr1.java:476  */
    { System.out.println("Rule 15 : statement_list statement SEMICOLON");};
  break;
    

  case 31:
  if (yyn == 31)
    /* "myParser.y":79  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : SHENASE := ebarat");};
  break;
    

  case 32:
  if (yyn == 32)
    /* "myParser.y":80  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : AGAR ebarat_bool ANGAH statement");};
  break;
    

  case 33:
  if (yyn == 33)
    /* "myParser.y":81  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : AGAR ebarat_bool ANGAH statement VAGARNA statement");};
  break;
    

  case 34:
  if (yyn == 34)
    /* "myParser.y":82  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : DO statement WHILE ebarat_bool");};
  break;
    

  case 35:
  if (yyn == 35)
    /* "myParser.y":83  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : FOR SHENASE := counter DO statement");};
  break;
    

  case 36:
  if (yyn == 36)
    /* "myParser.y":84  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : GOZINESH ebarat onsor_mored default END");};
  break;
    

  case 37:
  if (yyn == 37)
    /* "myParser.y":85  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : SHENASE(arguments_list)");};
  break;
    

  case 38:
  if (yyn == 38)
    /* "myParser.y":86  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : SHENASE [ ebarat ] := ebarat");};
  break;
    

  case 39:
  if (yyn == 39)
    /* "myParser.y":87  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : BAZGASHT ebarat");};
  break;
    

  case 40:
  if (yyn == 40)
    /* "myParser.y":88  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : EXIT WHEN ebarat_bool");};
  break;
    

  case 41:
  if (yyn == 41)
    /* "myParser.y":89  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : block");};
  break;
    

  case 42:
  if (yyn == 42)
    /* "myParser.y":90  */ /* lalr1.java:476  */
    { System.out.println("Rule 16 : lambda");};
  break;
    

  case 43:
  if (yyn == 43)
    /* "myParser.y":93  */ /* lalr1.java:476  */
    { System.out.println("Rule 17 : multi_arguments");};
  break;
    

  case 44:
  if (yyn == 44)
    /* "myParser.y":94  */ /* lalr1.java:476  */
    { System.out.println("Rule 17 : lambda");};
  break;
    

  case 45:
  if (yyn == 45)
    /* "myParser.y":97  */ /* lalr1.java:476  */
    { System.out.println("Rule 18 : multi_arguments COMMA ebarat");};
  break;
    

  case 46:
  if (yyn == 46)
    /* "myParser.y":98  */ /* lalr1.java:476  */
    { System.out.println("Rule 18 : ebarat");};
  break;
    

  case 47:
  if (yyn == 47)
    /* "myParser.y":101  */ /* lalr1.java:476  */
    { System.out.println("Rule 19 : ADADSABET UPTO ADADSABET");};
  break;
    

  case 48:
  if (yyn == 48)
    /* "myParser.y":102  */ /* lalr1.java:476  */
    { System.out.println("Rule 19 : ADADSABET DOWNTO ADADSABET");};
  break;
    

  case 49:
  if (yyn == 49)
    /* "myParser.y":105  */ /* lalr1.java:476  */
    { System.out.println("Rule 20 : MORED ADADSABET : block");};
  break;
    

  case 50:
  if (yyn == 50)
    /* "myParser.y":106  */ /* lalr1.java:476  */
    { System.out.println("Rule 20 : onsor_mored MORED ADADSABET : block");};
  break;
    

  case 51:
  if (yyn == 51)
    /* "myParser.y":109  */ /* lalr1.java:476  */
    { System.out.println("Rule 21 : DEFAULT : block");};
  break;
    

  case 52:
  if (yyn == 52)
    /* "myParser.y":110  */ /* lalr1.java:476  */
    { System.out.println("Rule 21 : lambda");};
  break;
    

  case 53:
  if (yyn == 53)
    /* "myParser.y":113  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : ebarat_sabet");};
  break;
    

  case 54:
  if (yyn == 54)
    /* "myParser.y":114  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : ebarat_bool");};
  break;
    

  case 55:
  if (yyn == 55)
    /* "myParser.y":115  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : ebarat_riazi");};
  break;
    

  case 56:
  if (yyn == 56)
    /* "myParser.y":116  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : SHENASE");};
  break;
    

  case 57:
  if (yyn == 57)
    /* "myParser.y":117  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : SHENASE [ebarat]");};
  break;
    

  case 58:
  if (yyn == 58)
    /* "myParser.y":118  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : SHENASE(arguments_list)");};
  break;
    

  case 59:
  if (yyn == 59)
    /* "myParser.y":119  */ /* lalr1.java:476  */
    { System.out.println("Rule 22 : (ebarat)");};
  break;
    

  case 60:
  if (yyn == 60)
    /* "myParser.y":122  */ /* lalr1.java:476  */
    { System.out.println("Rule 23 : ADADSABET");};
  break;
    

  case 61:
  if (yyn == 61)
    /* "myParser.y":123  */ /* lalr1.java:476  */
    { System.out.println("Rule 23 : REALCONST");};
  break;
    

  case 62:
  if (yyn == 62)
    /* "myParser.y":124  */ /* lalr1.java:476  */
    { System.out.println("Rule 23 : HARF");};
  break;
    

  case 63:
  if (yyn == 63)
    /* "myParser.y":125  */ /* lalr1.java:476  */
    { System.out.println("Rule 23 : BOOLSABET");};
  break;
    

  case 64:
  if (yyn == 64)
    /* "myParser.y":128  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab VA");};
  break;
    

  case 65:
  if (yyn == 65)
    /* "myParser.y":129  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab YA");};
  break;
    

  case 66:
  if (yyn == 66)
    /* "myParser.y":130  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab VA ANGAH");};
  break;
    

  case 67:
  if (yyn == 67)
    /* "myParser.y":131  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab YA VAGARNA");};
  break;
    

  case 68:
  if (yyn == 68)
    /* "myParser.y":132  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab< ");};
  break;
    

  case 69:
  if (yyn == 69)
    /* "myParser.y":133  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab<=");};
  break;
    

  case 70:
  if (yyn == 70)
    /* "myParser.y":134  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab>");};
  break;
    

  case 71:
  if (yyn == 71)
    /* "myParser.y":135  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab>=");};
  break;
    

  case 72:
  if (yyn == 72)
    /* "myParser.y":136  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab =");};
  break;
    

  case 73:
  if (yyn == 73)
    /* "myParser.y":137  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : zojmoratab<>");};
  break;
    

  case 74:
  if (yyn == 74)
    /* "myParser.y":138  */ /* lalr1.java:476  */
    { System.out.println("Rule 24 : ebarat NAGHIZ");};
  break;
    

  case 75:
  if (yyn == 75)
    /* "myParser.y":141  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : zojmoratab +");};
  break;
    

  case 76:
  if (yyn == 76)
    /* "myParser.y":142  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : zojmoratab -");};
  break;
    

  case 77:
  if (yyn == 77)
    /* "myParser.y":143  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : zojmoratab *");};
  break;
    

  case 78:
  if (yyn == 78)
    /* "myParser.y":144  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : zojmoratab/");};
  break;
    

  case 79:
  if (yyn == 79)
    /* "myParser.y":145  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : zojmoratab%");};
  break;
    

  case 80:
  if (yyn == 80)
    /* "myParser.y":146  */ /* lalr1.java:476  */
    { System.out.println("Rule 25 : – ebarat");};
  break;
    

  case 81:
  if (yyn == 81)
    /* "myParser.y":149  */ /* lalr1.java:476  */
    { System.out.println("Rule 26 : (ebarat, ebarat)");};
  break;
    


/* "myParser.java":964  */ /* lalr1.java:476  */
        default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
        && yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }



  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                 Object yyvaluep                                 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
   public boolean parse () throws java.io.IOException

  {
    


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {


            yycdebug ("Reading a token: ");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

        /* Convert token to internal form.  */
        if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
            yycdebug ("Now at end of input.\n");
          }
        else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                             yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
              {
                yyn = -yyn;
                label = YYREDUCE;
              }
          }

        else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                             yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
        /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

        if (yychar <= Lexer.EOF)
          {
          /* Return failure if at end of input.  */
          if (yychar == Lexer.EOF)
            return false;
          }
        else
            yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                yyn += yyterror_;
                if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;



        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
                         yylval);

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -44;
  private static final short yytable_ninf_ = -55;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short yypact_[] = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
     -38,    14,    35,   100,   -44,   -44,   -44,   -44,   -44,   100,
     -44,    27,   -44,   -12,    39,    29,   -44,    37,    71,    77,
     -44,    16,    27,     3,    87,   148,   -44,    55,     7,     7,
      20,    98,    62,    33,   -44,    70,   -44,   -44,   -44,   -44,
     -44,   -44,   100,   114,    25,     7,   148,   120,     7,     7,
      96,   -44,    83,   116,   125,    86,     7,     0,   -44,   -44,
     -44,   103,    94,   -44,    84,   -44,    17,   -44,   -44,   -44,
     -44,   -44,   127,   121,    82,   100,     7,     7,     7,    94,
     117,   111,   151,    -1,    94,     7,   -44,   143,   -44,   -44,
       7,     7,     2,     7,   -44,   -44,   -44,   -44,   -44,   -44,
     -44,   -44,   -44,   -44,   -44,   -44,   -44,   -44,    70,   -44,
      69,    94,   149,   145,    94,    28,   148,     7,   105,   108,
      -9,   123,   -44,   153,    31,   -44,     9,   -44,   156,   -44,
       7,   160,   -44,   123,    68,   140,   154,   115,   157,   141,
     -44,   -44,   -44,   158,    94,     7,   122,   128,   148,    77,
     165,    77,   -44,   -44,    94,   -44,   -44,   -44,   -44,    77,
     -44,   -44
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       0,     0,     0,     0,     1,     6,     7,     8,     9,    25,
       3,     0,     4,     0,    14,     5,    10,    12,     0,     0,
      24,     0,     0,     0,     0,    42,     2,     0,     0,     0,
       0,     0,     0,     0,    11,     0,    61,    60,    62,    63,
      13,    20,     0,     0,     0,     0,    42,     0,     0,     0,
       0,    41,    42,     0,     0,    56,     0,     0,    53,    54,
      55,     0,    80,    16,     0,    15,     0,    75,    76,    77,
      78,    79,     0,    23,     0,     0,     0,    44,     0,     0,
      54,     0,     0,     0,    39,     0,    28,     0,    29,    17,
      44,     0,     0,     0,    74,    66,    67,    64,    65,    72,
      73,    68,    69,    70,    71,    18,    19,    21,     0,    27,
       0,    31,     0,    43,    46,     0,    42,     0,     0,     0,
      52,    40,    30,     0,     0,    59,     0,    22,     0,    37,
       0,     0,    32,    34,     0,     0,     0,     0,     0,     0,
      58,    57,    81,     0,    45,     0,     0,     0,    42,     0,
       0,     0,    36,    26,    38,    47,    48,    35,    49,     0,
      51,    50
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
     -44,   -44,   -30,    -4,   -44,   -44,   159,   -44,   -44,   -44,
      63,   -44,   -44,   -44,   -19,   -44,   -43,    90,   -44,   -44,
     -44,   -44,   -27,   -16,   -41,     5,     6
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short yydefgoto_[] = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,     2,     9,    10,    11,    15,    16,    17,    31,    40,
      72,    13,    20,    43,    51,    52,    53,   112,   113,   135,
     120,   139,    79,    58,    59,    60,    61
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short yytable_[] = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
      26,    57,    62,    81,    80,    12,    18,    41,    35,    87,
     125,    55,    74,    93,    56,    93,     1,   142,     3,    73,
      27,    83,    84,    28,    28,   137,    32,    33,    76,    92,
      63,    14,    77,   119,    78,     4,    94,    94,   131,    94,
      23,   141,    22,    19,   121,   110,    94,   138,    21,   111,
     114,   115,    29,    36,    37,    38,    39,    36,    37,    38,
      39,    29,    29,   114,   124,    94,   126,    30,    94,    64,
      12,   106,    33,   132,    25,    24,   133,    67,    68,    69,
      70,    71,    25,     5,     6,     7,     8,    44,    25,    86,
     109,   128,    73,    90,    42,    91,     5,     6,     7,     8,
     146,   147,    45,   144,    54,   157,    12,    46,    65,    47,
      48,    66,    49,    50,     5,     6,     7,     8,   154,    75,
      36,    37,    38,    39,    82,    95,    96,    85,    88,    89,
     158,    94,   160,   107,   108,   105,   117,   116,    97,    98,
     161,    99,   100,   101,   102,   103,   104,    67,    68,    69,
      70,    71,    44,    25,   118,   122,   134,   129,   130,   136,
     -54,   140,   143,   145,   148,   149,   150,    45,   151,   152,
     153,   127,    46,   155,    47,    48,   159,    49,    50,   156,
     123,    34
    };
  }

private static final short yycheck_[] = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
      19,    28,    29,    46,    45,     9,    18,    23,     5,    52,
       8,     4,    42,    13,     7,    13,    54,     8,     4,    35,
       4,    48,    49,     7,     7,    34,    21,    21,     3,    56,
      10,     4,     7,    34,     9,     0,    37,    37,    10,    37,
       3,    10,    13,    55,    85,    75,    37,    56,     9,    76,
      77,    78,    45,    50,    51,    52,    53,    50,    51,    52,
      53,    45,    45,    90,    91,    37,    93,    51,    37,    49,
      74,    66,    66,   116,     5,     4,   117,    44,    45,    46,
      47,    48,     5,    14,    15,    16,    17,     4,     5,     6,
       8,   110,   108,     7,     7,     9,    14,    15,    16,    17,
      32,    33,    19,   130,    49,   148,   110,    24,    10,    26,
      27,    49,    29,    30,    14,    15,    16,    17,   145,     5,
      50,    51,    52,    53,     4,    22,    23,    31,    12,     4,
     149,    37,   151,     6,    13,    51,    25,    20,    35,    36,
     159,    38,    39,    40,    41,    42,    43,    44,    45,    46,
      47,    48,     4,     5,     3,    12,    51,     8,    13,    51,
      37,     8,     6,     3,    24,    11,    51,    19,    11,    28,
      12,   108,    24,    51,    26,    27,    11,    29,    30,    51,
      90,    22
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,    54,    59,     4,     0,    14,    15,    16,    17,    60,
      61,    62,    61,    69,     4,    63,    64,    65,    18,    55,
      70,     9,    13,     3,     4,     5,    72,     4,     7,    45,
      51,    66,    83,    84,    64,     5,    50,    51,    52,    53,
      67,    81,     7,    71,     4,    19,    24,    26,    27,    29,
      30,    72,    73,    74,    49,     4,     7,    80,    81,    82,
      83,    84,    80,    10,    49,    10,    49,    44,    45,    46,
      47,    48,    68,    81,    60,     5,     3,     7,     9,    80,
      82,    74,     4,    80,    80,    31,     6,    74,    12,     4,
       7,     9,    80,    13,    37,    22,    23,    35,    36,    38,
      39,    40,    41,    42,    43,    51,    83,     6,    13,     8,
      60,    80,    75,    76,    80,    80,    20,    25,     3,    34,
      78,    82,    12,    75,    80,     8,    80,    68,    72,     8,
      13,    10,    74,    82,    51,    77,    51,    34,    56,    79,
       8,    10,     8,     6,    80,     3,    32,    33,    24,    11,
      51,    11,    28,    12,    80,    51,    51,    74,    72,    11,
      72,    72
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    58,    59,    60,    60,    61,    62,    62,    62,    62,
      63,    63,    64,    64,    65,    65,    65,    66,    66,    66,
      67,    67,    68,    68,    69,    69,    70,    71,    72,    73,
      73,    74,    74,    74,    74,    74,    74,    74,    74,    74,
      74,    74,    74,    75,    75,    76,    76,    77,    77,    78,
      78,    79,    79,    80,    80,    80,    80,    80,    80,    80,
      81,    81,    81,    81,    82,    82,    82,    82,    82,    82,
      82,    82,    82,    82,    82,    83,    83,    83,    83,    83,
      83,    84
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     6,     1,     2,     2,     1,     1,     1,     1,
       1,     3,     1,     3,     1,     4,     4,     3,     3,     3,
       1,     3,     3,     1,     2,     0,     8,     3,     3,     2,
       3,     3,     4,     6,     4,     6,     5,     4,     6,     2,
       3,     1,     0,     1,     0,     3,     1,     3,     3,     4,
       5,     3,     0,     1,     1,     1,     1,     4,     4,     3,
       1,     1,     1,     1,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     5
    };
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
    {
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312
    };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "ASSIGN", "SHENASE", "AKOLAD_BAZ",
  "AKOLAD_BASTE", "PARANTEZ_BAZ", "PARANTEZ_BASTE", "BRACKET_BAZ",
  "BRACKET_BASTE", "COLON", "SEMICOLON", "COMMA", "INT", "FLOAT", "CHAR",
  "BOOLEAN", "RAVIE", "AGAR", "ANGAH", "VAGARNA", "VA_ANGAH", "YA_VAGARNA",
  "DO", "WHILE", "FOR", "GOZINESH", "END", "BAZGASHT", "EXIT", "WHEN",
  "UPTO", "DOWNTO", "MORED", "VA", "YA", "NAGHIZ", "MOSAVI", "NA_MOSAVI",
  "KUCHIKTAR", "KUCHIKTAR_MOSAVI", "BOZORGTAR", "BOZORGTAR_MOSAVI", "PLUS",
  "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "TA", "REALCONST",
  "ADADSABET", "HARF", "BOOLSABET", "PROGRAM", "MAIN", "DEFAULT",
  "VAGARNA_1", "$accept", "program", "declarations_list", "declarations",
  "taeen_type", "declarator_list", "declarator", "dec", "range",
  "meghdar_avalie", "list_meghdar_avalie", "list_ravie", "ravie",
  "parameters", "block", "statement_list", "statement", "arguments_list",
  "multi_arguments", "counter", "onsor_mored", "default", "ebarat",
  "ebarat_sabet", "ebarat_bool", "ebarat_riazi", "zojmoratab", null
    };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,    20,    20,    23,    24,    27,    30,    31,    32,    33,
      36,    37,    40,    41,    44,    45,    46,    49,    50,    51,
      54,    55,    58,    59,    62,    63,    66,    69,    72,    75,
      76,    79,    80,    81,    82,    83,    84,    85,    86,    87,
      88,    89,    90,    93,    94,    97,    98,   101,   102,   105,
     106,   109,   110,   113,   114,   115,   116,   117,   118,   119,
     122,   123,   124,   125,   128,   129,   130,   131,   132,   133,
     134,   135,   136,   137,   138,   141,   142,   143,   144,   145,
     146,   149
    };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
              + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
                       yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
                       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57
    };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 181;
  private static final int yynnts_ = 27;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 58;

  private static final int yyuser_token_number_max_ = 312;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}

/* "myParser.y":151  */ /* lalr1.java:1064  */

