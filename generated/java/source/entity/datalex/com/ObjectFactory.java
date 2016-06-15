
package entity.datalex.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.datalex.services.Customer;
import com.datalex.services.Customers;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity.datalex.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Customer_QNAME = new QName("com.datalex.entity", "customer");
    private final static QName _Customers_QNAME = new QName("com.datalex.entity", "customers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity.datalex.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.datalex.entity", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "com.datalex.entity", name = "customers")
    public JAXBElement<Customers> createCustomers(Customers value) {
        return new JAXBElement<Customers>(_Customers_QNAME, Customers.class, null, value);
    }

}
