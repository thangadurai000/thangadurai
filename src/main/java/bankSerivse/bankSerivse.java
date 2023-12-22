package bankSerivse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.oasys.Bank.BankApplication;

import bankdao.bankdao;

@Service
public class bankSerivse {
	@Autowired bankdao bankdao;

	public String insertlist(List<BankApplication> detail) {
	
		
		return bankdao.insertlist(detail);
	}
}
