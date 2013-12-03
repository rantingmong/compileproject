grammar code;

options {
	
}

@lexer::header {
                
}

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

TOKEN_ELSE              :   'else'
                        |   'ELSE'
                        ;

TOKEN_TORF              :   'true'
                        |   'false'
                        |   'TRUE'
                        |   'FALSE'
                        ;

TOKEN_NO_PARAM          :   'blank'
                        |   'BLANK'
                        ;

TOKEN_NOT               :   'not'
                        |   'NOT'
                        ;

// -----------------------------------------------------------------------------

TYPE                    :   'nothing'
                        |   'whole_number'
                        |   'real_number'
                        |   'symbol'
                        |   'characters'
                        |   'torf'
                        |   'NOTHING'
                        |   'WHOLE_NUMBER'
                        |   'REAL_NUMBER'
                        |   'SYMBOL'
                        |   'CHARACTERS'
                        |   'TORF'
                        ;

ID                      :   ('A'..'Z' | 'a'..'z')( 'A'..'Z' | 'a'..'z' | '0'..'9')*
                        ;

NUM                     :   ('0'..'9')+
                        |   ('0'..'9')* '.' ('0'..'9')+
                        ;

STRING                  :   ('<')('A'..'Z' | 'a'..'z' | '0'..'9' | ' ' | '.' | ',' | '\'' | '"' | ':' | ';' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '('| ')' | '-' | '=' | '?' | '/' | '_' | '+')*('>')
                        ;

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

//PROGRAM START

s                       :   (package_declaration)* (function_declaration)* (main_function)*
                        ;

//OPERATIONS

operator_bool1          :   expression_final    (LOGIC_1 operator_bool2)*
                        |   expression5         (LOGIC_1 operator_bool2)*
                        |   expression4         (LOGIC_1 operator_bool2)*
                        |   expression3         (LOGIC_1 operator_bool2)*
                        |   expression2         (LOGIC_1 operator_bool2)*
                        |   expression1         (LOGIC_1 operator_bool2)*
                        |   operator_bool5      (LOGIC_1 operator_bool2)*
                        |   operator_bool4      (LOGIC_1 operator_bool2)*
                        |   operator_bool3      (LOGIC_1 operator_bool2)*
                        |   operator_bool2      (LOGIC_1 operator_bool2)*
                        ;

operator_bool2          :   expression_final    (LOGIC_2 operator_bool3)*
                        |   expression5         (LOGIC_2 operator_bool3)*
                        |   expression4         (LOGIC_2 operator_bool3)*
                        |   expression3         (LOGIC_2 operator_bool3)*
                        |   expression2         (LOGIC_2 operator_bool3)*
                        |   expression1         (LOGIC_2 operator_bool3)*
                        |   operator_bool5      (LOGIC_2 operator_bool3)*
                        |   operator_bool4      (LOGIC_2 operator_bool3)*
                        |   operator_bool3      (LOGIC_2 operator_bool3)*
                        ;

operator_bool3          :   expression_final    (LOGIC_3 operator_bool4)*
                        |   expression5         (LOGIC_3 operator_bool4)*
                        |   expression4         (LOGIC_3 operator_bool4)*
                        |   expression3         (LOGIC_3 operator_bool4)*
                        |   expression2         (LOGIC_3 operator_bool4)*
                        |   expression1         (LOGIC_3 operator_bool4)*
                        |   operator_bool5      (LOGIC_3 operator_bool4)*
                        |   operator_bool4      (LOGIC_3 operator_bool4)*
                        ;
                        
operator_bool4          :   expression_final
                        |   expression5
                        |   expression4
                        |   expression3
                        |   expression2
                        |   expression1
                        |   operator_bool5   
                        |   TOKEN_OPEN_P operator_bool1 TOKEN_CLOS_P
                        ;

operator_bool5          :   expression_final
                        |   expression5
                        |   expression4
                        |   expression3
                        |   expression2
                        |   expression1
                        |   TOKEN_NOT TOKEN_OPEN_P logical_statement TOKEN_CLOS_P
                        ;

//EXPRESSIONS

expression1             :   expression_final    (ARTH_1 expression2)*
                        |   expression5         (ARTH_1 expression2)*
                        |   expression4         (ARTH_1 expression2)*
                        |   expression3         (ARTH_1 expression2)*
                        |   expression2         (ARTH_1 expression2)*
                        ;

expression2             :   expression_final    (ARTH_2 expression3)*
                        |   expression5         (ARTH_2 expression3)*
                        |   expression4         (ARTH_2 expression3)*
                        |   expression3         (ARTH_2 expression3)*
                        ;

