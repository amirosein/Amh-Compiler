%{

%}
%token ASSIGN SHENASE AKOLAD_BAZ  AKOLAD_BASTE PARANTEZ_BAZ PARANTEZ_BASTE BRACKET_BAZ BRACKET_BASTE COLON SEMICOLON COMMA INT FLOAT CHAR BOOLEAN RAVIE AGAR ANGAH VAGARNA VA_ANGAH YA_VAGARNA DO WHILE FOR GOZINESH END BAZGASHT EXIT WHEN UPTO DOWNTO MORED VA YA NAGHIZ MOSAVI NA_MOSAVI KUCHIKTAR KUCHIKTAR_MOSAVI BOZORGTAR BOZORGTAR_MOSAVI PLUS MINUS MULTIPLICATION DIVISION MOD  TA REALCONST ADADSABET HARF BOOLSABET PROGRAM MAIN DEFAULT


%left YA
%left VA
%left PLUS MINUS
%left MULTIPLICATION DIVISION MOD
%left MOSAVI NA_MOSAVI
%left KUCHIKTAR KUCHIKTAR_MOSAVI BOZORGTAR BOZORGTAR_MOSAVI
%right ASSIGN
%right NAGHIZ
%nonassoc VAGARNA_1
%nonassoc VAGARNA


%%
program :
	PROGRAM SHENASE declarations_list list_ravie MAIN block { System.out.println("Rule 1 : PROGRAM SHENASE declarations_list list_ravie MAIN block");};

declarations_list :
	declarations { System.out.println("Rule 2 : declarations");};
	| declarations_list declarations { System.out.println("Rule 2 : declarations_list declarations");};

declarations :
	taeen_type declarator_list { System.out.println("Rule 3 : taeen_type declarator_list");};

taeen_type : 
	INT { System.out.println("Rule 4 : INT");}; 
	| FLOAT { System.out.println("Rule 4 : FLOAT");};
	| CHAR { System.out.println("Rule 4 : CHAR");}; 
	| BOOLEAN { System.out.println("Rule 4 : BOOLEAN");};

declarator_list : 
	declarator { System.out.println("Rule 5 : declarator");};
	| declarator_list COMMA declarator { System.out.println("Rule 5 : declarations_list, declarator");};

declarator :
	dec { System.out.println("Rule 6 : dec");};
	| dec ASSIGN meghdar_avalie { System.out.println("Rule 6 : dec ASSIGN meghdar_avalie");};

dec : 
	SHENASE { System.out.println("Rule 7 : dec");};
	| SHENASE BRACKET_BAZ range BRACKET_BASTE { System.out.println("Rule 7 : SHENASE BRACKET_BAZ range BRACKET_BASTE");};
	| SHENASE BRACKET_BAZ ADADSABET BRACKET_BASTE { System.out.println("Rule 7 : SHENASE BRACKET_BAZ ADADSABET BRACKET_BASTE");};

range : 
	SHENASE TA SHENASE { System.out.println("Rule 8 : SHENASE TA SHENASE");};
	| ADADSABET TA ADADSABET { System.out.println("Rule 8 : ADADSABET TA ADADSABET");}; 
	| ebarat_riazi TA ebarat_riazi { System.out.println("Rule 8 : ebarat_riazi TA ebarat_riazi");};

meghdar_avalie : 
	ebarat_sabet { System.out.println("Rule 9 : ebarat_sabet");};
	|AKOLAD_BAZ list_meghdar_avalie AKOLAD_BASTE { System.out.println("Rule 9 : AKOLAD_BAZ list_ meghdar_avalie AKOLAD_BASTE");};

list_meghdar_avalie : 
	ebarat_sabet COMMA list_meghdar_avalie { System.out.println("Rule 10 : ebarat_sabet COMMA list_ meghdar_avalie");};
	| ebarat_sabet { System.out.println("Rule 10 : ebarat_sabet");};

list_ravie : 
	list_ravie ravie { System.out.println("Rule 11 : list_ravie ravie");}; 
	| { System.out.println("Rule 11 : lambda");};

ravie : 
	RAVIE SHENASE parameters AKOLAD_BAZ declarations_list block AKOLAD_BASTE SEMICOLON { System.out.println("Rule 12 : RAVIE SHENASE parameters AKOLAD_BAZ declarations_list block AKOLAD_BASTE;");};

parameters : 
	PARANTEZ_BAZ declarations_list PARANTEZ_BASTE { System.out.println("Rule 13 : PARANTEZ_BAZ declarations_list PARANTEZ_BASTE");};

block : 
	AKOLAD_BAZ statement_list AKOLAD_BASTE { System.out.println("Rule 14 : AKOLAD_BAZ statement_list AKOLAD_BASTE");}; 

statement_list : 
	statement SEMICOLON { System.out.println("Rule 15 : statement SEMICOLON");};
	| statement_list statement SEMICOLON { System.out.println("Rule 15 : statement_list statement SEMICOLON");};

