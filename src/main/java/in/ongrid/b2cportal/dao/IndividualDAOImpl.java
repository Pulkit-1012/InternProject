package in.ongrid.b2cportal.dao;

import in.ongrid.b2cportal.entity.Individual;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IndividualDAOImpl implements IndividualDAO {

    //defininf the entityManager
    private final EntityManager entityManager;

    public IndividualDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }




    @Override
    public void save(Individual individual) {
        entityManager.merge(individual);
    }

    @Override
    public List<Individual> findAll() {
        //creating query
//        TypedQuery<Individual> query = entityManager.createNamedQuery("FROM individual", Individual.class);
//        //saving the result from the query
//        List<Individual> individuals = query.getResultList();
//        //return the list
//        return individuals;
    }

    @Override
    public Individual findById(Long id) {
        Individual individual = entityManager.find(Individual.class, id);
        return individual;
    }

    @Override
    public void deleteById(Long id) {
        Individual individual = entityManager.find(Individual.class, id);
        entityManager.remove(individual);
    }


}
