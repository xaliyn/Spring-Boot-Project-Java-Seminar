package hu.nje.townsapp.web;

import hu.nje.townsapp.repository.CountyRepository;
import hu.nje.townsapp.repository.TownRepository;
import hu.nje.townsapp.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseController {

    @Autowired
    private CountyRepository countyRepository;

    @Autowired
    private TownRepository townRepository;

    @Autowired
    private PopulationRepository populationRepository;

    @GetMapping("/database")
    public String showDatabase(Model model) {
        model.addAttribute("counties", countyRepository.findAll());
        model.addAttribute("towns", townRepository.findAll());
        model.addAttribute("populations", populationRepository.findAll());
        return "database"; // refers to templates/database.html
    }
}

