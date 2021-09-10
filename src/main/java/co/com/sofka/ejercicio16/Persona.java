package co.com.sofka.ejercicio16;

public class Persona {
    /**Atributos**/
    private String nombre;
    private int edad;
    private String DNI;
    private Character sexo;
    private double peso;
    private double altura;
    private static final byte PESO_IDEAL = 0;
    private static final byte SOBRE_PESO = 1;
    private static final byte BAJO_PESO = -1;
    private final char[] letrasDNI = {  'T', 'R', 'W',
                                        'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                        'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                                        'V', 'H', 'L', 'C', 'K', 'E'};


    /**Constructor**/
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
        generateDNI();
    }

    public Persona(String nombre, int edad, Character sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generateDNI();
    }

    public Persona(String nombre, int edad, Character sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generateDNI();
    }

    public byte calcularIMC(){
        double IMC = (this.peso/Math.pow(this.altura,2));
        if(IMC<20) return BAJO_PESO;
        else if(IMC>=20 && IMC <=25) return PESO_IDEAL;
        else return SOBRE_PESO;
    }

    public Boolean esMayorDeEdad() {
        if (this.getEdad() >= 18) return Boolean.TRUE;
         else return Boolean.FALSE;
    }

    private void comprobarSexo(Character sexo) {
        sexo = Character.toUpperCase(sexo);
        if (sexo.equals('H') || sexo.equals('M')) this.sexo=sexo;
        else this.sexo='H';
    }

    private void generateDNI(){

        int numDNI = (int) (100000000 * Math.random());
        int rest = numDNI % 23;
        this.DNI = "" + numDNI + "" + letrasDNI[rest];

    }

    @Override
    public String toString() {
        return  "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }
    public void comprobarPesoIdeal(){
        if(calcularIMC()==-1) System.out.println("Estas bajo de peso");
        else if(calcularIMC()==0) System.out.println("Estas en tu peso ideal");
        else System.out.println("Estas en sobrepeso");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
