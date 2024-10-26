ava
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelector {

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Pet Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);  // Use no layout manager to place components manually

        // Create radio buttons for each pet
        JRadioButton birdButton = new JRadioButton("Bird");
        birdButton.setBounds(50, 50, 100, 30); // x, y, width, height
        JRadioButton catButton = new JRadioButton("Cat");
        catButton.setBounds(50, 80, 100, 30);
        JRadioButton dogButton = new JRadioButton("Dog");
        dogButton.setBounds(50, 110, 100, 30);
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        rabbitButton.setBounds(50, 140, 100, 30);
        JRadioButton pigButton = new JRadioButton("Pig");
        pigButton.setBounds(50, 170, 100, 30);

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Create a button to show the selected pet
        JButton showButton = new JButton("Show Selected Pet");
        showButton.setBounds(200, 100, 150, 30);

        // Add an ActionListener to display the selected pet
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPet = "";
                if (birdButton.isSelected()) {
                    selectedPet = "Bird";
                } else if (catButton.isSelected()) {
                    selectedPet = "Cat";
                } else if (dogButton.isSelected()) {
                    selectedPet = "Dog";
                } else if (rabbitButton.isSelected()) {
                    selectedPet = "Rabbit";
                } else if (pigButton.isSelected()) {
                    selectedPet = "Pig";
                }
                // Display the selected pet in a message box
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet);
            }
        });

        // Add all components to the frame
        frame.add(birdButton);
        frame.add(catButton);
        frame.add(dogButton);
        frame.add(rabbitButton);
        frame.add(pigButton);
        frame.add(showButton);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

