package crazypco.start.main.repositorys;

import org.hibernate.query.criteria.internal.CriteriaUpdateImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import crazypco.start.main.entitys.Customer;

public interface CutomerRepository extends JpaRepository<Customer, Long>{

}
