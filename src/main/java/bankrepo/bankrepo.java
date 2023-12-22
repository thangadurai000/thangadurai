package bankrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.Bank.BankApplication;

public interface bankrepo extends JpaRepository<BankApplication, Integer> {

}
