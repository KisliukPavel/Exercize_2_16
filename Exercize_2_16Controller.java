import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;


public class Exercize_2_16Controller {

	@FXML
	private TextField number1_Text_Field;

	@FXML
	private Label result_Label;

	@FXML
	private TextField number2_Text_Field;

	@FXML
	void number1_Text_Field_Input(KeyEvent event) {
		if(check_Empty(number1_Text_Field.getText()) || check_Empty(number2_Text_Field.getText())) {
			result_Label.setTextFill(Color.BLACK);
			result_Label.setText("Enter digits");
			if(!(check_Input(number1_Text_Field.getText())) || !(check_Input(number2_Text_Field.getText()))) {
				result_Label.setText("Incorrect");
				result_Label.setTextFill(Color.RED);
			}
		}
		else if(!(check_Input(number1_Text_Field.getText())) || !(check_Input(number2_Text_Field.getText()))) {
			result_Label.setText("Incorrect");
			result_Label.setTextFill(Color.RED);
		}
		else {
			result_Label.setTextFill(Color.BLACK);
			Integer num1 = Integer.valueOf(number1_Text_Field.getText());
			Integer num2 = Integer.valueOf(number2_Text_Field.getText());
			if(num1 > num2) {
				result_Label.setText(">");
			}
			else if(num1 < num2) {
				result_Label.setText("<");
			}
			else {
				result_Label.setText("=");
			}
		}
	}

	@FXML
	void number2_Text_Field_Input(KeyEvent event) {
		if(check_Empty(number1_Text_Field.getText()) || check_Empty(number2_Text_Field.getText())) {
			result_Label.setTextFill(Color.BLACK);
			result_Label.setText("Enter digits");
			if(!(check_Input(number1_Text_Field.getText())) || !(check_Input(number2_Text_Field.getText()))) {
				result_Label.setText("Incorrect");
				result_Label.setTextFill(Color.RED);
			}

		}
		else if(!(check_Input(number1_Text_Field.getText())) || !(check_Input(number2_Text_Field.getText()))) {
			result_Label.setText("Incorrect");
			result_Label.setTextFill(Color.RED);
		}
		else {
			result_Label.setTextFill(Color.BLACK);
			Integer num1 = Integer.valueOf(number1_Text_Field.getText());
			Integer num2 = Integer.valueOf(number2_Text_Field.getText());
			if(num1 > num2) {
				result_Label.setText(">");
			}
			else if(num1 < num2) {
				result_Label.setText("<");
			}
			else {
				result_Label.setText("=");
			}
		}
		/*if(!(check_Input(number2_Text_Field.getText()))) {
			result_Label.setText("Incorrect");
			result_Label.setTextFill(Color.RED);
		}
		else if(check_Empty(number1_Text_Field.getText()) || check_Empty(number2_Text_Field.getText())) {
			result_Label.setTextFill(Color.BLACK);
			result_Label.setText("Enter digits");
		}
		else {
			result_Label.setTextFill(Color.BLACK);
			Integer num1 = Integer.valueOf(number1_Text_Field.getText());
			Integer num2 = Integer.valueOf(number2_Text_Field.getText());
			if(num1 > num2) {
				result_Label.setText(">");
			}
			else if(num1 < num2) {
				result_Label.setText("<");
			}
			else {
				result_Label.setText("=");
			}
		}*/

	}

	boolean check_Input(String S)
	{
		for(int i = 0; i < S.length(); i++) {
			if(!(Character.isDigit(S.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	boolean check_Empty(String S)
	{
		return 0 == S.length();
	}

}