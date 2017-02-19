package com.culqi.example.controller;

import com.culqi.Culqi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by culqi on 12/26/16.
 */

@RestController
public class Server {

    @RequestMapping(value= "/charges", method = RequestMethod.POST, produces = "application/json")
    public Map<String, Object> charges(@RequestParam("token") String token, @RequestParam("installments") String Installments) throws Exception {

        Culqi culqi = new Culqi("", "sk_test_UTCQSGcXW8bCyU59");

        Map<String, Object> charge = new HashMap<>();

        Map<String, Object> metadata = new HashMap<String, Object>();
        metadata.put("oder_id", "124");
        charge.put("amount",1000);
        //charge.put("capture", true);
        charge.put("currency_code","PEN");
        charge.put("description","Venta de prueba");
        charge.put("email","test@culqi.com");
        charge.put("installments", Integer.parseInt(Installments));
        charge.put("metadata", metadata);
        charge.put("source_id", token);

        return culqi.charge.create(charge);

    }

}
