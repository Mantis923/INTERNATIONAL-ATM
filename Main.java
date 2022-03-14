/********************************************
*	AUTHORS:	<your names> GIULIO VITTI, ADAM ELIDRISSI, Samuel Peppetta 
* COLLABORATORS: < tutor, instructor, anyone else who helped> Sabrina Barry embedded tutor
*	LAST MODIFIED:	MARCH 12, 2022 
<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM> INTERNATIONAL ATM
*********************************************
Adam wrote the program description
*	PROGRAM DESCRIPTION:
The program converts the US dollar into seven different types of currency! 
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
*********************************************/

public class Main 
{
  
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    
    /***** DECLARATION SECTION with 5 variables *****/
    
   //Giulio did these final strings
    final String INTRO = "Welcome to the International ATM!"; //String
    //Adam created the Balance string
    final String BALANCE = "Your balance is $"; 
    final String GREETING = "Insert cash to begin.";
    //Sam did the final strings for the following:
    final String EURO_START_WORDS = " You have €";
    final String PESOS_START_WORDS = " You have ₱";
    final String YEN_START_WORDS = " You have ¥";
    final String WON_START_WORDS = " You have ₩";
    final String POUND_START_WORDS = " You have £";
    //Adam wrote the ending piece of the string
    final String IN_YO_MOMAS_BANK_ACCT = " in your bank account!";
    
    /***** INITIALIZATION SECTION *****/
    int dollar = 1000; //int
    String DollarIntro = "1000.00!";
    double euro, peso, yen, won, pound;
    
    euro = Main.calcEuro(dollar);
    peso = Main.calcPeso(dollar);
    yen = Main.calcYen(dollar);
    won = Main.calcWon(dollar);
    pound = Main.calcPound(dollar);
    
   // euro = dollar * 0.92;
   // peso = dollar * 20.98;
   // yen = dollar * 117.79;
   // won = dollar * 1240.13;
   // pound = dollar * 0.77;
    //String EuroDisplay, PesoDisplay, YenDisplay, WonDisplay, PoundDisplay; 
    
    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/
    
    //Sam and Adam
  //  EuroDisplay = String.format("%.2f", euro); //two line method
    
    /**calcPound*** OUTPUT SECTION *****/

    Main.printHeader(INTRO, GREETING);
    
    System.out.printf("║%14s%17s%-26s║%n", "", BALANCE, DollarIntro);
    System.out.printf("║%57s║%n", "");
    System.out.printf("║%10s%5.2f%-40s║%n", EURO_START_WORDS, euro, IN_YO_MOMAS_BANK_ACCT, ""); 
    //the all in one line method
    //System.out.printf("║%10s%5s%-41s║%n", EURO_START_WORDS, EuroDisplay, IN_YO_MOMAS_BANK_ACCT, ""); //the two line method, other line is EuroDisplay = String.format("%.2f", euro) above
    System.out.printf("║%10s%5.2f%-38s║%n", PESOS_START_WORDS, peso, IN_YO_MOMAS_BANK_ACCT, "");
    System.out.printf("║%10s%5.2f%-37s║%n", YEN_START_WORDS, yen, IN_YO_MOMAS_BANK_ACCT, "");
    System.out.printf("║%10s%5.2f%-36s║%n", WON_START_WORDS, won, IN_YO_MOMAS_BANK_ACCT, "");
    System.out.printf("║%10s%5.2f%-40s║%n", POUND_START_WORDS, pound, IN_YO_MOMAS_BANK_ACCT, "");
    System.out.println("╚═════════════════════════════════════════════════════════╝");
  }

     /***** STATIC METHODS *****/
//Adam did the printHeader
  public static void printHeader(String INTRO, String GREETING) {
    
    System.out.println();             
System.out.println("╔═════════════════════════════════════════════════════════╗");
    System.out.printf("║%45s%12s║%n", INTRO, "");
    System.out.printf("║%57s║%n", "");
    System.out.printf("║%35s%22s║%n", GREETING, "");
    System.out.printf("║%57s║%n", "");
    
  }
  
   public static double calcEuro(int usDollar) {
  
   double euro = usDollar * 0.92;
   return euro;
     
  }
  
  public static double calcPeso(int usDollar) {
     
    double peso = usDollar * 20.92;
    return peso;
  
    }
  
  public static double calcYen(int usDollar) { 
    
    double yen = usDollar * 117.32;
    return yen;
    
  }   
  
   public static double calcWon(int usDollar) {
 
   double won = usDollar * 1237.11;
   return won;
     
  }  
  
  public static double calcPound(int usDollar) {

  double Pound = usDollar * 0.77;
  return Pound;
    
   }
   
}