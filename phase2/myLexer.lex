

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


%%

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
GOZINESH="gozinesh"
BAZGASHT="bazgasht"
EXIT = "exit"
WHEN = "when"
UPTO="upto"
DOWNTO="downto"
MORED = "mored"
VA = "va"
YA= "ya"
ANGAH="angah"
VA_ANGAH = "va angah"
VAGARNA = "vagarna"
YA_VAGARNA = "ya vagarna"
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
BOZORGTAR_MOSAVI=">="
KUCHIKTAR = "<"
KUCHIKTAR_MOSAVI = "<="

PLUS = "+"
MINUS="-"
MULTIPLICATION="*"
DIVISION = "/"
MOD = "%"

MOSAVI= "="
NA_MOSAVI = "<>"
ASSIGN = ":="
TA = ".."


%%





{SHENASE} { 
				return SHENASE ;
}
{ADADSABET} { 
				return ADADSABET ; 
}
{REALCONST} { 
				return REALCONST ;
}
{BOOLSABET} { 
				return BOOLSABET ; 
}
{HARF} { 
				return HARF ;
}





{PROGRAM} { 
				return PROGRAM ;
}

{MAIN} { 
				return MAIN ;
}

{INT} { 
				return INT ;
}

{FLOAT} { 
				return FLOAT ;
}

{CHAR} { 
				return CHAR ;
}

{BOOLEAN} { 
				return BOOLEAN ; 
}

{RAVIE} { 
				return RAVIE ;
}

{AGAR} { 
				return AGAR ;
}

{ANGAH} { 
				return ANGAH ;
}

{DO} { 
				return DO ;
}

{WHILE} { 
				return WHILE ; 
}

{FOR} { 
				return FOR ; 
}

{GOZINESH} { 
				return GOZINESH ; 
}

{BAZGASHT} { 
				return BAZGASHT ;
}
{EXIT} { 
				return EXIT ;
}

{WHEN} { 
				return WHEN ;
}

{UPTO} { 
				return UPTO ;
}

{DOWNTO} { 
				return DOWNTO ;
}

{MORED} { 
				return MORED ;
}

{VA} { 
				return VA ;
}

{YA} { 
				return YA ; 
}

{ANGAH} { 
				return ANGAH ;
}

{VAGARNA} { 
				return VAGARNA ; 
}

{NAGHIZ} { 
				return NAGHIZ ;
}
{END} { 
				return END ;
}





{PARANTEZ_BAZ} { 
				return PARANTEZ_BAZ ;
}
{PARANTEZ_BASTE} { 
				return PARANTEZ_BASTE ; 
}
{AKOLAD_BAZ} { 
				return AKOLAD_BAZ ; 
}
{AKOLAD_BASTE} { 
				return AKOLAD_BASTE ;
}
{BRACKET_BAZ} { 
				return BRACKET_BAZ ;
}
{BRACKET_BASTE} { 
				return BRACKET_BASTE ;
}
{COMMA} { 
				return COMMA ;
}
{SEMICOLON} { 
				return SEMICOLON ;
}
{COLON} { 
				return COLON ;
}
{BOZORGTAR} { 
				return BOZORGTAR ;
}
{KUCHIKTAR} { 
				return KUCHIKTAR ;
}
{PLUS} { 
				return PLUS ;
}
{MINUS} { 
				return MINUS ;
}
{MOSAVI} { 
				return MOSAVI ;
}
{NA_MOSAVI} { 
				return NA_MOSAVI ;
}
{MULTIPLICATION} { 
				return MULTIPLICATION ;
}
{DIVISION} { 
				return DIVISION ;
}
{MOD} { 
				return MOD ;
}


{BOZORGTAR_MOSAVI} { 
				return BOZORGTAR_MOSAVI ;
}
{KUCHIKTAR_MOSAVI} { 
				return KUCHIKTAR_MOSAVI ;
}
{ASSIGN} { 
				return ASSIGN ;
}
{TA} { 
				return TA ;
}
{VA_ANGAH} { 
				return VA_ANGAH ;
}
{YA_VAGARNA} { 
				return YA_VAGARNA ;
}







