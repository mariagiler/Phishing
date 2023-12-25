/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc_parte3;

import java.util.Scanner;


public class PRC_parte3 {

   
    public static void main(String[] args) {
         String[] keywords = {
            "Notificación esencial", "Acceso a tu perfil", "recompensa", "Oportunidad de ingresos", "Sin costo",
            "Ganador afortunado", "Bloqueo cuenta", "Bloqueo de acceso", "Vencimiento de la membresía", "Actualización de información",
            "Confirmación de identidad", "clave segura", "oferta exclusiva", "suspensión temporal", "Oferta especial",
            "Problemas de seguridad detectados", "Suspensión temporal de cuenta", "Reclama tu premio", "Oferta por tiempo limitado",
            "Problemas con inicio de sesión", "Obtén tu premio", "Restablecer la cuenta", "Problema inicio de sesión", "Oferta limitada en el tiempo",
            "Recupera el acceso", "Advertencia de seguridad importante", "Confirma tu identidad", "Oferta promocional increíble",
            "Realice la actualización inmediatamente", "Cierre de perfil"
        };
        
        int[] scores = {3,3,2,1,3,2,1,1,2,2,3,3,2,1,3,3,2,1,3,2,1,3,2,1,3,3,3,3,3,3};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba la palabra a investigar :: ");
        String text = scanner.nextLine();
        
        int totalScore = 0;
        
        for (int i = 0; i < keywords.length; i++) {
          
        }
    }
    
}
