import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainJFrame extends JFrame{
    private PersonList personList;
    private HomeList homeList;
    private WorkList workList;
    

    public MainJFrame(){

        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Dimension size = new Dimension(140, 30); //set the same size

        //split panel
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(200);

        //left and right panel
        JPanel leftpanel = new JPanel();
        JPanel rightpanel = new JPanel();
        leftpanel.setBounds(0, 0, 200, 500);
        leftpanel.setBackground(Color.cyan);
        rightpanel.setBounds(200, 0, 600, 500);
        rightpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightpanel.setBackground(Color.pink);
        splitPane.setLeftComponent(leftpanel);
        splitPane.setRightComponent(rightpanel);

        //components in left panel
        JButton addButton = new JButton("Add Person");
        addButton.setPreferredSize(size);
        addButton.setLayout(new CardLayout());
        addButton.setHorizontalAlignment(SwingConstants.CENTER);

        JButton listButton = new JButton("List Person");
        listButton.setPreferredSize(size);
        listButton.setLayout(new CardLayout());
        listButton.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField searchField = new JTextField("Type name/address to search");
        searchField.setPreferredSize(size);
        searchField.setLayout(new CardLayout());
        searchField.setEditable(true);

        JButton searchButton = new JButton("Search Person");
        searchButton.setPreferredSize(size);
        searchButton.setLayout(new CardLayout());
        searchButton.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel titleLabel = new JLabel("Person Profile");
        titleLabel.setSize(200, 100);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 27));
        titleLabel.setLayout(new CardLayout());
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);


        leftpanel.add(titleLabel);
        leftpanel.add(addButton);
        leftpanel.add(listButton);
        leftpanel.add(searchField);
        leftpanel.add(searchButton);
        //leftpanel.add(operatePanel);
        //leftpanel.add(searchPanel);

        frame.add(leftpanel);

        //components in right panel
        JPanel namepanel = new JPanel();
        namepanel.setLayout(new GridLayout(-1, 4));
        namepanel.setBackground(Color.pink);
        rightpanel.setVisible(false);

        //components in name panel
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setHorizontalTextPosition(SwingConstants.LEFT);

        JLabel firstnameLabel = new JLabel("First Name");
        JTextField firstnameField = new JTextField();
        firstnameField.setPreferredSize(size);
        firstnameLabel.setLayout(new CardLayout());

        JLabel lastnameLabel = new JLabel("Last Name");
        JTextField lastnameField = new JTextField();
        lastnameField.setPreferredSize(size);

        JLabel studentnumberLabel = new JLabel("Student Number");
        JTextField studentnumberField = new JTextField();
        studentnumberField.setPreferredSize(size);

        JLabel ageLabel = new JLabel("Age");
        JTextField ageField = new JTextField();
        ageField.setPreferredSize(size);

        namepanel.add(firstnameLabel);
        namepanel.add(firstnameField);
        namepanel.add(lastnameLabel);
        namepanel.add(lastnameField);
        namepanel.add(studentnumberLabel);
        namepanel.add(studentnumberField);
        namepanel.add(ageLabel);
        namepanel.add(ageField);


        JPanel homepanel = new JPanel();
        homepanel.setLayout(new GridLayout(-1, 4));
        homepanel.setBackground(Color.pink);

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


        JPanel workpanel = new JPanel();
        workpanel.setLayout(new GridLayout(-1, 4));
        workpanel.setBackground(Color.pink);

        JLabel worklabel = new JLabel("Work Address");
        worklabel.setFont(new Font("Arial", Font.BOLD, 15));
        worklabel.setHorizontalAlignment(SwingConstants.LEFT);

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


        JPanel buttonpanel = new JPanel();
        //buttonpanel.setLayout(new GridLayout(2,1));
        //buttonpanel.setBounds(400,500,100,50);
        buttonpanel.setBackground(Color.pink);

        JButton createButton = new JButton("Create");
        createButton.setPreferredSize(size);

        JButton updateButton = new JButton("Update");
        updateButton.setPreferredSize(size);


        buttonpanel.add(createButton);
        buttonpanel.add(updateButton);

        rightpanel.add(nameLabel);
        rightpanel.add(namepanel);
        rightpanel.add(homelabel);
        rightpanel.add(homepanel);
        rightpanel.add(worklabel);
        rightpanel.add(workpanel);
        rightpanel.add(buttonpanel);


        JTable list = new JTable();
        setTitle("List Persons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
/*
        //Person data = personList.addPerson(new Person("jin", "wang", "0023", 24));
        String[] column_name = {"First Name", "Last Name", "Student Number", "Age"};
        JTable table = new JTable(new DefaultTableModel(new Person( , column_name));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        scrollPane.setVisible(false);
 */

        frame.add(rightpanel);
        frame.add(splitPane);
        //frame.add(scrollPane);

        frame.setResizable(false);
        frame.setVisible(true);

        //add button functions

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightpanel.setVisible(true);
            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // scrollPane.setVisible(true);
                list.setVisible(true);
                //table.setVisible(true);

            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = searchField.getText();
                Person found1 = personList.searchPerson(query);
                Home found2 = homeList.searchHome(query);
                Work found3 = workList.searchWork(query);
                if (found1 != null || found2 != null || found3 != null) {
                    rightpanel.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(frame, "No match found");
                }
            }
        });

        //updateButton
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String first_name = firstnameField.getText();
                String last_name = lastnameField.getText();
                String student_number = studentnumberField.getText();
                int age = Integer.parseInt(ageField.getText());
                String home_addr1 = homeaddr1field.getText();
                String home_addr2 = homeaddr2field.getText();
                String city = cityfield.getText();
                String state = statefield.getText();
                String zip = zipfield.getText();
                long phone = Long.parseLong(phonefield.getText());
                String work_addr1 = workaddr1field.getText();
                String work_addr2 = workaddr2field.getText();
                String work_city = cityfield.getText();
                String work_state = statefield.getText();
                String work_zip = zipfield.getText();
                long fax = Long.parseLong(faxfield.getText());



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

//createButton
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String first_name = firstnameField.getText();
                String last_name = lastnameField.getText();
                String student_number = studentnumberField.getText();
                int age = Integer.parseInt(ageField.getText());
                String home_addr1 = homeaddr1field.getText();
                String home_addr2 = homeaddr2field.getText();
                String city = cityfield.getText();
                String state = statefield.getText();
                String zip = zipfield.getText();
                long phone = Long.parseLong(phonefield.getText());
                String work_addr1 = workaddr1field.getText();
                String work_addr2 = workaddr2field.getText();
                String work_city = cityfield.getText();
                String work_state = statefield.getText();
                String work_zip = zipfield.getText();
                long fax = Long.parseLong(faxfield.getText());



                Person newPerson = new Person(first_name, last_name, student_number, age);
                personList.addPerson(newPerson);

                personList.addPerson(new Person(first_name, last_name, student_number, age));
                homeList.addHome(new Home(home_addr1, home_addr2, city, state, zip, phone));
                workList.addWork(new Work(work_addr1, work_addr2, work_city, work_state, work_zip, fax));


                JOptionPane.showMessageDialog(frame, "Operation Submitted!", "Success", JOptionPane.PLAIN_MESSAGE);

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


    }
}
