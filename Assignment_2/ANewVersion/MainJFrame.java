package ANewVersion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainJFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel rightpanel;
    private PersonList personList;
    private ArrayList<Persons> people;
    private String[][] data;
    private DefaultTableModel tableModel;
    private JTable table;

    Persons foundPerson;


    String first_name;
    String last_name;
    String student_number;
    String age;
    String home_addr1;
    String home_addr2;
    String city;
    String state;
    String zip;
    String phone;
    String work_addr1;
    String work_addr2;
    String work_city;
    String work_state;
    String work_zip;
    String fax;

    public MainJFrame() {

        personList = new PersonList();

        // Set up the main frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        Dimension size = new Dimension(140, 30);
        setLocationRelativeTo(null);

        // Create a JSplitPane
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLocation(200, 0);
        splitPane.setDividerLocation(200);
        splitPane.setVisible(true);


        // Create the left panel
        JPanel leftpanel = new JPanel();
        leftpanel.setPreferredSize(new Dimension(200, 600));

        // Initialize the right panel with CardLayout
        rightpanel = new JPanel();
        cardLayout = new CardLayout();
        rightpanel.setLayout(cardLayout);

        // Create the panels for different cards
        JPanel addpanel = new JPanel();

//inside add panel
        //person panel inside add panel
        JPanel personpanel = new JPanel();
        personpanel.setPreferredSize(new Dimension(550, 100));
        personpanel.setLayout(new GridLayout(2, 4));
        personpanel.setBackground(Color.lightGray);

        JLabel nameLabel = new JLabel("Basic Information");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setHorizontalTextPosition(SwingConstants.LEFT);

        JLabel firstnameLabel = new JLabel("First Name");
        JTextField firstnameField = new JTextField();
        firstnameField.setPreferredSize(size);

        JLabel lastnameLabel = new JLabel("Last Name");
        JTextField lastnameField = new JTextField();
        lastnameField.setPreferredSize(size);

        JLabel studentnumberLabel = new JLabel("Student Number");
        JTextField studentnumberField = new JTextField();
        studentnumberField.setPreferredSize(size);

        JLabel ageLabel = new JLabel("Age");
        JTextField ageField = new JTextField();
        ageField.setPreferredSize(size);

        personpanel.add(firstnameLabel);
        personpanel.add(firstnameField);
        personpanel.add(lastnameLabel);
        personpanel.add(lastnameField);
        personpanel.add(studentnumberLabel);
        personpanel.add(studentnumberField);
        personpanel.add(ageLabel);
        personpanel.add(ageField);

        //home panel inside add panel
        JPanel homepanel = new JPanel(new GridLayout(3, 4));
        homepanel.setPreferredSize(new Dimension(550, 150));
        homepanel.setBackground(Color.GRAY);

        JLabel homelabel = new JLabel("Home Address");
        homelabel.setFont(new Font("Arial", Font.BOLD, 15));
        homelabel.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel homeaddr1label = new JLabel("Address1");
        JTextField homeaddr1field = new JTextField();
        homeaddr1field.setPreferredSize(size);

        JLabel homeaddr2label = new JLabel("Address2");
        JTextField homeaddr2field = new JTextField();
        homeaddr2field.setPreferredSize(size);

        JLabel citylabel = new JLabel("City");
        JTextField cityfield = new JTextField();
        cityfield.setPreferredSize(size);

        JLabel statelabel = new JLabel("State");
        JTextField statefield = new JTextField();
        statefield.setPreferredSize(size);

        JLabel ziplabel = new JLabel("Zip");
        JTextField zipfield = new JTextField();
        zipfield.setPreferredSize(size);

        JLabel phonelabel = new JLabel("Phone Number");
        JTextField phonefield = new JTextField();
        phonefield.setPreferredSize(size);

        homepanel.add(homeaddr1label);
        homepanel.add(homeaddr1field);
        homepanel.add(homeaddr2label);
        homepanel.add(homeaddr2field);
        homepanel.add(citylabel);
        homepanel.add(cityfield);
        homepanel.add(statelabel);
        homepanel.add(statefield);
        homepanel.add(ziplabel);
        homepanel.add(zipfield);
        homepanel.add(phonelabel);
        homepanel.add(phonefield);

        //work panel inside add panel
        JPanel workpanel = new JPanel(new GridLayout(3, 4));
        workpanel.setPreferredSize(new Dimension(550, 150));
        workpanel.setBackground(Color.lightGray);

        JLabel worklabel = new JLabel("Work Address");
        worklabel.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel workaddr1label = new JLabel("Address1");
        JTextField workaddr1field = new JTextField();
        workaddr1field.setPreferredSize(size);

        JLabel workaddr2label = new JLabel("Address2");
        JTextField workaddr2field = new JTextField();
        workaddr2field.setPreferredSize(size);

        JLabel wcitylabel = new JLabel("City");
        JTextField wcityfield = new JTextField();
        wcityfield.setPreferredSize(size);

        JLabel wstatelabel = new JLabel("State");
        JTextField wstatefield = new JTextField();
        wstatefield.setPreferredSize(size);

        JLabel wziplabel = new JLabel("Zip");
        JTextField wzipfield = new JTextField();
        wzipfield.setPreferredSize(size);

        JLabel faxlabel = new JLabel("Fax Number");
        JTextField faxfield = new JTextField();
        faxfield.setPreferredSize(size);

        workpanel.add(workaddr1label);
        workpanel.add(workaddr1field);
        workpanel.add(workaddr2label);
        workpanel.add(workaddr2field);
        workpanel.add(wcitylabel);
        workpanel.add(wcityfield);
        workpanel.add(wstatelabel);
        workpanel.add(wstatefield);
        workpanel.add(wziplabel);
        workpanel.add(wzipfield);
        workpanel.add(faxlabel);
        workpanel.add(faxfield);

        JButton createbutton = new JButton("Create");
        createbutton.setPreferredSize(size);

        addpanel.add(nameLabel);
        addpanel.add(personpanel);
        addpanel.add(homelabel);
        addpanel.add(homepanel);
        addpanel.add(worklabel);
        addpanel.add(workpanel);
        addpanel.add(createbutton);


//list panel
        JPanel listpanel = new JPanel();
        listpanel.add(new JLabel("List Persons"));
        listpanel.setLayout(new BorderLayout());

        Persons person1 = new Persons(
                "Alice", "Smith", "00123", "20", "123 Main St", "Apt 4B", "Springfield", "IL", "62701", "555-1234",
                "456 Elm St", "Suite 2", "Springfield", "IL", "62702", "555-5678");
        Persons person2 = new Persons(
                "Bob", "Johnson", "00456", "22", "789 Maple Ave", "", "Lincoln", "NE", "68508", "555-9876",
                "321 Oak St", "", "Lincoln", "NE", "68509", "555-6543");
        Persons person3 = new Persons(
                "Carol", "Williams", "00789", "21", "555 Birch Blvd", "", "Denver", "CO", "80203", "555-3456",
                "987 Pine St", "", "Denver", "CO", "80204", "555-8765");
        Persons person4 = new Persons(
                "David", "Brown", "01234", "23", "234 Cedar St", "", "Seattle", "WA", "98101", "555-4321",
                "654 Spruce St", "", "Seattle", "WA", "98102", "555-7890");
        Persons person5 = new Persons(
                "Emily", "Davis", "05678", "24", "345 Oak Ln", "", "Austin", "TX", "78701", "555-6789",
                "567 Willow Dr", "", "Austin", "TX", "78702", "555-2345");

        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);
        personList.addPerson(person4);
        personList.addPerson(person5);

        String[] columns = {"First Name", "Last Name", "Home City", "Home Zip", "Work City", "Work Zip"};
        data = personList.toArray();
        tableModel = new DefaultTableModel(data, columns);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);


        //table inside list panel

