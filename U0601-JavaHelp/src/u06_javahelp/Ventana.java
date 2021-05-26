package u06_javahelp;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

/**
 *
 * @author Flor Moncada
 */
public class Ventana extends JDialog{
    
    public JTextField txtAyuda;
    public JLabel jlHelp;
    
    public Ventana(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        
        jlHelp = new JLabel();
        txtAyuda = new JTextField();

        super.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jlHelp.setText("Pulsa F1 dentro del campo:");
        jlHelp.setForeground(Color.blue);

        GroupLayout layout = new GroupLayout(super.getContentPane());
        super.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlHelp)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAyuda, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHelp)
                    .addComponent(txtAyuda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }
    
}
