/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;

/**
 *
 * @author alexa
 */
public class StoredProceduresAdmin {
    

    static void dropStoreProcedures(){
        
        dropVathmologiaStoredProcedures();
        
        dropMathimaStoredProcedure();
        dropMathimaStoredProcedureUpdateQueries();
        
        dropMathitisStoredProcedure();
        dropMathitisStoredProceduresDeleteQueries();
        dropMathitisStoredProceduresUpdateQueries();        
        dropMathitisStoredProceduresInsertQueries();
        
        dropKathigitisStoredProcedure();
        dropKathigitisStoredProceduresInsertQueries();
        dropKathigitisStoredProceduresUpdateQueries();
        dropKathigitisStoredProceduresDeleteQueries();
        
        
    }
    
    static void createStoreProcedures(){
        
        createKathigitisStoredProcedureSelectQueries();
        createKathigitisStoredProceduresInsertQueries();
        createKathigitisStoredProceduresUpdateQueries();
        createKathigitisStoredProceduresDeleteQueries();
        
        createMathitisStoredProcedureSelectQueries();
        createMathitisStoredProceduresInsertQueries();
        createMathitisStoredProceduresDeleteQueries();
        createMathitisStoredProceduresUpdateQueries();
        
        
        createMathimaStoredProcedure();
        createMathimaStoredProcedureUpdateQueries();
        
        createVathmologiaStoredProceduresSelectQueries();   
        
        
        

    
    }
    
    
// DROP
    
    
    private static void dropMathitisStoredProcedure(){
    Statement psql = DBPostresqlAdmin.getStatement();
    try {psql.executeUpdate("DROP FUNCTION showtablemathitis();");} catch (SQLException e) {System.out.println("DROP :2 " +e.getMessage());}
    try {psql.executeUpdate("DROP FUNCTION showtablemathitisyearly(int);");} catch (SQLException e) {System.out.println("DROP :3 "         +e.getMessage());}

}
    private static void dropMathitisStoredProceduresInsertQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION insertmathitis(varchar, varchar, varchar, varchar, int)");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresInsertQueries : " + e.getMessage());
        }
    }
    private static void dropMathitisStoredProceduresDeleteQueries(){
            try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION deletemathitis(int)");
            }catch (SQLException e) {
                System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
            }
        }
    private static void dropMathitisStoredProceduresUpdateQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION updatemathitis(int, varchar, varchar, varchar, varchar, int);");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresUpdateQueries : " + e.getMessage());
        }
    }      
    
    
    private static void dropKathigitisStoredProcedure(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION showtablekathigitis();");} 
        catch (SQLException e) {
            System.out.println("dropMathitisStoredProcedure : " + e.getMessage());
     
        }
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION showtableeidkathigitis(varchar);");} 
        catch (SQLException e) {
            System.out.println("dropMathitisStoredProcedure : " + e.getMessage());
            
        }
        

    }
    private static void dropKathigitisStoredProceduresInsertQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION insertkathigitis(varchar, varchar, varchar)");
        }catch (SQLException e) {
            System.out.println("dropKathigitisStoredProcedureInsertQueries : " + e.getMessage());
        } 
    }
    private static void dropKathigitisStoredProceduresUpdateQueries(){
        try {
            DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION updatemathitis(int, varchar, varchar, varchar, varchar, int)");
        
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
                
    }
    private static void dropKathigitisStoredProceduresDeleteQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION updatekathigitis(int, varchar, varchar, varchar)");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }

    
    private static void dropMathimaStoredProcedure(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION showtablemathima();");} 
        catch (SQLException e) {
            System.out.println("dropMathitisStoredProcedure : " + e.getMessage());
        }
        
        
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selMathimaViaID(int)");}
        catch (SQLException e) {
            System.out.println("dropMathitisStoredProcedure : " + e.getMessage());
            
        }
        
    }
    private static void dropMathimaStoredProcedureUpdateQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION updatemathima(int, varchar, int);");} 
        catch (SQLException e) {
            System.out.println("dropMathimaStoredProcedureUpdateQueries : " + e.getMessage());
        }
        
    }

    
    private static void dropVathmologiaStoredProcedures(){
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmTwoTermsWithFinalExams();");} catch (SQLException e) {System.out.println("DROP :2 " +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmOnePlusTwoTerms();");} catch (SQLException e) {System.out.println("DROP :3 "         +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFinalExams();");} catch (SQLException e) {System.out.println("DROP :4 "              +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmSecondTerm();");} catch (SQLException e) {System.out.println("DROP :5 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFirstTerm();");} catch (SQLException e) {System.out.println("DROP :6 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmStudentViaID(int);");} catch (SQLException e) {System.out.println("DROP : 7 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmLessonViaID(int);");} catch (SQLException e) {System.out.println("DROP : 8 "+e.getMessage());}
    
    
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmTwoTermsWithFinalExamsFilterSid(int);");} catch (SQLException e) {System.out.println("DROP :2 " +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmOnePlusTwoTermsFilterSid(int);");} catch (SQLException e) {System.out.println("DROP :3 "         +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFinalExamsFilterSid(int);");} catch (SQLException e) {System.out.println("DROP :4 "              +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmSecondTermFilterSid(int);");} catch (SQLException e) {System.out.println("DROP :5 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFirstTermFilterSid(int);");} catch (SQLException e) {System.out.println("DROP :6 "+e.getMessage());}
    
    
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmTwoTermsWithFinalExamsFilterEtos(int);");} catch (SQLException e) {System.out.println("DROP :2 " +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmOnePlusTwoTermsFilterEtos(int);");} catch (SQLException e) {System.out.println("DROP :3 "         +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFinalExamsFilterEtos(int);");} catch (SQLException e) {System.out.println("DROP :4 "              +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmSecondTermFilterEtos(int);");} catch (SQLException e) {System.out.println("DROP :5 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFirstTermFilterEtos(int);");} catch (SQLException e) {System.out.println("DROP :6 "+e.getMessage());}
    
    
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmTwoTermsWithFinalExamsFilterSidEtos(int,int);");} catch (SQLException e) {System.out.println("DROP :2 " +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmOnePlusTwoTermsFilterSidEtos(int,int);");} catch (SQLException e) {System.out.println("DROP :3 "         +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFinalExamsFilterSidEtos(int,int);");} catch (SQLException e) {System.out.println("DROP :4 "              +e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmSecondTermFilterSidEtos(int,int);");} catch (SQLException e) {System.out.println("DROP :5 "+e.getMessage());}
    try {DBPostresqlAdmin.getStatement().executeUpdate("DROP FUNCTION selVathmFirstTermFilterSidEtos(int,int);");} catch (SQLException e) {System.out.println("DROP :6 "+e.getMessage());}
    
    
    
    
    
    
    
    }

    
