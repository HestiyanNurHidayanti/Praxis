@Component
public class Customer
{
    private Person person;
    @Autowired
    public Customer(Person person)
    {
        this.person=person;
    }
}