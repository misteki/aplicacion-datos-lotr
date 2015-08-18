/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import com.mongodb.BasicDBObject;
import data.analyzer.UserSchema;
import data.analyzer.DataAnalyzer;
import data.analyzer.GameSchema;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import connection.lotr.LotRDataInput;
import connection.lotr.LotRModel;
import data.analyzer.DataInput;
import data.analyzer.InvalidInputException;
import data.analyzer.Model;
import java.io.File;
import java.util.Hashtable;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author matias
 */
public class MainWindow extends javax.swing.JFrame {
    
    private final JFileChooser fc = new JFileChooser();
    private DataAnalyzer analizador;
    private DataInput database;
    private Model model;
    private Hashtable<String,UserSchema> availableUsers;
    private ArrayList<GameSchema> analysisInput;
    private ArrayList<BasicDBObject> currentChat;
    
    //Variables extra para chequeos de estado
    private int prevChatIndex = 0;
    
    
    
    public void consolePrint(String s) {
        try {
           Document doc = consoleArea.getDocument();
           doc.insertString(doc.getLength(), s+"\n", null);
        } catch(BadLocationException exc) {
           exc.printStackTrace();
        }
    }
    
    public void setInput(DataInput d){
        database=d;
    }
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        availableUsers = new Hashtable<String,UserSchema>();
        List<String> ls = new ArrayList<String>(); 
        
