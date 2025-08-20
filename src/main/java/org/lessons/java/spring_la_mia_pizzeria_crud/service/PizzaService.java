package org.lessons.java.spring_la_mia_pizzeria_crud.service;

import java.util.List;

import org.lessons.java.spring_la_mia_pizzeria_crud.model.PizzaModel;
import org.lessons.java.spring_la_mia_pizzeria_crud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<PizzaModel> findAll() {
        return pizzaRepository.findAll();
    }

    public PizzaModel findById(Integer id) {
        return pizzaRepository.findById(id).get();
    }

    public List<PizzaModel> findByname(String nome) {
        return pizzaRepository.findByNomeContaining(nome);
    }


    // create e update 
    public PizzaModel save(PizzaModel pizza) {
        return pizzaRepository.save(pizza);

    }

    public void deleteById(Integer id) {
        pizzaRepository.deleteById(id);
    }


}
