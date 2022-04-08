import java.sql.Date;
import java.util.List;

public class Name {
	//variáveis que falam por si só 
    //A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};
    

    //Declarações corretas
    //A
    public List<Account> AccountList;


    // Sem Prefixos
    //B
    public void deleteUser(Name.User user){};

    // Evite mapa mental    
    //B
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    //A
    public class TableRepresent {};
    public void saveCar(){};

    // Uma palavra por conceito
    //A
    public saveUser(){}; saveAccount(){}; saveContract(){};


    //Use constants, enums instead of magic numbers, abbreviations
    //A
    public int daysInYear = 360;
    public int hoursInWeek = 168;


}