statement :
	SHENASE ASSIGN ebarat { System.out.println("Rule 16 : SHENASE := ebarat");}; 
	| AGAR ebarat_bool ANGAH statement %prec VAGARNA_1 { System.out.println("Rule 16 : AGAR ebarat_bool ANGAH statement");};
	| AGAR ebarat_bool ANGAH statement VAGARNA statement { System.out.println("Rule 16 : AGAR ebarat_bool ANGAH statement VAGARNA statement");}; 
	| DO statement WHILE ebarat_bool { System.out.println("Rule 16 : DO statement WHILE ebarat_bool");};
	| FOR SHENASE ASSIGN counter DO statement { System.out.println("Rule 16 : FOR SHENASE := counter DO statement");};
	| GOZINESH ebarat onsor_mored default END { System.out.println("Rule 16 : GOZINESH ebarat onsor_mored default END");};
	| SHENASE PARANTEZ_BAZ arguments_list PARANTEZ_BASTE { System.out.println("Rule 16 : SHENASE(arguments_list)");};
	| SHENASE BRACKET_BAZ ebarat BRACKET_BASTE ASSIGN ebarat { System.out.println("Rule 16 : SHENASE [ ebarat ] := ebarat");};
	| BAZGASHT ebarat { System.out.println("Rule 16 : BAZGASHT ebarat");}; 
	| EXIT WHEN ebarat_bool { System.out.println("Rule 16 : EXIT WHEN ebarat_bool");};
	| block { System.out.println("Rule 16 : block");};
	| { System.out.println("Rule 16 : lambda");}; 

arguments_list : 
	multi_arguments { System.out.println("Rule 17 : multi_arguments");};
	| { System.out.println("Rule 17 : lambda");};

multi_arguments : 
	multi_arguments COMMA ebarat { System.out.println("Rule 18 : multi_arguments COMMA ebarat");}; 
	| ebarat { System.out.println("Rule 18 : ebarat");};

counter : 
	ADADSABET UPTO ADADSABET { System.out.println("Rule 19 : ADADSABET UPTO ADADSABET");}; 
	| ADADSABET DOWNTO ADADSABET { System.out.println("Rule 19 : ADADSABET DOWNTO ADADSABET");};

onsor_mored : 
	MORED ADADSABET COLON block { System.out.println("Rule 20 : MORED ADADSABET : block");};
	| onsor_mored MORED ADADSABET COLON block { System.out.println("Rule 20 : onsor_mored MORED ADADSABET : block");};

default : 
	DEFAULT COLON block { System.out.println("Rule 21 : DEFAULT : block");}; 
	| { System.out.println("Rule 21 : lambda");};

ebarat : 
	ebarat_sabet { System.out.println("Rule 22 : ebarat_sabet");};
	| ebarat_bool { System.out.println("Rule 22 : ebarat_bool");}; 
	| ebarat_riazi { System.out.println("Rule 22 : ebarat_riazi");}; 
	| SHENASE { System.out.println("Rule 22 : SHENASE");}; 
	| SHENASE BRACKET_BAZ ebarat BRACKET_BASTE { System.out.println("Rule 22 : SHENASE [ebarat]");}; 
	| SHENASE PARANTEZ_BAZ arguments_list PARANTEZ_BASTE { System.out.println("Rule 22 : SHENASE(arguments_list)");}; 
	| PARANTEZ_BAZ ebarat PARANTEZ_BASTE { System.out.println("Rule 22 : (ebarat)");};

ebarat_sabet : 
	ADADSABET { System.out.println("Rule 23 : ADADSABET");};
	| REALCONST { System.out.println("Rule 23 : REALCONST");};
	| HARF { System.out.println("Rule 23 : HARF");}; 
	| BOOLSABET { System.out.println("Rule 23 : BOOLSABET");};
	
ebarat_bool : 
	zojmoratab VA { System.out.println("Rule 24 : zojmoratab VA");};
	| zojmoratab YA { System.out.println("Rule 24 : zojmoratab YA");};
	| zojmoratab VA_ANGAH { System.out.println("Rule 24 : zojmoratab VA ANGAH");};
	| zojmoratab YA_VAGARNA { System.out.println("Rule 24 : zojmoratab YA VAGARNA");}; 
	| zojmoratab KUCHIKTAR { System.out.println("Rule 24 : zojmoratab< ");};
	| zojmoratab KUCHIKTAR_MOSAVI { System.out.println("Rule 24 : zojmoratab<=");};
	| zojmoratab BOZORGTAR { System.out.println("Rule 24 : zojmoratab>");};
	| zojmoratab BOZORGTAR_MOSAVI { System.out.println("Rule 24 : zojmoratab>=");};
	| zojmoratab MOSAVI { System.out.println("Rule 24 : zojmoratab =");};
	| zojmoratab NA_MOSAVI { System.out.println("Rule 24 : zojmoratab<>");};
	| ebarat NAGHIZ { System.out.println("Rule 24 : ebarat NAGHIZ");};

ebarat_riazi : 
	zojmoratab PLUS { System.out.println("Rule 25 : zojmoratab +");};
	| zojmoratab MINUS { System.out.println("Rule 25 : zojmoratab -");};
	| zojmoratab MULTIPLICATION { System.out.println("Rule 25 : zojmoratab *");};
	| zojmoratab DIVISION { System.out.println("Rule 25 : zojmoratab/");};
	| zojmoratab MOD { System.out.println("Rule 25 : zojmoratab%");};
	| MINUS ebarat { System.out.println("Rule 25 : – ebarat");};

zojmoratab : 
  PARANTEZ_BAZ ebarat COMMA ebarat PARANTEZ_BASTE { System.out.println("Rule 26 : (ebarat, ebarat)");};

%%
