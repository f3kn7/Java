package model.dao;

import java.util.List;
import model.entities.Department;

/**
 *
 * @author Felipe Kellermann
 */
public interface DepartmentDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer idPessoa);

    Department findById(Integer idPessoa);

    List<Department> findAll();

}
