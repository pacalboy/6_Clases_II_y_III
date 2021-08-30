public class Aplicacion {

    public static void main(String[] args) {
         
        //Crea dos taquillas
        Taquilla t1 = new Taquilla ("aithor");
        Taquilla t2 = new Taquilla ("elenoide");
        
        //Creo dos contratos
        Contrato c1 = new Contrato(1250.75f, "Obra y Servicio");
        Contrato c2 = new Contrato(1050.25f, "Temporal");
        
        //Creo dos empleados
        Empleado e1 = new Empleado("74448987D", 888558744);
        Empleado e2 = new Empleado("55441236X", 563333214);
        
        //Asigno fecha nacimiento a empleado 2
        e2.setfNac(2, 5, 2001);
        
        //Asigno atributos
        e1.setNombre("Aitor");
        e1.setApellido1("Tilla");
        e1.setApellido2("Buena");
        
        e2.setNombre("Elena");
        e2.setApellido1("Nito");
        e2.setApellido2("Azul");
        
        //Asigna contratos y taquillas
        e1.setContrato(c1);
        e1.setTaquilla(t1);
        
        e2.setTaquilla(t2);
        e2.setContrato(c2);
        
        //Muestra ambos empleados
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
        //empleado 1 salario mensual tras trabajar 10 horas extras
        try {
            e1.getContrato().sumarHorasExtras(10);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            e1.getContrato().calcularSueldoMes(50.78f);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //empleado 2 modifica el identificador de su taquilla y cambia la clave
        e2.getTaquilla().setIdentificador("AitorMenta");
        e2.getTaquilla().renovarCodigo(1111);//No se puede cambiar la clave, solo podemos acceder a la clave con el método toString
        
        //empleado 1 modifica contrato a tipo Indefinido y muestra el contrato
        e1.getContrato().setTipo("Indefinido");
        System.out.println(e1.getContrato().toString());
        
        //empleado 2 se da de baja y muestra el estado de empleado 2
        e2.darBaja();
        System.out.println(e2.isActivo());
        
        //Crea un nuevo contrato y da de alta al empleado 2 con ese contrato
        Contrato c3 = new Contrato(958.55f, "Temporal");
        e2.setContrato(c3);
        
        //Asigna el género 'M' al empleado 1. Muestra el género del empleado 1.
        try {
            e1.setGenero('M');
        } catch (Exception e) {
            System.out.println(e);
        }
        e1.getGenero();
        
        //Asigna el género 'J' al empleado 1. Muestra el género del empleado 1.
        try {
            e1.setGenero('J');
        } catch (Exception e) {
            System.out.println(e);
        }
        e1.getGenero();
        
        //Muestra cuántos contratos se han hecho hasta la fecha. 
        System.out.println(Contrato.getCuentaContrato());
     
    }
    
}
