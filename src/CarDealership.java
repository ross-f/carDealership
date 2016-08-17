import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This is the main class this contains the main() method
 * the data is created in this class and the base components of the UI are constructed
 *
 * CarDealership implements ActionListener so that this class can manage all
 * of the actions in the other classes.
 */

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
        /**
         * This is where the initial data for the app is created
         *
         * This is completely flexable and new objects can be added here
         * and they will apprear in the searches and employees can be used to login
         *
         * Each ArrayList has field names inline.
         */


        // create the array list that the employees will be stored in
        ArrayList<Employee> employees = new ArrayList<>();
        //  create the new Employees in the following format
        //            new Employee(firstName, lastName, role, username, password, salary)
        employees.add(new Employee("admin", "Admin", "Staff", "admin", "admin", 10));
        employees.add(new Employee("Ross", "Fletcher", "Boss guy", "rfletcher", "password", 1234567));
        employees.add(new Employee("example", "person", "person", "magic", "magic", 1));
        employees.add(new Employee("low level", "user", "peasant", "user", "pass", -1));

        // create the array list that the cars will be stored in
        ArrayList<Car> cars = new ArrayList<>();
        // create the new cars in the following format
        //       new Car(make, model, colour, registration, miles, price
        cars.add(new Car("Nissan", "Micra", "Red", "AB12 CDE", 1000, 1000));
        cars.add(new Car("Porshe", "Boxer", "Red", "AB12 CDE", 1000, 1000));
        cars.add(new Car("Nissdan", "Micra", "Red", "AB12 CDE", 1000, 1000));

        // Create the array list that the customers will be stored in
        ArrayList<Customer> customers = new ArrayList<>();
        // populate the ArrayList with new customers in the following format
        //            new Customer(firstName, lastName, Date of Birth, Fave car brand
        customers.add(new Customer("Customer", "Customer", "Merc"));
        customers.add(new Customer("Customer2", "Customer2", "s"));
        customers.add(new Customer("Customer3", "Customer3", "Mesrc"));

        // Create the JFrame to hold the app
        frame = new JFrame("CarSales");
        // exit the java process when closing the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set a size - can be anything over around 450 becuase of the frame packing later
        frame.setSize(500,500);

        // get the content within the frame
        // -- this is because CardLayout requires the specific conent to focus on
        app = frame.getContentPane();
        // create the Card layout to allow visible panels to be switched on the fly
        cl = new CardLayout();

        // Apply the new layout
        app.setLayout(cl);

        // Contruct the diffent classes that hold the interchangeable panels
        login = new Login(employees);
        menu = new Menu();
        // The search class is constucted with different ArrayLists of objects
        // each of the panels are constucted with differnt array lists
        carSearch = new Search(cars);
        employeeSearch = new Search(employees);
        customerSearch = new Search(customers);

        // add the searches to the app container and give them lables
        app.add(login, "login");
        app.add(menu, "menu");
        app.add(carSearch, "car");
        app.add(employeeSearch, "employee");
        app.add(customerSearch, "customer");

        // Add the carDealership action listener???/
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

        // Pack the JFrame - this changes the size of the frame to match the largest panel
        frame.pack();
        // Now we've finished the GUI - show it to the user
        frame.setVisible(true);
    }

    // main - this is where the program starts
    public static void main(String[] args) {
      // TODO: RESEARCH THIS
        SwingUtilities.invokeLater(() -> {
            CarDealership startFrame = new CarDealership();
        });
    }

    /**
     * void actionPerformed
     * This method will Override the actionPerformed method that is part of
     * the ActionListener interface and will be called whenever an action
     * element that has had the curent object (startFrame) added to it.
     *
     * This method should never be called in code that is written in Java files.
     * It will be automatically called by the classes that use GUI elements
     * and have action listeners.
     *
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Get the name of the button that has been clicked
        switch(ae.getActionCommand()){
            // Compare that name to each case statement
            case("Login"):{
                // If login succesful then switch the panel cards to the menu
                // reason for the "feature" of having to click Login twice
                if (login.done)
                    cl.show(app, "menu");
                break;
            }

            // if search cars clicked swich panels to the Car Search
            case("Search Cars"):{
                cl.show(app, "car");
                break;
            }

            // if search staff clicked swich panels to the Staff Search
            case("Search Staff"):{
                cl.show(app, "employee");
                break;
            }

            // if search customers clicked swich panels to the Customer Search
            case("Search Customers"):{
                cl.show(app, "customer");
                break;
            }

            // if logout clicked switch panels back to the Login page
            case("Logout"):{
                cl.show(app, "login");
                // also clear the fields so you can't just click login again
                login.clearLoginFields();
                break;
            }

            // ASCII for left arrow - if you can't see it set encoding to ANSI
            case("←"):{
                // Show menu if back is pressed
                cl.show(app, "menu");
                break;
            }

            /**
             * This case will take the user to the veiw screen for the currently
             * selected object from anyone of the Car, Customer or Employee search
             * screens.
             *
             * It does this by first finding the currently shown Panel and then
             * getting the (SearchableObject) selected attribute out of that class
             *
             */
            case("View"):{
                // get active card by looping through layout and storeing what is visable
                SearchableObject selected = null;

                // a for each loop to loop though each component inside the main frame
                for (Component comp: app.getComponents()) {
                    // check if the current compoent in the loop is visable
                    if (comp.isVisible()) {
                        // The view button is only found on the search page
                        // And this case would get run if the view button is clicked
                        // which means the visable component must be a search panel.

                        // Here the component is casted to a search panel so we can
                        // use it as if it was a search panel all along
                        Search searchPanel = (Search) comp;
                        // pull out the attribute that is stored as slected on the search
                        // page and store it in the selected variable to use it on for view
                        selected = searchPanel.selected;
                    }
                }

                // genrerate the view panel using the selected attribute
                View viewPanel = new View(selected);
                // Add the new view panel to the jframe
                app.add(viewPanel, "view");
                // Switch to it on the card layout
                cl.show(app, "view");
                // add an actionlistener to go back to the menu
                viewPanel.backToMenu.addActionListener(this);

                break;
            }

            // This is for debugging puroses only, will throw an usuported exception if code
            // has been writen for action listener and it hasn't been written in the case switch
            default:
                throw new UnsupportedOperationException(
                        ae.getActionCommand() + " has not been implemented yet");
        }
    }
}
