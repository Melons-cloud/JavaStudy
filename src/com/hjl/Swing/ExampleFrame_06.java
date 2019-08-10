package com.hjl.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExampleFrame_06 extends JFrame {
    //定义表格模型对象
    private DefaultTableModel tableModel;
    //定义表格对象
    private JTable table;
    private JTextField aTextField;
    private JTextField bTextField;

    public static void main(String[] args) {
        ExampleFrame_06 frame = new ExampleFrame_06();
        frame.setVisible(true);
    }
    public ExampleFrame_06(){

        super();
        setTitle("维护表格模型");
        setBounds(100,100,510,375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JScrollPane scrollPane =new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        //定义表格列名数组
        String[] columnNames={"A","B"};
        //定义表格数据数组
        String[][] tableValues={{"A1","B1"},{"A2"},{"B2"},{"A3","B3"}};
        //创建指定表格模型的表格
        table = new JTable(tableModel);
        //设置表格的排序器
        table.setRowSorter(new TableRowSorter<>(tableModel));
        //设置表格的选择模式为单选
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //为表格添加鼠标监听器
        table.addMouseListener(new MouseAdapter() {
            //发生了单击事件

            public void mouseClicked(MouseEvent e) {
                //获得被选中行的索引
                int selectedRow =table.getSelectedRow();
                //从表格模型中获取指定单元格的值
                Object oa =tableModel.getValueAt(selectedRow,0);
                Object ob =tableModel.getValueAt(selectedRow,1);
                //将值赋给文本框
                aTextField.setText(oa.toString());
                bTextField.setText(ob.toString());
            }
        });

        scrollPane.setViewportView(table);
        final JPanel panel = new JPanel();
        getContentPane().add(panel,BorderLayout.SOUTH);
        panel.add(new JLabel("A:"));
        aTextField=new JTextField("A4",10);
        panel.add(aTextField);
        panel.add(new JLabel("B: "));
        bTextField=new JTextField("B4",10);
        panel.add(bTextField);
        final JButton addButton =new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //创建表格行数数组
                String[] rowValues ={aTextField.getText(),bTextField.getText()};
                //向表格模型中添加一行
                try {
                    tableModel.addRow(rowValues);
                }catch (Exception e1){
                    e1.printStackTrace();
                }

                int rowCount =table.getRowCount()+1;
                aTextField.setText("A"+rowCount);
                bTextField.setText("B"+rowCount);

            }
        });
        panel.add(addButton);
        final JButton updButton = new JButton("修改");
        updButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获得被选中行的索引
                int selectedRow =table.getSelectedRow();
                //判断是否存在被选中行
                if (selectedRow!=-1){
                    //修改表格模型中的指定值
                    tableModel.setValueAt(aTextField.getText(),selectedRow,0);
                    tableModel.setValueAt(bTextField.getText(),selectedRow,1);

                }
            }
        });
        panel.add(updButton);
        final JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获得被选中行的索引
                int selectedRow =table.getSelectedRow();
                //判断是否存在被选中行
                if (selectedRow!=-1){

                    //从表格模型当中删除指定行
                    tableModel.removeRow(selectedRow);
                }
            }
        });
        panel.add(delButton);
    }


}
