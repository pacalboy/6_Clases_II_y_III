public class AppVehiculos {

    public static void main(String[] args) {
        
        //Crea 2 motores con todos sus atributos
        Motor m1 = new Motor(90, 10001, 4);
        Motor m2 = new Motor(120, 22222, 6);
        
        //Muestra todos los atributos del motor 1 usando los métodos get
        System.out.println("Motor 1:"+ 
                "\nPotencia: " + m1.getPotencia()+
                "\nMotor: " + m1.N_MOTOR+
                "\nCilindros " + m1.N_CILINDROS);
        
        //Muestra todos los atributos del motor 2 usando el toString
        System.out.println(m2.toString());
        
        /**
         * Crea 3 vehículos.  
         * El primer vehículo créalo con el motor 1 e invéntate una matrícula. 
         * El vehículo 2 créalo con todos los atributos inventados (utiliza el motor 2). 
         * El tercer vehículo créalo por defecto.
         */
        Vehiculo v1 = new Vehiculo(m1, "FBJ6969");
        Vehiculo v2 = new Vehiculo(5, 1000, m2, "FDX2306");
        Vehiculo v3 = new Vehiculo();
        
        //Muestra la potencia del motor del primer vehículo (accede desde el vehículo)
        System.out.println("Potencia v1: " + v1.getMotor().getPotencia());
        //Muestra el número máximo de pasajeros del vehículo 2
        System.out.println("N maximo pasajeros v2: " + v2.MAX_PASAJEROS);
        //Haz un toString del vehículo 3
        System.out.println(v3.toString());
        
        //Transporta 15 pasajeros en el vehículo segundo. 
        //Muestra el número de pasajeros de dicho vehículo
        v2.transportar(15);
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        
        //Transporta 10 pasajeros en el segundo vehículo. 
        //Muestra el número de pasajeros de dicho vehículo
        v2.transportar(10);
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        
        //Descarga los pasajeros del vehículo 2. 
        //Muestra el número actual de pasajeros de dicho vehículo. 
        v2.descargarPasajeros();
        System.out.println("Pasajeros v2: " + v2.getnPasajeros());
        
        //Creamos v4 asignandole v1
        System.out.println(v1.equals(v2));
        Vehiculo v4 = v1;
        System.out.println("¿Son el mismo objeto v1 y v4? " + (v1 == v4));
        System.out.println("¿Son iguales v1 y v4? " + v1.equals(v4));

        Vehiculo v5 = new Vehiculo (v1.MAX_PASAJEROS, v1.getPeso(), v1.getMotor(), v1.getMatricula());
        v5.setnPasajeros(v1.getnPasajeros());
        System.out.println("¿Son el mismo objeto v1 y v5? " + (v1 == v5));
        System.out.println("¿Son iguales v1 y v5? " + v1.equals(v5));
    }
    
}
