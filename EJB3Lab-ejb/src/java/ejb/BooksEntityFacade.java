/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Никита
 */
@Stateless
public class BooksEntityFacade extends AbstractFacade<BooksEntity> implements BooksEntityFacadeLocal {

    @PersistenceContext(unitName = "EJB3Lab-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BooksEntityFacade() {
        super(BooksEntity.class);
    }
    
}