expression3             :   expression_final    (ARTH_3 expression4)*
                        |   expression5         (ARTH_3 expression4)*
                        |   expression4         (ARTH_3 expression4)*
                        ;

expression4             :   expression_final
                        |   expression5 ARTH_4
                        ;

expression5             :   expression_final
                        |   TOKEN_OPEN_P expression1 TOKEN_CLOS_P 
                        ;

expression_final        :   (ID | NUM | STRING | TOKEN_TORF)
                        |   function_call
                        ;

// FUNCTIONS

package_declaration     :   TOKEN_GRAB STRING TOKEN_SEMICOLON
                        ;

main_function           :   TOKEN_FUNCTION TOKEN_MAIN TOKEN_OPEN_B TOKEN_CLOS_B TOKEN_RETURNING TYPE group_statement
                        ;

function_declaration	:   TOKEN_FUNCTION ID parameter TOKEN_RETURNING TYPE group_statement
                        ;

parameter               :   TOKEN_OPEN_B (parameter_entry)(TOKEN_COMMA parameter_entry)* TOKEN_CLOS_B
                        |   TOKEN_OPEN_B TOKEN_CLOS_B
                        ;

parameter_entry         :   TYPE ID
                        ;

function_call           :   ID TOKEN_OPEN_B function_arguments TOKEN_CLOS_B
                        ;

function_arguments      :   (logical_statement)?
                        |   (logical_statement)(TOKEN_COMMA logical_statement)*
                        ;

//STATEMENTS

group_statement         :   TOKEN_OPEN_S statement* TOKEN_CLOS_S
                        ;

statement               :   declare_statement
                        |   group_statement
                        |   assignment_statement
                        |   conditional_statement
                        |   loop_statement
                        |   function_call_statement
                        |   return_statement
                        ;

return_statement        :   TOKEN_RETURNING logical_statement TOKEN_SEMICOLON
                        |   TOKEN_RETURNING TOKEN_SEMICOLON
                        ;

function_call_statement :   function_call TOKEN_SEMICOLON
                        ;

declare_statement       :   TOKEN_DECLARE ID TOKEN_AS TYPE TOKEN_SEMICOLON
                        |   TOKEN_DECLARE ID TOKEN_AS TYPE TOKEN_TO logical_statement TOKEN_SEMICOLON
                        ;

assignment_statement    :   ID TOKEN_IS logical_statement TOKEN_SEMICOLON
                        ;

logical_statement       :   expression_final
                        |   expression5
                        |   expression4
                        |   expression3
                        |   expression2
                        |   expression1
                        |   operator_bool5
                        |   operator_bool4
                        |   operator_bool3
                        |   operator_bool2
                        |   operator_bool1
                        ;

conditional_statement   :   conditional_IF   
                        |   conditional_SWITCH
                        ;

conditional_SWITCH      :   conditional_SWITCH_H TOKEN_OPEN_S (conditional_CASE)+ (conditional_DEFAULT)? TOKEN_CLOS_S
                        ;

conditional_SWITCH_H    :   TOKEN_CHECK TOKEN_IF TOKEN_OPEN_B ID TOKEN_CLOS_B
                        ;

conditional_CASE        :   TOKEN_IS conditional_CASE_CONST TOKEN_COLON group_statement   
                        ;

conditional_CASE_CONST  :   (NUM | STRING | TOKEN_TORF);

conditional_DEFAULT     :   TOKEN_ELSE TOKEN_COLON group_statement   
                        ;

conditional_IF          :   conditional_IF_H (conditional_ELSEIF)* (conditional_ELSE)?
                        ;

conditional_IF_H        :              TOKEN_IF TOKEN_OPEN_B logical_statement TOKEN_CLOS_B group_statement
                        ;

conditional_ELSEIF      :   TOKEN_ELSE TOKEN_IF TOKEN_OPEN_B logical_statement TOKEN_CLOS_B group_statement
                        ;

conditional_ELSE        :   TOKEN_ELSE group_statement
                        ;

loop_statement          :   loop_DO_WHILE   
                        |   loop_WHILE
                        |   loop_for
                        ;

loop_DO_WHILE           :   TOKEN_REPEAT group_statement TOKEN_UNTIL TOKEN_OPEN_B logical_statement TOKEN_CLOS_B TOKEN_SEMICOLON
                        ;

loop_WHILE              :   TOKEN_REPEAT TOKEN_UNTIL TOKEN_OPEN_B logical_statement TOKEN_CLOS_B group_statement
                        ;

loop_for                :   TOKEN_REPEAT TYPE ID loop_for_control (TOKEN_WITH expression1)? group_statement
                        ;

loop_for_control        :   TOKEN_FROM expression1 TOKEN_TO expression1
                        ;
