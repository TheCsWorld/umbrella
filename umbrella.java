import javax.swing.JOptionPane;
public class umbrella {

	public static void main(String[] args) {
		int answer = JOptionPane.showConfirmDialog(null,"Could it rain/Is it raining today?");
		boolean possibleRain = (answer == JOptionPane.YES_OPTION);
		boolean noRain = (answer == JOptionPane.NO_OPTION);
		if (possibleRain)
		{
			answer = JOptionPane.showConfirmDialog(null,"You will need an umbrella. Is it currently raining?");
			boolean currentRain = (answer == JOptionPane.YES_OPTION);
			if (currentRain)
			{
				JOptionPane.showMessageDialog(null,"You need to put up your umbrella");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"You don't need to put up your umbrella");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"You don't need an umbrella");
		}

	}

}


