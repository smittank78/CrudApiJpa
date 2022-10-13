package api.crud.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.crud.entity.userentity.userEntity;
@Repository
public interface userRepository extends JpaRepository<userEntity, Integer>
{

}