
package takvimuygulamasi;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JLayeredPane {

   private int month;
   private int year;
   
    public PanelDate(int month, int year) {
        initComponents();
        this.month=month;
        this.year=year;
        init();
    }

    private void init(){
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
    }
    
    private void setDate(){
        Calendar calendar =Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) -1;
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay=getToDay();
          for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                  if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1);
                
            }
        }
        
    }
   
     private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new takvimuygulamasi.Cell();
        mon = new takvimuygulamasi.Cell();
        tue = new takvimuygulamasi.Cell();
        wed = new takvimuygulamasi.Cell();
        thu = new takvimuygulamasi.Cell();
        fri = new takvimuygulamasi.Cell();
        sat = new takvimuygulamasi.Cell();
        cell9 = new takvimuygulamasi.Cell();
        cell10 = new takvimuygulamasi.Cell();
        cell11 = new takvimuygulamasi.Cell();
        cell12 = new takvimuygulamasi.Cell();
        cell13 = new takvimuygulamasi.Cell();
        cell14 = new takvimuygulamasi.Cell();
        cell8 = new takvimuygulamasi.Cell();
        cell15 = new takvimuygulamasi.Cell();
        cell16 = new takvimuygulamasi.Cell();
        cell17 = new takvimuygulamasi.Cell();
        cell18 = new takvimuygulamasi.Cell();
        cell19 = new takvimuygulamasi.Cell();
        cell20 = new takvimuygulamasi.Cell();
        cell21 = new takvimuygulamasi.Cell();
        cell22 = new takvimuygulamasi.Cell();
        cell23 = new takvimuygulamasi.Cell();
        cell24 = new takvimuygulamasi.Cell();
        cell25 = new takvimuygulamasi.Cell();
        cell26 = new takvimuygulamasi.Cell();
        cell27 = new takvimuygulamasi.Cell();
        cell28 = new takvimuygulamasi.Cell();
        cell29 = new takvimuygulamasi.Cell();
        cell30 = new takvimuygulamasi.Cell();
        cell31 = new takvimuygulamasi.Cell();
        cell32 = new takvimuygulamasi.Cell();
        cell33 = new takvimuygulamasi.Cell();
        cell34 = new takvimuygulamasi.Cell();
        cell35 = new takvimuygulamasi.Cell();
        cell36 = new takvimuygulamasi.Cell();
        cell37 = new takvimuygulamasi.Cell();
        cell38 = new takvimuygulamasi.Cell();
        cell39 = new takvimuygulamasi.Cell();
        cell40 = new takvimuygulamasi.Cell();
        cell41 = new takvimuygulamasi.Cell();
        cell42 = new takvimuygulamasi.Cell();
        cell43 = new takvimuygulamasi.Cell();
        cell44 = new takvimuygulamasi.Cell();
        cell45 = new takvimuygulamasi.Cell();
        cell46 = new takvimuygulamasi.Cell();
        cell47 = new takvimuygulamasi.Cell();
        cell48 = new takvimuygulamasi.Cell();
        cell49 = new takvimuygulamasi.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(221, 13, 13));
        sun.setText("Pazar");
        sun.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(sun);

        mon.setText("Pazartesi");
        mon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Sali");
        tue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Carsamba");
        wed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Persembe");
        thu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Cuma");
        fri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Cumartesi");
        sat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(sat);

        cell9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell14);

        cell8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell8);

        cell15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell18ActionPerformed(evt);
            }
        });
        add(cell18);

        cell19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void cell18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell18ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private takvimuygulamasi.Cell cell10;
    private takvimuygulamasi.Cell cell11;
    private takvimuygulamasi.Cell cell12;
    private takvimuygulamasi.Cell cell13;
    private takvimuygulamasi.Cell cell14;
    private takvimuygulamasi.Cell cell15;
    private takvimuygulamasi.Cell cell16;
    private takvimuygulamasi.Cell cell17;
    private takvimuygulamasi.Cell cell18;
    private takvimuygulamasi.Cell cell19;
    private takvimuygulamasi.Cell cell20;
    private takvimuygulamasi.Cell cell21;
    private takvimuygulamasi.Cell cell22;
    private takvimuygulamasi.Cell cell23;
    private takvimuygulamasi.Cell cell24;
    private takvimuygulamasi.Cell cell25;
    private takvimuygulamasi.Cell cell26;
    private takvimuygulamasi.Cell cell27;
    private takvimuygulamasi.Cell cell28;
    private takvimuygulamasi.Cell cell29;
    private takvimuygulamasi.Cell cell30;
    private takvimuygulamasi.Cell cell31;
    private takvimuygulamasi.Cell cell32;
    private takvimuygulamasi.Cell cell33;
    private takvimuygulamasi.Cell cell34;
    private takvimuygulamasi.Cell cell35;
    private takvimuygulamasi.Cell cell36;
    private takvimuygulamasi.Cell cell37;
    private takvimuygulamasi.Cell cell38;
    private takvimuygulamasi.Cell cell39;
    private takvimuygulamasi.Cell cell40;
    private takvimuygulamasi.Cell cell41;
    private takvimuygulamasi.Cell cell42;
    private takvimuygulamasi.Cell cell43;
    private takvimuygulamasi.Cell cell44;
    private takvimuygulamasi.Cell cell45;
    private takvimuygulamasi.Cell cell46;
    private takvimuygulamasi.Cell cell47;
    private takvimuygulamasi.Cell cell48;
    private takvimuygulamasi.Cell cell49;
    private takvimuygulamasi.Cell cell8;
    private takvimuygulamasi.Cell cell9;
    private takvimuygulamasi.Cell fri;
    private takvimuygulamasi.Cell mon;
    private takvimuygulamasi.Cell sat;
    private takvimuygulamasi.Cell sun;
    private takvimuygulamasi.Cell thu;
    private takvimuygulamasi.Cell tue;
    private takvimuygulamasi.Cell wed;
    // End of variables declaration//GEN-END:variables
}
