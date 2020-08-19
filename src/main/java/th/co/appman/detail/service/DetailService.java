package th.co.appman.detail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import th.co.appman.detail.entity.Detail;
import th.co.appman.detail.repository.DetailRepository;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class DetailService {

    private final DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public List<Detail> getAll(){
        return detailRepository.findAll();
    }

    public List<Detail> getByProductId(long productId){
        return detailRepository.findByProductId(productId);
    }
}
