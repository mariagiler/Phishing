
package prc_phishing_principal;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PRC_Phishing_principal {
    
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
            int occurrences = textosrepetidosss(text, keywords[i]);
            if (occurrences > 0) {
                int score = occurrences * scores[i];
                System.out.printf("TOTAL ACONTINUACIÓN: \nPalabras claves: %s, Ocurrencias: %d, Puntaje: %d%n",
                        keywords[i], occurrences, score);
                totalScore += score;
            }
        }
        
        System.out.println("el total es :: " + totalScore);
           
       }
       
       private static int textosrepetidosss(String text, String keyword) {
        int count = 0;
        int index = text.indexOf(keyword);
        while (index != -1) {
            count++;
            index = text.indexOf(keyword, index + keyword.length());
        }
        return count;
      }

    }


   
