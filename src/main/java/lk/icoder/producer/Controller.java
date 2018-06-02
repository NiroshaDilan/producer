package lk.icoder.producer;

import lk.icoder.producer.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project producer
 * @Author DILAN on 6/2/2018
 */
@RestController
public class Controller {

    @Autowired
    private Producer producer;

    @PostMapping("send")
    public ResponseEntity<String> sendMessage(@RequestBody Company company) {
        producer.produce(company);
        return new ResponseEntity<>("Sent...", HttpStatus.OK);
    }
}
