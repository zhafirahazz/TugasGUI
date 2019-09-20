package guiapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FormData extends JFrame{
    public FormData(){
        //buat frame
        JFrame jf = new JFrame();
        jf.setTitle("INPUT DATA DIRI");
        jf.setSize(1000, 700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setLayout(null);
        
        //title
        JLabel labelJudul = new JLabel("===== B I O D A T A =====");
        jf.add(labelJudul);
        labelJudul.setBounds(430, 20, 300, 30);
        
        JTextField fnama = new JTextField(100); //nama
        jf.add(fnama);
        fnama.setBounds(500, 70, 200, 30);
        JLabel labelNama = new JLabel("Nama");
        jf.add(labelNama);
        labelNama.setBounds(300, 70, 150, 20);
        
        JTextField fnim = new JTextField(100); //nim
        jf.add(fnim);
        fnim.setBounds(500, 120, 200, 30);
        JLabel labelNim = new JLabel("NIM");
        jf.add(labelNim);
        labelNim.setBounds(300, 120, 170, 20);
        
        JLabel ljeniskelamin = new JLabel("Jenis Kelamin"); //jenis kelamin
        jf.add(ljeniskelamin);
        ljeniskelamin.setBounds(300, 170, 190, 20);
        JRadioButton rbPria = new JRadioButton(" Laki-laki ");
        jf.add(rbPria);
        rbPria.setBounds(500, 170, 100, 20);
        JRadioButton rbWanita = new JRadioButton(" Perempuan ");
        jf.add(rbWanita);
         rbWanita.setBounds(600, 170, 100, 20);
         
        String[] namaAgama //agama
                = {" Islam ", 
                   " Kristen ",
                   " Katholik ",
                   " Hindu ",
                   " Budha "};
        JComboBox cmbAgama = new JComboBox(namaAgama);
        jf.add(cmbAgama);
        cmbAgama.setBounds(500, 220, 280, 20);
        JLabel labelAgama = new JLabel("Agama");
        jf.add(labelAgama);
        labelAgama.setBounds(300, 220, 150, 20);
        
        String[] namaFakultas //fakultas
                = {" FAKULTAS FARMASI",
                   " FAKULTAS PERTANIAN ",
                   " FAKULTAS PETERNAKAN ",
                   " FAKULTAS KEDOKTERAN ",
                   " FAKULTAS EKONOMI BISNIS ",
                   " FAKULTAS TEKNIK INDUSTRI ",                 
                   " FALKUTAS TEKNOLOGI MINERAL ", 
                   " FAKULTAS ILMU SOSIAL DAN ILMU POLITIK "}; 
        JComboBox cmbFakultas = new JComboBox(namaFakultas);
        jf.add(cmbFakultas);
        cmbFakultas.setBounds(500, 270, 280, 20);
        JLabel labelFakultas = new JLabel("Fakultas");
        jf.add(labelFakultas);
        labelFakultas.setBounds(300, 270, 150, 20);
        
        JTextArea tAlamat = new JTextArea(); //alamat
        tAlamat.setLineWrap(true);
        tAlamat.setWrapStyleWord(true);
        jf.add(tAlamat);
        tAlamat.setBounds(500, 320, 280, 110);
        JLabel labelAlamat = new JLabel("Alamat");
        jf.add(labelAlamat);
        labelAlamat.setBounds(300, 320, 150, 20);
        
        JButton save = new JButton("Save"); //save
        jf.add(save);
        save.setBounds(500, 450, 70, 30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               String name = fnama.getText();
               String nim = fnim.getText();
               String jk = " ";
                if(rbPria.isSelected()){
                    jk = "Laki-Laki";
                }
                else if(rbWanita.isSelected()){
                        jk = "Perempuan";
                        }
               
               String agamaAgama  = cmbAgama.getSelectedItem().toString();
               String fakFakultas = cmbFakultas.getSelectedItem().toString();
               String alamat = tAlamat.getText();
               jf.dispose();
               TampilForm tf = new TampilForm(name, nim, jk, agamaAgama, fakFakultas, alamat);  
            }
        });               
    }
}
