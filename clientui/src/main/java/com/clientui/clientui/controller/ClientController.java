package com.clientui.clientui.controller;

import com.clientui.clientui.beans.ProductBean;
import com.clientui.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@CrossOrigin("*")
public class ClientController {

    private final   MicroserviceProduitsProxy  produitsProxy;
    public ClientController(MicroserviceProduitsProxy produitsProxy)
    {
        this.produitsProxy = produitsProxy;
    }
    @RequestMapping("/")
    public String accueil(Model model){
        List<ProductBean> produits =  produitsProxy.listeDesProduits();
        model.addAttribute("produits", produits);
        return "Accueil";
    }








}
