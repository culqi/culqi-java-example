package com.culqi.example.controller;

import com.culqi.Culqi;
import com.culqi.model.Charge;
import com.culqi.model.Security;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by culqi on 12/26/16.
 */

@RestController
public class Server {

    @RequestMapping(value= "/charges", method = RequestMethod.POST, produces = "application/json")
    public String charges(@RequestParam("token") String token, @RequestParam("first_name") String first_name, @RequestParam("last_name") String last_name,  @RequestParam("email") String email) throws Exception {

        Security culqi = new Culqi().init("pk_test_vzMuTHoueOMlgUPj","sk_test_UTCQSGcXW8bCyU59");

        Charge charge = new Charge();
        charge.setAddress("Avenida Lima 1232");
        charge.setAddress_city("LIMA");
        charge.setAmount(1000);
        charge.setCountry_code("PE");
        charge.setCurrency_code("PEN");
        charge.setEmail(email);
        charge.setFirst_name(first_name);
        charge.setInstallments(0);
        charge.setLast_name(last_name);
        charge.setMetadata("");
        charge.setPhone_number(3333339);
        charge.setProduct_description("Venta de prueba");
        charge.setToken_id(token);
        Map<String, Object> data = charge.create(culqi);

        return "{\"status\":\"201\",\"id\":\"" + data.get("id").toString() + "\",\"message\":\""+data.get("user_message").toString()+"\"}";

    }

}
