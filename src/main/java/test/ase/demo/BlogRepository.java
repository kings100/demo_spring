package test.ase.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);

    @Query(
            value = "SELECT * FROM Blog b WHERE b.id=3",
            nativeQuery = true)
    Collection<Blog> findBlogThree();

}
