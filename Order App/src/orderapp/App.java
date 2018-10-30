/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 *
 * @author ndc07
 */
public class App {
    
    private JFrame mainFrame;
    
    public App() {
        initComponents();
    }
    
    public static void main(String[] args) {
        new App();
    }
    
    private void initComponents() {
        
        mainFrame = new JFrame("Cafe Management || Order App");
        mainFrame.setSize(1000, 700);
        
        /* HEADER */
        JPanel header = new JPanel();
        createHeader(header);
        
        /* MENU */
        JPanel menuSection = new JPanel();
        menuSection.setBackground(Color.green);
        
        /* BILL */
        JPanel billSection = new JPanel();
        billSection.setBackground(Color.yellow);
        
        
        /* FOOTER */
        JPanel footer = new JPanel();
        footer.setBackground(Color.cyan);
        
        mainFrame.getContentPane().add(header, BorderLayout.PAGE_START);
        mainFrame.getContentPane().add(menuSection, BorderLayout.CENTER);
        mainFrame.getContentPane().add(billSection, BorderLayout.LINE_END);
        mainFrame.getContentPane().add(footer, BorderLayout.PAGE_END);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        
    }
    
    private void createHeader(JPanel header) {
        
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        header.setBackground(new Color(228,249,245));
        
        /* BRAND */
        JPanel brandSection = new JPanel();
        brandSection.setBackground(new Color(228,249,245));
        
        JLabel brandImage = new JLabel();
        URL imgURL = getClass().getResource("../images/logo.png");
        brandImage.setIcon(new ImageIcon(imgURL));
        brandImage.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                brandImage.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                brandImage.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        JLabel brandText = new JLabel("Starbucks – The Best Coffee and Espresso Drinks");
        brandText.setForeground(new Color(0,107,68));
        brandText.setBackground(new Color(228,249,245));
        brandText.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        JSeparator brandLine = new JSeparator();
        brandLine.setBackground(new Color(0,107,68));
        
        JPanel brandTitle = new JPanel();
        brandTitle.setBackground(new Color(228,249,245));
        brandTitle.setLayout(new BoxLayout(brandTitle, BoxLayout.Y_AXIS));
        brandTitle.add(brandText);
        brandTitle.add(brandLine);
        brandTitle.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                brandTitle.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                brandTitle.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        brandSection.add(Box.createRigidArea(new Dimension(10, 0)));
        brandSection.add(brandImage);
        brandSection.add(Box.createRigidArea(new Dimension(15, 0)));
        brandSection.add(brandTitle);
        brandSection.add(Box.createRigidArea(new Dimension(10, 0)));
        /* END BRAND */
        
        /*CONTROLS*/
        JPanel controlSection = new JPanel();
        controlSection.setBackground(new Color(228,249,245));
        controlSection.setLayout(new BoxLayout(controlSection, BoxLayout.X_AXIS));
        
        /* HOME CONTROL */
        JPanel homeControl = new JPanel();
        homeControl.setLayout(new BoxLayout(homeControl, BoxLayout.Y_AXIS));
        homeControl.setBackground(new Color(228,249,245));
        homeControl.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                homeControl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                homeControl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        JLabel homeTitle = new JLabel("Home");
        homeTitle.setForeground(new Color(41,55,72));
        homeTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        URL homeURL = getClass().getResource("../images/home.png");
        JLabel homeIcon = new JLabel(new ImageIcon(homeURL));
        homeIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        homeControl.add(homeTitle);
        homeControl.add(Box.createRigidArea(new Dimension(0, 6)));
        homeControl.add(homeIcon);
        /* END HOME CONTROL */
        
        /* HISTORY CONTROL */
        JPanel historyControl = new JPanel();
        historyControl.setLayout(new BoxLayout(historyControl, BoxLayout.Y_AXIS));
        historyControl.setBackground(new Color(228,249,245));
        historyControl.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                historyControl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                historyControl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        JLabel historyTitle = new JLabel("History");
        historyTitle.setForeground(new Color(41,55,72));
        historyTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        URL historyURL = getClass().getResource("../images/history.png");
        JLabel historyIcon = new JLabel(new ImageIcon(historyURL));
        historyIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        historyControl.add(historyTitle);
        historyControl.add(Box.createRigidArea(new Dimension(0, 6)));
        historyControl.add(historyIcon);
        /* END HISTORY CONTROL */
        
        /* HELP CONTROL */
        JPanel helpControl = new JPanel();
        helpControl.setLayout(new BoxLayout(helpControl, BoxLayout.Y_AXIS));
        helpControl.setBackground(new Color(228,249,245));
        helpControl.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                helpControl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                helpControl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        JLabel helpTitle = new JLabel("Help");
        helpTitle.setForeground(new Color(41,55,72));
        helpTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        URL helpURL = getClass().getResource("../images/help.png");
        JLabel helpIcon = new JLabel(new ImageIcon(helpURL));
        helpIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        helpControl.add(helpTitle);
        helpControl.add(Box.createRigidArea(new Dimension(0, 6)));
        helpControl.add(helpIcon);
        /* END HELP CONTROL */
        
        /* ABOUT CONTROL */
        JPanel aboutControl = new JPanel();
        aboutControl.setLayout(new BoxLayout(aboutControl, BoxLayout.Y_AXIS));
        aboutControl.setBackground(new Color(228,249,245));
        aboutControl.addMouseListener(new MouseAdapter()  
        {  
            @Override
            public void mouseClicked(MouseEvent e)  
            {  
                try {
                    Desktop.getDesktop().browse(new URL("https://github.com/ndc07/cafe-management").toURI());
                } catch (IOException ex) {} catch (URISyntaxException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                aboutControl.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); 
                aboutControl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }); 
        
        JLabel aboutTitle = new JLabel("About");
        aboutTitle.setForeground(new Color(41,55,72));
        aboutTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        URL aboutURL = getClass().getResource("../images/about.png");
        JLabel aboutIcon = new JLabel(new ImageIcon(aboutURL));
        aboutIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        aboutControl.add(aboutTitle);
        aboutControl.add(Box.createRigidArea(new Dimension(0, 6)));
        aboutControl.add(aboutIcon);
        /* END ABOUT CONTROL */
        
        controlSection.add(Box.createRigidArea(new Dimension(30, 0)));
        controlSection.add(homeControl);
        controlSection.add(Box.createRigidArea(new Dimension(30, 0)));
        controlSection.add(historyControl);
        controlSection.add(Box.createRigidArea(new Dimension(30, 0)));
        controlSection.add(helpControl);
        controlSection.add(Box.createRigidArea(new Dimension(30, 0)));
        controlSection.add(aboutControl);
        controlSection.add(Box.createRigidArea(new Dimension(30, 0)));
        
        /* END CONTROLS */
        
        header.add(brandSection);
        header.add(controlSection);
        
    }
}