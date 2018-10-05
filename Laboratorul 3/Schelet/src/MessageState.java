import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

public class MessageState extends State {

	private static final Logger log = Logger.getLogger(MessageState.class);
	private Mediator med;
	
	public MessageState(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void add() {
		JOptionPane.showMessageDialog(
				null, "Add pressed", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	/*@Override
	public void add () 
	{
		log.info("Succesfully added.");
	}*/
	@Override
	public void remove () 
	{
		log.info("Succesfully removed.");
	}
}
