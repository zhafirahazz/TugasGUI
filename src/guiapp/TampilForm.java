package guiapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TampilForm extends JFrame {
    
    TampilForm(String name, String nim, String jk, String agamaAgama, String fakFakultas, String alamat) {
        JFrame frame = new JFrame();
        frame.setTitle("INPUT DATA DIRI");
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        
        JLabel labelJudul = new JLabel("===== B I O D A T A =====");
        frame.add(labelJudul);
        labelJudul.setBounds(430, 20, 300, 30);
        
        JLabel labelNama = new JLabel("Nama");
        frame.add(labelNama);
        labelNama.setBounds(300, 70, 150, 20);
        JLabel hasil1 = new JLabel(name);
        frame.add(hasil1);
        hasil1.setBounds(500, 70, 200, 30);
        
        JLabel labelNim = new JLabel("NIM");
        frame.add(labelNim);
        labelNim.setBounds(300, 120, 170, 20);
        JLabel hasil2 = new JLabel(nim);
        frame.add(hasil2);
        hasil2.setBounds(500, 120, 200, 30);
        
        JLabel ljeniskelamin = new JLabel("Jenis Kelamin"); //jenis kelamin
        frame.add(ljeniskelamin);
        ljeniskelamin.setBounds(300, 170, 190, 20);
        JLabel hasil3 = new JLabel(jk);
        frame.add(hasil3);
        hasil3.setBounds(500, 170, 100, 20);
        
        JLabel labelAgama = new JLabel("Agama");
        frame.add(labelAgama);
        labelAgama.setBounds(300, 220, 150, 20);
        JLabel hasil4 = new JLabel(agamaAgama);
        frame.add(hasil4);
        hasil4.setBounds(500, 220, 280, 20);
        
        JLabel labelFakultas = new JLabel("Fakultas");
        frame.add(labelFakultas);
        labelFakultas.setBounds(300, 270, 150, 20);
        JLabel hasil5 = new JLabel(fakFakultas);
        frame.add(hasil5);
        hasil5.setBounds(500, 270, 280, 20);
        
        JLabel labelAlamat = new JLabel("Alamat");
        frame.add(labelAlamat);
        labelAlamat.setBounds(300, 320, 150, 20);
        JLabel hasil6 = new JLabel(alamat);
        frame.add(hasil6);
        hasil6.setBounds(500, 275, 280, 110);
        
        JButton oke = new JButton("OK"); //oke untuk keluar
        frame.add(oke);
        oke.setBounds(500, 450, 70, 30);
        oke.addActionListener(new ActionListener() {
            @Override
            @SuppressWarnings("empty-statement")
            public void actionPerformed(java.awt.event.ActionEvent ae) {
               if(JOptionPane.showConfirmDialog(null, "Anda Yakin Keluar?", "Keluar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                   System.exit(0);
            }
        }
        });
    }   
    }
