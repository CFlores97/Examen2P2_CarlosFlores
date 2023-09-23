package examen2p2_carlosflores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_userToVerify = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_passToVerify = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jd_createUser = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_userName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        btn_createUSer = new javax.swing.JButton();
        jp_nombArti = new javax.swing.JPanel();
        tf_artistName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jd_createLanz = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_titPub = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_fechaPub = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_canLikes = new javax.swing.JTextField();
        btn_crtSingle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_time = new javax.swing.JTextField();
        btn_verLanzamientos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_cantCanciones = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tf_nombreAlbum = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf_likes = new javax.swing.JTextField();
        btn_crearAlbum = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_canciones = new javax.swing.JList<>();
        btn_cargar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jd_lanzamientos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_lanzArbol = new javax.swing.JTree();
        btn_upload = new javax.swing.JButton();
        pp_menu = new javax.swing.JPopupMenu();
        mi_addSong = new javax.swing.JMenuItem();
        mi_delSong = new javax.swing.JMenuItem();
        jd_canciones = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_tiempo = new javax.swing.JTextField();
        tf_nombreCanc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bg_init = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btn_jdLogin = new javax.swing.JButton();
        btn_jdCreate = new javax.swing.JButton();

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LOGIN");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("USER:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PASSWORD:");

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(tf_userToVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel16)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(tf_passToVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btn_login)))
                .addGap(106, 182, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(81, 81, 81)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tf_userToVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(tf_passToVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btn_login)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Usuarios Crear");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Username:");

        tf_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_userNameActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password:");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Edad:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tipo:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artista", "Cliente" }));
        cb_tipo.setSelectedIndex(-1);
        cb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoItemStateChanged(evt);
            }
        });

        btn_createUSer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_createUSer.setText("Crear");
        btn_createUSer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_createUSerMouseClicked(evt);
            }
        });

        jp_nombArti.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre de Artista:");

        javax.swing.GroupLayout jp_nombArtiLayout = new javax.swing.GroupLayout(jp_nombArti);
        jp_nombArti.setLayout(jp_nombArtiLayout);
        jp_nombArtiLayout.setHorizontalGroup(
            jp_nombArtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_nombArtiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(tf_artistName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_nombArtiLayout.setVerticalGroup(
            jp_nombArtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_nombArtiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jp_nombArtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_artistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(110, 110, 110)
                                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(107, 107, 107)
                                .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addComponent(jp_nombArti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_createUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel17)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jp_nombArti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btn_createUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jd_createUserLayout = new javax.swing.GroupLayout(jd_createUser.getContentPane());
        jd_createUser.getContentPane().setLayout(jd_createUserLayout);
        jd_createUserLayout.setHorizontalGroup(
            jd_createUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_createUserLayout.setVerticalGroup(
            jd_createUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("Crear Single");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Titulo de Publicacion:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Fecha de Lanzamiento");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cantidad de likes");

        btn_crtSingle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_crtSingle.setText("Crear");
        btn_crtSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crtSingleMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiempo:");

        btn_verLanzamientos.setText("Ver Lanzamientos");
        btn_verLanzamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verLanzamientosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(tf_titPub, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_fechaPub, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_canLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_crtSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_verLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel30)
                .addGap(89, 89, 89)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_titPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(tf_fechaPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(tf_canLikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(btn_crtSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_verLanzamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        jTabbedPane1.addTab("Crear Singles", jPanel17);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setText("Crear Album");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Cantidad de Canciones");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nombre del album");

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Cantidad de likes");

        btn_crearAlbum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_crearAlbum.setText("Crear");
        btn_crearAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel37)))
                            .addComponent(jLabel36))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cantCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_likes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel35)
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tf_nombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(tf_cantCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_likes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btn_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Albumes", jPanel3);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reproduccion");

        jButton2.setText("Pausar");

        jScrollPane2.setViewportView(jl_canciones);

        btn_cargar.setText("Cargar");
        btn_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cargarMouseClicked(evt);
            }
        });

        jButton4.setText("Reproducir");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(108, 108, 108))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(400, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(230, 230, 230)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addGap(66, 66, 66)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(298, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100)))
        );

        jTabbedPane1.addTab("Simulcion", jPanel6);

        javax.swing.GroupLayout jd_createLanzLayout = new javax.swing.GroupLayout(jd_createLanz.getContentPane());
        jd_createLanz.getContentPane().setLayout(jd_createLanzLayout);
        jd_createLanzLayout.setHorizontalGroup(
            jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_createLanzLayout.setVerticalGroup(
            jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lanzamientos");
        jt_lanzArbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_lanzArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_lanzArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_lanzArbol);

        btn_upload.setText("Cargar");
        btn_upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_uploadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btn_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_lanzamientosLayout = new javax.swing.GroupLayout(jd_lanzamientos.getContentPane());
        jd_lanzamientos.getContentPane().setLayout(jd_lanzamientosLayout);
        jd_lanzamientosLayout.setHorizontalGroup(
            jd_lanzamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(jd_lanzamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_lanzamientosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jd_lanzamientosLayout.setVerticalGroup(
            jd_lanzamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jd_lanzamientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_lanzamientosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        mi_addSong.setText("Agregar a album");
        mi_addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_addSongActionPerformed(evt);
            }
        });
        pp_menu.add(mi_addSong);

        mi_delSong.setText("Eliminar");
        pp_menu.add(mi_delSong);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Cancion");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiempo:");

        jButton1.setText("Agregar Cancion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(259, 259, 259))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66)
                            .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(tf_nombreCanc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(tf_nombreCanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(358, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jd_cancionesLayout = new javax.swing.GroupLayout(jd_canciones.getContentPane());
        jd_canciones.getContentPane().setLayout(jd_cancionesLayout);
        jd_cancionesLayout.setHorizontalGroup(
            jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_cancionesLayout.setVerticalGroup(
            jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_init.setBackground(new java.awt.Color(0, 0, 0));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("BIENVENIDO");

        btn_jdLogin.setText("LOGIN");
        btn_jdLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jdLoginMouseClicked(evt);
            }
        });

        btn_jdCreate.setText("Crear Usuario");
        btn_jdCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jdCreateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_initLayout = new javax.swing.GroupLayout(bg_init);
        bg_init.setLayout(bg_initLayout);
        bg_initLayout.setHorizontalGroup(
            bg_initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_initLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addGroup(bg_initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_jdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(bg_initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_initLayout.createSequentialGroup()
                    .addContainerGap(304, Short.MAX_VALUE)
                    .addComponent(btn_jdCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(296, 296, 296)))
        );
        bg_initLayout.setVerticalGroup(
            bg_initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_initLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(btn_jdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(bg_initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_initLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(btn_jdCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(296, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_init, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_init, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userNameActionPerformed

    private void cb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoItemStateChanged
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_tipo.getModel();

        if (m.getSelectedItem().equals("Artista")) {
            jp_nombArti.setVisible(true);
        } else {
            jp_nombArti.setVisible(false);
        }
    }//GEN-LAST:event_cb_tipoItemStateChanged

    private void btn_createUSerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createUSerMouseClicked
        try {
            String username = tf_userName.getText();
            String password = tf_pass.getText();

            int edad = Integer.parseInt(tf_edad.getText());

            DefaultComboBoxModel m = (DefaultComboBoxModel) cb_tipo.getModel();

            if (m.getSelectedItem().equals("Artista")) {

                try {

                    if (edad < 18 && edad > 0) {
                        JOptionPane.showMessageDialog(this, "La edad minima debe ser mayor que 18");
                    } else {
                        Artista artistCreated = new Artista(tf_artistName.getText(), username, password, edad);

                        AdminArtista ap = new AdminArtista("./Artistas.karu");

                        ap.cargarArchivo();
                        ap.setUsuario(artistCreated);
                        ap.escribirArchivo();

                        JOptionPane.showMessageDialog(jd_createUser, "Artista guardado exitosamente");

                        tf_artistName.setText("");
                        tf_userName.setText("");
                        tf_pass.setText("");
                        tf_edad.setText("");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "No se puedo guardar el artisa");
                    e.printStackTrace();

                }

            }
            if (m.getSelectedItem().equals("Cliente")) {

                try {

                    if (edad < 12 && edad > 0) {
                        JOptionPane.showMessageDialog(this, "La edad minima debe ser mayor que 12");
                    } else {
                        Cliente clientCreated = new Cliente(username, password, edad);

                        AdminCliente ap = new AdminCliente("./Clientes.karu");

                        ap.cargarArchivo();
                        ap.setUsuario(clientCreated);
                        ap.escribirArchivo();

                        JOptionPane.showMessageDialog(jd_createUser, "Cliente guardado exitosamente");

                        tf_userName.setText("");
                        tf_pass.setText("");
                        tf_edad.setText("");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "No se puedo guardar el cliente");
                    e.printStackTrace();

                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_createUSerMouseClicked

    private void btn_jdLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jdLoginMouseClicked

        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_btn_jdLoginMouseClicked

    private void btn_jdCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jdCreateMouseClicked
        jp_nombArti.setVisible(true);
        jd_createUser.pack();
        jd_createUser.setModal(true);
        jd_createUser.setLocationRelativeTo(this);
        jd_createUser.setVisible(true);
    }//GEN-LAST:event_btn_jdCreateMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        llenarArtistas();
        llenarClientes();

        if (!artistas.isEmpty()) {
            for (Artista artista : artistas) {
                System.out.println(artista.getUsername());
                System.out.println(artista.getPassword());

                if (artista.getUsername().equals(tf_userToVerify.getText()) && artista.getPassword().equals(tf_passToVerify.getText())) {

                    jd_login.setVisible(false);
                    jd_createLanz.pack();
                    jd_createLanz.setModal(true);
                    jd_createLanz.setLocationRelativeTo(this);
                    jd_createLanz.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado!");
                }
            }
        }

        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente.getUsername().equals(tf_userToVerify.getText()) && cliente.getPassword().equals(tf_passToVerify.getText())) {

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado!");
                }
            }
        }


    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uploadMouseClicked
        DefaultTreeModel m = (DefaultTreeModel) jt_lanzArbol.getModel();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) m.getRoot();

        DefaultMutableTreeNode singles = new DefaultMutableTreeNode("Singles");
        DefaultMutableTreeNode albumes = new DefaultMutableTreeNode("Albumes");

        root.add(singles);
        root.add(albumes);

        Single temp = new Single();
        Cancion tempsong = new Cancion();
        //Cancion tempSong = new Cancion();

        File fsingles = null;
        File cSingles = null;
        File aSingles = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            fsingles = new File("./Singles.txt");
            fr = new FileReader(fsingles);
            br = new BufferedReader(fr);

            if (fsingles.exists()) {

                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] sing = linea.split(",");

                    String titPub = sing[0].trim();
                    String fechaLanz = sing[1].trim();
                    int cantlikes = Integer.parseInt(sing[2].trim());

                    temp = new Single(titPub, fechaLanz, cantlikes);
                    temp.setSingle(tempsong);

                    DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(temp);

                    singles.add(tempNode);

                }

            }

            cSingles = new File("./Canciones.txt");
            fr = new FileReader(cSingles);
            br = new BufferedReader(fr);

            if (cSingles.exists()) {
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] song = linea.split(",");

                    String titPub = song[0].trim();
                    double tiempo = Double.parseDouble(song[1].trim());
                    //int cantlikes = Integer.parseInt(song[2].trim());

                    tempsong = new Cancion(titPub, tiempo);

                    DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(temp);

                    singles.add(tempNode);

                }
            }

            aSingles = new File("./Albums.txt");
            fr = new FileReader(fsingles);
            br = new BufferedReader(fr);

            if (fsingles.exists()) {

                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] sing = linea.split(",");

                    String titPub = sing[0].trim();
                    String fechaLanz = sing[1].trim();
                    int cantlikes = Integer.parseInt(sing[2].trim());

                    temp = new Single(titPub, fechaLanz, cantlikes);
                    temp.setSingle(tempsong);

                    DefaultMutableTreeNode tempNode = new DefaultMutableTreeNode(temp);

                    singles.add(tempNode);

                }

            }

            //sc.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "null");
            ex.printStackTrace();
        }

        m.reload();

    }//GEN-LAST:event_btn_uploadMouseClicked

    private void jt_lanzArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_lanzArbolMouseClicked
        if (evt.isMetaDown()) {
            //DefaultTreeModel m = (DefaultTreeModel) jt_lanzArbol.getModel();
            TreePath way = jt_lanzArbol.getSelectionPath();
            selected = (DefaultMutableTreeNode) way.getLastPathComponent();
            if (selected.getUserObject() instanceof Single) {
                pp_menu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_lanzArbolMouseClicked

    private void mi_addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_addSongActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_lanzArbol.getModel();


    }//GEN-LAST:event_mi_addSongActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        for (int i = 0; i < al.getCantCanciones(); i++) {
            File lanzSongFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            String tit = tf_nombreCanc.getText();

            double time = Math.round(Double.parseDouble(tf_tiempo.getText()) / 60);

            al.getCanciones().add(new Cancion(tit, time));

            try {

                lanzSongFile = new File("./Canciones.txt");
                fw = new FileWriter(lanzSongFile, true);
                bw = new BufferedWriter(fw);

                bw.write(tit + ", " + time + "\n");
                bw.flush();

                tf_nombreCanc.setText("");

                tf_tiempo.setText("");

                bw.close();
                fw.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(jd_createUser, "Canciones guardado exitosamente");
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_crearAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearAlbumMouseClicked
        File lanzSingleFile = null;
        File lanzSongFile = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        String tit = tf_titPub.getText();
        String nombreAl = tf_nombreAlbum.getText();
        int cantSongAl = Integer.parseInt(tf_cantCanciones.getText());
        int cantLikes = Integer.parseInt(tf_likes.getText());

        al = new Album(tit, nombreAl, cantLikes);

        try {

            lanzSingleFile = new File("./Albums.txt");
            fw = new FileWriter(lanzSingleFile, true);
            bw = new BufferedWriter(fw);

            bw.write(tit + ", " + nombreAl + ", " + cantLikes + "\n");
            bw.flush();

            JOptionPane.showMessageDialog(jd_createUser, "Album guardado exitosamente");

            tf_titPub.setText("");
            tf_fechaPub.setText("");
            tf_canLikes.setText("");
            tf_time.setText("");

            bw.close();
            fw.close();

            jd_createLanz.setVisible(false);
            jd_canciones.pack();
            jd_canciones.setModal(true);
            jd_canciones.setLocationRelativeTo(this);
            jd_canciones.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_crearAlbumMouseClicked

    private void btn_verLanzamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verLanzamientosMouseClicked

        jd_lanzamientos.pack();
        jd_lanzamientos.setModal(true);
        jd_lanzamientos.setLocationRelativeTo(this);
        jd_lanzamientos.setVisible(true);
    }//GEN-LAST:event_btn_verLanzamientosMouseClicked

    private void btn_crtSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crtSingleMouseClicked
        File lanzSingleFile = null;
        File lanzSongFile = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        String tit = tf_titPub.getText();
        String fecha = tf_fechaPub.getText();
        int likes = Integer.parseInt(tf_canLikes.getText());
        double time = Math.round(Double.parseDouble(tf_time.getText()) / 60);

        try {

            lanzSingleFile = new File("./Singles.txt");
            fw = new FileWriter(lanzSingleFile, true);
            bw = new BufferedWriter(fw);

            bw.write(tit + ", " + fecha + ", " + likes + "\n");
            bw.flush();

            lanzSongFile = new File("./Canciones.txt");
            fw = new FileWriter(lanzSongFile, true);
            bw = new BufferedWriter(fw);

            bw.write(tit + ", " + time + "\n");
            bw.flush();

            JOptionPane.showMessageDialog(jd_createUser, "Single guardado exitosamente");

            tf_titPub.setText("");
            tf_fechaPub.setText("");
            tf_canLikes.setText("");
            tf_time.setText("");

            bw.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_crtSingleMouseClicked

    private void btn_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargarMouseClicked
        
        File fsingles = null;
        File cSingles = null;
        File aSingles = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        Single temp = null;
        
        try {
            fsingles = new File("./Singles.txt");
            fr = new FileReader(fsingles);
            br = new BufferedReader(fr);
            
            int c = 0;

            if (fsingles.exists()) {

                String linea = "";
                while ((linea = br.readLine()) != null) {
                    String[] sing = linea.split(",");

                    String titPub = sing[0].trim();
                    String fechaLanz = sing[1].trim();
                    int cantlikes = Integer.parseInt(sing[2].trim());

                    temp = new Single(titPub, fechaLanz, cantlikes);
                    
                    DefaultListModel m = new DefaultListModel();
                    
                    m.add(c, temp);
                    
                    jl_canciones.setModel(m);
                    
                    c++;

                    

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_cargarMouseClicked

    public void llenarArtistas() {
        //artistas.clear();
        AdminArtista ap = new AdminArtista("./Artistas.karu");
        ap.cargarArchivo();
        artistas.addAll(ap.getListaUsuarios());
    }

    public void llenarClientes() {
        //clientes.clear();
        AdminCliente ap = new AdminCliente("./Clientes.karu");
        ap.cargarArchivo();
        clientes.addAll(ap.getListaUsuarios());
    }

    ArrayList<Artista> artistas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    Album al = null;

    DefaultMutableTreeNode selected;

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_init;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_crearAlbum;
    private javax.swing.JButton btn_createUSer;
    private javax.swing.JButton btn_crtSingle;
    private javax.swing.JButton btn_jdCreate;
    private javax.swing.JButton btn_jdLogin;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_upload;
    private javax.swing.JButton btn_verLanzamientos;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_canciones;
    private javax.swing.JDialog jd_createLanz;
    private javax.swing.JDialog jd_createUser;
    private javax.swing.JDialog jd_lanzamientos;
    private javax.swing.JDialog jd_login;
    private javax.swing.JList<String> jl_canciones;
    private javax.swing.JPanel jp_nombArti;
    private javax.swing.JTree jt_lanzArbol;
    private javax.swing.JMenuItem mi_addSong;
    private javax.swing.JMenuItem mi_delSong;
    private javax.swing.JPopupMenu pp_menu;
    private javax.swing.JTextField tf_artistName;
    private javax.swing.JTextField tf_canLikes;
    private javax.swing.JTextField tf_cantCanciones;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_fechaPub;
    private javax.swing.JTextField tf_likes;
    private javax.swing.JTextField tf_nombreAlbum;
    private javax.swing.JTextField tf_nombreCanc;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_passToVerify;
    private javax.swing.JTextField tf_tiempo;
    private javax.swing.JTextField tf_time;
    private javax.swing.JTextField tf_titPub;
    private javax.swing.JTextField tf_userName;
    private javax.swing.JTextField tf_userToVerify;
    // End of variables declaration//GEN-END:variables
}
