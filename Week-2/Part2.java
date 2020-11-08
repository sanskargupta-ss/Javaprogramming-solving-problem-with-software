
/**
 * Write a description of Part2 here.
 * 
 * @author (Sanskar Gupta) 
 * @version (07 Nov 2020)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
         String result = "";
         if(Character.isUpperCase(dna.charAt(0))){
             startCodon = startCodon.toUpperCase();
             stopCodon = stopCodon.toLowerCase();
         }
         else{
             startCodon = startCodon.toLowerCase();
             stopCodon = stopCodon.toUpperCase();
         }
         int startIndex = dna.indexOf(startCodon);
         if(startIndex == -1){
             return "";
         }
         int stopIndex = dna.indexOf(stopCodon,startIndex);
         if(stopIndex == -1){
             return "";
         }
         if((stopIndex - startIndex) % 3 == 0){
             return dna.substring(startIndex,stopIndex+3);
         }
         else{
             return "";
         }
     }
     public void testSimpleGene(){
         String a = "AAATGCCCTAACTAGATTAAGAAACC";
	 String ap = "CCAATGCAGCGATAC";
	 String apa = "CTAATCCGGATCCGA";
	 String app = "CCAGCATGCCAGTCAGCTAACAG";
	 String appa = "CCAGCATGCCAGTAGCTAACAG";
		
	System.out.println("The string is: " + a + ". The Gene is: " + findSimpleGene(a, "ATG", "TAA"));
        System.out.println("The string is: " + ap + ". The Gene is: " + findSimpleGene(ap, "ATG", "TAA"));
        System.out.println("The string is: " + apa + ". The Gene is: " + findSimpleGene(apa, "ATG", "TAA"));
        System.out.println("The string is: " + app + ". The Gene is: " + findSimpleGene(app, "ATG", "TAA"));
        System.out.println("The string is: " + appa + ". The Gene is: " + findSimpleGene(appa, "ATG", "TAA"));
    }
    
    public static void main (String[] args) {
        Part2 gene = new Part2();
        gene.testSimpleGene();
    }

}
