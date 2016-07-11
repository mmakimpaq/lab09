package savings.repository;

import savings.model.AccountIncome;
import savings.model.PaybackConfirmation;
import savings.model.Purchase;

import java.util.List;

/**
 * Created by mmak on 11.07.16.
 */
public interface PayBackRepositoryCustom {
    List<PaybackConfirmation> findByAccountNumber(String accountNumber);

    PaybackConfirmation save(AccountIncome income, Purchase purchase);
}
