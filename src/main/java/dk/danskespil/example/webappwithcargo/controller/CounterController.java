package dk.danskespil.example.webappwithcargo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CounterController {

    private static int counter = 0;
    private static final String VIEW_INDEX = "index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        // Some comment Sonar will pick up and complain about
        model.addAttribute("message", "Welcome");
        model.addAttribute("counter", ++counter);

        return VIEW_INDEX;

    }
    // // Duplicated code Sonar will pick up and complain about
    @RequestMapping(value = "/duplicatedcode", method = RequestMethod.GET)
    public String duplicatedcode(ModelMap model) {
        // Some comment Sonar will pick up and complain about
        model.addAttribute("message", "Welcome");
        model.addAttribute("counter", ++counter);

        return VIEW_INDEX;

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", "Welcome " + name);
        model.addAttribute("counter", ++counter);
        return VIEW_INDEX;
    }
}
