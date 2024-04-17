package ma.emsi.jpaemsi.repositories;

import ma.emsi.jpaemsi.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*la notation repository cest un composant de la couche dao
couche web controller restcontroller... */
@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRoleName(String rolename);
}


