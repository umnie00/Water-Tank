import javax.swing.*;
public class HomeTank extends waterTAnk_abs {

	  @Override
	  public void fillTank(int liters) {
	        if (currentLevel + liters > capacity) {
	            JOptionPane.showMessageDialog(null, "Cannot fill! Tank will overflow.");
	        } else {
	            currentLevel += liters;
	            JOptionPane.showMessageDialog(null, "Added " + liters + " liters.\nCurrent Level: " + currentLevel);
	        }
	    }
	    @Override
	    public void useWater(int liters) {
	        currentLevel -= liters;
	        if (currentLevel < 0) currentLevel = 0;
	    }

	    @Override
	    public void checkStatus() {
	        if (currentLevel == 0)
	            JOptionPane.showMessageDialog(null, "Home tank is empty.",null,JOptionPane.ERROR_MESSAGE);
	        else if (currentLevel == capacity)
	        	JOptionPane.showMessageDialog(null, "Cannot fill! Tank will overflow.,",null,JOptionPane.WARNING_MESSAGE);
	        else
	          JOptionPane.showMessageDialog(null,"Home tank is in use: " + currentLevel + " liters.",null,JOptionPane.INFORMATION_MESSAGE);
	    }
	}