// CREATE   
    
    
    private static void createMathitisStoredProcedureSelectQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION showtablemathitis()\n" +
                                "returns SETOF mathitis as\n" +
                                "$$\n" +
                                "SELECT sid , onoma, eponymo, onpateras, onMiteras, etoseisagogis FROM mathitis ORDER BY sid;\n" +
                                "$$ LANGUAGE SQL");} 
        catch (SQLException e) {
            System.out.println("createMathitisStoredProcedure, showtablemathitis : " + e.getMessage());
        }
        
        
        
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION showtablemathitisyearly(int)\n" +
                                "returns SETOF mathitis as\n" +
                                "$$\n" +
                                "SELECT * \n" +
                                "FROM mathitis\n" +
                                "WHERE etosEisagogis = $1;\n" +
                                "$$ LANGUAGE SQL");} 
        catch (SQLException e) {
            System.out.println("createMathitisStoredProcedure, showtablemathitisyearly(int) : " + e.getMessage());    
        }
    }
    private static void createMathitisStoredProceduresInsertQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION insertmathitis(varchar, varchar, varchar, varchar, int)\n" +
                                            "returns VOID as\n" +
                                            "$$\n" +
                                            "\n" +
                                            "INSERT INTO mathitis( onoma, eponymo, onPateras, onMiteras, etosEisagogis )" +
                                            "VALUES ($1, $2, $3, $4, $5)" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }
    private static void createMathitisStoredProceduresDeleteQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION deletemathitis(int)\n" +
                                            "returns VOID as\n" +
                                            "$$\n" +
                                            "\n" +
                                            "DELETE FROM mathitis WHERE sid=$1;\n" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }
    private static void createMathitisStoredProceduresUpdateQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION updatemathitis(int, varchar, varchar, varchar, varchar, int)\n" +
                                            "returns VOID as\n" +
                                            "$$\n" +
                                            "\n" +
                                            "UPDATE mathitis\n" +
                                            "SET onoma=$2 , eponymo=$3 , onPateras=$4 , onMiteras=$5 , etosEisagogis=$6 \n" +
                                            "WHERE sid = $1;\n" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }     
    
    private static void createKathigitisStoredProcedureSelectQueries(){

        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION showtablekathigitis()\n" +
                        "returns SETOF kathigitis as\n" +
                        "$$\n" +
                        "SELECT * FROM kathigitis;\n" +
                        "\n" +
                        "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createKathigitisStoredProcedure : " + e.getMessage());
        }
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION showtableeidkathigitis(varchar)\n" +
                                            "returns SETOF kathigitis as\n" +
                                            "$$\n" +
                                            "SELECT * \n" +
                                            "FROM kathigitis\n" +
                                            "WHERE eidikotita = $1;\n" +
                                            "\n" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createKathigitisStoredProcedure : " + e.getMessage());
        }
        
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION selKathigitisViaID(int)\n" +
                                "returns table(name varchar,\n" +
                                "	      surname varchar,\n" +
                                "	      nameFathers varchar) as\n" +
                                "$$\n" +
                                "SELECT Onoma_kathigiti, Epitheto_kathigiti, Eidikotita FROM kathigitis WHERE kid = $1;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        
        }
        
        
        
    }
    private static void createKathigitisStoredProceduresInsertQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION insertkathigitis(varchar, varchar, varchar)\n" +
                    "returns void as\n" +
                    "$$\n" +
                    "INSERT INTO kathigitis( Onoma_kathigiti, Epitheto_kathigiti, Eidikotita ) VALUES ( $1, $2, $3);\n" +
                    "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createKathigitisStoredProcedure : " + e.getMessage());
        }        
    }
    private static void createKathigitisStoredProceduresUpdateQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION updatekathigitis(int, varchar, varchar, varchar)\n" +
                                            "returns VOID as\n" +
                                            "$$\n" +
                                            "\n" +
                                            "UPDATE kathigitis\n" +
                                            "SET onoma_kathigiti=$2 , epitheto_kathigiti=$3 , eidikotita=$4\n" +
                                            "WHERE kid = $1;\n" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }
    private static void createKathigitisStoredProceduresDeleteQueries(){
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION deletekathigitis(int)\n" +
                                            "returns VOID as\n" +
                                            "$$\n" +
                                            "\n" +
                                            "DELETE FROM kathigitis WHERE kid=$1;\n" +
                                            "$$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathitisStoredProceduresDeleteQueries : " + e.getMessage());
        }
    }


    
    private static void createMathimaStoredProcedure(){
        
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION showtablemathima()\n" +
                "returns table (mid int, onoma_mathimatos varchar, onoma_kathigiti varchar , epitheto_kathigiti varchar)as\n" +
                "$$\n" +
                "SELECT M.mid, M.onoma_mathimatos, K.onoma_kathigiti, K.epitheto_kathigiti \n" +
                "FROM mathima M, kathigitis K \n" +
                "WHERE M.kid=K.kid ORDER BY mid;\n" +
                "\n" +
                "$$ LANGUAGE SQL");
        }catch (SQLException e) {
            System.out.println("createMathimaStoredProcedure : " + e.getMessage());
        }
        
        try {DBPostresqlAdmin.getStatement().executeUpdate( "CREATE OR REPLACE FUNCTION selMathimaViaID(int)\n" +
                                                            "    returns table(onoma_mathimatos varchar,\n" +
                                                            "    	      	  kid int,\n" +
                                                            "    	      	  onoma_kathigiti varchar,\n" +
                                                            "    	      	  epitheto_kathigiti varchar,\n" +
                                                            "    	      	  eidikotita varchar)as\n" +
                                                            "\n" +
                                                            "    $$\n" +
                                                            "    SELECT M.onoma_mathimatos, K.kid, K.onoma_kathigiti, K.epitheto_kathigiti, K.eidikotita\n" +
                                                            "	FROM mathima M, kathigitis K\n" +
                                                            "	WHERE M.kid=K.kid AND \n" +
                                                            "	mid = $1;\n" +
                                                            "    $$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathimaStoredProcedure : " + e.getMessage());
        }        
        
        
        
        
        
        
        
        
        
    }
    private static void createMathimaStoredProcedureUpdateQueries(){
        
        try {DBPostresqlAdmin.getStatement().executeUpdate("CREATE OR REPLACE FUNCTION updatemathima(int, varchar, int)\n" +
"                                            returns VOID as\n" +
"                                            $$\n" +
"                                            UPDATE mathima\n" +
"                                            SET onoma_mathimatos=$2 , kid=$3\n" +
"                                            WHERE mid = $1;\n" +
"                                            $$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathimaStoredProcedure : " + e.getMessage());
        }
        
        try {DBPostresqlAdmin.getStatement().executeUpdate( "CREATE OR REPLACE FUNCTION selMathimaViaID(int)\n" +
                                                            "    returns table(onoma_mathimatos varchar,\n" +
                                                            "    	      	  kid int,\n" +
                                                            "    	      	  onoma_kathigiti varchar,\n" +
                                                            "    	      	  epitheto_kathigiti varchar,\n" +
                                                            "    	      	  eidikotita varchar)as\n" +
                                                            "    $$\n" +
                                                            "    SELECT M.onoma_mathimatos, K.kid, K.onoma_kathigiti, K.epitheto_kathigiti, K.eidikotita\n" +
                                                            "	FROM mathima M, kathigitis K\n" +
                                                            "	WHERE M.kid=K.kid AND \n" +
                                                            "	mid = $1;\n" +
                                                            "    $$ LANGUAGE SQL;");
        }catch (SQLException e) {
            System.out.println("createMathimaStoredProcedure : " + e.getMessage());
        }        
        
        
        
        
        
        
        
        
        
    }
    
    
    private static void createVathmologiaStoredProceduresSelectQueries(){
        Statement psql = DBPostresqlAdmin.getStatement();
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmStudentViaID(int)\n" +
                                "returns table(name varchar,\n" +
                                "	      surname varchar,\n" +
                                "	      nameFathers varchar,\n" +
                                "	      nameMothers varchar,\n" +
                                "	      year int) as\n" +
                                "$$\n" +
                                "SELECT onoma, eponymo, onPateras, onMiteras, etosEisagogis FROM mathitis WHERE sid = $1;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        
        }
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmLessonViaID(int)\n" +
                                "returns table(onomamath varchar,\n" +
                                "			  onomakathigiti varchar,\n" +
                                "	  		  epithetokathigiti varchar) as\n" +
                                "$$\n" +
                                "SELECT M.onoma_mathimatos, K.onoma_kathigiti, K.epitheto_kathigiti FROM mathima M, kathigitis K WHERE K.kid=M.kid AND mid = $1;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmTwoTermsWithFinalExams()\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int,\n" +
                                "					vathmosTritos int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos, v3.vathmos\n" +
                                "                               FROM vathmologia V1, vathmologia v2, vathmologia v3, mathitis m1, mathima m2\n" +
                                "                               WHERE v1.sid      =  v2.sid  AND\n" +
                                "                                    v2.sid      =  v3.sid  AND\n" +
                                "                                     v1.mid      =  v2.mid  AND\n" +
                                "                                     v2.mid      =  v3.mid  AND\n" +
                                "                                    v1.etos     =  v2.etos AND\n" +
                                "                                     v2.etos     =  v3.etos AND\n" +
                                "                                     v1.eksamino =   1      AND\n" +
                                "                                     v2.eksamino =   2      AND\n" +
                                "                                     v3.eksamino =   3      AND\n" +
                                "                                     m1.sid      =  v1.sid  AND\n" +
                                "                                     m2.mid      =  v1.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmTwoTermsWithFinalExams()\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int,\n" +
                                "					vathmosTritos int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos, v3.vathmos\n" +
                                "                               FROM vathmologia V1, vathmologia v2, vathmologia v3, mathitis m1, mathima m2\n" +
                                "                               WHERE v1.sid      =  v2.sid  AND\n" +
                                "                                    v2.sid      =  v3.sid  AND\n" +
                                "                                     v1.mid      =  v2.mid  AND\n" +
                                "                                     v2.mid      =  v3.mid  AND\n" +
                                "                                    v1.etos     =  v2.etos AND\n" +
                                "                                     v2.etos     =  v3.etos AND\n" +
                                "                                     v1.eksamino =   1      AND\n" +
                                "                                     v2.eksamino =   2      AND\n" +
                                "                                     v3.eksamino =   3      AND\n" +
                                "                                     m1.sid      =  v1.sid  AND\n" +
                                "                                     m2.mid      =  v1.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmOnePlusTwoTerms()\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid\n" +
                                "    EXCEPT\n" +
                                "    SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v2.sid=v3.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v2.mid=v3.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v2.etos=v3.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          v3.eksamino = 3 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFinalExams()\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeuteros text,\n" +
                                "					vathmosTritos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v1.vathmos\n" +
                                "FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "WHERE v1.eksamino=3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v1.mid\n" +
                                "EXCEPT\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid=v2.sid AND\n" +
                                "      v2.sid=v3.sid AND\n" +
                                "      v1.mid=v2.mid AND\n" +
                                "      v2.mid=v3.mid AND\n" +
                                "      v1.etos=v2.etos AND\n" +
                                "      v2.etos=v3.etos AND\n" +
                                "      v1.eksamino = 1 AND\n" +
                                "      v2.eksamino = 2 AND\n" +
                                "      v3.eksamino = 3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmSecondTerm()\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeutero int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid\n" +
                                "	      \n" +
                                "  	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFirstTerm()\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=1 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid\n" +
                                "  	EXCEPT\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmTwoTermsWithFinalExamsFilterSid(int)\n" +
                                "returns table (\n" +
                                "		sid bigint, \n" +
                                "		onoma varchar, \n" +
                                "		eponymo varchar, \n" +
                                "		onoma_mathimatos varchar, \n" +
                                "		etos int,\n" +
                                "		vathmosProtos int,\n" +
                                "		vathmosDeuteros int,\n" +
                                "		vathmosTritos int\n" +
                                "		) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2, vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid      =  v2.sid  AND\n" +
                                "     v2.sid      =  v3.sid  AND\n" +
                                "      v1.mid      =  v2.mid  AND\n" +
                                "      v2.mid      =  v3.mid  AND\n" +
                                "     v1.etos     =  v2.etos AND\n" +
                                "      v2.etos     =  v3.etos AND\n" +
                                "      v1.eksamino =   1      AND\n" +
                                "      v2.eksamino =   2      AND\n" +
                                "      v3.eksamino =   3      AND\n" +
                                "      m1.sid      =  v1.sid  AND\n" +
                                "      m2.mid      =  v1.mid  AND\n" +
                                "      v1.sid      =  $1;" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmOnePlusTwoTermsFilterSid(int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid AND" +
                                "          v1.sid = $1\n" +
                                "    EXCEPT\n" +
                                "    SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v2.sid=v3.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v2.mid=v3.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v2.etos=v3.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          v3.eksamino = 3 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFinalExamsFilterSid(int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeuteros text,\n" +
                                "					vathmosTritos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v1.vathmos\n" +
                                "FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "WHERE v1.eksamino=3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v1.mid AND\n" +
                                "      v1.sid = $1\n" +
                                "EXCEPT\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid=v2.sid AND\n" +
                                "      v2.sid=v3.sid AND\n" +
                                "      v1.mid=v2.mid AND\n" +
                                "      v2.mid=v3.mid AND\n" +
                                "      v1.etos=v2.etos AND\n" +
                                "      v2.etos=v3.etos AND\n" +
                                "      v1.eksamino = 1 AND\n" +
                                "      v2.eksamino = 2 AND\n" +
                                "      v3.eksamino = 3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmSecondTermFilterSid(int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeutero int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "	      v1.sid = $1 \n" +
                                "  	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFirstTermFilterSid(int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=1 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "             v1.sid = $1 \n" +
                                "  	EXCEPT\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmTwoTermsWithFinalExamsFilterEtos(int)\n" +
                                "returns table (\n" +
                                "		sid bigint, \n" +
                                "		onoma varchar, \n" +
                                "		eponymo varchar, \n" +
                                "		onoma_mathimatos varchar, \n" +
                                "		etos int,\n" +
                                "		vathmosProtos int,\n" +
                                "		vathmosDeuteros int,\n" +
                                "		vathmosTritos int\n" +
                                "		) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2, vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid      =  v2.sid  AND\n" +
                                "     v2.sid      =  v3.sid  AND\n" +
                                "      v1.mid      =  v2.mid  AND\n" +
                                "      v2.mid      =  v3.mid  AND\n" +
                                "     v1.etos     =  v2.etos AND\n" +
                                "      v2.etos     =  v3.etos AND\n" +
                                "      v1.eksamino =   1      AND\n" +
                                "      v2.eksamino =   2      AND\n" +
                                "      v3.eksamino =   3      AND\n" +
                                "      m1.sid      =  v1.sid  AND\n" +
                                "      m2.mid      =  v1.mid  AND\n" +
                                "      v1.etos     =  $1;" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmOnePlusTwoTermsFilterEtos(int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid AND" +
                                "          v1.etos = $1\n" +
                                "    EXCEPT\n" +
                                "    SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v2.sid=v3.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v2.mid=v3.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v2.etos=v3.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          v3.eksamino = 3 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFinalExamsFilterEtos(int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeuteros text,\n" +
                                "					vathmosTritos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v1.vathmos\n" +
                                "FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "WHERE v1.eksamino=3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v1.mid AND\n" +
                                "      v1.etos = $1\n" +
                                "EXCEPT\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid=v2.sid AND\n" +
                                "      v2.sid=v3.sid AND\n" +
                                "      v1.mid=v2.mid AND\n" +
                                "      v2.mid=v3.mid AND\n" +
                                "      v1.etos=v2.etos AND\n" +
                                "      v2.etos=v3.etos AND\n" +
                                "      v1.eksamino = 1 AND\n" +
                                "      v2.eksamino = 2 AND\n" +
                                "      v3.eksamino = 3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmSecondTermFilterEtos(int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeutero int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "	      v1.etos = $1 \n" +
                                "  	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFirstTermFilterEtos(int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=1 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "             v1.etos = $1 \n" +
                                "  	EXCEPT\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmTwoTermsWithFinalExamsFilterSidEtos(int,int)\n" +
                                "returns table (\n" +
                                "		sid bigint, \n" +
                                "		onoma varchar, \n" +
                                "		eponymo varchar, \n" +
                                "		onoma_mathimatos varchar, \n" +
                                "		etos int,\n" +
                                "		vathmosProtos int,\n" +
                                "		vathmosDeuteros int,\n" +
                                "		vathmosTritos int\n" +
                                "		) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2, vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid      =  v2.sid  AND\n" +
                                "     v2.sid      =  v3.sid  AND\n" +
                                "      v1.mid      =  v2.mid  AND\n" +
                                "      v2.mid      =  v3.mid  AND\n" +
                                "     v1.etos     =  v2.etos AND\n" +
                                "      v2.etos     =  v3.etos AND\n" +
                                "      v1.eksamino =   1      AND\n" +
                                "      v2.eksamino =   2      AND\n" +
                                "      v3.eksamino =   3      AND\n" +
                                "      m1.sid      =  v1.sid  AND\n" +
                                "      m2.mid      =  v1.mid  AND\n" +
                                "      v1.sid      =  $1      AND\n" +
                                "      v1.etos     =  $2;" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmOnePlusTwoTermsFilterSidEtos(int,int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int,\n" +
                                "					vathmosDeuteros int\n" +
                                "					) as\n" +
                                "$$\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid AND" +
                                "      v1.sid      =  $1      AND\n" +
                                "      v1.etos     =  $2" +
                                "    EXCEPT\n" +
                                "    SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos, v2.vathmos\n" +
                                "    FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "    WHERE v1.sid=v2.sid AND\n" +
                                "          v2.sid=v3.sid AND\n" +
                                "          v1.mid=v2.mid AND\n" +
                                "          v2.mid=v3.mid AND\n" +
                                "          v1.etos=v2.etos AND\n" +
                                "          v2.etos=v3.etos AND\n" +
                                "          v1.eksamino = 1 AND\n" +
                                "          v2.eksamino = 2 AND\n" +
                                "          v3.eksamino = 3 AND\n" +
                                "          m1.sid = v1.sid AND\n" +
                                "          m2.mid = v2.mid;\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFinalExamsFilterSidEtos(int,int)\n" +
                                "returns table (\n" +
                                "					sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeuteros text,\n" +
                                "					vathmosTritos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v1.vathmos\n" +
                                "FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "WHERE v1.eksamino=3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v1.mid AND\n" +
                                "      v1.sid      =  $1      AND\n" +
                                "      v1.etos     =  $2" +
                                "EXCEPT\n" +
                                "SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos,null,null, v3.vathmos\n" +
                                "FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "WHERE v1.sid=v2.sid AND\n" +
                                "      v2.sid=v3.sid AND\n" +
                                "      v1.mid=v2.mid AND\n" +
                                "      v2.mid=v3.mid AND\n" +
                                "      v1.etos=v2.etos AND\n" +
                                "      v2.etos=v3.etos AND\n" +
                                "      v1.eksamino = 1 AND\n" +
                                "      v2.eksamino = 2 AND\n" +
                                "      v3.eksamino = 3 AND\n" +
                                "      m1.sid = v1.sid AND\n" +
                                "      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        
        
        
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmSecondTermFilterSidEtos(int,int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos text,\n" +
                                "					vathmosDeutero int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "      v1.sid      =  $1      AND\n" +
                                "      v1.etos     =  $2" +
                                "  	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, null, v2.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
        try {psql.executeUpdate("CREATE OR REPLACE FUNCTION selVathmFirstTermFilterSidEtos(int,int)\n" +
                                "returns table (		sid bigint, \n" +
                                "					onoma varchar, \n" +
                                "					eponymo varchar, \n" +
                                "					onoma_mathimatos varchar, \n" +
                                "					etos int,\n" +
                                "					vathmosProtos int					\n" +
                                "					) as\n" +
                                "$$\n" +
                                "\n" +
                                "	SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, mathitis m1, mathima m2\n" +
                                "	WHERE v1.eksamino=1 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v1.mid AND\n" +
                                "      v1.sid      =  $1      AND\n" +
                                "      v1.etos     =  $2" +
                                "  	EXCEPT\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "\n" +
                                "	EXCEPT\n" +
                                "\n" +
                                "		SELECT v1.sid, m1.onoma, m1.eponymo, m2.onoma_mathimatos, v1.etos, v1.vathmos\n" +
                                "	FROM vathmologia V1, vathmologia v2,vathmologia v3, mathitis m1, mathima m2\n" +
                                "	WHERE v1.sid=v2.sid AND\n" +
                                "	      v2.sid=v3.sid AND\n" +
                                "	      v1.mid=v2.mid AND\n" +
                                "	      v2.mid=v3.mid AND\n" +
                                "	      v1.etos=v2.etos AND\n" +
                                "	      v2.etos=v3.etos AND\n" +
                                "	      v1.eksamino = 1 AND\n" +
                                "	      v2.eksamino = 2 AND\n" +
                                "	      v3.eksamino = 3 AND\n" +
                                "	      m1.sid = v1.sid AND\n" +
                                "	      m2.mid = v2.mid\n" +
                                "$$ LANGUAGE SQL;");} 
        catch (SQLException e) {
            System.out.println("createVathmologiaStoredProcedures : " + e.getMessage());
        }
    }    
    

    
   
    

    
    
    
    
    
    
    
}
