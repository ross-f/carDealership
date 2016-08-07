import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CarDealership implements ActionListener {
    JFrame frame;
    Container app;
    CardLayout cl;
    Login login;
    Menu menu;
    Search carSearch;
    Search employeeSearch;
    Search customerSearch;
    
    CarDealership() {
        /***
         * This is where the initial data for the app is created
         * 
         * This is completely flexable and new objects can be added here 
         * and they will apprear in the searches and employees can be used to login
         */
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("admin", "Admin", "Staff", "admin", "admin", 10));
        employees.add(new Employee("Ross", "Fletcher", "Boss guy", "rfletcher", "password", 1234567));
        employees.add(new Employee("example", "person", "person", "magic", "magic", 1));
        employees.add(new Employee("low level", "user", "peasant", "user", "pass", -1));
        ArrayList<SearchableObject> searchableEmployees = new ArrayList<>();
        employees.forEach( (employee) -> searchableEmployees.add(employee.getBasicObject()));
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Micra", "Red", "AB12 CDE", 1000, 1000));
        cars.add(new Car("Porshe", "Boxer", "Red", "AB12 CDE", 1000, 1000));
        cars.add(new Car("Nissdan", "Micra", "Red", "AB12 CDE", 1000, 1000));
        ArrayList<SearchableObject> searchableCars = new ArrayList<>();
        cars.forEach( (car) -> searchableCars.add(car.getBasicObject()));
        
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Customer", "Customer", new Date(), "Merc"));
        customers.add(new Customer("Customer2", "Customer2", new Date(), "s"));
        customers.add(new Customer("Customer3", "Customer3", new Date(), "Mesrc"));
        ArrayList<SearchableObject> searchableCustomers = new ArrayList<>();
        customers.forEach( (customer) -> searchableCustomers.add(customer.getBasicObject()));

        frame = new JFrame("CarSales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        app = frame.getContentPane();
        cl = new CardLayout();

        app.setLayout(cl);

        // TODO - Next three sections could be functionalized
        login = new Login(employees);
        menu = new Menu();
        carSearch = new Search(cars);
        employeeSearch = new Search(employees);
        customerSearch = new Search(customers);

        app.add(login, "login");
        app.add(menu, "menu");
        app.add(carSearch, "car");
        app.add(employeeSearch, "employee");
        app.add(customerSearch, "customer");

        // TODO - don't pass this through when your still building it
        login.login.addActionListener(this);
        menu.cars.addActionListener(this);
        menu.customers.addActionListener(this);
        menu.staff.addActionListener(this);
        menu.exit.addActionListener(this);
        carSearch.backToMenu.addActionListener(this);
        employeeSearch.backToMenu.addActionListener(this);
        customerSearch.backToMenu.addActionListener(this);
        carSearch.viewButton.addActionListener(this);
        employeeSearch.viewButton.addActionListener(this);
        customerSearch.viewButton.addActionListener(this);
        
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CarDealership startFrame = new CarDealership();
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {                
        switch(ae.getActionCommand()){
            case("Login"):{
                if (login.done)
                    cl.show(app, "menu");
                break;
            }
        
            case("Search Cars"):{
                cl.show(app, "car");
                break;
            }
        
            case("Search Staff"):{
                cl.show(app, "employee");
                break;
            }

            case("Search Customers"):{
                cl.show(app, "customer");
                break;
            }
        
            case("Logout"):{
                cl.show(app, "login");
                login.clearLoginFields();
                break;
            }
            
            case("←"):{
                cl.show(app, "menu");
                break;
            }
            
            case("View"):{
                // get active card by looping through layout and storeing what is visable
                SearchableObject selected = null;
                
                View viewPanel;

                for (Component comp: app.getComponents()) {
                    if (comp.isVisible()) {
                        Search searchPanel = (Search) comp;
                        selected = searchPanel.selected;
                    }
                }

                // posible memory leak by adding more and not deleting - lazy
                viewPanel = new View(selected);
                app.add(viewPanel, "view");
                cl.show(app, "view");
                viewPanel.backToMenu.addActionListener(this);
                
                break;
            }
                
            default:
                throw new UnsupportedOperationException(
                        ae.getActionCommand() + " has not been implemented yet");
        }
    }
}
