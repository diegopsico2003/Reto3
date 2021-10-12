/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costume.controller;

import com.costume.model.Admin;
import com.costume.repository.AdminRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author hugog
 */
@RestController
@RequestMapping("/api/Admin")
public class AdminRestController {
    
    @Autowired
    private AdminRepository adminRepository;
    
    @GetMapping("all")
    public ResponseEntity<List<Admin>> listAdmis() {
       List<Admin> listAdmins =adminRepository.findAll();
        return ResponseEntity.ok(listAdmins);
        
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        /**@TODO*/
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
         /**@TODO*/
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Admin> post(@RequestBody Admin admin) {
        Admin newAdmin=adminRepository.save(admin);
        return ResponseEntity.ok(newAdmin);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        /**@TODO*/
        return null;
    }
    
}
