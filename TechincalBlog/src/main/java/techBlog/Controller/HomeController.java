package techBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import techBlog.Model.Post;
import techBlog.Service.PostService;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    public HomeController() {
        System.out.println("*** HomeController ***");
    }
    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Post>posts    =postService.getAllPosts();
        model.addAttribute("posts", posts);

        return "index";
    }
}
