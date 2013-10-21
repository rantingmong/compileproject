                        grammar code;
options {
	
}

@lexer::header {
                
}

WS                      :   (' ' | '\t' | '\r' | '\n')  -> channel(HIDDEN)
                        ;

// -----------------------------------------------------------------------------

TOKEN_OPEN_B            :   '['
                        ;

TOKEN_CLOS_B            :   ']'
                        ;

TOKEN_OPEN_P            :   '('
                        ;

TOKEN_CLOS_P            :   ')'
                        ;

TOKEN_OPEN_S            :   '<<'
                        ;

TOKEN_CLOS_S            :   '>>'
                        ;

TOKEN_COMMA             :   ','
                        ;

TOKEN_SEMICOLON         :   ';'
                        ;

TOKEN_COLON             :   ':'
                        ;

// -----------------------------------------------------------------------------

LOGIC_1                 :   'EQUAL'
                        |   'NOT_EQUAL'
                        |   'equal'
                        |   'not_equal'
                        ;

LOGIC_2                 :   'AND'
                        |   'OR'
                        |   'and'
                        |   'or'
                        ;

LOGIC_3                 :   'LT'
                        |   'GT'
                        |   'LTE'
                        |   'GTE'
                        |   'lt'
                        |   'gt'
                        |   'lte'
                        |   'gte'
                        ;

// -----------------------------------------------------------------------------

ARTH_1                  :   'ADD'
                        |   'SUB'
                        |   'add'
                        |   'sub'
                        ;

ARTH_2                  :   'MUL'
                        |   'DIV'
                        |   'mul'
                        |   'div'
                        ;

ARTH_3                  :   'MOD'
                        |   'mod'
                        ;

ARTH_4                  :   'ADDS'
                        |   'SUBS'
                        |   'MULS'
                        |   'DIVS'
                        |   'adds'
                        |   'subs'
                        |   'muls'
                        |   'divs'
                        ;

// -----------------------------------------------------------------------------

TOKEN_GRAB              :   'grab'
                        |   'GRAB';

TOKEN_MAIN              :   'main'
                        |   'MAIN'
                        ;

TOKEN_FUNCTION          :   'function'
                        |   'FUNCTION'
                        ;

TOKEN_RETURNING         :   'RETURNING'
                        |   'returning'
                        ;

TOKEN_REPEAT            :   'repeat'
                        |   'REPEAT'
                        ;

TOKEN_UNTIL             :   'until'
                        |   'UNTIL'
                        ;

TOKEN_FROM              :   'from'
                        |   'FROM'
                        ;

TOKEN_TO                :   'to'
                        |   'TO'
                        ;

TOKEN_WITH              :   'with'
                        |   'WITH'
                        ;

TOKEN_DECLARE           :   'declare'
                        |   'DECLARE'
                        ;

TOKEN_AS                :   'as'
                        |   'AS'
                        ;

TOKEN_IS                :   'is'
                        |   'IS'
                        ;

TOKEN_IF                :   'if'
                        |   'IF'
                        ;

TOKEN_CHECK             :   'check'
                        |   'CHECK'
                        ;

TOKEN_OR                :   'or'
                        |   'OR'
                        ;

TOKEN_ELSE              :   'else'
                        |   'ELSE'
                        ;

// -----------------------------------------------------------------------------

TYPE                    :   'nothing'
                        |   'whole_number'
			|   'real_number'
			|   'symbol'
			|   'characters'
			|   'torf'
			;

ID                      :   ('A'..'Z' | 'a'..'z')( 'A'..'Z' | 'a'..'z' | '0'..'9')*
                        ;

NUM                     :   ('0'..'9')+
                        |   ('0'..'9')* '.' ('0'..'9')+
                        ;

STRING                  :   ('<')('A'..'Z' | 'a'..'z' | '0'..'9')*('>')
                        ;

//PROGRAM START

s			:   (package_declaration)* (function_declaration)* (main_function)*
			;

//OPERATIONS

operator_bool1          :   operator_bool3
                        |   operator_bool2 (LOGIC_1 operator_bool2)*
                        ;

operator_bool2          :   operator_bool3 (LOGIC_2 operator_bool3)*
                        ;

