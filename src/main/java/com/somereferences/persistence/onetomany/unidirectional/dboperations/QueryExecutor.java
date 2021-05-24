package com.somereferences.persistence.onetomany.unidirectional.dboperations;

import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.PaginationQueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.ProjectionQueryExecutor;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor.SimpleQueryExecutor;

public interface QueryExecutor {
    SimpleQueryExecutor simpleQueryExecutor();
    PaginationQueryExecutor paginationQueryExecutor();
    ProjectionQueryExecutor projectionQueryExecutor();
}
