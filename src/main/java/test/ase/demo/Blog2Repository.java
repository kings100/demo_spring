package test.ase.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Blog2Repository extends JpaRepository<Blog2, Blog2Id> {
}
