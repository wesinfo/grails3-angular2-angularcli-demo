package ng2starter
import grails.persistence.Entity

@Entity
class Supplier {

    Integer id;
    String name;
    String address;
    Integer company;
    String shortname;
    String sellerQuality;
    String sellerContacts = "";
    String sellerPhone = "";
    String sellerGoods = "";
    String sellerPart = "";
    String sellerFrom = "";
    Boolean sellerIsset = false;
    String sellerPressure = "";
    Integer sellerState = 0;
    Integer sellerDistance=0;
    Integer addEmployee;
    float freightRate;
    boolean firstClass = false;
    BigDecimal gasificationRate;

    static mapping = {
        id name: 'id'
    }
}
