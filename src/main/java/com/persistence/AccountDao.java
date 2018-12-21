package com.persistence;
import com.model.Account;
import java.util.*;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface AccountDao {
	
@SqlQuery("select * from Account where accNum = :accNumber")
@Mapper(AccountMapper.class)
public Account balanceCheck(@Bind("accNumber") int accNumber);
	
@SqlUpdate("insert into account values(:accnum,:name,:amount)")
public int createAccount(@Bind("accnum")int accnum,
@Bind("name")String name,@Bind("amount")float amount);

@SqlUpdate("update account set amount = amount - :amt where accNum = :accNumber")
public int withdraw(@Bind("accNumber")int accnum,
@Bind("amt")float amount);

@SqlUpdate("update account set amount = amount + :amt where accNum = :accNumber")
public int deposite(@Bind("accNumber")int accnum,
@Bind("amt")float amount);


}