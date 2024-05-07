import java.io.*;

// Classe para ler dados de entrada (pela entrada padr�o) 
// @vers�o 2 - 20 Jan 2002
// @autor: Paulo Marques (pmarques@dei.uc.pt)

public class Le
{
	// Inibe o construtor por defeito
	private Le() 
	{
	}
	
	// Le um inteiro da entrada padr�o. 
	// A entrada � terminada com um return. Se a entrada n�o for 
	// v�lida � mostrada a mensagem "!!! N�o � um inteiro !!!" e o 
	// utilizador pode tentar de novo.
	// @devolve o n�mero lido

	public static int umInt()
	{
  		while(true)
      	{
        	try
         	{  
         		return Integer.valueOf(umaString().trim()).intValue();
         	} 
      		catch(Exception e)
         	{  
         		System.out.println("!!! N�o � um inteiro !!!");
         	}
         }
	}
	
	// Le um double da entrada padr�o. 
	// A entrada � terminada com um return. Se a entrada n�o for
	// v�lida � mostrada a mensagem "!!! N�o � um double !!!" e o 
	// utilizador pode tentar de novo.
	// @devolve o n�mero lido

	
	public static double umDouble()
	{
  		while(true)
      	{
        	try
         	{ 
         		return Double.valueOf(umaString().trim()).doubleValue();
         	} 
      		catch(Exception e)
         	{  
         		System.out.println("!!! N�o � um double !!!");
         	}
         }
	}
	
	// Le um float da entrada padr�o. 
	// A entrada � terminada com um return. Se a entrada n�o for 
	// v�lida � mostrada a mensagem "!!! N�o � um float !!!" e o 
	// utilizador pode tentar de novo.
	// @devolve o n�mero lido

	public static float umFloat()
	{
  		while(true)
      	{
        	try
         	{ 
         		return Float.valueOf(umaString().trim()).floatValue();
         	} 
      		catch(Exception e)
         	{  
         		System.out.println("!!! N�o � um float !!!");
         	}
         }
	}
	
	
	// Le um char da entrada padr�o.
	// A entrada � terminada com um return. Se a entrada n�o for
	// v�lida � mostrada a mensagem "!!! N�o � um char !!!" e o
	// utilizador pode tentar de novo.
	// @Devolve o car�cter lido

	public static char umChar()
	{
		String s = "";
		
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1);
			s = in.readLine();
		}
		catch (IOException e)
		{
        	System.out.println("!!! N�o � um char!!!");
		}
		
		return s.charAt(0);
	}
		
	// Le uma String da entrada padr�o. 
	// A entrada � terminada com um return. 
	// @devolve a String lida

	public static String umaString()
	{
		String s = "";
		
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1);
			s = in.readLine();
		}
		catch (IOException e)
		{
        	System.out.println("!!! N�o � uma String!!!");
		}
		
		return s;
	}
}
		
	

