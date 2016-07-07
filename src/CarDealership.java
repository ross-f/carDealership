import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ross
 */

public class CarDealership implements ActionListener {
    JFrame frame;
    Container app;
    CardLayout cl;
    Login loginPage;
    Menu menu;
    Search carSeaerch;
    Search employeeSearch;
    Search customerSearch;
    
    CarDealership() {
        // Data creation
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("admin", "Admin", "Staff", "admin", "admin", 0, true));
        employees.add(new Employee("admfin", "Admin", "Staff", "admin", "admin", 0, true));
        employees.add(new Employee("afdmifn", "Admin", "Staff", "admin", "admin", 0, true));
        employees.add(new Employee("adamin", "Admin", "Staff", "admin", "admin", 0, true));
        ArrayList<SearchableObject> searchableEmployees = new ArrayList<>();
        employees.forEach( (employee) -> searchableEmployees.add(employee.getBasicObject()));
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Micra", "Red", "AB12 CDE", 1000, 1000));
        cars.add(new Car("Nissfan", "Micra", "Red", "AB12 CDE", 1000, 1000));
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
        loginPage = new Login(employees);
        menu = new Menu(employees);
        carSeaerch = new Search(searchableCars);
        employeeSearch = new Search(searchableEmployees);
        customerSearch = new Search(searchableCustomers);

        app.add(loginPage, "login");
        app.add(menu, "menu");
        app.add(carSeaerch, "car");
        app.add(employeeSearch, "employee");
        app.add(customerSearch, "customer");

        loginPage.login.addActionListener(this);
        menu.cars.addActionListener(this);
        menu.customers.addActionListener(this);
        menu.staff.addActionListener(this);
        menu.exit.addActionListener(this);
        
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
        System.out.println(ae.getActionCommand());
        
        switch(ae.getActionCommand()){
            case("Login"):{
                if (loginPage.done)
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
                break;
            }
            
            case("←"):{
                cl.show(app, "menu");
//                break;
            }
                
            default:
                throw new UnsupportedOperationException(
                        ae.getActionCommand() + " has not been implemented yet");
        }
    }
}
