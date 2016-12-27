package com.culqi.example.controller;

import com.culqi.Culqi;
import com.culqi.util.Result;
import com.culqi.util.Util;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by culqi on 12/26/16.
 */

@RestController
public class Server {

    @RequestMapping(value= "/charges", method = RequestMethod.POST, produces = "application/json")
    public String charges(@RequestParam("token") String token, @RequestParam("first_name") String first_name, @RequestParam("last_name") String last_name,  @RequestParam("email") String email) throws Exception {
        Culqi culqi = new Culqi("pk_test_vzMuTHoueOMlgUPj","sk_test_UTCQSGcXW8bCyU59");
        Result result = culqi.createCharge("Avenida Lima 1232", "LIMA", 1000, "PE", "PEN", "123", email,
                first_name, 0, last_name, "", new Util().ramdomNumber(), 3333339, "Venta de prueba", token);
        return "{\"status\":\"" + result.getStatus() + "\",\"id\":\"" + result.getId() + "\",\"message\":\""+result.getMessage()+"\"}";
    }

}
