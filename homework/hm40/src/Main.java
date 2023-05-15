import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    List<Account> accountList = List.of(
        new Account("de202123232323232304",
            new Person("John", "Malcovich"),
            50000),
        new Account("de202123232323232304",
            new Person("John", "Malcovich"),
            50000),
        new Account("de202123232322323",
            new Person("Bob", "Crouse"),
            10000),
        new Account("de2021232123232313",
            new Person("Anna", "Frank"),
            100000000)
    );
    new Account("de2021232123232313",
        new Person("Anna", "Frank"),
        100000000);

     Map <Account, Person > resultMap= getAccountMap(accountList);
    System.out.println(resultMap);

    System.out.println(getUniqueAccounts(accountList));
  }
    public static Map<Account, Person> getAccountMap(List<Account> accountList){
      Map<Account, Person> map = new HashMap<>();
  for(Account account : accountList){
    map.put(account, account.getOwner());
  }
  return map;
  }
  public  static List<Account> getUniqueAccounts(List<Account> list){

    HashSet<Account> set = new HashSet<>();
    for (Account account: list){
      set.add(account);
    }
    List<Account> uniqueAccounts = new ArrayList<>(set);
    return uniqueAccounts;

  }
}