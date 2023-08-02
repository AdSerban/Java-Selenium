package W3Schools.Table;

import javax.swing.*;

class Table{
    public static void main(String args[]){
        JFrame frame = new JFrame();

        String[] columnNames = {"Name", "Age", "Student"};

        Object[][] data = {
                {"Ken", (5), (false)},
                {"Tom", (3), (true)},
                {"Susam", (2), (false)},
                {"Mark", (20), (true)},
                {"Joe",  (10), (false)}
        };
        JTable table = new JTable(data, columnNames);

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}