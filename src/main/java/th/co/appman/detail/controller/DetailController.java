package th.co.appman.detail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import th.co.appman.detail.entity.Detail;
import th.co.appman.detail.service.DetailService;

import java.util.List;

@RestController
public class DetailController {

    private final DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/detail")
    public List<Detail> detailAll() {
        return detailService.getAll();
    }

    @GetMapping("/detail/{productid}")
    public List<Detail> detailAll(@PathVariable("productid") long productid) {
        return detailService.getByProductId(productid);
    }

}
