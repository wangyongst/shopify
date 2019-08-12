package com.spring.boot.manager.admin.controller;


import com.spring.boot.manager.service.AdminService;
import com.spring.boot.manager.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public AdminService adminService;

    @GetMapping("/get/mailinfo")
    public Result getMailinfo() {

    }

}
