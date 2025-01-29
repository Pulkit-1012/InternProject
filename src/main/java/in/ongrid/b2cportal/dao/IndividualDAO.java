package in.ongrid.b2cportal.dao;

import in.ongrid.b2cportal.entity.Individual;

import java.util.List;

public interface IndividualDAO {
    void save(Individual individual);
    List<Individual> findAll();
    Individual findById(Long id);
    void deleteById(Long id);
}
