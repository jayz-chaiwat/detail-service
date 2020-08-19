package th.co.appman.detail.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import th.co.appman.detail.entity.Detail;

import java.util.List;

public interface DetailRepository extends JpaRepository<Detail,Long> {

    List<Detail> findByProductId(long productId);
}
