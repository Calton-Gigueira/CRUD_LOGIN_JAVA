/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.UserDAO;
import models.User;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

/**
 *
 * @author Calton Gigueira
 */
public class Formulario extends javax.swing.JFrame {

    public Formulario() {
      initComponents();
      fillTable();

      updateButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genreComboField = new javax.swing.JComboBox<>();
        saveButtton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        functionField = new javax.swing.JComboBox<>();
        statusField = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        newButton = new javax.swing.JButton();
        alterButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        wellcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Função:");

        jLabel7.setText("Status:");

        genreComboField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        saveButtton.setText("Cadastrar");
        saveButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButttonActionPerformed(evt);
            }
        });

        updateButton.setText("Atualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        functionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        statusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(genreComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveButtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(functionField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(functionField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusField)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genreComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Senha", "E-mail", "Sexo", "Função", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usersTable);

        newButton.setText("Novo");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        alterButton.setText("Editar");
        alterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(newButton)
                        .addGap(48, 48, 48)
                        .addComponent(alterButton)
                        .addGap(39, 39, 39)
                        .addComponent(deleteButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(wellcomeLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(wellcomeLabel)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Lista de Usuários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void saveButttonActionPerformed(java.awt.event.ActionEvent evt) {
        User user = new User();
        user.setName(nameField.getText());

        char[] password = passwordField.getPassword();
        String textPassword = new String(password);
        user.setPassword(textPassword);
        java.util.Arrays.fill(password, '\0');
        user.setEmail(emailField.getText());
        user.setGenre(genreComboField.getSelectedItem().toString());
        user.setFunction(functionField.getSelectedItem().toString());
        user.setStatus(statusField.getSelectedItem().toString());

        UserDAO userDAO = new UserDAO();
        userDAO.insertUser(user);

        cleanFields();
        fillTable();
        wellcomeLabel.setText("");
        jTabbedPane1.setSelectedIndex(1);
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {
      cleanFields();

      jTabbedPane1.setSelectedIndex(0);
      updateButton.setVisible(false);
      saveButtton.setVisible(true);
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
      User user = new User();
      user.setName(nameField.getText());

      char[] password = passwordField.getPassword();
      String textPassword = new String(password);
      user.setPassword(textPassword);
      java.util.Arrays.fill(password, '\0');
      user.setEmail(emailField.getText());
      user.setGenre(genreComboField.getSelectedItem().toString());
      user.setFunction(functionField.getSelectedItem().toString());
      user.setStatus(statusField.getSelectedItem().toString());

      int selectedRow = usersTable.getSelectedRow();
      int id = (int) usersTable.getValueAt(selectedRow, 0);
      user.setId(id);

      UserDAO userDAO = new UserDAO();
      userDAO.updateUser(user);

      fillTable();
      jTabbedPane1.setSelectedIndex(1);
      wellcomeLabel.setText("");
      saveButtton.setVisible(true);
      updateButton.setVisible(false);
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
      cleanFields();

      updateButton.setVisible(false);
      saveButtton.setVisible(true);
    }

    private void alterButtonActionPerformed(java.awt.event.ActionEvent evt) {
      int selectedRow = usersTable.getSelectedRow();

      if (selectedRow >= 0) {
        nameField.setText(usersTable.getValueAt(selectedRow, 1).toString());
        passwordField.setText(usersTable.getValueAt(selectedRow, 2).toString());
        emailField.setText(usersTable.getValueAt(selectedRow, 3).toString());
        genreComboField.setSelectedItem(usersTable.getValueAt(selectedRow, 4).toString());
        functionField.setSelectedItem(usersTable.getValueAt(selectedRow, 5).toString());
        statusField.setSelectedItem(usersTable.getValueAt(selectedRow, 6).toString());

        jTabbedPane1.setSelectedIndex(0);
        updateButton.setVisible(true);
        saveButtton.setVisible(false);
      } else {
        JOptionPane.showMessageDialog(null, "Selecione uma linha.");
      }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
      int selectedRow = usersTable.getSelectedRow();

      if (selectedRow >= 0) {
        User user = new User();

        int id = (int) usersTable.getValueAt(selectedRow, 0);
        user.setId(id);

        user.setName(usersTable.getValueAt(selectedRow, 1).toString());
        user.setPassword(usersTable.getValueAt(selectedRow, 2).toString());
        user.setEmail(usersTable.getValueAt(selectedRow, 3).toString());
        user.setGenre(usersTable.getValueAt(selectedRow, 4).toString());
        user.setFunction(usersTable.getValueAt(selectedRow, 5).toString());
        user.setStatus(usersTable.getValueAt(selectedRow, 6).toString());

        UserDAO userDAO = new UserDAO();
        userDAO.deleteUser(user);

        fillTable();

        updateButton.setVisible(false);
        saveButtton.setVisible(true);

        cleanFields();
      } else {
        JOptionPane.showMessageDialog(null, "Selecione uma linha.");
      }
    }

    private void cleanFields() {
        nameField.setText("");
        passwordField.setText("");
        emailField.setText("");
    }

    private void fillTable() {
      UserDAO userDAO = new UserDAO();
      ArrayList<User> users = userDAO.listAllUsers();

      DefaultTableModel tableModel = (DefaultTableModel) usersTable.getModel();
      tableModel.setRowCount(0);

      for (User user : users) {
        tableModel.addRow(new Object[] {
          user.getId(),
          user.getName(),
          user.getPassword(),
          user.getEmail(),
          user.getGenre(),
          user.getFunction(),
          user.getStatus()   
        });
      }

      usersTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          String senhaEscondida = "********";
          return super.getTableCellRendererComponent(table, senhaEscondida, isSelected, hasFocus, row, column);
        }
      });
    }

    private javax.swing.JButton alterButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> functionField;
    private javax.swing.JComboBox<String> genreComboField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton newButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton saveButtton;
    private javax.swing.JComboBox<String> statusField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable usersTable;
    private javax.swing.JLabel wellcomeLabel;

    public javax.swing.JTabbedPane getJTabbedPane1() {
        return this.jTabbedPane1;
    }
    
    public javax.swing.JLabel getwellcomeLabel() {
        return this.wellcomeLabel;
    }
}
