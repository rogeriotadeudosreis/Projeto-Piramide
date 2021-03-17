
package classe;

public class Piramide {
    
    private float base = 0;
    private float altura = 0;

    //Métodos getters e setters
    public float getBase() {
        return base;
    }

        public void setBase(float base) {
        this.base = base;
    }

        public float getAltura() {
        return altura;
    }

        public void setAltura(float altura) {
        this.altura = altura;
    }
        public float calcularVolume(){
            return (float)(1.0/3.0 * base * altura);
        }
                
    
}
