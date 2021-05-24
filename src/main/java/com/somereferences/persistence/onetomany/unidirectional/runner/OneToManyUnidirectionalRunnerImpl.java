package com.somereferences.persistence.onetomany.unidirectional.runner;

import com.somereferences.persistence.onetomany.unidirectional.OneToManyUnidirectionalRunner;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.ApplicationPopulator;
import com.somereferences.persistence.onetomany.unidirectional.dboperations.QueryExecutor;
import org.springframework.stereotype.Component;

@Component
public class OneToManyUnidirectionalRunnerImpl implements OneToManyUnidirectionalRunner {
    private final ApplicationPopulator applicationPopulator;
    private final QueryExecutor queryExecutor;

    public OneToManyUnidirectionalRunnerImpl(ApplicationPopulator applicationPopulator,
                                             QueryExecutor queryExecutor) {
        this.applicationPopulator = applicationPopulator;
        this.queryExecutor = queryExecutor;
    }

    public void execute(){
//      applicationPopulator.execute();
        queryExecutor.paginationQueryExecutor()
                     .printFindLessThanAttributeThreePageSizeValue(0,2,20000);
        queryExecutor.simpleQueryExecutor()
                     .printFindUsingAttributeOneOrAttributeTwo("Mary","Park");
        queryExecutor.projectionQueryExecutor()
                     .printGetAllAttributeTwoAttributeThree();
    }
}
