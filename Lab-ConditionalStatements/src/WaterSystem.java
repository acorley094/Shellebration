
public class WaterSystem {
	 public static void main(String args[]){
	        int precipitation = 0;
	        int waterOutput = 0;
	        int temperature = 80;
	        
	        //start an if-statement
	        if (precipitation < 15){
	        	if (temperature <= 75){
	                waterOutput = 32;
	            }
	            else {
	                waterOutput = 45;
	            }
	        }else if (precipitation < 35){
	        	if (temperature <= 70){
	                waterOutput = 15;
	            }
	            else {
	                waterOutput = 25;
	            } 
	        }else if (precipitation < 48){
	        	if (temperature <= 70){
	                waterOutput = 0;
	            }
	            else {
	                waterOutput = 10;
	            }
	        }else {
	        	waterOutput = 0;
	        }

	        System.out.println("The water output should be " + waterOutput);
	    }
}
