package forca;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author felipe
 */
public class GUI {
    private final String appName = "Forca";
    private final String infoString0 = "Sua vez! Insira uma letra ou palavra para tentar.";
    private final String infoString1 = "É a vez de ";
    private final String buttonString = "Enviar";
    
    JFrame window;
    
    JPanel tipPanel;
    JPanel historyPanel;
    JPanel wordPanel;
    JPanel inputPanel;    
    JPanel rightPanel;
    JPanel charPanel;
    JPanel infoPanel;
    
    JLabel tipLabel;
    JLabel historyLabel;
    JLabel wordLabel;
    JLabel infoLabel;
    JLabel charLabel;
    
    JButton sendButton;
    
    JTextField textField;
    
    public void GUI(){        
        // SETUP DAS JLABELS
        tipLabel = new JLabel();
        historyLabel = new JLabel();
        wordLabel = new JLabel();
        infoLabel = new JLabel();
        charLabel = new JLabel();
        
        
        // SETUP DO BOTÃO
        sendButton = new JButton(buttonString);
        
        // SETUP DA CAIXA DE TEXTO
        textField = new JTextField();
        
        // SETUP DOS JPANELS
        tipPanel = new JPanel();
        tipPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        tipPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        tipPanel.add(tipLabel);
        
        historyPanel = new JPanel();
        historyPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        historyPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        historyPanel.add(historyLabel);
        
        wordPanel = new JPanel();
        wordPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        wordPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        wordPanel.add(wordLabel);
        
        inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(sendButton, BorderLayout.EAST);
        inputPanel.add(textField, BorderLayout.CENTER);
        
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(0, 1, 0, 5));
        rightPanel.add(tipPanel);
        rightPanel.add(historyPanel);
        rightPanel.add(wordPanel);
        rightPanel.add(inputPanel);
        
        charPanel = new JPanel();
        charPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        charPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        
        infoPanel = new JPanel();
        infoPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        infoPanel.add(infoLabel);
        
        // SETUP DA JANELA
        window = new JFrame(appName);
        window.setSize(640, 480);
        window.setLayout(new BorderLayout());
        window.add(rightPanel, BorderLayout.EAST);
        window.add(charPanel, BorderLayout.WEST);
        window.add(infoPanel, BorderLayout.SOUTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        System.out.println("Exibindo janela?");
    }
    
}
