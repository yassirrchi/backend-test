package com.peacock.backend.repositories;

import com.peacock.backend.entities.BillItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BillItemRepository extends JpaRepository<BillItem,Long> {
}
