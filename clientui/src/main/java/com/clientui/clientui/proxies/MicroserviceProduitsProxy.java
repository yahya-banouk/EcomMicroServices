package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.ProductBean;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits", url = "localhost:9001")

public interface MicroserviceProduitsProxy {
    @GetMapping(value = "/Produits")
    public List<ProductBean> listeDesProduits();

    @GetMapping( value = "/Produits/{id}")
    public ProductBean recupererUnProduit(@PathVariable("id") int id);
}
