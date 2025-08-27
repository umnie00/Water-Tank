import javax.swing.JOptionPane;

	public class watertankmain2 {
	    public static void main(String[] args) {
	    	
waterTAnk_abs tank =null;

	        // Step 1: Choose tank type
	        String[] tankOptions = {"Home Tank", "Building Tank","Exit"};
	        int tankChoice = JOptionPane.showOptionDialog(null, "Choose a tank:", "Water Tank Selection",
	                JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,null, tankOptions,null);

	        if (tankChoice == 0) {
	        	
	            tank.capacity=1000;//awa niiiiiiiiiiiiiiiiiiiiiii
	            	
	        } else if (tankChoice == 1) {
	        	tank.capacity=5000;//kani puuuuuuuuuuuuuuuuuuuuuuud
	        	
	        }
	        else if(tankChoice==2) { // Exit
                JOptionPane.showMessageDialog(null, "Thank you for using the system!");
                System.exit(0);
            }else {
	            JOptionPane.showMessageDialog(null, "No tank selected. Exiting.");
	            System.exit(0);
	        }

	        // Step 2: Loop until user exits
	        while (true) {
	            String[] options = {"Fill Tank", "Use Water", "Check Status", "Exit"};
	            int choice = JOptionPane.showOptionDialog(null, "Choose an action:", "Water Tank System",
	                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,null);

	            if (choice == 0) { // Fill
	                String input = JOptionPane.showInputDialog("Enter liters to add:");
	                if (input != null && !input.isEmpty()) {
	                    tank.fillTank(Integer.parseInt(input));
	                }
	            } else if (choice == 1) { // Use
	                String input = JOptionPane.showInputDialog("Enter liters to use:");
	                if (input != null && !input.isEmpty()) {
	                    tank.useWater(Integer.parseInt(input));
	                }
	            } else if (choice == 2) { // Status
	                tank.checkStatus();
	            } else { // Exit
	                JOptionPane.showMessageDialog(null, "Thank you for using the system!");
	                break;
	            }
	        }
	    }
	}

