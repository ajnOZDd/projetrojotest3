package com.nba.sport.services;

import java.util.List;

import com.nba.sport.models.Equipe;

public interface EquipeServiceBase {
    List<Equipe> getAllProducts();
    Equipe getProductById(Long id);
    void addProduct(Equipe product);
    void updateProduct(Equipe product);
    void deleteProduct(Long id);
    
} 
