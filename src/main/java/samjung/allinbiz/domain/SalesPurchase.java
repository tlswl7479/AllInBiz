package samjung.allinbiz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesPurchase {

    private int id;
    private String loginId;
    private int year;
    private int month;
    private int quarter;
    private int registrationNum;
    private int sales;
    private int purchase;
    private int profit;
}
