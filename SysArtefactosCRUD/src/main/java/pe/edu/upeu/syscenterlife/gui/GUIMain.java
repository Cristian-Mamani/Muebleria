package pe.edu.upeu.syscenterlife.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import org.springframework.context.ConfigurableApplicationContext;

public class GUIMain extends JFrame {

    JTabbedPane jtpane;
    JScrollPane scrollPane;
    ConfigurableApplicationContext ctx;

    public GUIMain() {
        this.setTitle("SystemMain@DMP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new Dimension(screenSize.width, (screenSize.height)
                - 36));
        MainArtefactos ma = new MainArtefactos();
//mc.setContexto(ctx);
        ma.setPreferredSize(new Dimension(1024, 600));
        jtpane = new JTabbedPane();
        jtpane.setName("Muebles");
        jtpane.add(ma);
        scrollPane = new JScrollPane(ma);
        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jtpane.add(scrollPane, "Muebeles");
        this.add(BorderLayout.CENTER, jtpane);
        this.validate();
        this.repaint();
    }

    public void setContexto(ConfigurableApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {
        new GUIMain().setVisible(true);
    }
}
