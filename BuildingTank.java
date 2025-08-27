
import javax.swing.*;

public class BuildingTank extends waterTAnk_abs {

    // Constructor for BuildingTank (capacity = 5000 liters)

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
        if (currentLevel - liters < 0) {
            JOptionPane.showMessageDialog(null, "Not enough water!");
        } else {
            currentLevel -= liters;
            JOptionPane.showMessageDialog(null, "Used " + liters + " liters.\nCurrent Level: " + currentLevel);
        }
    }

    @Override
    public void checkStatus() {
        if (currentLevel == 0) {
            JOptionPane.showMessageDialog(null, "Status: EMPTY");
        } else if (currentLevel == capacity) {
            JOptionPane.showMessageDialog(null, "Status: FULL");
        } else {
            JOptionPane.showMessageDialog(null, "Status: IN USE\nCurrent Level: " + currentLevel);
        }
    }
}