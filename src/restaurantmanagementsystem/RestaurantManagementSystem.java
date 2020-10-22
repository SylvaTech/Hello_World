/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsystem;
/**
 *
 * @author Sylva
 */
public class RestaurantManagementSystem {
        private static Menu home;
        
    
        public static void main(String[] args) {
            
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
                System.out.println("An error occurred while configuring the UI:::" + ex.getMessage());
                ex.printStackTrace();
            }
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               home = new Menu();
               home.setVisible(true);
               home.setLocationRelativeTo(null);
               //home.setResizable(false);
            }
        });
    }
    
}
