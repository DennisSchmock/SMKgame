package SMKGUI;

import java.awt.CardLayout;

public class BigScreen extends javax.swing.JFrame {
    
    // Fields
    private CardLayout layCard;

    public BigScreen() {
        initComponents();
        layCard = new CardLayout();
        bigMainPanel.setLayout(layCard);
        bigMainPanel.add("bigIntroPanel", bigIntroPanel);
        bigMainPanel.add("bigWaitingPanel", bigWaitingPanel);
        bigMainPanel.add("bigQuestionPanel", bigQuestionPanel);
        bigMainPanel.add("bigScorePanel", bigScorePanel);
        bigMainPanel.add("bigRankingPanel", bigRankingPanel);
        bigMainPanel.add("bigCorrectPanel", bigCorrectPanel);
        
    }

    public void bigIntroPanel() {
        layCard.show(bigMainPanel, "bigIntroPanel");
    }
    
    public void bigWaitingPanel() {
        layCard.show(bigMainPanel, "bigWaitingPanel");
    }    
    
    public void bigQuestionPanel() {
        layCard.show(bigMainPanel, "bigQuestionPanel");
    }   

    public void bigScorePanel() {
        layCard.show(bigMainPanel, "bigScorePanel");
    }   

    public void bigRankingPanel() {
        layCard.show(bigMainPanel, "bigRankingPanel");
    }    
    public void bigCorrectAnswerPanel(){
        
        layCard.show(bigMainPanel, "bigCorrectPanel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bigMainPanel = new javax.swing.JPanel();
        bigIntroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bigWaitingPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player5 = new javax.swing.JLabel();
        bigQuestionPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bigScorePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        WinnerIcon = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bigRankingPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rank1 = new javax.swing.JLabel();
        rank5 = new javax.swing.JLabel();
        rank2 = new javax.swing.JLabel();
        rank3 = new javax.swing.JLabel();
        rank4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        score1 = new javax.swing.JLabel();
        score3 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        score5 = new javax.swing.JLabel();
        score4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bigCorrectPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Art Game - Big screen");
        setLocation(new java.awt.Point(3500, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        bigMainPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        bigMainPanel.setLayout(new java.awt.CardLayout());

        bigIntroPanel.setBackground(new java.awt.Color(255, 255, 255));
        bigIntroPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLAY THE ART GAME");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI/btn_appstore.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI/google-play-en@2x.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("To play, download our app.");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        javax.swing.GroupLayout bigIntroPanelLayout = new javax.swing.GroupLayout(bigIntroPanel);
        bigIntroPanel.setLayout(bigIntroPanelLayout);
        bigIntroPanelLayout.setHorizontalGroup(
            bigIntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigIntroPanelLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(bigIntroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigIntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigIntroPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigIntroPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigIntroPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bigIntroPanelLayout.setVerticalGroup(
            bigIntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigIntroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(bigIntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        bigMainPanel.add(bigIntroPanel, "card2");

        bigWaitingPanel.setBackground(new java.awt.Color(255, 255, 255));
        bigWaitingPanel.setForeground(new java.awt.Color(255, 255, 255));
        bigWaitingPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("The game will begin shortly");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel21.setText("Waiting for players to join:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        player1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        player1.setText("user connecting...");
        player1.setPreferredSize(new java.awt.Dimension(220, 40));

        player2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        player2.setText("user connecting...");
        player2.setPreferredSize(new java.awt.Dimension(220, 40));

        player3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        player3.setText("user connecting...");
        player3.setPreferredSize(new java.awt.Dimension(220, 40));

        player4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        player4.setText("user connecting...");
        player4.setPreferredSize(new java.awt.Dimension(220, 40));

        player5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        player5.setText("user connecting...");
        player5.setPreferredSize(new java.awt.Dimension(220, 40));

        javax.swing.GroupLayout bigWaitingPanelLayout = new javax.swing.GroupLayout(bigWaitingPanel);
        bigWaitingPanel.setLayout(bigWaitingPanelLayout);
        bigWaitingPanelLayout.setHorizontalGroup(
            bigWaitingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigWaitingPanelLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(bigWaitingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigWaitingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bigWaitingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60)
                        .addGroup(bigWaitingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bigWaitingPanelLayout.setVerticalGroup(
            bigWaitingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigWaitingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigWaitingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel21))
                .addGap(59, 59, 59)
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bigMainPanel.add(bigWaitingPanel, "card3");

        bigQuestionPanel.setBackground(new java.awt.Color(255, 255, 255));
        bigQuestionPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("The Question here");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Answer on your phone now! ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI/btn_appstore.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        javax.swing.GroupLayout bigQuestionPanelLayout = new javax.swing.GroupLayout(bigQuestionPanel);
        bigQuestionPanel.setLayout(bigQuestionPanelLayout);
        bigQuestionPanelLayout.setHorizontalGroup(
            bigQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigQuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bigQuestionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bigQuestionPanelLayout.setVerticalGroup(
            bigQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigQuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bigMainPanel.add(bigQuestionPanel, "card4");

        bigScorePanel.setBackground(new java.awt.Color(255, 255, 255));
        bigScorePanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("The winner is!");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        WinnerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinnerIcon.setToolTipText("");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        javax.swing.GroupLayout bigScorePanelLayout = new javax.swing.GroupLayout(bigScorePanel);
        bigScorePanel.setLayout(bigScorePanelLayout);
        bigScorePanelLayout.setHorizontalGroup(
            bigScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bigScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bigScorePanelLayout.createSequentialGroup()
                        .addGroup(bigScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WinnerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bigScorePanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bigScorePanelLayout.setVerticalGroup(
            bigScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WinnerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bigMainPanel.add(bigScorePanel, "card5");

        bigRankingPanel.setBackground(new java.awt.Color(255, 255, 255));
        bigRankingPanel.setPreferredSize(new java.awt.Dimension(1000, 650));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rankings");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("4th");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("3rd");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("2nd");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("1st");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel10.setText("Position");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel24.setText("Player");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel25.setText("Score");

        rank1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        rank5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        rank2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        rank3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        rank4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("5th");

        score1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        score3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        score2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        score5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        score4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        javax.swing.GroupLayout bigRankingPanelLayout = new javax.swing.GroupLayout(bigRankingPanel);
        bigRankingPanel.setLayout(bigRankingPanelLayout);
        bigRankingPanelLayout.setHorizontalGroup(
            bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigRankingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bigRankingPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigRankingPanelLayout.createSequentialGroup()
                        .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(180, 180, 180)
                        .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rank4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rank3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rank2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rank5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bigRankingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(150, 150, 150)
                        .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rank1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(203, 203, 203))
        );
        bigRankingPanelLayout.setVerticalGroup(
            bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigRankingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel26))
                .addGap(29, 29, 29)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rank4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bigRankingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rank5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        bigMainPanel.add(bigRankingPanel, "card6");

        bigCorrectPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMKGUI_pics/header_logo.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel28.setText("Correct answers");

        q1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        q1.setText("jLabel29");

        q2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        q2.setText("jLabel29");

        q3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        q3.setText("jLabel29");

        q4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        q4.setText("jLabel29");

        q5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        q5.setText("jLabel29");

        a1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a1.setText("jLabel29");

        a2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a2.setText("jLabel29");

        a3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a3.setText("jLabel29");

        a4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a4.setText("jLabel29");

        a5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        a5.setText("jLabel29");

        javax.swing.GroupLayout bigCorrectPanelLayout = new javax.swing.GroupLayout(bigCorrectPanel);
        bigCorrectPanel.setLayout(bigCorrectPanelLayout);
        bigCorrectPanelLayout.setHorizontalGroup(
            bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigCorrectPanelLayout.createSequentialGroup()
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigCorrectPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel28))
                    .addGroup(bigCorrectPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4)
                            .addComponent(a5)
                            .addComponent(a2)
                            .addComponent(a3)
                            .addComponent(a1))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        bigCorrectPanelLayout.setVerticalGroup(
            bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigCorrectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addGap(58, 58, 58)
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1)
                    .addComponent(a1))
                .addGap(30, 30, 30)
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2)
                    .addComponent(a2))
                .addGap(30, 30, 30)
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3)
                    .addComponent(a3))
                .addGap(30, 30, 30)
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4)
                    .addComponent(a4))
                .addGap(30, 30, 30)
                .addGroup(bigCorrectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5)
                    .addComponent(a5))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        bigMainPanel.add(bigCorrectPanel, "card7");

        getContentPane().add(bigMainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(BigScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BigScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BigScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BigScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BigScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel WinnerIcon;
    public javax.swing.JLabel a1;
    public javax.swing.JLabel a2;
    public javax.swing.JLabel a3;
    public javax.swing.JLabel a4;
    public javax.swing.JLabel a5;
    private javax.swing.JPanel bigCorrectPanel;
    private javax.swing.JPanel bigIntroPanel;
    private javax.swing.JPanel bigMainPanel;
    private javax.swing.JPanel bigQuestionPanel;
    private javax.swing.JPanel bigRankingPanel;
    private javax.swing.JPanel bigScorePanel;
    private javax.swing.JPanel bigWaitingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JProgressBar jProgressBar3;
    public javax.swing.JProgressBar jProgressBar4;
    public javax.swing.JLabel player1;
    public javax.swing.JLabel player2;
    public javax.swing.JLabel player3;
    public javax.swing.JLabel player4;
    public javax.swing.JLabel player5;
    public javax.swing.JLabel q1;
    public javax.swing.JLabel q2;
    public javax.swing.JLabel q3;
    public javax.swing.JLabel q4;
    public javax.swing.JLabel q5;
    public javax.swing.JLabel rank1;
    public javax.swing.JLabel rank2;
    public javax.swing.JLabel rank3;
    public javax.swing.JLabel rank4;
    public javax.swing.JLabel rank5;
    public javax.swing.JLabel score1;
    public javax.swing.JLabel score2;
    public javax.swing.JLabel score3;
    public javax.swing.JLabel score4;
    public javax.swing.JLabel score5;
    // End of variables declaration//GEN-END:variables
}
