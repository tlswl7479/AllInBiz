package samjung.allinbiz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SalesPurchaseController {

    @GetMapping("/graph")
    public String graph() {
        return "salesPurchaseGraph";
    }

    @GetMapping("/manage")
    public String manage() {
        return "salesPurchaseManage";
    }

    @GetMapping("/table")
    public String table() {
        return "salesPurchaseTable";
    }

    @PostMapping("/manage")
    public void insertSalesPurchase(String sales, String purchase) {

    }
}
