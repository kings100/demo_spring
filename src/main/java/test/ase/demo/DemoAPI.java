package test.ase.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "demo/")
public class DemoAPI {

    @Autowired
    BlogRepository blogRepository;
    @Autowired
    Blog2Repository blog2Repository;

    @RequestMapping(value = "id", method = RequestMethod.GET)
    public Blog findid(@RequestParam int x1) {
        return blogRepository.getOne(x1);
    }

    @RequestMapping(value = "find", method = RequestMethod.GET)
    public List<Blog> findString(@RequestParam String x2) {
        return blogRepository.findByTitleContainingOrContentContaining(x2, x2);
    }

    @RequestMapping(value = "findthree", method = RequestMethod.GET)
    public Collection<Blog> findBlogThree() {
        return blogRepository.findBlogThree();
    }


    @RequestMapping(value = "twopks", method = RequestMethod.GET)
    public Blog2 findBlogTwoe(@RequestParam int x1, @RequestParam String x2) {
        return blog2Repository.getOne(new Blog2Id(x1, x2));
    }

}
