/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Никита
 */
@Local
public interface BooksEntityFacadeLocal {

    void create(BooksEntity booksEntity);

    void edit(BooksEntity booksEntity);

    void remove(BooksEntity booksEntity);

    BooksEntity find(Object id);

    List<BooksEntity> findAll();

    List<BooksEntity> findRange(int[] range);

    int count();
    
}
