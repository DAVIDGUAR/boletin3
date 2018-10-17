package boletin3;


public class Consumo {
    
    private float km,litros,vMed,pGas;
    
    //constructor defecto
    
    public Consumo(){
        }
    
    //constructor parametros
    
    public Consumo(float km,float Lt,float vMed,float pGas){
        this.km=km;
        this.litros=Lt;
        this.pGas=pGas;
        this.vMed=vMed;
    }
    
    //metodos
    
    public void setkm (float km){
    this.km = km;
    }
    public float getkm(){
    return km;
    }
    public void setlitros (float Lt){
        this.litros = Lt;
    }
    
    public float getlitros(){
        return litros;
    }
    
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    
    public float getvMed(){
        return vMed;
        
    }
    public void setpGas(){
        this.pGas = pGas;
        
    }
    public float getpGas(){
        return pGas;
    }
    
    public float calculo(){
        
        
    }
        
    
}
