package com.spring.learning.dacelearning;

import org.springframework.jdbc.BadSqlGrammarException;

import java.sql.SQLException;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/5/21 20:28
 * @since
 */
public class CustomException extends BadSqlGrammarException {

    /**
     * Constructor for BadSqlGrammarException.
     *
     * @param task name of current task
     * @param sql  the offending SQL statement
     * @param ex   the root cause
     */
    public CustomException(String task, String sql, SQLException ex) {
        super(task, sql, ex);
    }
}
