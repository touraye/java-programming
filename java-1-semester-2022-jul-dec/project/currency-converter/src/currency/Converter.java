package currency;

import javax.swing.*;

public class Converter {
    String[] options = {"Dollar", "Pound", "Euro", "Dalasis"};
    CurrencySetter currencySetter = new CurrencySetter();

    public void convert() {
        int userChoice;
        do {
            userChoice = JOptionPane.showOptionDialog(null, "What currency do have in hand?", "click to select",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            //option for Dollar
            if (userChoice == 0) {
                int changeTo = JOptionPane.showOptionDialog(null, "Choose the currency you wish exchange "
                        + options[userChoice] + " to ", "Click to Select", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]);

                //check if user choose Dollar
                if (changeTo == 0) {
                    JOptionPane.showMessageDialog(null, "Oops! cannot convert Dollar to Dollar\nTry it with a different currency.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (changeTo == 1){
                    try {
                        currencySetter.setDollarToPound(0.85);
                        double dollarToPound = currencySetter.getDollarToPound();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Dollar to Pound.\n1 Dollar is equivalent to "+dollarToPound+" Pound.\nHow many Dollar do you want to convert into Pound");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dollarToPound;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Dollar is equals to " +currentFormat(convertedAmount)+ " Pound");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (changeTo == 2){
                    try {
                        currencySetter.setDollarToEuro(.98);
                        double dollarToEuro = currencySetter.getDollarToEuro();
                        JOptionPane.showMessageDialog(null, "You choose to convert Dollar to Euro.\n1 Dollar is equivalent to " + dollarToEuro + " Euro");
                        String amountToConvert = JOptionPane.showInputDialog(null, "You choose to convert Dollar to Euro.\n1 Dollar is equivalent to " + dollarToEuro + " Euro.\nHow many Dollar you want to convert into Euro");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dollarToEuro;
                        JOptionPane.showMessageDialog(null, "" + currentFormat(Double.parseDouble(amountToConvert)) + " Dollar is equals to " + currentFormat(convertedAmount) + " Euro");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    try {
                        currencySetter.setDollarToDalasis(61.50);
                        double dollarToDalasis = currencySetter.getDollarToDalasis();
                        String amountToConvert = JOptionPane.showInputDialog(null, "You choose to convert Dollar to Euro.\n1 Dollar is equivalent to " + dollarToDalasis + "Euro. \nHow many Dollar you want to convert into Dalasis");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dollarToDalasis;
                        JOptionPane.showMessageDialog(null, "" + currentFormat(Double.parseDouble(amountToConvert)) + " Dollar is equals to " + currentFormat(convertedAmount) + " Dalasis");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            //option for Pound
            if (userChoice == 1) {
                int changeTo = JOptionPane.showOptionDialog(null, "Choose the currency you wish exchange "+
                                options[userChoice]+ " to "+ userChoice, "Click to Select", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null,
                        options, options[0]);
                if (changeTo == 0) {
                    try {
                        currencySetter.setPoundToDollar(1.18);
                        double poundToDollar = currencySetter.getPoundToDollar();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Pound to Dollar.\n1 Pound is equivalent to "+currentFormat(poundToDollar)+" Dollar.\nHow many Pound do you want to convert into Dollar");
                        double convertedAmount = Double.parseDouble(amountToConvert) * poundToDollar;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Pound is equals to " +currentFormat(convertedAmount)+ " Dollar");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if(changeTo == 1) {
                    JOptionPane.showMessageDialog(null, "Oops! cannot convert Pound to Pound\nTry it a different currency.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if(changeTo == 2) {
                    try {
                        currencySetter.setPoundToEuro(1.15);
                        double poundToEuro = currencySetter.getPoundToEuro();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Pound to Dalasis.\n1 Pound is equivalent to "+currentFormat(poundToEuro)+" Euro.\nHow many Pound do you want to convert into Euro");
                        double convertedAmount = Double.parseDouble(amountToConvert) * poundToEuro;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Pound is equals to " +currentFormat(convertedAmount)+ " Euro");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    try {
                        currencySetter.setPoundToDalasis(72.59);
                        double poundToDalasis = currencySetter.getPoundToDalasis();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Pound to Dalasis.\n1 Pound is equivalent to "+currentFormat(poundToDalasis)+" Dalasis.\nHow many Pound do you want to convert into Dalasis");
                        double convertedAmount = Double.parseDouble(amountToConvert) * poundToDalasis;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Pound is equals to " +currentFormat(convertedAmount)+ " Dalasis");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            //option Euro
            if (userChoice == 2) {
                int changeTo = JOptionPane.showOptionDialog(null, "Choose the currency you wish exchange "
                        + options[userChoice] + " to", "click to select", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        options, options[0]);

                if (changeTo == 0) {
                    try {
                        currencySetter.setEuroToDollar(1.02);
                        double euroToDollar = currencySetter.getEuroToDollar();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Euro to Dollar.\n1 Euro is equivalent to "+euroToDollar+" Dollar.\nHow many Euro do you want to convert into Dollar");
                        double convertedAmount = Double.parseDouble(amountToConvert) * euroToDollar;
                        JOptionPane.showMessageDialog(null, ""+amountToConvert+ " Euro is equals to " +convertedAmount+ " Dollar");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (changeTo == 1) {
                    try {
                        currencySetter.setEuroToPound(0.87);
                        double euroToPound = currencySetter.getEuroToPound();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Euro to Pound.\n1 Euro is equivalent to "+euroToPound+" Dollar.\nHow many Euro do you want to convert into Pound");
                        double convertedAmount = Double.parseDouble(amountToConvert) * euroToPound;
                        JOptionPane.showMessageDialog(null, ""+amountToConvert+ " Euro is equals to " +convertedAmount+ " Pound");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else   if (changeTo == 2) {
                    JOptionPane.showMessageDialog(null, "Oops! cannot convert Euro to Euro. \nTry with a different currency", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        currencySetter.setEuroToDalasis(63.07);
                        double euroToDalasis = currencySetter.getEuroToDalasis();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Euro to Dalasis.\n1 Euro is equivalent to "+euroToDalasis+" Dollar.\nHow many Euro do you want to convert into Dalasis");
                        double convertedAmount = Double.parseDouble(amountToConvert) * euroToDalasis;
                        JOptionPane.showMessageDialog(null, ""+amountToConvert+ " Euro is equals to " +convertedAmount+ " Dalasis");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            //option Dalasis
            if (userChoice == 3) {
                int changeTo = JOptionPane.showOptionDialog(null, "Choose the currency you wish to exchange "
                        + options[userChoice] +" to", "click to select", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        options, options[0]);

                if (changeTo == 0) {
                    try {
                        currencySetter.setDalasisToDollar(0.016);
                        double dalasisToDollar = currencySetter.getDalasisToDollar();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Dalasis to Dollar.\n1 Dalasis is equivalent to "+currentFormat(dalasisToDollar)+" Dollar.\nHow many Dalasis do you want to convert into Dollar");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dalasisToDollar;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Dalasis is equals to " +currentFormat(convertedAmount)+ " Dollar");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (changeTo == 1) {
                    try {
                        currencySetter.setDalasisToPound(0.014);
                        double dalasisToPound = currencySetter.getDalasisToPound();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Dalasis to Pound.\n1 Dalasis is equivalent to "+currentFormat(dalasisToPound)+" Pound.\nHow many Dalasis do you want to convert into Pound");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dalasisToPound;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Dalasis is equals to " +currentFormat(convertedAmount)+ " Pound");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else if (changeTo == 2) {
                    try {
                        currencySetter.setDalasisToEuro(0.016);
                        double dalasisToEuro = currencySetter.getDalasisToEuro();
                        String amountToConvert =  JOptionPane.showInputDialog(null, "You choose to convert Dalasis to Euro.\n1 Dalasis is equivalent to "+dalasisToEuro+" Euro.\nHow many Dalasis do you want to convert into Euro");
                        double convertedAmount = Double.parseDouble(amountToConvert) * dalasisToEuro;
                        JOptionPane.showMessageDialog(null, ""+currentFormat(Double.parseDouble(amountToConvert))+ " Dalasis is equals to " +currentFormat(convertedAmount)+ " Euro");
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Please input numbers only!", "Wrong Input",
                                JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Please input something", "Null Value",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Oops! cannot convert Dalasis to Dalasis\nTry with a different currency", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (userChoice != -1);

    }

    public String currentFormat(double amount){
        return String.format("%,.2f", amount);
    }
}
