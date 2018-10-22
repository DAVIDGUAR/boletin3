
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
        Consumo consumo1 = new Consumo(120f,10f,150f,1.40f,1f);
        
        //D
        System.out.println("consumo Medio= " +consumo1.consumoMedio());
        System.out.println("consumo Euro= " +consumo1.consumoEuro());
        

        //E
        consumo1.setpGas(1.55f);
        consumo1.setlitros(12f);
        
        
        System.out.println("consumo Medio= " +consumo1.consumoMedio());
        System.out.println("consumo Euro= " +consumo1.consumoEuro());

        //F no lo pedia el enunciado
        //System.out.println("velocidad media=" +consumo1.velocidadMedia());
        
        //F 
        System.out.println("velocidad media2=" +consumo1.getvMed());
    }
    
}
