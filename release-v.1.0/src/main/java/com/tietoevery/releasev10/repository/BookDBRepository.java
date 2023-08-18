package com.tietoevery.releasev10.repository;

import com.tietoevery.releasev10.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDBRepository extends JpaRepository<Book, Long> {
}
