package W3Schools.Table;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class TableUsingModel{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        JTable table = new JTable(new MyTableModel());

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        table.setRowHeight(80);
        table.getColumn(2).setPreferredWidth(200);

    }
}
class MyTableModel extends AbstractTableModel {
    String[] columnNames = {"Name", "Age", "Location"};

    Object[][] data = {
            {"Ken", (25), "Nairobi"},
            {"Tom", (31), "Geneva"},
            {"Sheila", (29), "Paris"},
            {"Mark",(20), "Cairo"},
            {"Jessie", (18), "Miami"}
    };

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

}