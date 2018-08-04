package demo.web.router;

import com.magicfish.weroll.annotation.Param;
import com.magicfish.weroll.annotation.Router;
import org.springframework.ui.Model;

public class Test {

    @Router(path = "/test", needLogin = true)
    public void renderTestPage() {

    }

    @Router(path = "/test2", view = "/test",
            needLogin = false,
            params = {
                @Param(name = "id")
            }
    )
    public void renderTest2Page(String id, Model model) {
        model.addAttribute("msg", "Hello, " + id);
    }

}