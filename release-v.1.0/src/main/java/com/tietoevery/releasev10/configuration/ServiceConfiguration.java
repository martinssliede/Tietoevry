package com.tietoevery.releasev10.configuration;

import com.tietoevery.releasev10.repository.BookDBRepository;
import com.tietoevery.releasev10.repository.BookRepository;
import com.tietoevery.releasev10.service.BookDBService;
import com.tietoevery.releasev10.service.BookInMemoryService;
import com.tietoevery.releasev10.service.BookService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "book", name = "service.version", havingValue = "in-memory")
    public BookService getInMemoryVersion(BookRepository bookRepository) {
        return new BookInMemoryService(bookRepository);
    }

    @Bean
    @ConditionalOnProperty(prefix = "book", name = "service.version", havingValue = "database")
    public BookService getDatabaseVersion(BookDBRepository bookDBRepository) {
        return new BookDBService(bookDBRepository);
    }
}