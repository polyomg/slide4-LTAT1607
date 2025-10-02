package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/form")
    public String form0() {
        return "form"; // hiển thị form.html trong /templates
    }

    @RequestMapping("/save/{x}")
    public String save(
            @PathVariable("x") String x,
            @RequestParam("y") String y,
            Model model) {

        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "form"; // trả về form.html và hiển thị kết quả
    }
}