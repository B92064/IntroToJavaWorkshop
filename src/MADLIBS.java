import javax.swing.JOptionPane;

public class MADLIBS {
public static void main(String[]args){
String userName = JOptionPane.showInputDialog("Enter Friends Name");
String noun = JOptionPane.showInputDialog("Enter a Noun");
String verb = JOptionPane.showInputDialog("Enter a Verb");
String name = JOptionPane.showInputDialog("Enter a Name");
String food = JOptionPane.showInputDialog("Enter a Food");
String color = JOptionPane.showInputDialog("Enter a Color");

JOptionPane.showMessageDialog(null, "You were going camping with your friend " + userName + ". You were about to go to "+ noun + "when a "+ verb + "donkey named "+ name + 
		"blocked your way. He said that his favorite food was "+ food + "you gave him the "+ food+"and were about to leave to go to " + noun+
		"and when you finally reached there, it was painted "+ color + "");
}
}
//You were (continue)