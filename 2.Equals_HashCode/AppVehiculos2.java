public class AppVehiculos2 {

    public static boolean comparaHash(Vehiculo v1, Vehiculo v2){
        int hash1 = v1.hashCode(); 
        int hash2 = v2.hashCode();
        return hash1 == hash2;
    }
    
    public static boolean comparaMotor(Vehiculo v1, Vehiculo v2){
        int hash1 = v1.getMotor().hashCode();
        int hash2 = v2.getMotor().hashCode();
        return hash1 == hash2;
    }
    
    public static float mediaPotencia(Vehiculo v1, Vehiculo v2){
        float p1 = v1.getMotor().getPotencia();
        float p2 = v2.getMotor().getPotencia();
        float media = (p1 + p2)/2;
        return media;
    }
    
    public static Vehiculo devolverPesado(Vehiculo v1, Vehiculo v2){
        float peso1 = v1.getPeso();
        float peso2 = v2.getPeso();
        if (peso1 > peso2) {
            return v1;
        }else
            return v2;
    }
    
    public static void main(String[] args) {
       
        Motor m1 = new Motor(72, 78984546, 2);
        Motor m2 = new Motor(156, 36925841, 4);
        
        System.out.println("Motor 1:" +
                "\n Potencia: " + m1.getPotencia() + 
                "\n N Motor: " + m1.N_MOTOR + 
                "\n Cilindros: " + m1.N_CILINDROS );
        
        System.out.println("Motor 2:" + m2);
        
        
        Vehiculo v1 = new Vehiculo("2345GRS", m1);
        Vehiculo v2 = new Vehiculo(5, 1923.2F, "8765JLP", m2);
        Vehiculo v3 = new Vehiculo();
    
        System.out.println("Potencia v1: " + v1.getMotor().getPotencia() );
        System.out.println("N max pasajeros v2: " + v2.N_ASIENTOS );
        System.out.println("v3 : " + v3);
        
        v2.subirPasajeros(15);
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        v2.subirPasajeros(10);
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        v2.descargarPasajeros();
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        
        System.out.println("FIN");
        
        System.out.println( v1.equals(v2) );
        
        //Creo v4 con los atributos de v1
        Vehiculo v4 = new Vehiculo(v1.N_ASIENTOS, v1.getPeso(), v1.getMatricula(), v1.getMotor());
        v4.setnPasajeros( v1.getnPasajeros() );
        System.out.println( "¿Son el mismo objeto v1 y v4? " + (v1 == v4) );
        System.out.println( "¿Son iguales v1 y v4? " + v1.equals(v4) );
        
        //Creo v5 asignándole v1
        Vehiculo v5 = v1;
        System.out.println( "¿Son el mismo objeto v1 y v5? " + (v1 == v5) );
        System.out.println( "¿Son iguales v1 y v5? " + v1.equals(v5) );
        
        
        boolean resultado = comparaHash(v1, v4);
        System.out.println("\nComparamos el hashCode de los vehículos v1 y v4: " + resultado);
        
        boolean resultado2 = comparaMotor(v1, v4);
        System.out.println("Comparamos el hashCode del motor de v1 y del motor de v4: " + resultado2);
        
        float resultado3 = mediaPotencia(v1, v4);
        System.out.println("La media de la potencia de los motores de v1 y v4: " + resultado3);
        
        Vehiculo resultado4 = devolverPesado(v1, v4);
        System.out.println("El vehículo más pesado entre v1 y v4: " + resultado4);
        
    }
    
}
