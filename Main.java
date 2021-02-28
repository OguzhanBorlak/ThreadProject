package yazlabdeneme3;

import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Yazlabdeneme3 {

    static String kat1degeri;
    static String kat2degeri;
    static String kat3degeri;
    static String kat4degeri;
    static String zeminkuyrukdegeri;
    static String kat1kuyrukdegeri;
    static String kat2kuyrukdegeri;
    static String kat3kuyrukdegeri;
    static String kat4kuyrukdegeri;
    static String asansörcountu;
    static String asansör2countu;
    static String asansör3countu;
    static String asansör4countu;
    static String asansör5countu;
    static int exitcount = 0;
    static boolean asansor1calıstımı = false;
    static boolean asansor2calıstımı = false;
    static boolean asansor3calıstımı = false;
    static boolean asansor4calıstımı = false;
    static int asansörindex = 0;
    static int asansör1index = 0;
    static int asansör2index = 0;
    static int asansör3index = 0;
    static int toplam;
    Thread avmcıkıs;
    Thread avmgiris;
    Thread asansor0;
    Thread kontrol;
    Thread asansor1;
    Thread asansor2;
    Thread asansor3;
    Thread asansor4;

    public static void main(String[] args) {
        katlar kat1 = new katlar();
        katlar kat2 = new katlar();
        katlar kat3 = new katlar();
        katlar kat4 = new katlar();
        kuyruklar zemin = new kuyruklar();
        kuyruklar kat1kuyruk = new kuyruklar();
        kuyruklar kat2kuyruk = new kuyruklar();
        kuyruklar kat3kuyruk = new kuyruklar();
        kuyruklar kat4kuyruk = new kuyruklar();
        Thread avmcıkıs;
        Thread avmgiris;
        Thread asansor0;
        Thread kontrol;
        Thread asansor1;
        Thread asansor2;
        Thread asansor3;
        Thread asansor4;

        ImageIcon img1 = new ImageIcon(new ImageIcon("H:\\masaüstü\\yazlab\\yazlabarkaplan.png").getImage().getScaledInstance(1180, 750, Image.SCALE_SMOOTH));

        JFrame pencere = new JFrame();
        pencere.setBounds(0, 0, 1192, 801);
        JLabel kat1deger = new JLabel(" ");
        JLabel kat2deger = new JLabel(" ");
        JLabel kat3deger = new JLabel(" ");
        JLabel kat4deger = new JLabel(" ");

        JLabel zeminkuyrukdeger = new JLabel(" ");
        JLabel kat1kuyrukdeger = new JLabel(" ");
        JLabel kat2kuyrukdeger = new JLabel(" ");
        JLabel kat3kuyrukdeger = new JLabel(" ");
        JLabel kat4kuyrukdeger = new JLabel(" ");

        JLabel asansörindexi = new JLabel("");
        JLabel asansöryön = new JLabel("");
        JLabel asansörcount = new JLabel("");
        JLabel asansörhedefi = new JLabel("");

        JLabel asansör2aktiflik = new JLabel("PASİF");
        JLabel asansör2mod = new JLabel("BEKLEMEDE");
        JLabel asansör2katı = new JLabel("");
        JLabel asansör2yön = new JLabel("");
        JLabel asansör2count = new JLabel("");
        JLabel asansör2hedef = new JLabel("");

        JLabel asansör3aktiflik = new JLabel("PASİF");
        JLabel asansör3mod = new JLabel("BEKLEMEDE");
        JLabel asansör3katı = new JLabel("");
        JLabel asansör3yön = new JLabel("");
        JLabel asansör3count = new JLabel("");
        JLabel asansör3hedef = new JLabel("");

        JLabel asansör4aktiflik = new JLabel("PASİF");
        JLabel asansör4mod = new JLabel("BEKLEMEDE");
        JLabel asansör4katı = new JLabel("");
        JLabel asansör4yön = new JLabel("");
        JLabel asansör4count = new JLabel("");
        JLabel asansör4hedef = new JLabel("");

        JLabel asansör5aktiflik = new JLabel("PASİF");
        JLabel asansör5mod = new JLabel("BEKLEMEDE");
        JLabel asansör5katı = new JLabel("");
        JLabel asansör5yön = new JLabel("");
        JLabel asansör5count = new JLabel("");
        JLabel asansör5hedef = new JLabel("");

        JLabel arkaplan;
        arkaplan = new JLabel();
        arkaplan.setIcon(img1);

        kat1deger.setBounds(200, 50, 150, 60);
        kat1deger.setFont(new Font("Arial", Font.PLAIN, 20));
        kat2deger.setBounds(200, 90, 150, 60);
        kat2deger.setFont(new Font("Serif", Font.PLAIN, 20));
        kat3deger.setBounds(200, 130, 150, 60);
        kat3deger.setFont(new Font("Serif", Font.PLAIN, 20));
        kat4deger.setBounds(200, 170, 150, 60);
        kat4deger.setFont(new Font("Serif", Font.PLAIN, 20));
        zeminkuyrukdeger.setBounds(400, 10, 150, 60);
        zeminkuyrukdeger.setFont(new Font("Arial", Font.PLAIN, 20));
        kat1kuyrukdeger.setBounds(400, 50, 150, 60);
        kat1kuyrukdeger.setFont(new Font("Arial", Font.PLAIN, 20));
        kat2kuyrukdeger.setBounds(400, 90, 150, 60);
        kat2kuyrukdeger.setFont(new Font("Serif", Font.PLAIN, 20));
        kat3kuyrukdeger.setBounds(400, 130, 150, 60);
        kat3kuyrukdeger.setFont(new Font("Serif", Font.PLAIN, 20));
        kat4kuyrukdeger.setBounds(400, 170, 150, 60);
        kat4kuyrukdeger.setFont(new Font("Serif", Font.PLAIN, 20));
        asansörindexi.setBounds(700, 125, 150, 60);
        asansörindexi.setFont(new Font("Serif", Font.PLAIN, 20));
        asansöryön.setBounds(700, 175, 150, 60);
        asansöryön.setFont(new Font("Serif", Font.PLAIN, 20));
        asansörcount.setBounds(700, 255, 150, 60);
        asansörcount.setFont(new Font("Serif", Font.PLAIN, 20));
        asansörhedefi.setBounds(700, 300, 150, 60);
        asansörhedefi.setFont(new Font("Serif", Font.PLAIN, 20));

        asansör2aktiflik.setBounds(1050, 45, 150, 60);
        asansör2aktiflik.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör2mod.setBounds(1050, 90, 150, 60);
        asansör2mod.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör2katı.setBounds(1050, 135, 150, 60);
        asansör2katı.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör2yön.setBounds(1050, 175, 150, 60);
        asansör2yön.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör2count.setBounds(1050, 260, 150, 60);
        asansör2count.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör2hedef.setBounds(1050, 305, 150, 60);
        asansör2hedef.setFont(new Font("Serif", Font.PLAIN, 20));

        asansör3aktiflik.setBounds(190, 425, 150, 60);
        asansör3aktiflik.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör3mod.setBounds(190, 470, 150, 60);
        asansör3mod.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör3katı.setBounds(190, 515, 150, 60);
        asansör3katı.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör3yön.setBounds(190, 550, 150, 60);
        asansör3yön.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör3count.setBounds(190, 640, 150, 60);
        asansör3count.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör3hedef.setBounds(190, 680, 150, 60);
        asansör3hedef.setFont(new Font("Serif", Font.PLAIN, 20));

        asansör4aktiflik.setBounds(700, 425, 150, 60);
        asansör4aktiflik.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör4mod.setBounds(700, 470, 150, 60);
        asansör4mod.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör4katı.setBounds(700, 515, 150, 60);
        asansör4katı.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör4yön.setBounds(700, 550, 150, 60);
        asansör4yön.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör4count.setBounds(700, 640, 150, 60);
        asansör4count.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör4hedef.setBounds(700, 680, 150, 60);
        asansör4hedef.setFont(new Font("Serif", Font.PLAIN, 20));

        asansör5aktiflik.setBounds(1050, 425, 150, 60);
        asansör5aktiflik.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör5mod.setBounds(1050, 470, 150, 60);
        asansör5mod.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör5katı.setBounds(1050, 515, 150, 60);
        asansör5katı.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör5yön.setBounds(1050, 550, 150, 60);
        asansör5yön.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör5count.setBounds(1050, 640, 150, 60);
        asansör5count.setFont(new Font("Serif", Font.PLAIN, 20));
        asansör5hedef.setBounds(1050, 680, 150, 60);
        asansör5hedef.setFont(new Font("Serif", Font.PLAIN, 20));

        pencere.add(kat1deger);
        pencere.add(kat2deger);
        pencere.add(kat3deger);
        pencere.add(kat4deger);
        pencere.add(zeminkuyrukdeger);
        pencere.add(kat1kuyrukdeger);
        pencere.add(kat2kuyrukdeger);
        pencere.add(kat3kuyrukdeger);
        pencere.add(kat4kuyrukdeger);
        pencere.add(asansörindexi);
        pencere.add(asansöryön);
        pencere.add(asansörcount);
        pencere.add(asansörhedefi);

        // pencere.add(asansör2indexi);
        pencere.add(asansör2aktiflik);
        pencere.add(asansör2mod);
        pencere.add(asansör2katı);
        pencere.add(asansör2yön);
        pencere.add(asansör2count);
        pencere.add(asansör2hedef);

        pencere.add(asansör3aktiflik);
        pencere.add(asansör3mod);
        pencere.add(asansör3katı);
        pencere.add(asansör3yön);
        pencere.add(asansör3count);
        pencere.add(asansör3hedef);

        pencere.add(asansör4hedef);
        pencere.add(asansör4aktiflik);
        pencere.add(asansör4mod);
        pencere.add(asansör4katı);
        pencere.add(asansör4yön);
        pencere.add(asansör4count);
        pencere.add(asansör4hedef);

        pencere.add(asansör5hedef);
        pencere.add(asansör5aktiflik);
        pencere.add(asansör5mod);
        pencere.add(asansör5katı);
        pencere.add(asansör5yön);
        pencere.add(asansör5count);
        pencere.add(asansör5hedef);

        pencere.add(arkaplan);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);

        avmgiris = new Thread(new Runnable() {

            @Override
            public void run() {
                int girişkuyruk = 0;
                int randkişi = 0;

                try {
                    while (randkişi < 11) {
                        randkişi = (int) (1 + Math.random() * 10);

                        zemin.kuyruktakikişi += randkişi;

                        if (zemin.kuyruktakikişi > 0) {
                            zeminkuyrukdegeri = Integer.toString(zemin.kuyruktakikişi);
                            zeminkuyrukdeger.setText(zeminkuyrukdegeri);
                        } else {
                            zeminkuyrukdeger.setText("0");
                        }

                        System.out.println("kuyruk: " + zemin.kuyruktakikişi);
                        Thread.sleep(500);
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        avmgiris.start();

        avmcıkıs = new Thread(new Runnable() {

            @Override
            public void run() {
                int randkişi, randkat;

                int totalkuyruk;
                try {
                    while (true) {
                        randkişi = (int) (1 + Math.random() * 5);
                        randkat = (int) (1 + Math.random() * 4);
                        if (randkat == 1 && kat1.kişisayısı > 5) {
                            kat1kuyruk.kuyruktakikişi += randkişi;
                            kat1.kişisayısı -= randkişi;
                        }
                        if (randkat == 2 && kat2.kişisayısı > 5) {
                            kat2kuyruk.kuyruktakikişi += randkişi;
                            kat2.kişisayısı -= randkişi;
                        }
                        if (randkat == 3 && kat3.kişisayısı > 5) {
                            kat3kuyruk.kuyruktakikişi += randkişi;
                            kat3.kişisayısı -= randkişi;
                        }
                        if (randkat == 4 && kat4.kişisayısı > 5) {
                            kat4kuyruk.kuyruktakikişi += randkişi;
                            kat4.kişisayısı -= randkişi;
                        }
                        kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                        kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                        kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                        kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                        kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                        kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                        kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                        kat4kuyrukdeger.setText(kat4kuyrukdegeri);
                        Thread.sleep(1000);
                        //    }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        avmcıkıs.start();

        asansor0 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    int asansörindex = 0;

                    boolean yön;
                    while (true) {

                        int hangikat = (int) (1 + (Math.random() * 4));

                        if (asansörindex == 0) {
                            asansörindexi.setText("0");
                            if (hangikat == 1) {
                                asansörhedefi.setText("1");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(200);
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansörcountu = Integer.toString(zemin.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                    } else {
                                        asansörcount.setText("10");
                                    }

                                    kat1.kişisayısı += zemin.kuyruktakikişi;
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;

                                } else {
                                    Thread.sleep(200);
                                    kat1.kişisayısı += 10;
                                    asansörcount.setText("10");
                                    zemin.kuyruktakikişi -= 10;

                                }
                                yön = true;
                                asansöryön.setText("AŞAĞI");
                                asansörindex = 1;
                                asansörindexi.setText("1");
                                if (asansörindex == 1 && kat1kuyruk.kuyruktakikişi != 0) {
                                    asansörhedefi.setText("0");
                                    if (kat1kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(200);
                                        asansörcountu = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                        kat1kuyruk.kuyruktakikişi -= kat1kuyruk.kuyruktakikişi;
                                        kat1.kişisayısı -= kat1kuyruk.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(200);
                                        asansörcount.setText("10");
                                        kat1kuyruk.kuyruktakikişi -= 10;
                                        kat1.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(200);
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                } else {
                                    Thread.sleep(200);
                                    yön = false;
                                    asansörhedefi.setText("0");
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                }

                            }
                            if (hangikat == 2) {
                                asansörhedefi.setText("2");
                                asansörindexi.setText("0");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(400);
                                    kat2.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansörcountu = Integer.toString(zemin.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                    } else {
                                        asansörcount.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(400);
                                    asansörcount.setText("10");
                                    kat2.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansöryön.setText("AŞAĞI");
                                asansörindex = 2;
                                asansörindexi.setText("2");
                                if (asansörindex == 2 && kat2kuyruk.kuyruktakikişi != 0) {
                                    asansörhedefi.setText("0");
                                    if (kat2kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(400);
                                        asansörcountu = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                        exitcount += kat2kuyruk.kuyruktakikişi;
                                        kat2kuyruk.kuyruktakikişi -= kat2kuyruk.kuyruktakikişi;

                                        kat2.kişisayısı -= kat2kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(400);
                                        asansörcount.setText("10");
                                        exitcount += 10;
                                        kat2kuyruk.kuyruktakikişi -= 10;
                                        kat2.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(400);
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(400);
                                    asansörhedefi.setText("0");
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                }

                            }
                            if (hangikat == 3) {
                                asansörhedefi.setText("3");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(600);
                                    kat3.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansörcountu = Integer.toString(zemin.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                    } else {
                                        asansörcount.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(600);
                                    asansörcount.setText("10");
                                    kat3.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansöryön.setText("AŞAĞI");
                                asansörindex = 3;
                                asansörindexi.setText("3");
                                if (asansörindex == 3 && kat3kuyruk.kuyruktakikişi != 0) {
                                    asansörhedefi.setText("0");
                                    if (kat3kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(600);
                                        asansörcountu = Integer.toString(kat3kuyruk.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                        exitcount += kat3kuyruk.kuyruktakikişi;
                                        kat3kuyruk.kuyruktakikişi -= kat3kuyruk.kuyruktakikişi;
                                        kat3.kişisayısı -= kat3kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(600);
                                        asansörcount.setText("10");
                                        exitcount += 10;
                                        kat3kuyruk.kuyruktakikişi -= 10;
                                        kat3.kişisayısı -= 10;

                                    }
                                    yön = false;
                                    Thread.sleep(600);
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(600);
                                    asansörhedefi.setText("0");
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                }

                            }
                            if (hangikat == 4) {
                                asansörhedefi.setText("4");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(800);
                                    kat4.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansörcountu = Integer.toString(zemin.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                    } else {
                                        asansörcount.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(800);
                                    asansörcount.setText("10");
                                    kat4.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansöryön.setText("AŞAĞI");
                                asansörindex = 4;
                                asansörindexi.setText("4");

                                if (asansörindex == 4 && kat4kuyruk.kuyruktakikişi != 0) {
                                    asansörhedefi.setText("0");
                                    if (kat4kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(800);
                                        asansörcountu = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                        asansörcount.setText(asansörcountu);
                                        exitcount += kat4kuyruk.kuyruktakikişi;
                                        kat4kuyruk.kuyruktakikişi -= kat4kuyruk.kuyruktakikişi;
                                        kat4.kişisayısı -= kat4kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(800);
                                        asansörcount.setText("10");
                                        kat4kuyruk.kuyruktakikişi -= 10;
                                        exitcount += 10;
                                        kat4.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(800);
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(800);
                                    asansörhedefi.setText("0");
                                    asansöryön.setText("YUKARI");
                                    asansörindex = 0;
                                    asansörindexi.setText("0");
                                }

                            }
                        }

                        kat1degeri = Integer.toString(kat1.kişisayısı);
                        kat1deger.setText(kat1degeri);
                        kat2degeri = Integer.toString(kat2.kişisayısı);
                        kat2deger.setText(kat2degeri);
                        kat3degeri = Integer.toString(kat3.kişisayısı);
                        kat3deger.setText(kat3degeri);
                        kat4degeri = Integer.toString(kat4.kişisayısı);
                        kat4deger.setText(kat4degeri);
                        kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                        kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                        kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                        kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                        kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                        kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                        kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                        kat4kuyrukdeger.setText(kat4kuyrukdegeri);

                        System.out.println("kat1: " + kat1.kişisayısı);
                        System.out.println("kat2: " + kat2.kişisayısı);
                        System.out.println("kat3: " + kat3.kişisayısı);
                        System.out.println("kat4: " + kat4.kişisayısı);
                        System.out.println("kat1kuyruk" + kat1kuyruk.kuyruktakikişi);
                        System.out.println("kat2kuyruk" + kat2kuyruk.kuyruktakikişi);
                        System.out.println("kat3kuyruk" + kat3kuyruk.kuyruktakikişi);
                        System.out.println("kat4kuyruk" + kat4kuyruk.kuyruktakikişi);
                        //System.out.println("exitcounnnnnnnnnnnnnnntttttttttttt: " + exitcount);
                        //  Thread.sleep(1000);   
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        asansor0.start();

        asansor1 = new Thread(new Runnable() {
            @Override
            public void run() {
                asansörindex = 0;
                try {

                    boolean yön;
                    while (true) {
                        if (asansor1calıstımı == true) {

                            int hangikat = (int) (1 + (Math.random() * 4));

                            if (asansörindex == 0) {
                                asansör2katı.setText("0");
                                if (hangikat == 1) {

                                    asansör2hedef.setText("1");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör2countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                        } else {
                                            asansör2count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += 10;
                                        asansör2count.setText("10");
                                        zemin.kuyruktakikişi -= 10;

                                    }
                                    yön = true;
                                    asansör2yön.setText("AŞAĞI");
                                    asansörindex = 1;
                                    asansör2katı.setText("1");
                                    if (asansörindex == 1 && kat1kuyruk.kuyruktakikişi != 0) {
                                        asansör2hedef.setText("0");
                                        if (kat1kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(200);
                                            asansör2countu = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                            kat1kuyruk.kuyruktakikişi -= kat1kuyruk.kuyruktakikişi;

                                            kat1.kişisayısı -= kat1kuyruk.kuyruktakikişi;
                                        } else {
                                            Thread.sleep(200);
                                            asansör2count.setText("10");
                                            kat1kuyruk.kuyruktakikişi -= 10;
                                            kat1.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    }

                                }
                                if (hangikat == 2) {
                                    asansör2hedef.setText("2");
                                    asansör2katı.setText("0");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(400);
                                        kat2.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör2countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                        } else {
                                            asansör2count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(400);
                                        asansör2count.setText("10");
                                        kat2.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör2yön.setText("AŞAĞI");
                                    asansörindex = 2;
                                    asansör2katı.setText("2");
                                    if (asansörindex == 2 && kat2kuyruk.kuyruktakikişi != 0) {
                                        asansör2hedef.setText("0");
                                        if (kat2kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(400);
                                            asansör2countu = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                            kat2kuyruk.kuyruktakikişi -= kat2kuyruk.kuyruktakikişi;

                                            kat2.kişisayısı -= kat2kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(400);
                                            asansör2count.setText("10");
                                            kat2kuyruk.kuyruktakikişi -= 10;
                                            kat2.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    }

                                }
                                if (hangikat == 3) {
                                    asansör2hedef.setText("3");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(600);
                                        kat3.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör2countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                        } else {
                                            asansör2count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(600);
                                        asansör2count.setText("10");
                                        kat3.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör2yön.setText("AŞAĞI");
                                    asansörindex = 3;
                                    asansör2katı.setText("3");
                                    if (asansörindex == 3 && kat3kuyruk.kuyruktakikişi != 0) {
                                        asansör2hedef.setText("0");
                                        if (kat3kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(600);

                                            asansör2countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);

                                            kat3kuyruk.kuyruktakikişi -= kat3kuyruk.kuyruktakikişi;
                                            kat3.kişisayısı -= kat3kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(600);
                                            asansör2count.setText("10");
                                            kat3kuyruk.kuyruktakikişi -= 10;
                                            kat3.kişisayısı -= 10;

                                        }
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    }

                                }
                                if (hangikat == 4) {
                                    asansör2hedef.setText("4");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(800);
                                        kat4.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör2countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                        } else {
                                            asansör2count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(800);
                                        asansör2count.setText("10");
                                        kat4.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör2yön.setText("AŞAĞI");
                                    asansörindex = 4;
                                    asansör2katı.setText("4");

                                    if (asansörindex == 4 && kat4kuyruk.kuyruktakikişi != 0) {
                                        asansör2hedef.setText("0");
                                        if (kat4kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(800);
                                            asansör2countu = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                            asansör2count.setText(asansör2countu);
                                            kat4kuyruk.kuyruktakikişi -= kat4kuyruk.kuyruktakikişi;
                                            kat4.kişisayısı -= kat4kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(800);
                                            asansör2count.setText("10");
                                            kat4kuyruk.kuyruktakikişi -= 10;
                                            kat4.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör2yön.setText("YUKARI");
                                        asansörindex = 0;
                                        asansör2katı.setText("0");
                                    }

                                }
                                //}

                                kat1degeri = Integer.toString(kat1.kişisayısı);
                                kat1deger.setText(kat1degeri);
                                kat2degeri = Integer.toString(kat2.kişisayısı);
                                kat2deger.setText(kat2degeri);
                                kat3degeri = Integer.toString(kat3.kişisayısı);
                                kat3deger.setText(kat3degeri);
                                kat4degeri = Integer.toString(kat4.kişisayısı);
                                kat4deger.setText(kat4degeri);
                                kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                                kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                                kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                                kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                                kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                kat4kuyrukdeger.setText(kat4kuyrukdegeri);

                                Thread.sleep(10);
                            }
                        }
                        asansörindex = 0;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        asansor2 = new Thread(new Runnable() {

            @Override
            public void run() {
                asansör1index = 0;
                try {

                    boolean yön;
                    while (true) {
                        if (asansor2calıstımı == true) {

                            int hangikat = (int) (1 + (Math.random() * 4));

                            // if (asansörindex == 0) {
                            asansör3katı.setText("0");
                            if (hangikat == 1) {
                                asansör3hedef.setText("1");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(200);
                                    kat1.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansör3countu = Integer.toString(zemin.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                    } else {
                                        asansör3count.setText("10");
                                    }

                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;

                                } else {
                                    Thread.sleep(200);
                                    kat1.kişisayısı += 10;
                                    asansör3count.setText("10");
                                    zemin.kuyruktakikişi -= 10;

                                }
                                yön = true;
                                asansör3yön.setText("AŞAĞI");
                                asansör1index = 1;
                                asansör3katı.setText("1");
                                if (asansör1index == 1 && kat1kuyruk.kuyruktakikişi != 0) {
                                    asansör3hedef.setText("0");
                                    if (kat1kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(200);
                                        asansör3countu = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                        kat1kuyruk.kuyruktakikişi -= kat1kuyruk.kuyruktakikişi;

                                        kat1.kişisayısı -= kat1kuyruk.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(200);
                                        asansör3count.setText("10");
                                        kat1kuyruk.kuyruktakikişi -= 10;
                                        kat1.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(200);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(200);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                }

                            }
                            if (hangikat == 2) {
                                asansör3hedef.setText("2");
                                asansör3katı.setText("0");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(400);
                                    kat2.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansör3countu = Integer.toString(zemin.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                    } else {
                                        asansör3count.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(400);
                                    asansör3count.setText("10");
                                    kat2.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansör3yön.setText("AŞAĞI");
                                asansör1index = 2;
                                asansör3katı.setText("2");
                                if (asansör1index == 2 && kat2kuyruk.kuyruktakikişi != 0) {
                                    asansör3hedef.setText("0");
                                    if (kat2kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(400);
                                        asansör3countu = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                        kat2kuyruk.kuyruktakikişi -= kat2kuyruk.kuyruktakikişi;

                                        kat2.kişisayısı -= kat2kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(400);
                                        asansör3count.setText("10");
                                        kat2kuyruk.kuyruktakikişi -= 10;
                                        kat2.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(400);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(400);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                }

                            }
                            if (hangikat == 3) {
                                asansör3hedef.setText("3");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(600);
                                    kat3.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansör3countu = Integer.toString(zemin.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                    } else {
                                        asansör3count.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(600);
                                    asansör3count.setText("10");
                                    kat3.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansör3yön.setText("AŞAĞI");
                                asansör1index = 3;
                                asansör3katı.setText("3");
                                if (asansör1index == 3 && kat3kuyruk.kuyruktakikişi != 0) {
                                    asansör3hedef.setText("0");
                                    if (kat3kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(600);
                                        asansör3countu = Integer.toString(kat3kuyruk.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                        kat3kuyruk.kuyruktakikişi -= kat3kuyruk.kuyruktakikişi;
                                        kat3.kişisayısı -= kat3kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(600);
                                        asansör3count.setText("10");
                                        kat3kuyruk.kuyruktakikişi -= 10;
                                        kat3.kişisayısı -= 10;

                                    }
                                    yön = false;
                                    Thread.sleep(600);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(600);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                }

                            }
                            if (hangikat == 4) {
                                asansör3hedef.setText("4");
                                if (zemin.kuyruktakikişi <= 10) {
                                    Thread.sleep(800);
                                    kat4.kişisayısı += zemin.kuyruktakikişi;
                                    if (zemin.kuyruktakikişi <= 10) {
                                        asansör3countu = Integer.toString(zemin.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                    } else {
                                        asansör3count.setText("10");
                                    }
                                    zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                } else {
                                    Thread.sleep(800);
                                    asansör3count.setText("10");
                                    kat4.kişisayısı += 10;
                                    zemin.kuyruktakikişi -= 10;
                                }
                                yön = true;
                                asansör3yön.setText("AŞAĞI");
                                asansör1index = 4;
                                asansör3katı.setText("4");

                                if (asansör1index == 4 && kat4kuyruk.kuyruktakikişi != 0) {
                                    asansör3hedef.setText("0");
                                    if (kat4kuyruk.kuyruktakikişi < 10) {
                                        Thread.sleep(800);
                                        asansör3countu = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                        asansör3count.setText(asansör3countu);
                                        kat4kuyruk.kuyruktakikişi -= kat4kuyruk.kuyruktakikişi;
                                        kat4.kişisayısı -= kat4kuyruk.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(800);
                                        asansör3count.setText("10");
                                        kat4kuyruk.kuyruktakikişi -= 10;
                                        kat4.kişisayısı -= 10;
                                    }
                                    yön = false;
                                    Thread.sleep(800);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                } else {
                                    yön = false;
                                    Thread.sleep(800);
                                    asansör3yön.setText("YUKARI");
                                    asansör1index = 0;
                                    asansör3katı.setText("0");
                                }

                            }
                            // }

                            kat1degeri = Integer.toString(kat1.kişisayısı);
                            kat1deger.setText(kat1degeri);
                            kat2degeri = Integer.toString(kat2.kişisayısı);
                            kat2deger.setText(kat2degeri);
                            kat3degeri = Integer.toString(kat3.kişisayısı);
                            kat3deger.setText(kat3degeri);
                            kat4degeri = Integer.toString(kat4.kişisayısı);
                            kat4deger.setText(kat4degeri);
                            kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                            kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                            kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                            kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                            kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                            kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                            kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                            kat4kuyrukdeger.setText(kat4kuyrukdegeri);

                            // Thread.sleep(1000);
                        }
                        asansör1index = 0;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        asansor3 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    asansör2index = 0;

                    boolean yön;
                    while (true) {
                        if (asansor3calıstımı == true) {
                            int hangikat = (int) (1 + (Math.random() * 4));
                            //   Thread.sleep(500);

                            if (asansör2index == 0) {
                                asansör4katı.setText("0");
                                if (hangikat == 1) {
                                    asansör4hedef.setText("1");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör4countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                        } else {
                                            asansör4count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += 10;
                                        asansör4count.setText("10");
                                        zemin.kuyruktakikişi -= 10;

                                    }
                                    yön = true;
                                    asansör4yön.setText("AŞAĞI");
                                    asansör2index = 1;
                                    asansör4katı.setText("1");
                                    if (asansör2index == 1 && kat1kuyruk.kuyruktakikişi != 0) {
                                        asansör4hedef.setText("0");
                                        if (kat1kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(200);
                                            asansör4countu = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                            kat1kuyruk.kuyruktakikişi -= kat1kuyruk.kuyruktakikişi;

                                            kat1.kişisayısı -= kat1kuyruk.kuyruktakikişi;
                                        } else {
                                            Thread.sleep(200);
                                            asansör4count.setText("10");
                                            kat1kuyruk.kuyruktakikişi -= 10;
                                            kat1.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    }

                                }
                                if (hangikat == 2) {
                                    asansör4hedef.setText("2");
                                    asansör4katı.setText("0");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(400);
                                        kat2.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör4countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                        } else {
                                            asansör4count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(400);
                                        asansör4count.setText("10");
                                        kat2.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör4yön.setText("AŞAĞI");
                                    asansör2index = 2;
                                    asansör4katı.setText("2");
                                    if (asansör2index == 2 && kat2kuyruk.kuyruktakikişi != 0) {
                                        asansör4hedef.setText("0");
                                        if (kat2kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(400);
                                            asansör4countu = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                            kat2kuyruk.kuyruktakikişi -= kat2kuyruk.kuyruktakikişi;

                                            kat2.kişisayısı -= kat2kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(400);
                                            asansör4count.setText("10");
                                            kat2kuyruk.kuyruktakikişi -= 10;
                                            kat2.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    }

                                }
                                if (hangikat == 3) {
                                    asansör4hedef.setText("3");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(600);
                                        kat3.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör4countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                        } else {
                                            asansör4count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(600);
                                        asansör4count.setText("10");
                                        kat3.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör4yön.setText("AŞAĞI");
                                    asansör2index = 3;
                                    asansör4katı.setText("3");
                                    if (asansör2index == 3 && kat3kuyruk.kuyruktakikişi != 0) {
                                        asansör4hedef.setText("0");
                                        if (kat3kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(600);

                                            asansör4countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);

                                            kat3kuyruk.kuyruktakikişi -= kat3kuyruk.kuyruktakikişi;
                                            kat3.kişisayısı -= kat3kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(600);
                                            asansör4count.setText("10");
                                            kat3kuyruk.kuyruktakikişi -= 10;
                                            kat3.kişisayısı -= 10;

                                        }
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    }

                                }
                                if (hangikat == 4) {
                                    asansör4hedef.setText("4");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(800);
                                        kat4.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör4countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                        } else {
                                            asansör4count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(800);
                                        asansör4count.setText("10");
                                        kat4.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör4yön.setText("AŞAĞI");
                                    asansör2index = 4;
                                    asansör4katı.setText("4");

                                    if (asansör2index == 4 && kat4kuyruk.kuyruktakikişi != 0) {
                                        asansör4hedef.setText("0");
                                        if (kat4kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(800);
                                            asansör4countu = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                            asansör4count.setText(asansör4countu);
                                            kat4kuyruk.kuyruktakikişi -= kat4kuyruk.kuyruktakikişi;
                                            kat4.kişisayısı -= kat4kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(800);
                                            asansör4count.setText("10");
                                            kat4kuyruk.kuyruktakikişi -= 10;
                                            kat4.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör4yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör4katı.setText("0");
                                    }

                                }
                            }

                            kat1degeri = Integer.toString(kat1.kişisayısı);
                            kat1deger.setText(kat1degeri);
                            kat2degeri = Integer.toString(kat2.kişisayısı);
                            kat2deger.setText(kat2degeri);
                            kat3degeri = Integer.toString(kat3.kişisayısı);
                            kat3deger.setText(kat3degeri);
                            kat4degeri = Integer.toString(kat4.kişisayısı);
                            kat4deger.setText(kat4degeri);
                            kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                            kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                            kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                            kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                            kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                            kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                            kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                            kat4kuyrukdeger.setText(kat4kuyrukdegeri);

                            Thread.sleep(10);
                        }
                        asansör2index = 0;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        asansor4 = new Thread(new Runnable() {
            @Override
            public void run() {
                asansör2index = 0;
                try {
                    asansör2index = 0;

                    boolean yön;
                    while (true) {
                        if (asansor4calıstımı == true) {
                            int hangikat = (int) (1 + (Math.random() * 4));

                            if (asansör2index == 0) {
                                asansör5katı.setText("0");
                                if (hangikat == 1) {
                                    asansör5hedef.setText("1");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör5countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                        } else {
                                            asansör5count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;

                                    } else {
                                        Thread.sleep(200);
                                        kat1.kişisayısı += 10;
                                        asansör5count.setText("10");
                                        zemin.kuyruktakikişi -= 10;

                                    }
                                    yön = true;
                                    asansör5yön.setText("AŞAĞI");
                                    asansör2index = 1;
                                    asansör5katı.setText("1");
                                    if (asansör2index == 1 && kat1kuyruk.kuyruktakikişi != 0) {
                                        asansör5hedef.setText("0");
                                        if (kat1kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(200);
                                            asansör5countu = Integer.toString(kat1kuyruk.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                            kat1kuyruk.kuyruktakikişi -= kat1kuyruk.kuyruktakikişi;

                                            kat1.kişisayısı -= kat1kuyruk.kuyruktakikişi;
                                        } else {
                                            Thread.sleep(200);
                                            asansör5count.setText("10");
                                            kat1kuyruk.kuyruktakikişi -= 10;
                                            kat1.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(200);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    }

                                }
                                if (hangikat == 2) {
                                    asansör5hedef.setText("2");
                                    asansör5katı.setText("0");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(400);
                                        kat2.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör5countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                        } else {
                                            asansör5count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(400);
                                        asansör5count.setText("10");
                                        kat2.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör5yön.setText("AŞAĞI");
                                    asansör2index = 2;
                                    asansör5katı.setText("2");
                                    if (asansör2index == 2 && kat2kuyruk.kuyruktakikişi != 0) {
                                        asansör5hedef.setText("0");
                                        if (kat2kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(400);
                                            asansör5countu = Integer.toString(kat2kuyruk.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                            kat2kuyruk.kuyruktakikişi -= kat2kuyruk.kuyruktakikişi;

                                            kat2.kişisayısı -= kat2kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(400);
                                            asansör5count.setText("10");
                                            kat2kuyruk.kuyruktakikişi -= 10;
                                            kat2.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(400);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    }

                                }
                                if (hangikat == 3) {
                                    asansör5hedef.setText("3");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(600);
                                        kat3.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör5countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                        } else {
                                            asansör5count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(600);
                                        asansör5count.setText("10");
                                        kat3.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör5yön.setText("AŞAĞI");
                                    asansör2index = 3;
                                    asansör5katı.setText("3");
                                    if (asansör2index == 3 && kat3kuyruk.kuyruktakikişi != 0) {
                                        asansör5hedef.setText("0");
                                        if (kat3kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(600);
                                            asansör5countu = Integer.toString(kat3kuyruk.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                            kat3kuyruk.kuyruktakikişi -= kat3kuyruk.kuyruktakikişi;
                                            kat3.kişisayısı -= kat3kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(600);
                                            asansör5count.setText("10");
                                            kat3kuyruk.kuyruktakikişi -= 10;
                                            kat3.kişisayısı -= 10;

                                        }
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(600);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    }

                                }
                                if (hangikat == 4) {
                                    asansör5hedef.setText("4");
                                    if (zemin.kuyruktakikişi <= 10) {
                                        Thread.sleep(800);
                                        kat4.kişisayısı += zemin.kuyruktakikişi;
                                        if (zemin.kuyruktakikişi <= 10) {
                                            asansör5countu = Integer.toString(zemin.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                        } else {
                                            asansör5count.setText("10");
                                        }
                                        zemin.kuyruktakikişi -= zemin.kuyruktakikişi;
                                    } else {
                                        Thread.sleep(800);
                                        asansör5count.setText("10");
                                        kat4.kişisayısı += 10;
                                        zemin.kuyruktakikişi -= 10;
                                    }
                                    yön = true;
                                    asansör5yön.setText("AŞAĞI");
                                    asansör2index = 4;
                                    asansör5katı.setText("4");

                                    if (asansör2index == 4 && kat4kuyruk.kuyruktakikişi != 0) {
                                        asansör5hedef.setText("0");
                                        if (kat4kuyruk.kuyruktakikişi < 10) {
                                            Thread.sleep(800);
                                            asansör5countu = Integer.toString(kat4kuyruk.kuyruktakikişi);
                                            asansör5count.setText(asansör5countu);
                                            kat4kuyruk.kuyruktakikişi -= kat4kuyruk.kuyruktakikişi;
                                            kat4.kişisayısı -= kat4kuyruk.kuyruktakikişi;

                                        } else {
                                            Thread.sleep(800);
                                            asansör5count.setText("10");
                                            kat4kuyruk.kuyruktakikişi -= 10;
                                            kat4.kişisayısı -= 10;
                                        }
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    } else {
                                        yön = false;
                                        Thread.sleep(800);
                                        asansör5yön.setText("YUKARI");
                                        asansör2index = 0;
                                        asansör5katı.setText("0");
                                    }

                                }
                            }

                            kat1degeri = Integer.toString(kat1.kişisayısı);
                            kat1deger.setText(kat1degeri);
                            kat2degeri = Integer.toString(kat2.kişisayısı);
                            kat2deger.setText(kat2degeri);
                            kat3degeri = Integer.toString(kat3.kişisayısı);
                            kat3deger.setText(kat3degeri);
                            kat4degeri = Integer.toString(kat4.kişisayısı);
                            kat4deger.setText(kat4degeri);
                            kat1kuyrukdegeri = Integer.toString(kat1kuyruk.kuyruktakikişi);
                            kat1kuyrukdeger.setText(kat1kuyrukdegeri);
                            kat2kuyrukdegeri = Integer.toString(kat2kuyruk.kuyruktakikişi);
                            kat2kuyrukdeger.setText(kat2kuyrukdegeri);
                            kat3kuyrukdegeri = Integer.toString(kat3kuyruk.kuyruktakikişi);
                            kat3kuyrukdeger.setText(kat3kuyrukdegeri);
                            kat4kuyrukdegeri = Integer.toString(kat4kuyruk.kuyruktakikişi);
                            kat4kuyrukdeger.setText(kat4kuyrukdegeri);

                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        kontrol = new Thread(new Runnable() {
            int i = 0, j = 0, a = 0, b = 0;

            @Override
            public void run() {

                try {
                    while (true) {

                        toplam = kat1kuyruk.kuyruktakikişi + kat2kuyruk.kuyruktakikişi + kat3kuyruk.kuyruktakikişi + kat4kuyruk.kuyruktakikişi + zemin.kuyruktakikişi;
                        // System.out.println("toplaaaaaam " + toplam);

                        if (toplam >= 20 && i == 0) {

                            if (i == 0) {
                                asansör2aktiflik.setText("AKTİF");
                                asansör2mod.setText("ÇALIŞIYOR");

                                asansor1.start();
                                asansor1calıstımı = true;

                                i++;

                            }

                         if (toplam < 20 && i >= 1 && i % 2 == 1) {

                            asansör2aktiflik.setText("PASİF");
                            asansör2mod.setText("BEKLEMEDE");
                            asansor1calıstımı = false;
                            i++;
                        }
                        if (toplam >= 20 && i >= 2 && i % 2 == 0) {

                            asansor1calıstımı = true;
                            asansör2aktiflik.setText("AKTİF");
                            asansör2mod.setText("ÇALIŞIYOR");
                            i++;
 
                        }}
                       
                      
                        if (toplam >= 40 && j == 0) {

                            if (j == 0) {
                                asansör3aktiflik.setText("AKTİF");
                                asansör3mod.setText("ÇALIŞIYOR");
                                asansor2.start();
                                asansor2calıstımı = true;
                                j++;

                            }
                            if (toplam < 40 && j >= 1 && j % 2 == 1) {

                                asansör3aktiflik.setText("PASİF");
                                j++;
                                asansör3mod.setText("BEKLEMEDE");
                                asansor2calıstımı = false;
                            }
                            if (toplam >= 40 && j >= 2 && j % 2 == 0) {
                                asansor2calıstımı = true;
                                asansör3aktiflik.setText("AKTİF");
                                asansör3mod.setText("ÇALIŞIYOR");
                                j++;
                            }
                        }

                        if (toplam >= 60 && a == 0) {

                            if (a == 0) {
                                asansör4aktiflik.setText("AKTİF");
                                asansör4mod.setText("ÇALIŞIYOR");
                                asansor3.start();
                                asansor3calıstımı = true;
                                a++;

                            }
                            if (toplam < 60 && a >= 1 && a % 2 == 1) {

                                asansör4aktiflik.setText("PASİF");
                                a++;
                                asansör4mod.setText("BEKLEMEDE");
                                asansor3calıstımı = false;
                            }
                            if (toplam >= 60 && a >= 2 && a % 2 == 0) {
                                asansor3calıstımı = true;
                                asansör4aktiflik.setText("AKTİF");
                                asansör4mod.setText("ÇALIŞIYOR");
                                a++;
                            }
                        }

                        if (toplam >= 80 && b == 0) {

                            if (b == 0) {
                                asansör5aktiflik.setText("AKTİF");
                                asansör5mod.setText("ÇALIŞIYOR");
                                asansor4.start();
                                asansor4calıstımı = true;
                                b++;

                            }
                            if (toplam < 80 && b >= 1 && b % 2 == 1) {

                                asansör5aktiflik.setText("PASİF");
                                b++;
                                asansör5mod.setText("BEKLEMEDE");
                                asansor4calıstımı = false;
                            }
                            if (toplam >= 80 && b >= 2 && b % 2 == 0) {
                                asansor4calıstımı = true;
                                asansör5aktiflik.setText("AKTİF");
                                asansör5mod.setText("ÇALIŞIYOR");
                                b++;
                            }
                        }

                        Thread.sleep(10);
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Yazlabdeneme3.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        kontrol.start();

    }

}
