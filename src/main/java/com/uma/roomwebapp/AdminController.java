/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uma.roomwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Kinich Mansilla
 */
@Controller
public class AdminController {

    @GetMapping("/login")
    public String getLogInPage() {
        return "login";
    }
}
