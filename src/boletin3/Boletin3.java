
package boletin3;


public class Boletin3 {

    public static void main(String[] args) {
        
        
        //A
        //Consumo consume = new Consumo();
        //System.out.println("consumo Medio= " +consume.consumoMedio());
        //System.out.println("consume Euro= " +consume.consumoEuro());
        
        
        //B
        //consume.setlitros(50f);
        //consume.setpGas(1.57f);
        //System.out.println("consumo Medio= " + consume.consumoMedio());
        //System.out.println("consumo Euro= " + consume.consumoEuro());
        
        
        //C
        Consumo consumo1 = new Consumo(100f,10f,150f,1.40f,60f);
        
        //D
        //System.out.println("consumo Medio= " +consumo1.consumoMedio());
        //System.out.println("consumo Euro= " +consumo1.consumoEuro());
        

        //E
        consumo1.setlitros(1.55f);
        
        System.out.println("consumo Medio= " +consumo1.getlitros());
        System.out.println("consumo Medio= " +consumo1.consumoMedio());
        System.out.println("consumo Euro= " +consumo1.consumoEuro());

        //F
        //System.out.println("velocidad media=" +consumo1.velocidadMedia());
    }
    
}
