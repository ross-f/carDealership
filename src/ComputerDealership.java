import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This is the main class this contains the main() method
 * the data is created in this class and the base components of the UI are constructed
 *
 * ComputerDealership implements ActionListener so that this class can manage all
 * of the actions in the other classes.
 */

public class ComputerDealership implements ActionListener {
    private JFrame frame;
    private Container app;
    private CardLayout cl;
    private Login login;
    private Menu menu;
    private Search ComputerSearch;
    private Search employeeSearch;
    private Search customerSearch;

    private ComputerDealership() {
        /**
         * This is where the initial data for the app is created
         *
         * This is completely flexible and new objects can be added here
         * and they will appear in the searches and employees can be used to login
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
        // 100 EMPLOYEES GENERATED FROM http://random-name-generator.info/
        employees.add(new Employee("Phillip", "Torres", "example", "genuser1", "password1", 1));
        employees.add(new Employee("Evelyn", "Bailey", "example", "genuser2", "password2", 2));
        employees.add(new Employee("Philip", "Bennett", "example", "genuser3", "password3", 3));
        employees.add(new Employee("George", "Turner", "example", "genuser4", "password4", 4));
        employees.add(new Employee("Paul", "Reed", "example", "genuser5", "password5", 5));
        employees.add(new Employee("Bobby", "White", "example", "genuser6", "password6", 6));
        employees.add(new Employee("Carolyn", "Brown", "example", "genuser7", "password7", 7));
        employees.add(new Employee("Lillian", "Moore", "example", "genuser8", "password8", 8));
        employees.add(new Employee("Rose", "Bell", "example", "genuser9", "password9", 9));
        employees.add(new Employee("Fred", "Miller", "example", "genuser10", "password10", 10));
        employees.add(new Employee("Todd", "Washington", "example", "genuser11", "password11", 11));
        employees.add(new Employee("Sean", "Jenkins", "example", "genuser12", "password12", 12));
        employees.add(new Employee("Alan", "Henderson", "example", "genuser13", "password13", 13));
        employees.add(new Employee("Christopher", "Gray", "example", "genuser14", "password14", 14));
        employees.add(new Employee("Jack", "Evans", "example", "genuser15", "password15", 15));
        employees.add(new Employee("Dennis", "James", "example", "genuser16", "password16", 16));
        employees.add(new Employee("James", "Gonzales", "example", "genuser17", "password17", 17));
        employees.add(new Employee("Harry", "Harris", "example", "genuser18", "password18", 18));
        employees.add(new Employee("Teresa", "Wood", "example", "genuser19", "password19", 19));
        employees.add(new Employee("Bruce", "Morgan", "example", "genuser20", "password20", 20));
        employees.add(new Employee("Stephen", "Alexander", "example", "genuser21", "password21", 21));
        employees.add(new Employee("Paula", "Walker", "example", "genuser22", "password22", 22));
        employees.add(new Employee("Clarence", "Patterson", "example", "genuser23", "password23", 23));
        employees.add(new Employee("Amy", "Lopez", "example", "genuser24", "password24", 24));
        employees.add(new Employee("Denise", "Adams", "example", "genuser25", "password25", 25));
        employees.add(new Employee("Angela", "Hughes", "example", "genuser26", "password26", 26));
        employees.add(new Employee("Eugene", "Cook", "example", "genuser27", "password27", 27));
        employees.add(new Employee("Katherine", "Ross", "example", "genuser28", "password28", 28));
        employees.add(new Employee("Catherine", "Hernandez", "example", "genuser29", "password29", 29));
        employees.add(new Employee("Keith", "Ramirez", "example", "genuser30", "password30", 30));
        employees.add(new Employee("Annie", "Clark", "example", "genuser31", "password31", 31));
        employees.add(new Employee("Theresa", "Price", "example", "genuser32", "password32", 32));
        employees.add(new Employee("Patricia", "Perez", "example", "genuser33", "password33", 33));
        employees.add(new Employee("Ruby", "Stewart", "example", "genuser34", "password34", 34));
        employees.add(new Employee("Jessica", "Young", "example", "genuser35", "password35", 35));
        employees.add(new Employee("Stephanie", "Foster", "example", "genuser36", "password36", 36));
        employees.add(new Employee("Steven", "Richardson", "example", "genuser37", "password37", 37));
        employees.add(new Employee("Thomas", "Rodriguez", "example", "genuser38", "password38", 38));
        employees.add(new Employee("Joan", "Lee", "example", "genuser39", "password39", 39));
        employees.add(new Employee("Laura", "Robinson", "example", "genuser40", "password40", 40));
        employees.add(new Employee("Rebecca", "Jackson", "example", "genuser41", "password41", 41));
        employees.add(new Employee("Gregory", "Parker", "example", "genuser42", "password42", 42));
        employees.add(new Employee("Michelle", "Griffin", "example", "genuser43", "password43", 43));
        employees.add(new Employee("Terry", "Morris", "example", "genuser44", "password44", 44));
        employees.add(new Employee("Andrew", "Edwards", "example", "genuser45", "password45", 45));
        employees.add(new Employee("Janice", "Perry", "example", "genuser46", "password46", 46));
        employees.add(new Employee("Steve", "Peterson", "example", "genuser47", "password47", 47));
        employees.add(new Employee("Jesse", "Sanchez", "example", "genuser48", "password48", 48));
        employees.add(new Employee("Edward", "King", "example", "genuser49", "password49", 49));
        employees.add(new Employee("Lori", "Thompson", "example", "genuser50", "password50", 50));
        employees.add(new Employee("Joseph", "Jones", "example", "genuser51", "password51", 51));
        employees.add(new Employee("Margaret", "Hill", "example", "genuser52", "password52", 52));
        employees.add(new Employee("Amanda", "Johnson", "example", "genuser53", "password53", 53));
        employees.add(new Employee("Dorothy", "Rivera", "example", "genuser54", "password54", 54));
        employees.add(new Employee("Brenda", "Simmons", "example", "genuser55", "password55", 55));
        employees.add(new Employee("Nicholas", "Wright", "example", "genuser56", "password56", 56));
        employees.add(new Employee("Benjamin", "Ward", "example", "genuser57", "password57", 57));
        employees.add(new Employee("Cynthia", "Flores", "example", "genuser58", "password58", 58));
        employees.add(new Employee("Sarah", "Anderson", "example", "genuser59", "password59", 59));
        employees.add(new Employee("Betty", "Cooper", "example", "genuser60", "password60", 60));
        employees.add(new Employee("Jennifer", "Martin", "example", "genuser61", "password61", 61));
        employees.add(new Employee("Alice", "Thomas", "example", "genuser62", "password62", 62));
        employees.add(new Employee("Julie", "Diaz", "example", "genuser63", "password63", 63));
        employees.add(new Employee("Beverly", "Rogers", "example", "genuser64", "password64", 64));
        employees.add(new Employee("Susan", "Garcia", "example", "genuser65", "password65", 65));
        employees.add(new Employee("Tina", "Coleman", "example", "genuser66", "password66", 66));
        employees.add(new Employee("Donna", "Brooks", "example", "genuser67", "password67", 67));
        employees.add(new Employee("Deborah", "Collins", "example", "genuser68", "password68", 68));
        employees.add(new Employee("Charles", "Gonzalez", "example", "genuser69", "password69", 69));
        employees.add(new Employee("Arthur", "Bryant", "example", "genuser70", "password70", 70));
        employees.add(new Employee("Louise", "Barnes", "example", "genuser71", "password71", 71));
        employees.add(new Employee("David", "Butler", "example", "genuser72", "password72", 72));
        employees.add(new Employee("John", "Green", "example", "genuser73", "password73", 73));
        employees.add(new Employee("Ann", "Taylor", "example", "genuser74", "password74", 74));
        employees.add(new Employee("Lois", "Computerter", "example", "genuser75", "password75", 75));
        employees.add(new Employee("Sara", "Allen", "example", "genuser76", "password76", 76));
        employees.add(new Employee("Martha", "Roberts", "example", "genuser77", "password77", 77));
        employees.add(new Employee("Bonnie", "Russell", "example", "genuser78", "password78", 78));
        employees.add(new Employee("Sandra", "Williams", "example", "genuser79", "password79", 79));
        employees.add(new Employee("Samuel", "Phillips", "example", "genuser80", "password80", 80));
        employees.add(new Employee("Diane", "Watson", "example", "genuser81", "password81", 81));
        employees.add(new Employee("Anthony", "Powell", "example", "genuser82", "password82", 82));
        employees.add(new Employee("Earl", "Murphy", "example", "genuser83", "password83", 83));
        employees.add(new Employee("Roy", "Scott", "example", "genuser84", "password84", 84));
        employees.add(new Employee("Jose", "Sanders", "example", "genuser85", "password85", 85));
        employees.add(new Employee("Judy", "Davis", "example", "genuser86", "password86", 86));
        employees.add(new Employee("Johnny", "Wilson", "example", "genuser87", "password87", 87));
        employees.add(new Employee("Kathleen", "Martinez", "example", "genuser88", "password88", 88));
        employees.add(new Employee("Harold", "Hall", "example", "genuser89", "password89", 89));
        employees.add(new Employee("Ashley", "Baker", "example", "genuser90", "password90", 90));
        employees.add(new Employee("Matthew", "Lewis", "example", "genuser91", "password91", 91));
        employees.add(new Employee("Jane", "Howard", "example", "genuser92", "password92", 92));
        employees.add(new Employee("Maria", "Smith", "example", "genuser93", "password93", 93));
        employees.add(new Employee("Jeffrey", "Mitchell", "example", "genuser94", "password94", 94));
        employees.add(new Employee("Jason", "Long", "example", "genuser95", "password95", 95));
        employees.add(new Employee("Michael", "Campbell", "example", "genuser96", "password96", 96));
        employees.add(new Employee("Julia", "Kelly", "example", "genuser97", "password97", 97));
        employees.add(new Employee("Shawn", "Cox", "example", "genuser98", "password98", 98));
        employees.add(new Employee("Russell", "Nelson", "example", "genuser99", "password99", 99));
        employees.add(new Employee("Marilyn", "Monroe", "example", "genuser100", "password100", 100));

        // create the array list that the Computers will be stored in
        ArrayList<Computer> Computers = new ArrayList<>();
        // create the new Computers in the following format
        //       new Computer(make, model, colour, registration, miles, price
        Computers.add(new Computer("Nissan", "Micra", "Red", "AB12 CDE", 100000000, 1));
        Computers.add(new Computer("Porshe", "Boxer", "Yellow", "AA12 CDE", 10, 1000000000));
        Computers.add(new Computer("Audi", "A2", "Silver", "CD12 CDE", 0, 100000));

        // Create the array list that the customers will be stored in
        ArrayList<Customer> customers = new ArrayList<>();
        // populate the ArrayList with new customers in the following format
        //            new Customer(firstName, lastName, Date of Birth, Fave Computer brand
        // 100 CUSTOMERS GENERATED FROM http://random-name-generator.info/
        // WITH ComputerS FROM https://en.wikipedia.org/wiki/List_of_automobile_manufacturers
        customers.add(new Customer("Evelyn", "Brooks", "Ranger"));
        customers.add(new Customer("Kathryn", "Peterson", "AutoComputers"));
        customers.add(new Customer("Henry", "Foster", "SAIPA"));
        customers.add(new Customer("Joan", "Taylor", "Asia"));
        customers.add(new Customer("Shirley", "Scott", "AsComputeri"));
        customers.add(new Customer("Donald", "Jones", "Volkswagen"));
        customers.add(new Customer("Edward", "Barnes", "Sao"));
        customers.add(new Customer("Johnny", "Brown", "WallysComputer"));
        customers.add(new Customer("Ruby", "Gonzales", "VAM"));
        customers.add(new Customer("Samuel", "Bennett", "Hispano-Argentina"));
        customers.add(new Customer("Ruth", "Hill", "Australian Six"));
        customers.add(new Customer("Louise", "Roberts", "Pretty"));
        customers.add(new Customer("Kenneth", "Phillips", "Dennison"));
        customers.add(new Customer("Martin", "Murphy", "Spyker automobielen"));
        customers.add(new Customer("Wanda", "Thomas", "Land Rover"));
        customers.add(new Customer("Walter", "Davis", "Perana"));
        customers.add(new Customer("Lawrence", "Allen", "Cobra"));
        customers.add(new Customer("Phyllis", "Stewart", "Moose Jaw Standard"));
        customers.add(new Customer("Kevin", "Rivera", "CMC"));
        customers.add(new Customer("Thomas", "Garcia", "Jaguar"));
        customers.add(new Customer("Karen", "Jenkins", "Özaltin"));
        customers.add(new Customer("Tammy", "Morgan", "GMC"));
        customers.add(new Customer("Eric", "Bryant", "Enfield"));
        customers.add(new Customer("Marie", "Patterson", "Everson"));
        customers.add(new Customer("Ernest", "Computerter", "Aston Martin Lagonda"));
        customers.add(new Customer("Scott", "Moore", "Daewoo"));
        customers.add(new Customer("Arthur", "Griffin", "Dina"));
        customers.add(new Customer("Computerol", "Rogers", "Hindustan"));
        customers.add(new Customer("Harry", "Butler", "Siam di Tella"));
        customers.add(new Customer("Joshua", "Henderson", "Opel"));
        customers.add(new Customer("Frances", "Jackson", "Tesla Motors"));
        customers.add(new Customer("Katherine", "Wright", "Puma"));
        customers.add(new Customer("Stephen", "Ross", "Steel Brothers"));
        customers.add(new Customer("Mary", "Bailey", "Yugo"));
        customers.add(new Customer("Jeremy", "Lewis", "IMCL"));
        customers.add(new Customer("Todd", "Simmons", "Computerlton"));
        customers.add(new Customer("Justin", "Watson", "Mobius Motors"));
        customers.add(new Customer("Gloria", "Thompson", "Zastava"));
        customers.add(new Customer("Diana", "Coleman", "Monarch"));
        customers.add(new Customer("Rachel", "Williams", "Sungri Motor Plant"));
        customers.add(new Customer("Jonathan", "Ramirez", "Elfin"));
        customers.add(new Customer("Lori", "Hall", "Lotus"));
        customers.add(new Customer("Matthew", "Miller", "Marlborough"));
        customers.add(new Customer("Joyce", "Cook", "Cheetah"));
        customers.add(new Customer("Ralph", "Young", "Kaiser-Ilin Industries"));
        customers.add(new Customer("Bobby", "Anderson", "Optimal Energy"));
        customers.add(new Customer("Joseph", "Campbell", "David Brown"));
        customers.add(new Customer("Teresa", "Diaz", "Perana"));
        customers.add(new Customer("Computerlos", "Robinson", "Styl Kar"));
        customers.add(new Customer("Mildred", "Cox", "Timmis"));
        customers.add(new Customer("Anna", "Flores", "Theologou"));
        customers.add(new Customer("Craig", "Powell", "Hercules"));
        customers.add(new Customer("Computerl", "King", "Mazda"));
        customers.add(new Customer("Susan", "Mitchell", "Chrysler"));
        customers.add(new Customer("Amy", "Nelson", "Cadillac"));
        customers.add(new Customer("Sarah", "Russell", "Toroidion"));
        customers.add(new Customer("Timothy", "Price", "Oullim"));
        customers.add(new Customer("Terry", "Richardson", "Colonial"));
        customers.add(new Customer("Judith", "Martinez", "Manic GT"));
        customers.add(new Customer("Gregory", "Perry", "Holden"));
        customers.add(new Customer("Lisa", "Evans", "Gurgel"));
        customers.add(new Customer("Paul", "Clark", "Industrias Aeronáuticas y Mecánicas del Estado"));
        customers.add(new Customer("Rose", "Reed", "Rolls Royce"));
        customers.add(new Customer("Janet", "Rodriguez", "Devaux"));
        customers.add(new Customer("Kathleen", "Sanchez", "Automobile Dacia"));
        customers.add(new Customer("Brandon", "Wood", "Maserati"));
        customers.add(new Customer("Alan", "Turner", "Speranza Chery"));
        customers.add(new Customer("Virginia", "Gray", "Pyongsang Auto Works"));
        customers.add(new Customer("Phillip", "Howard", "Subaru"));
        customers.add(new Customer("Helen", "Wilson", "Hartnett"));
        customers.add(new Customer("Christina", "Harris", "Maruti"));
        customers.add(new Customer("Anne", "Bell", "Aurora 122-C"));
        customers.add(new Customer("Sara", "Long", "PRB"));
        customers.add(new Customer("Anthony", "Adams", "Bahman"));
        customers.add(new Customer("Marilyn", "Hernandez", "MAVA-Renault"));
        customers.add(new Customer("Roy", "Lopez", "Alpha Sports"));
        customers.add(new Customer("Cheryl", "Torres", "Scavas"));
        customers.add(new Customer("Bruce", "Gonzalez", "Koenigsegg"));
        customers.add(new Customer("Linda", "Cooper", "Dacon"));
        customers.add(new Customer("Sandra", "Lee", "Zarooq Motors"));
        customers.add(new Customer("Sean", "Smith", "Wood"));
        customers.add(new Customer("Lillian", "Baker", "Gray-Dort"));
        customers.add(new Customer("Amanda", "Hughes", "Hradyesh"));
        customers.add(new Customer("Barbara", "Alexander", "Santa Matilde"));
        customers.add(new Customer("Richard", "Morris", "Abarth"));
        customers.add(new Customer("Adam", "White", "Eagle"));
        customers.add(new Customer("Fred", "Sanders", "Matra"));
        customers.add(new Customer("Rebecca", "James", "FNM"));
        customers.add(new Customer("Cynthia", "Martin", "ARO"));
        customers.add(new Customer("Louis", "Perez", "Tangalakis"));
        customers.add(new Customer("Emily", "Washington", "Engesa"));
        customers.add(new Customer("Christine", "Edwards", "Uirapuru"));
        customers.add(new Customer("William", "Walker", "Holland Computer"));
        customers.add(new Customer("Andrew", "Johnson", "MP Lafer"));
        customers.add(new Customer("Maria", "Ward", "Mirage GT"));
        customers.add(new Customer("Julie", "Green", "Tan Chong Motor"));
        customers.add(new Customer("Pamela", "Kelly", "Lloyd-Hartnett"));
        customers.add(new Customer("Laura", "Parker", "Tata"));
        customers.add(new Customer("Benjamin", "Collins", "Egy-Tech"));
        customers.add(new Customer("Martha", "Collins", "Tudhope"));

        // Create the JFrame to hold the app
        frame = new JFrame("ComputerSales");
        // exit the java process when closing the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set a size - can be anything over around 450 becuase of the frame packing later
        frame.setSize(500,500);

        // get the content within the frame
        // -- this is because CardLayout requires the specific conent to focus on
        app = frame.getContentPane();
        // create the CardLayout layout to allow visible panels to be switched on the fly
        cl = new CardLayout();

        // Apply the new layout
        app.setLayout(cl);

        // Construct the different classes that hold the interchangeable panels
        login = new Login("credlist.txt");
        menu = new Menu();
        // The search class is constructed with different ArrayLists of objects
        // each of the panels are constructed with different array lists
        ComputerSearch = new Search(Computers);
        employeeSearch = new Search(employees);
        customerSearch = new Search(customers);

        // add the searches to the app container and give them labels
        app.add(login, "login");
        app.add(menu, "menu");
        app.add(ComputerSearch, "Computer");
        app.add(employeeSearch, "employee");
        app.add(customerSearch, "customer");

        // Add the ComputerDealership action listener to each button
        login.login.addActionListener(this);
        menu.Computers.addActionListener(this);
        menu.customers.addActionListener(this);
        menu.staff.addActionListener(this);
        menu.exit.addActionListener(this);
        ComputerSearch.backToMenu.addActionListener(this);
        employeeSearch.backToMenu.addActionListener(this);
        customerSearch.backToMenu.addActionListener(this);
        ComputerSearch.viewButton.addActionListener(this);
        employeeSearch.viewButton.addActionListener(this);
        customerSearch.viewButton.addActionListener(this);

        // Pack the JFrame - this changes the size of the frame to match the largest panel
        frame.pack();
        // Now we've finished the GUI - show it to the user
        frame.setVisible(true);
    }

    // main - this is where the program starts
    public static void main(String[] args) {
        // causes the startframe to get constructed after any other AWT (swing) threads have been processed
        // This means that the app runs independantly instead of off the back of the static main
        SwingUtilities.invokeLater(() -> {
            // construct the current class - creating the starting frame
            ComputerDealership startFrame = new ComputerDealership();
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
                // If login successful then switch the panel Cards to the menu
                // reason for the "feature" of having to click Login twice
                if (login.done)
                    cl.show(app, "menu");
                break;
            }

            // if search Computers clicked switch panels to the Computer Search
            case("Search Computers"):{
                cl.show(app, "Computer");
                break;
            }

            // if search staff clicked switch panels to the Staff Search
            case("Search Staff"):{
                cl.show(app, "employee");
                break;
            }

            // if search customers clicked switch panels to the Customer Search
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
             * This case will take the user to the view screen for the currently
             * selected object from anyone of the Computer, Customer or Employee search
             * screens.
             *
             * It does this by first finding the currently shown Panel and then
             * getting the (SearchableObject) selected attribute out of that class
             *
             */
            case("View"):{
                // get active card by looping through layout and storing what is viable
                SearchableObject selected = null;

                // a for each loop to loop though each component inside the main frame
                for (Component comp: app.getComponents()) {
                    // check if the current component in the loop is visible
                    if (comp.isVisible()) {
                        // The view button is only found on the search page
                        // And this case would get run if the view button is clicked
                        // which means the visible component must be a search panel.

                        // Here the component is casted to a search panel so we can
                        // use it as if it was a search panel all along
                        Search searchPanel = (Search) comp;
                        // pull out the attribute that is stored as selected on the search
                        // page and store it in the selected variable to use it on for view
                        selected = searchPanel.selected;
                    }
                }

                // generate the view panel using the selected attribute
                View viewPanel = new View(selected);
                // Add the new view panel to the jframe
                app.add(viewPanel, "view");
                // Switch to it on the Card layout
                cl.show(app, "view");
                // add an actionlistener to go back to the menu
                viewPanel.backToMenu.addActionListener(this);

                break;
            }

            // This is for debugging purposes only, will throw an unsupported exception if code
            // has been written for action listener and it hasn't been written in the case switch
            default:
                throw new UnsupportedOperationException(
                        ae.getActionCommand() + " has not been implemented yet");
        }
    }
}
