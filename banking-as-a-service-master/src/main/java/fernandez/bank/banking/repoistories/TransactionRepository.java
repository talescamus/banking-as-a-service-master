package fernandez.bank.banking.repoistories;

import fernandez.bank.banking.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}