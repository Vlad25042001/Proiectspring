package com.example.Proiectspring.model;

import com.example.Proiectspring.controller.echipe;
import com.example.Proiectspring.controller.fotbalisti;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class fotbal {


    @GetMapping(value = "/index")
    public String index(Model model) {
        String text = "LPF";
        model.addAttribute("greetings", text);

        echipe e1 = new echipe("Steaua Bucuresti", 1);
        echipe e2 = new echipe("Dinamo Bucuresti", 2);

        model.addAttribute("echipeList", List.of(e1, e2));

        fotbalisti f1 = new fotbalisti(7, "Florinel Coman", e1.getTeam());
        fotbalisti f2 = new fotbalisti(10, "Octavian Popescu", e1.getTeam());
        fotbalisti f3 = new fotbalisti(1, "Stefan Tarnovanu", e1.getTeam());
        fotbalisti f4 = new fotbalisti(11, "Ahmed Bani", e2.getTeam());
        fotbalisti f5 = new fotbalisti(5, "Ionel Danciulescu", e2.getTeam());

        model.addAttribute("fotbalistiList", List.of(f1, f2, f3, f4, f5));

        return "index";
    }

    @GetMapping(value = "/Echipe")
    public String Echipe(Model model) {
        String text = "Echipe";
        model.addAttribute("greetings", text);

        echipe e1 = new echipe("Steaua Bucuresti", 1);
        echipe e2 = new echipe("Dinamo Bucuresti", 2);

        model.addAttribute("echipeList", List.of(e1, e2));
        return "Echipe";
    }

    @GetMapping(value = "/Fotbalisti")
    public String Fotbalisti(Model model) {

        echipe e1 = new echipe("Steaua Bucuresti", 1);
        echipe e2 = new echipe("Dinamo Bucuresti", 2);

        model.addAttribute("echipeList", List.of(e1, e2));

        fotbalisti f1 = new fotbalisti(7, "Florinel Coman", e1.getTeam());
        fotbalisti f2 = new fotbalisti(10, "Octavian Popescu", e1.getTeam());
        fotbalisti f3 = new fotbalisti(1, "Stefan Tarnovanu", e1.getTeam());
        fotbalisti f4 = new fotbalisti(11, "Ahmed Bani", e2.getTeam());
        fotbalisti f5 = new fotbalisti(5, "Ionel Danciulescu", e2.getTeam());

        model.addAttribute("fotbalistiList", List.of(f1, f2, f3, f4, f5));

        return "Fotbalisti";
    }
}