operator_bool3          :   expression1 (LOGIC_3 expression1)*
                        ;

//EXPRESSIONS

expression1             :   expression_final
                        |   expression2 (ARTH_1 expression2)*
                        ;

expression2             :   expression_final
                        |   expression3 (ARTH_2 expression3)*
                        ;

expression3             :   expression_final
                        |   expression4 (ARTH_3 expression4)*
                        ;

expression4             :   expression_final
                        |   expression5 ARTH_4
                        ;

expression5             :   TOKEN_OPEN_P expression1 TOKEN_CLOS_P
                        |   expression_final   
                        ;

expression_final        :   (ID | NUM | STRING)
                        |   function_call
                        ;

// FUNCTIONS

package_declaration	:   TOKEN_GRAB STRING TOKEN_SEMICOLON
			;

main_function		:   TOKEN_FUNCTION TOKEN_MAIN TOKEN_OPEN_B TOKEN_CLOS_B TOKEN_RETURNING TYPE group_statement
			;

function_declaration	:   TOKEN_FUNCTION ID TOKEN_OPEN_B (parameter)* TOKEN_CLOS_B TOKEN_RETURNING TYPE group_statement
                        ;

parameter               :   (TYPE ID)(TOKEN_COMMA TYPE ID)*
                        ;

function_call           :   ID TOKEN_OPEN_B expression1 (TOKEN_COMMA expression1)* TOKEN_CLOS_B
                        ;

//STATEMENTS

group_statement         :   TOKEN_OPEN_S statement* TOKEN_CLOS_S
                        ;

statement		:   declare_statement
                        |   group_statement
                        |   assignment_statement
                        |   conditional_statement
                        |   loop_statement
                        |   function_call TOKEN_SEMICOLON
                        |   TOKEN_RETURNING expression1 TOKEN_SEMICOLON
			;

declare_statement       :   TOKEN_DECLARE ID TOKEN_AS TYPE TOKEN_SEMICOLON
                        |   TOKEN_DECLARE ID TOKEN_AS TYPE TOKEN_TO expression1 TOKEN_SEMICOLON
                        ;

assignment_statement    :   ID TOKEN_IS expression1 TOKEN_SEMICOLON
                        ;

logical_statement       :   operator_bool1
                        ;

conditional_statement   :   TOKEN_IF TOKEN_OPEN_B (logical_statement) TOKEN_CLOS_B group_statement conditional_ELSEIF conditional_ELSE
                        |   TOKEN_CHECK TOKEN_IF TOKEN_OPEN_B ID TOKEN_CLOS_B TOKEN_OPEN_S conditional_CASE+ conditional_DEFAULT TOKEN_CLOS_S
                        ;

conditional_CASE        :   TOKEN_IS ID TOKEN_COLON group_statement TOKEN_SEMICOLON
                        |   TOKEN_IS ID TOKEN_COLON statement TOKEN_SEMICOLON
                        ;

conditional_DEFAULT     :   TOKEN_OR TOKEN_ELSE TOKEN_COLON group_statement TOKEN_SEMICOLON
                        |   TOKEN_OR TOKEN_ELSE TOKEN_COLON statement TOKEN_SEMICOLON
                        |
                        ;

conditional_ELSEIF      :   (TOKEN_ELSE TOKEN_IF TOKEN_OPEN_B logical_statement TOKEN_CLOS_B group_statement)*
                        ;

conditional_ELSE        :   TOKEN_ELSE group_statement
                        |       
                        ;

loop_statement          :   TOKEN_REPEAT group_statement TOKEN_UNTIL TOKEN_OPEN_B logical_statement TOKEN_CLOS_B
                        |   TOKEN_REPEAT TOKEN_UNTIL TOKEN_OPEN_B logical_statement TOKEN_CLOS_B group_statement
                            
                        |   TOKEN_REPEAT TYPE ID TOKEN_FROM expression1 TOKEN_TO expression1 group_statement
                        |   TOKEN_REPEAT TYPE ID TOKEN_FROM expression1 TOKEN_TO expression1 TOKEN_WITH expression1 group_statement
                        ;