        initComponents();
        //opciones de configuracion y carga hard
        messageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ls.add("Modelo 1");
        modelOptions.setModel(new DefaultComboBoxModel(ls.toArray()));
        FileFilter filter = new FileNameExtensionFilter("Archivo JSON","json");
        fc.setFileFilter(filter);
        tabbedPane.setEnabledAt(1, false);
        File workingDirectory = new File(System.getProperty("user.dir"));
        fc.setCurrentDirectory(workingDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        modelOptions = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        loadJSONButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        getGamesButton = new javax.swing.JButton();
        cabezaButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        resetAnalysisButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consoleArea = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        chatList = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageList = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        IPAButton = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador de Datos - LotR");

        jButton3.setText("Conectar a base de datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        modelOptions.setEnabled(false);

        jLabel3.setText("Modelo de análisis");
        jLabel3.setName(""); // NOI18N

        loadJSONButton.setText("Cargar JSON para modelo");
        loadJSONButton.setEnabled(false);
        loadJSONButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadJSONButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Partidas sin analizar");
        jLabel2.setName(""); // NOI18N

        getGamesButton.setText("Buscar partidas");
        getGamesButton.setEnabled(false);
        getGamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGamesButtonActionPerformed(evt);
            }
        });

        cabezaButton.setText("Analizar");
        cabezaButton.setEnabled(false);
        cabezaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabezaButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Acciones generales");

        resetAnalysisButton.setText("Resetear análisis");
        resetAnalysisButton.setEnabled(false);
        resetAnalysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAnalysisButtonActionPerformed(evt);
            }
        });

        consoleArea.setEditable(false);
        jScrollPane1.setViewportView(consoleArea);

        jLabel1.setText("Resultados");

        jButton4.setText("Limpiar pantalla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cabezaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetAnalysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadJSONButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getGamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(349, 349, 349))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadJSONButton)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getGamesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cabezaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetAnalysisButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Análisis de partidas", jPanel1);

        jLabel5.setText("Cargar chat");

        chatList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chatListItemStateChanged(evt);
            }
        });
        chatList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatListActionPerformed(evt);
            }
        });

        messageList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                messageListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(messageList);

        jLabel6.setText("Mensajes");

        prevButton.setText("<< Anterior");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Siguiente >>");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Mensaje");

        messageArea.setEditable(false);
        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane3.setViewportView(messageArea);

        jLabel9.setText("Categoria");

        IPAButton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No categorizado", "C1 - Muestra Solidaridad", "C2 - Muestra descarga de tensión", "C3 - Muestra aceptación pasiva", "C4 - Da sugerencia", "C5 - Da opinión", "C6 - Da información", "C7 - Pide orientación", "C8 - Pide opinión", "C9 - Pide sugerencia", "C10 - Está en desacuerdo", "C11 - Muestra tensión", "C12 - Muestra antagonismo", "C13 - Otra categoría 1", "C14 - Otra categoría 2", "C15 - Otra categoría 3", "C16 - Otra categoría 4" }));
        IPAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IPAButtonMouseClicked(evt);
            }
        });
        IPAButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IPAButtonItemStateChanged(evt);
            }
        });
        IPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPAButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Jugador:");

        jButton1.setText("Guardar análisis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(155, 155, 155))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(chatList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(39, 39, 39)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPAButton, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chatList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextButton)
                            .addComponent(prevButton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Análisis de chats", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void getGamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGamesButtonActionPerformed
        try {
            analizador = new DataAnalyzer(database, model);
            analysisInput = analizador.getUnanalizedGames();
            ArrayList<UserSchema> users = analizador.getUsers();
            String [] userIDs = new String[users.size()];
            int i =0;
            for (UserSchema user : users){
                availableUsers.put(user.getKeyAttribute(),user);
                userIDs[i]= user.getKeyAttribute();
                i++;
            }
            this.consolePrint("Se han hallado "+(analysisInput.size())+" partidas sin analizar.");
            if (analysisInput.size()>0){
                cabezaButton.setEnabled(true);
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_getGamesButtonActionPerformed

    private void cabezaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabezaButtonActionPerformed
        this.consolePrint("\n ---------------------------------------------");
        analizador.analyzeGames(analysisInput);
    }//GEN-LAST:event_cabezaButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InputWindow w1 = new InputWindow(this);
        w1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loadJSONButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadJSONButtonActionPerformed
        int returnVal = fc.showOpenDialog(this);
        if (fc.getSelectedFile()!=null){
            model =  new LotRModel(this,(LotRDataInput)database,fc.getSelectedFile().getAbsolutePath());
            getGamesButton.setEnabled(true);
            resetAnalysisButton.setEnabled(true);
        }
        
    }//GEN-LAST:event_loadJSONButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        consoleArea.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void resetAnalysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAnalysisButtonActionPerformed
        ((LotRDataInput)database).resetAnalysis(((LotRModel)model).getModelName());  
        this.consolePrint("Se ha reseteado el análisis.");
        this.consolePrint("---------------------------------------------");
    }//GEN-LAST:event_resetAnalysisButtonActionPerformed

    private void messageListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_messageListValueChanged

        if (messageList.getSelectedIndex() < currentChat.size() && messageList.getSelectedIndex()!=-1){
            BasicDBObject obj = (BasicDBObject)(currentChat.get(messageList.getSelectedIndex()));
            messageArea.setText((String)(obj).get("text"));
            playerLabel.setText((String)(obj).get("from"));
            if (obj.get("IPA")!=null){
                IPAButton.setSelectedIndex((int)obj.get("IPA"));
            }
            else{
                IPAButton.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_messageListValueChanged

    private void chatListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatListActionPerformed
        //cargo los chats de la db
            DefaultListModel listmodel = new DefaultListModel();
            if (chatList.getSelectedItem()!=null){
                currentChat = ((LotRDataInput)database).getChatMessages(chatList.getSelectedItem().toString());
                int i=0;
                while (i < currentChat.size()){
                    if (((BasicDBObject)currentChat.get(i)).get("IPA")!=null && ((BasicDBObject)currentChat.get(i)).get("IPADescription")!=null){
                        listmodel.addElement(i+" (Analizado)");
                    }
                    else{
                        listmodel.addElement(i);
                    }
                    i++;
                }
                 messageList.setModel(listmodel);
                 messageList.setSelectedIndex(0);
            }
        
    }//GEN-LAST:event_chatListActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        if (messageList.getSelectedIndex()>0){
            messageList.setSelectedIndex(messageList.getSelectedIndex()-1);
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (messageList.getSelectedIndex()<currentChat.size()-1){
            messageList.setSelectedIndex(messageList.getSelectedIndex()+1);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void IPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPAButtonActionPerformed
        
        DefaultListModel listModel = (DefaultListModel)messageList.getModel();
        if (currentChat.get(messageList.getSelectedIndex()).get("IPA")==null){
            if (IPAButton.getSelectedIndex()!=0){
                currentChat.get(messageList.getSelectedIndex()).put("IPA", IPAButton.getSelectedIndex()); 
                currentChat.get(messageList.getSelectedIndex()).put("IPADescription", IPAButton.getSelectedItem().toString()); 
                listModel.setElementAt(listModel.get(messageList.getSelectedIndex())+" (Analizado)", messageList.getSelectedIndex());
            }
            else{
                listModel.setElementAt(listModel.get(messageList.getSelectedIndex()).toString(), messageList.getSelectedIndex());
            }
        }
        else{
            if (IPAButton.getSelectedIndex()==0){
                currentChat.get(messageList.getSelectedIndex()).remove("IPA");
                currentChat.get(messageList.getSelectedIndex()).remove("IPADescription");
                listModel.setElementAt(messageList.getSelectedIndex(), messageList.getSelectedIndex());
            }
            else{
                currentChat.get(messageList.getSelectedIndex()).put("IPA", IPAButton.getSelectedIndex()); 
                currentChat.get(messageList.getSelectedIndex()).put("IPADescription", IPAButton.getSelectedItem().toString()); 
            }
        }
    }//GEN-LAST:event_IPAButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((LotRDataInput)database).saveChatAnalysis(chatList.getSelectedItem().toString(), currentChat);
        JOptionPane.showMessageDialog(this, "Se han guardado todos los cambios para este chat.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IPAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPAButtonMouseClicked

 
    }//GEN-LAST:event_IPAButtonMouseClicked

    private void IPAButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IPAButtonItemStateChanged
        
    }//GEN-LAST:event_IPAButtonItemStateChanged

    private void chatListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chatListItemStateChanged

    }//GEN-LAST:event_chatListItemStateChanged
                 
    
    public void enableModelLoad(){
        modelOptions.setEnabled(true);
        loadJSONButton.setEnabled(true);
        tabbedPane.setEnabledAt(1, true);
        
        //cargo los chats de la db
        chatList.setModel(new DefaultComboBoxModel(((LotRDataInput)database).getChats().toArray()));
        DefaultListModel listmodel = new DefaultListModel();
        if (chatList.getSelectedItem()!=null){
            currentChat = ((LotRDataInput)database).getChatMessages(chatList.getSelectedItem().toString());
            int i=0;
            while (i < currentChat.size()){
                if (((BasicDBObject)currentChat.get(i)).get("IPA")!=null && ((BasicDBObject)currentChat.get(i)).get("IPADescription")!=null){
                    listmodel.addElement(i+" (Analizado)");
                }
                else{
                    listmodel.addElement(i);
                }
                i++;
            }
             messageList.setModel(listmodel);
        }
        messageList.setSelectedIndex(0);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox IPAButton;
    private javax.swing.JButton cabezaButton;
    private javax.swing.JComboBox chatList;
    private javax.swing.JTextPane consoleArea;
    private javax.swing.JButton getGamesButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadJSONButton;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JList messageList;
    private javax.swing.JComboBox modelOptions;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton resetAnalysisButton;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
