/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.Calendrier;
import entities.TarifFormation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author francoise
 */
@Repository
public interface TarifRepository extends CrudRepository<TarifFormation, Long> {
    
}
