

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


%%

%class Lexer
%unicode
%line
%column
%standalone


%{
	private FileOutputStream out;
	private DataOutputStream dos;

	private void writeOutputFile(String s){
		try {
			if(out == null){
				out = new FileOutputStream(new File("output.txt"));
				dos = new DataOutputStream(out);
				
				s = s + "\r\n";
				byte[] data = s.getBytes("UTF-8");
				dos.write(data);
			}
			else{
				s = s + "\r\n";
				byte[] data = s.getBytes("UTF-8");
				dos.write(data);
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
	}
%}

LETTER= [a-zA-Z]
DIGIT= [0-9]
SHENASE= "#"{LETTER}{LETTER}{DIGIT}{DIGIT}{DIGIT}
ADADSABET={DIGIT}+
REALCONST={ADADSABET}"."{ADADSABET}
HARF= [']{LETTER}['] | [']{DIGIT}['] 
NEWLINE= "\n"
NULL= "\0"
BOOLSABET = "true" | "false"
WHITESPACE = [" "\t\n\r]
COMMENTS = "//".*


PROGRAM= "program"
MAIN= "main"
INT= "int"
FLOAT= "float"
CHAR = "char"
BOOLEAN = "boolean"
RAVIE = "ravie" 
AGAR = "agar"
ANGAH= "angah"
DO = "do"
WHILE="while"
FOR="for"
GOZINEH="gozineh"
BAZGASHT="bazgasht"
EXIT = "exit"
WHEN = "when"
UPTO="upto"
DOWNTO="downto"
MORED = "mored"
VA = "va"
YA= "ya"
ANGAH="angah"
VAGARNA = "vagarna"
NAGHIZ = "naghiz"
END = "end"


PARANTEZ_BAZ = "("
PARANTEZ_BASTE = ")"
AKOLAD_BAZ = "{"
AKOLAD_BASTE="}"
BRACKET_BAZ="["
BRACKET_BASTE="]"
COMMA = ","
SEMICOLON=";"
COLON = ":"
NOQTE = "."
BOZORGTAR= ">"
KUCHIKTAR = "<"
PLUS = "+"
MINUS="-"
EQUAL= ":="

STARTINDEX = {LETTER} | {DIGIT}
ENDINDEX = {LETTER} | {DIGIT}
INDEX = {BRACKET_BAZ}{STARTINDEX}{NOQTE}{NOQTE}{ENDINDEX}{BRACKET_BASTE} | {BRACKET_BAZ}{DIGIT}{BRACKET_BASTE}




%%




{DIGIT} { 
				writeOutputFile( "KEWORD : DIGIT : " + yytext() ) ; 
}
{SHENASE} { 
				writeOutputFile( "KEWORD : SHENASE : " + yytext() ) ; 
}
{ADADSABET} { 
				writeOutputFile( "KEWORD : ADADSABET : " + yytext() ) ; 
}
{REALCONST} { 
				writeOutputFile( "KEWORD : REALCONST : " + yytext() ) ; 
}
{BOOLSABET} { 
				writeOutputFile( "KEWORD : BOOLSABET : " + yytext() ) ; 
}
{HARF} { 
				writeOutputFile( "KEWORD : HARF : " + yytext() ) ; 
}
{COMMENTS} { 
				writeOutputFile( "KEWORD : COMMENTS : " + yytext() ) ; 
}
{NULL} { 
				writeOutputFile( "KEWORD : NULL : " + yytext() ) ; 
}
{NEWLINE} { 
				writeOutputFile( "KEWORD : NEWLINE  "  ) ; 
}





{PROGRAM} { 
				writeOutputFile( "KEWORD : PROGRAM : " + yytext() ) ; 
}

{MAIN} { 
				writeOutputFile( "KEWORD : MAIN : " + yytext() ) ; 
}

{INT} { 
				writeOutputFile( "KEWORD : INT : " + yytext() ) ; 
}

{FLOAT} { 
				writeOutputFile( "KEWORD : FLOAT : " + yytext() ) ; 
}

{CHAR} { 
				writeOutputFile( "KEWORD : CHAR : " + yytext() ) ; 
}

{BOOLEAN} { 
				writeOutputFile( "KEWORD : BOOLEAN : " + yytext() ) ; 
}

{RAVIE} { 
				writeOutputFile( "KEWORD : RAVIE : " + yytext() ) ; 
}

{AGAR} { 
				writeOutputFile( "KEWORD : AGAR : " + yytext() ) ; 
}

{ANGAH} { 
				writeOutputFile( "KEWORD : ANGAH : " + yytext() ) ; 
}

{DO} { 
				writeOutputFile( "KEWORD : DO : " + yytext() ) ; 
}

{WHILE} { 
				writeOutputFile( "KEWORD : WHILE : " + yytext() ) ; 
}

{FOR} { 
				writeOutputFile( "KEWORD : FOR : " + yytext() ) ; 
}

{GOZINEH} { 
				writeOutputFile( "KEWORD : GOZINEH : " + yytext() ) ; 
}

{BAZGASHT} { 
				writeOutputFile( "KEWORD : BAZGASHT : " + yytext() ) ; 
}

{GOZINEH} { 
				writeOutputFile( "KEWORD : GOZINEH : " + yytext() ) ; 
}

{EXIT} { 
				writeOutputFile( "KEWORD : EXIT : " + yytext() ) ; 
}

{WHEN} { 
				writeOutputFile( "KEWORD : WHEN : " + yytext() ) ; 
}

{UPTO} { 
				writeOutputFile( "KEWORD : UPTO : " + yytext() ) ; 
}

{DOWNTO} { 
				writeOutputFile( "KEWORD : DOWNTO : " + yytext() ) ; 
}

{MORED} { 
				writeOutputFile( "KEWORD : MORED : " + yytext() ) ; 
}

{VA} { 
				writeOutputFile( "KEWORD : VA : " + yytext() ) ; 
}

{YA} { 
				writeOutputFile( "KEWORD : YA : " + yytext() ) ; 
}

{ANGAH} { 
				writeOutputFile( "KEWORD : ANGAH : " + yytext() ) ; 
}

{VAGARNA} { 
				writeOutputFile( "KEWORD : VAGARNA : " + yytext() ) ; 
}

{NAGHIZ} { 
				writeOutputFile( "KEWORD : NAGHIZ : " + yytext() ) ; 
}
{END} { 
				writeOutputFile( "KEWORD : END : " + yytext() ) ; 
}





{PARANTEZ_BAZ} { 
				writeOutputFile( "KEWORD : PARANTEZ_BAZ : " + yytext() ) ; 
}
{PARANTEZ_BASTE} { 
				writeOutputFile( "KEWORD : PARANTEZ_BASTE : " + yytext() ) ; 
}
{AKOLAD_BAZ} { 
				writeOutputFile( "KEWORD : AKOLAD_BAZ : " + yytext() ) ; 
}
{AKOLAD_BASTE} { 
				writeOutputFile( "KEWORD : AKOLAD_BASTE : " + yytext() ) ; 
}
{BRACKET_BAZ} { 
				writeOutputFile( "KEWORD : BRACKET_BAZ : " + yytext() ) ; 
}
{BRACKET_BASTE} { 
				writeOutputFile( "KEWORD : BRACKET_BASTE : " + yytext() ) ; 
}
{COMMA} { 
				writeOutputFile( "KEWORD : COMMA : " + yytext() ) ; 
}
{SEMICOLON} { 
				writeOutputFile( "KEWORD : SEMICOLON : " + yytext() ) ; 
}
{COLON} { 
				writeOutputFile( "KEWORD : COLON : " + yytext() ) ; 
}
{NOQTE} { 
				writeOutputFile( "KEWORD : NOQTE : " + yytext() ) ; 
}
{BOZORGTAR} { 
				writeOutputFile( "KEWORD : BOZORGTAR : " + yytext() ) ; 
}
{KUCHIKTAR} { 
				writeOutputFile( "KEWORD : KUCHIKTAR : " + yytext() ) ; 
}
{PLUS} { 
				writeOutputFile( "KEWORD : PLUS : " + yytext() ) ; 
}
{MINUS} { 
				writeOutputFile( "KEWORD : MINUS : " + yytext() ) ; 
}
{EQUAL} { 
				writeOutputFile( "KEWORD : EQUAL : " + yytext() ) ; 
}



{INDEX} { 
				writeOutputFile( "KEWORD : INDEX : " + yytext() ) ; 
}







