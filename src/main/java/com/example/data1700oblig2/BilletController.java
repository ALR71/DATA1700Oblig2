package com.example.data1700oblig2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BilletController {
    private final List<Billett> BillettList = new ArrayList<>();
        @GetMapping("/GetBillett")
        public List<Billett> getBilleter() {
        return BillettList;
        }

        @PostMapping("/PostBillett")
        public void postBillett(Billett billett) {
        BillettList.add(billett);
        }

        @PostMapping("/DeleteBilletter")
        public void deleteBilletter() {
        BillettList.clear();
     }
}
