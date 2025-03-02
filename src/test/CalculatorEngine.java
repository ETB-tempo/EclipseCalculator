package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; 
public class CalculatorEngine implements ActionListener { 
		Calculator parent;  		//ссылка на окно калькулятора  
		char selectedAction = ' ';  // +, -, /, или * 
		double currentResult =0;    
		

		CalculatorEngine(Calculator parent){ 
			this.parent = parent; 
		} 
		
		public void actionPerformed(ActionEvent e){     
 
			JButton clickedButton =  (JButton) e.getSource(); 
			String dispFieldText=parent.displayField.getText(); 
			double displayValue=0; 

			if (!"".equals(dispFieldText)){ 
				displayValue= Double.parseDouble(dispFieldText);
			} 
			Object src = e.getSource(); 

			if (src == parent.buttonPlus){ 
			selectedAction = '+'; 
			   currentResult=displayValue; 
			   parent.displayField.setText(""); 
			} else if (src == parent.buttonMinus){ 
			selectedAction = '-'; 
			   currentResult=displayValue; 
			   parent.displayField.setText(""); 
			 }else if (src == parent.buttonDivide){ 
			selectedAction = '/'; 
			   currentResult=displayValue; 
			   parent.displayField.setText(""); 
			 } else if (src == parent.buttonMultiply){ 
			selectedAction = '*';  
			   currentResult=displayValue; 
			   parent.displayField.setText(""); 
			 } else if (src == parent.buttonEqual){ 
			 // Совершить арифметическое действие, в зависимости 
			 // от selectedAction, обновить переменную currentResult 
			 // и показать результат на дисплее 
			if (selectedAction=='+'){ 
			  currentResult+=displayValue; 
			      parent.displayField.setText(""+currentResult); 
			}else if (selectedAction=='-'){  
			 currentResult -=displayValue; 
			      parent.displayField.setText(""+currentResult); 
			}else if (selectedAction=='/'){ 
				currentResult /=displayValue;    
				parent.displayField.setText(""+currentResult); 
    }else if (selectedAction=='*'){
    	currentResult*=displayValue;  
    	parent.displayField.setText(""+currentResult); 
    	} 
    	} else{ 
    	// Для всех цифровых кнопок присоединить надпись на 
    	// кнопке к надписи в дисплее 
    	String clickedButtonLabel= clickedButton.getText(); 
    	parent.displayField.setText(dispFieldText +  
    	clickedButtonLabel); 
    	}
}}