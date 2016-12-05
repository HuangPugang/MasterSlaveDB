
package com.example.datasource.transaction;

import com.example.datasource.factory.MasterDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
public class TransactionTemplateConfiguration {

    /**
     * @see MasterDB
     */
    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager txManager) {
        return new TransactionTemplate(txManager);
    }

}
