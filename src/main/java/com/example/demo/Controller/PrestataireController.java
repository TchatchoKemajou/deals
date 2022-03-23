package com.example.demo.Controller;


import com.example.demo.Entity.Prestataire;
import com.example.demo.Services.PrestataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller()
public class PrestataireController {

    @Autowired
    private PrestataireService prestataireService;

    @RequestMapping("prestataireList")
    public String list(Model model){
        model.addAttribute("lists", prestataireService.getAllPrestataires());
        return "/prestataireList";
    }

    @RequestMapping("Prestataire/create")
    public  String create(Model model){
        model.addAttribute("lists", new Prestataire());
        return "addPrestataire";
    }

    @RequestMapping(value = "Prestataire/save", method = RequestMethod.POST)
    public  String save(Prestataire prestataire, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "addPrestataire";
        }else {
            prestataireService.addPrestataire(prestataire);
            return  "redirect:/prestataireList";
        }
    }

}
