import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

class LoginDetails {
    String username;
    String password;

    public LoginDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
/**
 * Login extends JPanel
 *
 * This is the class for the login page, this extends JPanel so that it can be
 * like any other JPanel and added to object like JFrames
 */
public class Login extends javax.swing.JPanel {
    // ArrayList is marked as final because it is never changed
    private String username, password;
    boolean done = false;
    ArrayList<LoginDetails> employees;

    /**
     * Creates new form Login, this is based of Netbeans GUI and contains
     * generated code that cannot be commented or it will be regenerated.
     * @param userFileName A file containing user data
     * the usernames
     */
    Login(String userFileName) {
        // read the user name and passwords from a file

        /*
            Format

            user pass
            user2 pass123
         */
        File userFile = new File(userFileName);

        employees = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(new FileInputStream(userFile));

            // move each line of the file into the array
            while (fileScanner.hasNext()) {
                employees.add(new LoginDetails(fileScanner.next(), fileScanner.next()));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");

            System.exit(1);
        } catch (NoSuchElementException e) {
            System.err.println("File is in wrong format");
            System.exit(1);
        }

        // Call the method that will construct the components of the UI
        initComponents();
    }

    /**
     * This is the method that is generated by Netbeans that will create the
     * components that will be shown to the user. These components include the
     * panel that will hold the class, the labels for the fields, the texts
     * fields, and the JButtons for the help and the login.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("User ID");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Computer dealership ");

        usernameField.setMinimumSize(new java.awt.Dimension(70, 21));
        usernameField.setName(""); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        passwordField.setMinimumSize(new java.awt.Dimension(70, 21));
        passwordField.setName(""); // NOI18N
        passwordField.setPreferredSize(new java.awt.Dimension(70, 21));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        message.setForeground(new java.awt.Color(250, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        message.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        message.setFocusTraversalPolicyProvider(true);
        message.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        message.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(login))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // This is the method that is called when the login button is clicked
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // Gets the entered data so it can be used in the filter
        username = usernameField.getText();
        password = passwordField.getText();

        // Filter out the employee records to find the entered username
        // This is where the employee will be stored when it is found
        LoginDetails matchedEmployee =
          // convert the employees to a stream so it can be filtered
          employees.stream()
            // here `e` is each instance of an employee in the stream
            // remove all of the records that don't match the critera
            // The critea being that the entered username must match the one on the employee
            .filter(e -> e.username.equalsIgnoreCase(username))
            // now the stream should only contain the ones with the entered username
            // Pull the entire employee object out of the first in the stream
            // store that in the matched employee variable
            .findFirst()
            // if non are found then matched employee is null
            .orElse(null);

        // set found username - as filter alows partial matches
        try {
            // this will get a NullPointerException if there were no matches
            username = matchedEmployee.username;
        } catch (NullPointerException e){
            // Show a warning if no username matches
            showWarning();
            // return early because the rest of the code is of no use
            return;
        }

        // Object.equals() returns a boolean
        // the done variable wants to be true if the the employees password equals the entered pass
        // so we can just call the method an put the output straight into done
        // if password matches then set the status to done
        done = matchedEmployee.password.equals(password);
        // if password doesn't match then show a warning
        if(!done) showWarning();
    }//GEN-LAST:event_loginActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
    }//GEN-LAST:event_usernameFieldActionPerformed

    // If help button pressed then show the help modal
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "This is the Computer dealership app "
            + "with this you can easily search and view different Computers and customers.\n "
            + "To use the app you will need to login with correct credentials, "
            + "for maintainence use only you can login with username 'admin'\n "
            + "and password 'admin', this will allow you to see and use all the "
            + "functionality of the app. When you login you will be taken to a menu\n "
            + "where you will be able to choose what you would like to search for. "
            + "When on a search page you will be able to see a list of Computers,\n "
            + "customers or employees that you can search through. "
            + "To use the search simply enter a few letters (or words) that you\n "
            + "want to search for. Whenever you can see any results on the page, "
            + "you can click on one and click the view button to show all its details.");
    }//GEN-LAST:event_jButton1ActionPerformed

    // method that clears the login fields, called after logging out
    public void clearLoginFields(){
        // set the texts to empty strings
        passwordField.setText("");
        usernameField.setText("");
        // empty the error message
        message.setText("");
        // mark the form as not done
        done = false;
    }

    // Shows the warning after incorrect creds
    private void showWarning(){
        message.setText("<html><center>Incorrect username or password!</center></html>");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton login;
    private javax.swing.JLabel message;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
