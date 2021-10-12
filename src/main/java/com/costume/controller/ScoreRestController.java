/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costume.controller;

import com.costume.model.Score;
import com.costume.repository.ScoreRepository;
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
@RequestMapping("/api/Score")
public class ScoreRestController {
    @Autowired
    private ScoreRepository scoreRepository;
    
    @GetMapping("/all")
    public ResponseEntity<List<Score> > listScores() {
          List<Score> listScore=(List<Score> ) scoreRepository.findAll();
        return ResponseEntity.ok(listScore);
        
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        /** @TODO*/
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
         /** @TODO*/
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Score> post(@RequestBody Score score) {
        Score newScore = scoreRepository.save(score);
        return ResponseEntity.ok(newScore);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
         /** @TODO*/
        return null;
    }
    
}
