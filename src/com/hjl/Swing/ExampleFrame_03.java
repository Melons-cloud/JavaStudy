package com.hjl.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.Vector;

public class ExampleFrame_03 extends JFrame {

    public static void main(String[] args) {
        ExampleFrame_03 frame = new ExampleFrame_03();
        frame.setVisible(true);
    }
    public ExampleFrame_03(){

        super();
        setTitle("定义表格");
        setBounds(100,100,500,375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JScrollPane scrollPane =new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String[] columNames ={"A","B","C","D","E","F","G"};
        Vector<String> columnNameV =new Vector<>();
        for (int column=0;column<columNames.length;column++){

            columnNameV.add(columNames[column]);

        }
        Vector<Vector<String>> tableValueV =new Vector<>();
        for (int row=1;row<21;row++){
            Vector<String> rowV =new Vector<String>();
            for (int column=0;column<columNames.length;column++){
                rowV.add(columNames[column]+row);
            }
            tableValueV.add(rowV);


        }
        JTable table = new MTable(tableValueV,columnNameV);
        //关闭表格列的自动调整功能
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //选择模式为单选
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //被选择行的背景色为黄色
        table.setBackground(Color.YELLOW);
        //被选择行的前景色(文字颜色)为红色
        table.setSelectionForeground(Color.RED);
        //表格的行高为30像素
        table.setRowHeight(30);
        scrollPane.setViewportView(table);


    }

    private class MTable extends JTable{   //实现表格类

        public MTable(Vector<Vector<String>>rowData,Vector<String>columnNames){

            super(rowData,columnNames);
        }
        @Override
        public JTableHeader getTableHeader(){   //定义表格头

            //获得表格头对象
            JTableHeader tableHeader =super.getTableHeader();

            //设置表格列不可重排
            tableHeader.setResizingAllowed(false);
            //获得表格头的单元格对象
            DefaultTableCellRenderer hr =(DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
            //设置列名居中显示
            hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            return tableHeader;


        }
        //定义单元格
        @Override
        public TableCellRenderer getDefaultRenderer(Class<?> columnClass){
            //获得表格的单元格对象
            DefaultTableCellRenderer cr = (DefaultTableCellRenderer) super.getDefaultRenderer(columnClass);
         // 设置单元格内容居中显示
         cr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
         return cr;
        }
        @Override
        public boolean isCellEditable(int row,int column){  //表格不可编辑

            return  false;
        }
    }
}
