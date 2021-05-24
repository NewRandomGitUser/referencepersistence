package com.somereferences.persistence.onetomany.unidirectional.dboperations.queryexecutor;

import com.somereferences.persistence.onetomany.unidirectional.dboperations.QueryExecutor;
import org.springframework.stereotype.Service;

@Service
public class QueryExecutorImpl implements QueryExecutor {
    private final PaginationQueryExecutor paginationQueryExecutor;
    private final SimpleQueryExecutor simpleQueryExecutor;
    private final ProjectionQueryExecutor projectionQueryExecutor;


    public QueryExecutorImpl(PaginationQueryExecutor paginationQueryExecutor,
                             SimpleQueryExecutor simpleQueryExecutor,
                             ProjectionQueryExecutor projectionQueryExecutor) {
        this.paginationQueryExecutor = paginationQueryExecutor;
        this.simpleQueryExecutor = simpleQueryExecutor;
        this.projectionQueryExecutor = projectionQueryExecutor;
    }


    @Override
    public PaginationQueryExecutor paginationQueryExecutor() {
        return this.paginationQueryExecutor;
    }

    @Override
    public ProjectionQueryExecutor projectionQueryExecutor()  {
        return this.projectionQueryExecutor;
    }

    @Override
    public SimpleQueryExecutor simpleQueryExecutor() {
        return this.simpleQueryExecutor;
    }
}