//left panel

        JLabel titlelabel = new JLabel("Person Profile");
        titlelabel.setSize(200, 100);
        titlelabel.setFont(new Font("Arial", Font.BOLD, 27));
        leftpanel.add(titlelabel);

        // Buttons to switch between cards
        JButton addbutton = new JButton("Add Person");
        addbutton.addActionListener(e -> cardLayout.show(rightpanel, "Add Person"));
        addbutton.setPreferredSize(new Dimension(150, 30));
        leftpanel.add(addbutton);

        JButton listbutton = new JButton("List Person");
        listbutton.addActionListener(e -> cardLayout.show(rightpanel, "List Persons"));
        listbutton.setPreferredSize(new Dimension(150, 30));
        leftpanel.add(listbutton);

        //search field in left panel
        JTextField searchfield = new JTextField();
        searchfield.setPreferredSize(new Dimension(150, 30));

        JButton searchbutton = new JButton("Search");
        searchbutton.addActionListener(e -> cardLayout.show(rightpanel, "Search"));
        searchbutton.setPreferredSize(new Dimension(150, 30));


        createbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                first_name = firstnameField.getText();
                last_name = lastnameField.getText();
                student_number = studentnumberField.getText();
                age = ageField.getText();
                home_addr1 = homeaddr1field.getText();
                home_addr2 = homeaddr2field.getText();
                city = cityfield.getText();
                state = statefield.getText();
                zip = zipfield.getText();
                phone = phonefield.getText();
                work_addr1 = workaddr1field.getText();
                work_addr2 = workaddr2field.getText();
                work_city = wcityfield.getText();
                work_state = wstatefield.getText();
                work_zip = wzipfield.getText();
                fax = faxfield.getText();

                Persons newPerson = new Persons(first_name, last_name, student_number, age, home_addr1, home_addr2, city, state, zip, phone, work_addr1, work_addr2, work_city, work_state, work_zip, fax);
                personList.addPerson(newPerson);

                //System.out.println(personList);

                data = personList.toArray();
                tableModel.addRow(newPerson.toStringArray());

                //Person newPerson = new Person(first_name, last_name, student_number, age, home_addr1, home_addr2, city, state, zip, phone, work_addr1, work_addr2, work_city, work_state, work_zip, fax);addperson

                if (!first_name.isEmpty() && !last_name.isEmpty()) {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "New Person Created !", "Success", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Please fill in fields.");
                }

                firstnameField.setText("");
                lastnameField.setText("");
                studentnumberField.setText("");
                ageField.setText("");
                homeaddr1field.setText("");
                homeaddr2field.setText("");
                cityfield.setText("");
                statefield.setText("");
                zipfield.setText("");
                phonefield.setText("");
                workaddr1field.setText("");
                workaddr2field.setText("");
                wcityfield.setText("");
                wstatefield.setText("");
                wzipfield.setText("");
                faxfield.setText("");
            }

        });

        leftpanel.add(searchfield);
        leftpanel.add(searchbutton);

        //search panel
        JPanel searchpanel = new JPanel();

        JPanel spersonpanel = new JPanel();
        spersonpanel.setPreferredSize(new Dimension(550, 100));
        spersonpanel.setLayout(new GridLayout(2, 4));
        spersonpanel.setBackground(Color.lightGray);

        JLabel snameLabel = new JLabel("Basic Information");
        snameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        snameLabel.setHorizontalTextPosition(SwingConstants.LEFT);

        JLabel sfirstnameLabel = new JLabel("First Name");
        JTextField sfirstnameField = new JTextField();
        sfirstnameField.setPreferredSize(size);

        JLabel slastnameLabel = new JLabel("Last Name");
        JTextField slastnameField = new JTextField();
        slastnameField.setPreferredSize(size);

        JLabel sstudentnumberLabel = new JLabel("Student Number");
        JTextField sstudentnumberField = new JTextField();
        sstudentnumberField.setPreferredSize(size);

        JLabel sageLabel = new JLabel("Age");
        JTextField sageField = new JTextField();
        sageField.setPreferredSize(size);

        spersonpanel.add(sfirstnameLabel);
        spersonpanel.add(sfirstnameField);
        spersonpanel.add(slastnameLabel);
        spersonpanel.add(slastnameField);
        spersonpanel.add(sstudentnumberLabel);
        spersonpanel.add(sstudentnumberField);
        spersonpanel.add(sageLabel);
        spersonpanel.add(sageField);

        //home panel inside search panel
        JPanel shomepanel = new JPanel(new GridLayout(3, 4));
        shomepanel.setPreferredSize(new Dimension(550, 150));
        shomepanel.setBackground(Color.GRAY);

        JLabel shomelabel = new JLabel("Home Address");
        shomelabel.setFont(new Font("Arial", Font.BOLD, 15));
        shomelabel.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel shomeaddr1label = new JLabel("Address1");
        JTextField shomeaddr1field = new JTextField();
        shomeaddr1field.setPreferredSize(size);

        JLabel shomeaddr2label = new JLabel("Address2");
        JTextField shomeaddr2field = new JTextField();
        shomeaddr2field.setPreferredSize(size);

        JLabel scitylabel = new JLabel("City");
        JTextField scityfield = new JTextField();
        scityfield.setPreferredSize(size);

        JLabel sstatelabel = new JLabel("State");
        JTextField sstatefield = new JTextField();
        sstatefield.setPreferredSize(size);

        JLabel sziplabel = new JLabel("Zip");
        JTextField szipfield = new JTextField();
        szipfield.setPreferredSize(size);

        JLabel sphonelabel = new JLabel("Phone Number");
        JTextField sphonefield = new JTextField();
        sphonefield.setPreferredSize(size);

        shomepanel.add(shomeaddr1label);
        shomepanel.add(shomeaddr1field);
        shomepanel.add(shomeaddr2label);
        shomepanel.add(shomeaddr2field);
        shomepanel.add(scitylabel);
        shomepanel.add(scityfield);
        shomepanel.add(sstatelabel);
        shomepanel.add(sstatefield);
        shomepanel.add(sziplabel);
        shomepanel.add(szipfield);
        shomepanel.add(sphonelabel);
        shomepanel.add(sphonefield);

        //work panel inside search panel
        JPanel sworkpanel = new JPanel(new GridLayout(3, 4));
        sworkpanel.setPreferredSize(new Dimension(550, 150));
        sworkpanel.setBackground(Color.lightGray);

        JLabel sworklabel = new JLabel("Work Address");
        sworklabel.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel sworkaddr1label = new JLabel("Address1");
        JTextField sworkaddr1field = new JTextField();
        sworkaddr1field.setPreferredSize(size);

        JLabel sworkaddr2label = new JLabel("Address2");
        JTextField sworkaddr2field = new JTextField();
        sworkaddr2field.setPreferredSize(size);

        JLabel swcitylabel = new JLabel("City");
        JTextField swcityfield = new JTextField();
        swcityfield.setPreferredSize(size);

        JLabel swstatelabel = new JLabel("State");
        JTextField swstatefield = new JTextField();
        swstatefield.setPreferredSize(size);

        JLabel swziplabel = new JLabel("Zip");
        JTextField swzipfield = new JTextField();
        swzipfield.setPreferredSize(size);

        JLabel sfaxlabel = new JLabel("Fax Number");
        JTextField sfaxfield = new JTextField();
        sfaxfield.setPreferredSize(size);

        sworkpanel.add(sworkaddr1label);
        sworkpanel.add(sworkaddr1field);
        sworkpanel.add(sworkaddr2label);
        sworkpanel.add(sworkaddr2field);
        sworkpanel.add(swcitylabel);
        sworkpanel.add(swcityfield);
        sworkpanel.add(swstatelabel);
        sworkpanel.add(swstatefield);
        sworkpanel.add(swziplabel);
        sworkpanel.add(swzipfield);
        sworkpanel.add(sfaxlabel);
        sworkpanel.add(sfaxfield);

        JButton updatebutton = new JButton("Update");
        updatebutton.setPreferredSize(size);
        JButton deletebutton = new JButton("Delete");
        deletebutton.setPreferredSize(size);

        searchpanel.add(snameLabel);
        searchpanel.add(spersonpanel);
        searchpanel.add(shomelabel);
        searchpanel.add(shomepanel);
        searchpanel.add(sworklabel);
        searchpanel.add(sworkpanel);
        searchpanel.add(updatebutton);
        searchpanel.add(deletebutton);

        searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchfield.getText().toLowerCase();

                if (searchText.isEmpty()) {
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Please enter a Name/Address");

                } else {
                    searchfield.setText("");

                    // Search for the person
                    boolean found = false;
                    for (Persons person : personList.getAllPersons()) {
                        if (person.getFirst_name().toLowerCase().equals(searchText) ||
                                person.getLast_name().toLowerCase().equals(searchText) ||
                                person.getHome_addr1().toLowerCase().equals(searchText) ||
                                person.getWork_addr1().toLowerCase().equals(searchText)) {

                            foundPerson = new Persons(person.getFirst_name(), person.getLast_name(), person.getStudent_number(), person.getAge(), person.getHome_addr1(), person.getHome_addr2(), person.getCity(), person.getState(), person.getZip(), person.getPhone(), person.getWork_addr1(), person.getWork_addr2(), person.getWork_city(), person.getWork_state(), person.getWork_zip(), person.getFax());
                            // Populate the text fields with the found person's details
                            sfirstnameField.setText(person.getFirst_name());
                            slastnameField.setText(person.getLast_name());
                            sstudentnumberField.setText(person.getStudent_number());
                            sageField.setText(person.getAge());
                            shomeaddr1field.setText(person.getHome_addr1());
                            shomeaddr2field.setText(person.getHome_addr2());
                            scityfield.setText(person.getCity());
                            sstatefield.setText(person.getState());
                            szipfield.setText(person.getZip());
                            sphonefield.setText(person.getPhone());
                            sworkaddr1field.setText(person.getWork_addr1());
                            sworkaddr2field.setText(person.getWork_addr2());
                            swcityfield.setText(person.getWork_city());
                            swstatefield.setText(person.getWork_state());
                            swzipfield.setText(person.getWork_zip());
                            sfaxfield.setText(person.getFax());
                            foundPerson = person; //
                            found = true;
                            break; // Exit loop after finding the person
                        }
                    }
                    if (!found) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "No match found", "Search Result", JOptionPane.WARNING_MESSAGE);
                        foundPerson = null;

                        sfirstnameField.setText("");
                        slastnameField.setText("");
                        sstudentnumberField.setText("");
                        sageField.setText("");
                        shomeaddr1field.setText("");
                        shomeaddr2field.setText("");
                        scityfield.setText("");
                        sstatefield.setText("");
                        szipfield.setText("");
                        sphonefield.setText("");
                        sworkaddr1field.setText("");
                        sworkaddr2field.setText("");
                        swcityfield.setText("");
                        swstatefield.setText("");
                        swzipfield.setText("");
                        sfaxfield.setText("");

                    }
                }
            }
        });

        deletebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstnameField.getText();
                String lastName = lastnameField.getText();
                String studentNumber = studentnumberField.getText();
                String age = ageField.getText();
                String homeAddr1 = homeaddr1field.getText();
                String homeAddr2 = homeaddr2field.getText();
                String city = cityfield.getText();
                String state = statefield.getText();
                String zip = zipfield.getText();
                String phone = phonefield.getText();
                String workAddr1 = workaddr1field.getText();
                String workAddr2 = workaddr2field.getText();
                String workCity = wcityfield.getText();
                String workState = wstatefield.getText();
                String workZip = wzipfield.getText();
                String fax = faxfield.getText();

                // Assuming 'foundPerson' is the currently selected person
                if (foundPerson != null) {
                    int confirm = JOptionPane.showConfirmDialog(MainJFrame.this,
                            "Are you sure you want to delete this person?",
                            "Confirm Deletion", JOptionPane.YES_NO_OPTION);

                    if (confirm == JOptionPane.YES_OPTION) {
                        // Remove the person from the list
                        personList.removePerson(foundPerson);

                        foundPerson.setFirst_name(firstName);
                        foundPerson.setLast_name(lastName);
                        foundPerson.setStudent_number(studentNumber);
                        foundPerson.setAge(age);
                        foundPerson.setHome_addr1(homeAddr1);
                        foundPerson.setHome_addr2(homeAddr2);
                        foundPerson.setCity(city);
                        foundPerson.setState(state);
                        foundPerson.setZip(zip);
                        foundPerson.setPhone(phone);
                        foundPerson.setWork_addr1(workAddr1);
                        foundPerson.setWork_addr2(workAddr2);
                        foundPerson.setWork_city(workCity);
                        foundPerson.setWork_state(workState);
                        foundPerson.setWork_zip(workZip);
                        foundPerson.setFax(fax);

                    }
                }

                if (foundPerson != null) {
                    // Notify the user
                    JOptionPane.showMessageDialog(MainJFrame.this, "Deleted successfully.", "Delete", JOptionPane.INFORMATION_MESSAGE);

                    data = personList.toArray();
                    updateTable();

                    sfirstnameField.setText("");
                    slastnameField.setText("");
                    sstudentnumberField.setText("");
                    sageField.setText("");
                    shomeaddr1field.setText("");
                    shomeaddr2field.setText("");
                    scityfield.setText("");
                    sstatefield.setText("");
                    szipfield.setText("");
                    sphonefield.setText("");
                    sworkaddr1field.setText("");
                    sworkaddr2field.setText("");
                    swcityfield.setText("");
                    swstatefield.setText("");
                    swzipfield.setText("");
                    sfaxfield.setText("");
                } else {
                    JOptionPane.showMessageDialog(MainJFrame.this, "No person selected", "Delete Error", JOptionPane.ERROR_MESSAGE);
                }
                //System.out.println(personList);
            }
        });

        updatebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String firstName = sfirstnameField.getText();
                String lastName = slastnameField.getText();
                String studentNumber = sstudentnumberField.getText();
                String age = sageField.getText();
                String homeAddr1 = shomeaddr1field.getText();
                String homeAddr2 = shomeaddr2field.getText();
                String city = scityfield.getText();
                String state = sstatefield.getText();
                String zip = szipfield.getText();
                String phone = sphonefield.getText();
                String workAddr1 = sworkaddr1field.getText();
                String workAddr2 = sworkaddr2field.getText();
                String workCity = swcityfield.getText();
                String workState = swstatefield.getText();
                String workZip = swzipfield.getText();
                String fax = sfaxfield.getText();

                if (foundPerson != null) {
                    foundPerson.setFirst_name(firstName);
                    foundPerson.setLast_name(lastName);
                    foundPerson.setStudent_number(studentNumber);
                    foundPerson.setAge(age);
                    foundPerson.setHome_addr1(homeAddr1);
                    foundPerson.setHome_addr2(homeAddr2);
                    foundPerson.setCity(city);
                    foundPerson.setState(state);
                    foundPerson.setZip(zip);
                    foundPerson.setPhone(phone);
                    foundPerson.setWork_addr1(workAddr1);
                    foundPerson.setWork_addr2(workAddr2);
                    foundPerson.setWork_city(workCity);
                    foundPerson.setWork_state(workState);
                    foundPerson.setWork_zip(workZip);
                    foundPerson.setFax(fax);


                    JOptionPane.showMessageDialog(MainJFrame.this, "Updated successfully.", "Update", JOptionPane.INFORMATION_MESSAGE);
                    updateTable();


                    // Clear input fields
                    sfirstnameField.setText("");
                    slastnameField.setText("");
                    sstudentnumberField.setText("");
                    sageField.setText("");
                    shomeaddr1field.setText("");
                    shomeaddr2field.setText("");
                    scityfield.setText("");
                    sstatefield.setText("");
                    szipfield.setText("");
                    sphonefield.setText("");
                    sworkaddr1field.setText("");
                    sworkaddr2field.setText("");
                    swcityfield.setText("");
                    swstatefield.setText("");
                    swzipfield.setText("");
                    sfaxfield.setText("");
                    foundPerson = null; // Reset foundPerson

                } else {
                    JOptionPane.showMessageDialog(MainJFrame.this, "No person selected", "Update Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });


        // Add cards to the right panel with their names
        rightpanel.add(addpanel, "Add Person");
        rightpanel.add(listpanel, "List Persons");
        rightpanel.add(searchpanel, "Search");

        listpanel.add(scrollPane, BorderLayout.CENTER);
        table.setBackground(Color.pink);

        // Add the panels to the split pane
        splitPane.setLeftComponent(leftpanel);
        splitPane.setRightComponent(rightpanel);

        // Add the split pane to the main frame
        add(splitPane);

        // Set the frame visibility
        setVisible(true);

    }
    private void updateTable() {
        tableModel.setRowCount(0); // Clear existing rows

        // Populate the table with data from personList
        for (Persons person : personList.getAllPersons()) {
            String[] rowData = {
                    person.getFirst_name(),
                    person.getLast_name(),
                    person.getCity(),
                    person.getZip(),
                    person.getWork_city(),
                    person.getWork_zip()
            };
            tableModel.addRow(rowData);
        }
    }

}