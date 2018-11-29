package forca;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author felipe
 */
public class GUI {
    private final String appName = "Forca";
    private final String infoString0 = "Sua vez! Insira uma letra ou palavra para tentar.";
    private final String infoString1 = "É a vez de ";
    private final String buttonString = "Enviar";
    
    private final ImageIcon[] charImages = {criaImageIcon("img/0.png"),
        criaImageIcon("img/1.png"), criaImageIcon("img/2.png"),
        criaImageIcon("img/3.png"), criaImageIcon("img/4.png"),
        criaImageIcon("img/5.png")};
    
    private Mediator mediator;
    
    private JFrame window;
    
    private JPanel tipPanel;
    private JPanel historyPanel;
    private JPanel wordPanel;
    private JPanel inputPanel;    
    private JPanel rightPanel;
    private JPanel charPanel;
    private JPanel infoPanel;
    private JPanel mainContentPanel;
    
    private JLabel tipLabel;
    private JLabel historyLabel;
    private JLabel wordLabel;
    private JLabel infoLabel;
    private JLabel charLabel;
    
    private JButton sendButton;
    
    private JTextField textField;
    
    private final Font labelsFont = new Font("Monospace", Font.BOLD, 20);
    private final Font textFieldFont = new Font("Arial", Font.PLAIN, 20);
    
    public GUI(Mediator mediator){
        
        this.mediator = mediator;
        
        // SETUP DAS JLABELS
        tipLabel = new JLabel("tipLabel", SwingConstants.CENTER);
        tipLabel.setFont(labelsFont);
        tipLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        
        historyLabel = new JLabel("historyLabel", SwingConstants.CENTER);
        historyLabel.setFont(labelsFont);
        historyLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        
        wordLabel = new JLabel("wordLabel", SwingConstants.CENTER);
        wordLabel.setFont(labelsFont);
        wordLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        infoLabel = new JLabel("infoLabel", SwingConstants.CENTER);
        charLabel = new JLabel(charImages[0], SwingConstants.CENTER);
        
        
        // SETUP DO BOTÃO
        sendButton = new JButton(buttonString);
        
        // SETUP DA CAIXA DE TEXTO
        textField = new JTextField();
        textField.setFont(textFieldFont);
        
        // SETUP DOS JPANELS
        tipPanel = new JPanel();
        tipPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        tipPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        tipPanel.setLayout(new BorderLayout());
        tipPanel.add(tipLabel);
        tipPanel.setBorder(new TitledBorder("Dica"));
        
        historyPanel = new JPanel();
        historyPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        historyPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        historyPanel.setLayout(new BorderLayout());
        historyPanel.add(historyLabel, BorderLayout.CENTER);
        historyPanel.setBorder(new TitledBorder("Histórico"));
        
        wordPanel = new JPanel();
        wordPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        wordPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        wordPanel.setLayout(new BorderLayout());
        wordPanel.add(wordLabel);        
        wordPanel.setBorder(new TitledBorder("Palavra"));
        
        inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(sendButton, BorderLayout.EAST);
        inputPanel.add(textField, BorderLayout.CENTER);
        
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(0, 1, 0, 10));
        rightPanel.add(tipPanel);
        rightPanel.add(historyPanel);
        rightPanel.add(wordPanel);
        rightPanel.add(inputPanel);
        
        charPanel = new JPanel();
        charPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        charPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        charPanel.setLayout(new BorderLayout());
        charPanel.add(charLabel, BorderLayout.CENTER);
        charLabel.setBounds(charPanel.getBounds());
        charPanel.setBorder(new TitledBorder("Vidas"));
        
        mainContentPanel = new JPanel();
        mainContentPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        mainContentPanel.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        mainContentPanel.setLayout(new GridLayout(0, 2, 10, 0));
        
        mainContentPanel.add(charPanel);
        mainContentPanel.add(rightPanel);
        
        infoPanel = new JPanel();
        infoPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        infoPanel.add(infoLabel);
        
        // SETUP DA JANELA
        window = new JFrame(appName);
        window.setSize(640, 480);        
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout(10, 10));
        window.add(mainContentPanel, BorderLayout.CENTER);
        window.add(infoPanel, BorderLayout.SOUTH);
        window.setDefaultCloseOperation(onClose());
        window.setAlwaysOnTop(true);
        window.setVisible(true);
    }
    
    public void update(){
        
    }
    
    protected ImageIcon criaImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a imagem em \"" + path + "\".", "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    private int onClose(){
        mediator.post(Mediator.EXIT_MESSAGE);
        return JFrame.EXIT_ON_CLOSE;
    }
}
