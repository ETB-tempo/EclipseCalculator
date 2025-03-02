package test;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class SimpleCalculator {

	public static void main(String[] args) {
		// Создаём панель
		JPanel windowContentFlow= new JPanel();
		JPanel windowContentGrid = new JPanel();
		JPanel windowContentBorder = new JPanel();
		
		 // Задаём менеджер отображения для этой панели
		FlowLayout fl = new FlowLayout();
		 windowContentFlow.setLayout(fl);
		 
		 GridLayout gr = new GridLayout(4,2,5,5);
		 windowContentGrid.setLayout(gr);
		 
		 BorderLayout bl = new BorderLayout();
		 windowContentBorder.setLayout(bl);
		 
		 JTextField txtDisplay = new JTextField(20);
		 JLabel label4 = new JLabel("Number");
		 windowContentBorder.add("North", label4);
		 windowContentBorder.add("South", txtDisplay);
		 
		 // Создаём компоненты в памяти
		 JLabel label1 = new JLabel("Number 1:");
		 JTextField field1 = new JTextField(10);
		 JLabel label2 = new JLabel("Number 2:");
		 JTextField field2 = new JTextField(10);
		 JLabel label3 = new JLabel("Sum:");
		 JTextField result = new JTextField(10);
		 JButton go = new JButton("Add");
		 
		 JLabel label11 = new JLabel("Number 1:");
		 JTextField field11 = new JTextField(10);
		 JLabel label22 = new JLabel("Number 2:");
		 JTextField field22 = new JTextField(10);
		 JLabel label33 = new JLabel("Sum:");
		 JTextField resultG = new JTextField(10);
		 JButton goG = new JButton("Add");
		 
		 // Добавляем компоненты на панель
		 windowContentFlow.add(label1);
		 windowContentFlow.add(field1);
		 windowContentFlow.add(label2);
		 windowContentFlow.add(field2);
		 windowContentFlow.add(label3);
		 windowContentFlow.add(result);
		 windowContentFlow.add(go);
		 
		 windowContentGrid.add(label11);
		 windowContentGrid.add(field11);
		 windowContentGrid.add(label22);
		 windowContentGrid.add(field22);
		 windowContentGrid.add(label33);
		 windowContentGrid.add(resultG);
		 windowContentGrid.add(goG);
		 
		 // Создаём фрейм и задаём для него панель
		 JFrame frame = new JFrame("My First Calculator");
		 frame.setContentPane(windowContentFlow);
		 
		 JFrame framegrid = new JFrame("My First Calculator");
		 framegrid.setContentPane(windowContentGrid);
		 
		 JFrame frameborder = new JFrame("My First Calculator");
		 frameborder.setContentPane(windowContentBorder);
		 
		// задаём и размер и делаем фрейм видимым
		 frame.setSize(380,100);
		 frame.setVisible(true);
		 framegrid.setSize(380,100);
		 framegrid.setVisible(true);
		 frameborder.setSize(380,100);
		 frameborder.setVisible(true);
		}

	}

