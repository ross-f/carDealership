import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.AbstractListModel;

/**
 * Search class provides a GUI for searching though any object that extends
 * SearchableObject, any object can be searched as long as it was constucted
 * with the name attirbute. Construct this panel with an ArrayList of objects
 * that extend a SearchableObjects and it will build a Search JPanel
 */
public class Search extends javax.swing.JPanel {
    // generic type means that you can pass though anything that is based off a searchable object
    ArrayList<? extends SearchableObject> objectToSearch;
    ArrayList<? extends SearchableObject> results;
    AbstractListModel<String> resultsList;
    boolean hasBeenSearch;
    // Made public as it's pulled out in the event listeners to build the View class
    public SearchableObject selected;

    // Constructs the search JPanel can be constucted with anything that extends searchable object
    public Search(ArrayList<? extends SearchableObject> objectToSearch) {
        resultsList = new AbstractListModel<String>() {
            @Override
            public int getSize() {
                return objectToSearch.size();
            }

            @Override
            public String getElementAt(int i) {
                return objectToSearch.get(i).name;
            }
        };

        this.objectToSearch = objectToSearch;
        // Netbeans code to make the inital components
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        backToMenu = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jList1.setModel(resultsList);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Results");

        backToMenu.setText("←");
        backToMenu.setMargin(new java.awt.Insets(2, 1, 2, 1));
        backToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        viewButton.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(viewButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton)
                    .addComponent(backToMenu))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewButton)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method that is called when the search button is pressed.
     * This is very similar to the loginActionPerformed method in the Login class
     * as they both filter array lists based on entered values.
     */
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // Gets the entered data so it can be used in the filter
        String searchText = SearchField.getText().toLowerCase();

        // Filter the list of objects to find one that contains the searchText
        // results is where the data will be stored after it's been filtered
        results = objectToSearch
                // convert the list of objects to a stream so we can filter them
                .stream()
                // here i is each instance of the object in the stream
                // remove all of the records that don't match the critera
                // The critea being that the name attribute must contain the search text
                .filter((i) -> i.name.toLowerCase().contains(searchText))
                // collect the result of this stream to a new arraylist
                // so that it can be converted to an abstract list again
                .collect(Collectors.toCollection(ArrayList::new));


        // Set the results list by overriding the abstract list methods
        resultsList = new AbstractListModel<String>() {
            @Override
            public int getSize() {
                return results.size();
            }

            @Override
            public String getElementAt(int i) {
                return results.get(i).name;
            }
        };

        jList1.setModel(resultsList);
        hasBeenSearch = true;
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void backToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuActionPerformed
    }//GEN-LAST:event_backToMenuActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        viewButton.setVisible(true);
        selected = hasBeenSearch ? results.get(evt.getLastIndex()) : objectToSearch.get(evt.getLastIndex());
    }//GEN-LAST:event_jList1ValueChanged

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    public javax.swing.JButton backToMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
