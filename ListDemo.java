import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 

public class ListDemo implements ListSelectionListener { 
   JList<String> jlst; 
   JLabel jlab; 
   JScrollPane jscrlp; 
   // Create an array of names. 
   String names[] = { "Sherry", "Jon", "Rachel", 
 	"Sasha", "Josselyn", "Randy", 
	"Tom", "Mary", "Ken", 
	"Andrew", "Matt", "Todd" }; 

   ListDemo() { 
   // Create a new JFrame container. 
   JFrame frame = new JFrame("JList Demo"); 
   // Specify a flow Layout. 
   frame.setLayout(new FlowLayout()); 
   // Give the frame an initial size. 
   frame.setSize(200, 160); 
   // Create a JList. 
   jlst = new JList<String>(names); 
   // Set the list selection mode to single-selection. 
   jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
  			//MULTIPLE_INTERVAL_SELECTION
			//SINGLE_INTERVAL_SELECTION
   // Add list to a scroll pane. 
   jscrlp = new JScrollPane(jlst);
    // Set the preferred size of the scroll pane. 
   jscrlp.setPreferredSize(new Dimension(120, 90)); 
   // Make a label that displays the selection. 
   jlab = new JLabel("Please choose a name"); 
   // Add list selection handler. 
   jlst.addListSelectionListener(this); 
   // Add the list and label to the content pane. 
   frame.add(jscrlp); 
   frame.add(jlab); 
   // Display the frame. 
   frame.setVisible(true); 
 } 

 // Handle list selection events. 
 public void valueChanged(ListSelectionEvent le) { 
    // Get the index of the changed item. 
    int idx = jlst.getSelectedIndex(); 
    // Display selection, if item was selected. 
    if(idx != -1) 
       jlab.setText("Current selection: " + names[idx]); 
    else // Othewise, reprompt. 
       jlab.setText("Please choose an name"); 
  } 
}