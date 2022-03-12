import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    // To store the value while calculations
    private double total1 = 0.0;
    // To store the sum value
    private double total2 = 0.0;
    // To set math operator(multiply,divide...)
    private char math_operator;

    private JPanel Calculator;
    private JButton buttonOne;
    private JButton buttonZero;
    private JButton buttonTwo;
    private JButton buttonDecimal;
    private JButton buttonSum;
    private JButton buttonAdd;
    private JButton buttonMinus;
    private JButton buttonMult;
    private JButton buttonDiv;
    private JButton buttonTree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonClear;
    private JTextField textField1;

    private void getOperator (String buttonText) {
        math_operator = buttonText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText() );
        textField1.setText("");
    }

    public Calculator() {
        //Declare all buttons and theirs usage.
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = total1 + Double.parseDouble( textField1.getText() );
                textField1.setText(Double.toString(total2) );
                total1 = 0;
            }
        });
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonAdd.getText();
                getOperator(button_text);
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonDiv.getText();
                getOperator(button_text);
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = buttonMult.getText();
                getOperator(button_text);
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                textField1.setText(" ");
            }
        });
        buttonDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //This will make it neater - "0." instead of "."
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                //This will help to avoid a bug, cause ".." as well as "1.." or ".8."
                else if (textField1.getText().contains(".") ) {
                    buttonDecimal.setEnabled(false);
                }
                else
                { String buttonDecimalText = textField1.getText() + buttonDecimal.getText();
                  textField1.setText(buttonDecimalText);}
                buttonDecimal.setEnabled(false);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonZeroText = textField1.getText() + buttonZero.getText( );
                textField1.setText(buttonZeroText);
            }
        });
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonOneText = textField1.getText() + buttonOne.getText( );
                textField1.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonTwoText = textField1.getText() + buttonTwo.getText( );
                textField1.setText(buttonTwoText);
            }
        });
        buttonTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonThreeText = textField1.getText() + buttonTree.getText( );
                textField1.setText(buttonThreeText);
            }
        });buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonFourText = textField1.getText() + buttonFour.getText( );
                textField1.setText(buttonFourText);
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonFiveText = textField1.getText() + buttonFive.getText( );
                textField1.setText(buttonFiveText);
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonSixText = textField1.getText() + buttonSix.getText( );
                textField1.setText(buttonSixText);
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonSevenText = textField1.getText() + buttonSeven.getText( );
                textField1.setText(buttonSevenText);
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonEightText = textField1.getText() + buttonEight.getText( );
                textField1.setText(buttonEightText);
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonNineText = textField1.getText() + buttonNine.getText( );
                textField1.setText(buttonNineText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
