import java.util.Scanner;

public class Pra_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a String :");
        s=sc.next();

        int vowels = 0, consonants = 0,Capitalletter=0;
    
      
        for (int i = 0; i < s.length(); ++i) {
          char ch =s.charAt(i);
    
        
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U' ) {
           ++vowels;
          }
           else{
             consonants++;
           }
        
          
          

           if(ch>=65 && ch<=90){
            Capitalletter++;
          }
        }
    
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("CapitalLetter: " +Capitalletter );
      
      }
    }

