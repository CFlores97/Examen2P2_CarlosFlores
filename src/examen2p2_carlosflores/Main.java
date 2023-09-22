package examen2p2_carlosflores;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        llenarArtistas();
        llenarClientes();

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
        jButton3 = new javax.swing.JButton();
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
        btn_saveArtists = new javax.swing.JButton();
        btn_saveClients = new javax.swing.JButton();
        jd_createLanz = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_titPub2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_fechaPub2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_canLikes2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
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

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("LOGIN");

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
                        .addComponent(jButton3)))
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
                .addComponent(jButton3)
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

        btn_saveArtists.setText("Guardar Artistas");
        btn_saveArtists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveArtistsMouseClicked(evt);
            }
        });

        btn_saveClients.setText("Guardar Clientes");
        btn_saveClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveClientsMouseClicked(evt);
            }
        });

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
                        .addComponent(btn_createUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btn_saveArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btn_saveClients, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel17)))
                .addContainerGap(107, Short.MAX_VALUE))
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
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_createUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_saveClients, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btn_saveArtists, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
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
        jLabel30.setText("Crear Lanzamientos");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Titulo de Publicacion:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Fecha de Lanzamiento");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cantidad de likes");

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setText("Crear");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_fechaPub2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_titPub2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_canLikes2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addGap(63, 63, 63)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_titPub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_fechaPub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_canLikes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_createLanzLayout = new javax.swing.GroupLayout(jd_createLanz.getContentPane());
        jd_createLanz.getContentPane().setLayout(jd_createLanzLayout);
        jd_createLanzLayout.setHorizontalGroup(
            jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
            .addGroup(jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_createLanzLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jd_createLanzLayout.setVerticalGroup(
            jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(jd_createLanzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_createLanzLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

                        artistas.add(artistCreated);
                        
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
                        
                        clientes.add(clientCreated);
                        

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

    private void btn_saveArtistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveArtistsMouseClicked

        try {
            AdminArtista ap = new AdminArtista("./Artistas.karu");

            for (Artista artista : artistas) {
                ap.cargarArchivo();
                ap.setUsuario(artista);
                ap.escribirArchivo();
            }

            JOptionPane.showMessageDialog(this, "Artistas guardados exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar clientes");
            e.printStackTrace();
        }


    }//GEN-LAST:event_btn_saveArtistsMouseClicked

    private void btn_saveClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveClientsMouseClicked
        try {
            AdminCliente ap = new AdminCliente("./Clientes.karu");

            for (Cliente cliente : clientes) {
                ap.cargarArchivo();
                ap.setUsuario(cliente);
                ap.escribirArchivo();
            }

            JOptionPane.showMessageDialog(this, "Clientes guardados exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar clientes");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_saveClientsMouseClicked

    public void llenarArtistas() {
        AdminArtista ap = new AdminArtista("./Artistas.karu");
        ap.cargarArchivo();
        artistas.addAll(ap.getListaUsuarios());
    }

    public void llenarClientes() {
        AdminCliente ap = new AdminCliente("./Clientes.karu");
        ap.cargarArchivo();
        clientes.addAll(ap.getListaUsuarios());
    }

    ArrayList<Artista> artistas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

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
    private javax.swing.JButton btn_createUSer;
    private javax.swing.JButton btn_jdCreate;
    private javax.swing.JButton btn_jdLogin;
    private javax.swing.JButton btn_saveArtists;
    private javax.swing.JButton btn_saveClients;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JDialog jd_createLanz;
    private javax.swing.JDialog jd_createUser;
    private javax.swing.JDialog jd_login;
    private javax.swing.JPanel jp_nombArti;
    private javax.swing.JTextField tf_artistName;
    private javax.swing.JTextField tf_canLikes2;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_fechaPub2;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_passToVerify;
    private javax.swing.JTextField tf_titPub2;
    private javax.swing.JTextField tf_userName;
    private javax.swing.JTextField tf_userToVerify;
    // End of variables declaration//GEN-END:variables
}
