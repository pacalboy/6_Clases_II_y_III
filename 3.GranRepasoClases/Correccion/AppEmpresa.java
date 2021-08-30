import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taquilla t1 = new Taquilla("AH356");
        Taquilla t2 = new Taquilla("AAPFL");
        Contrato c1 = new Contrato(755.2f, Calendar.getInstance(), "Indefinido");
        Contrato c2 = new Contrato(1200.0f, Calendar.getInstance(), "Temporal");

        Empleado emp1 = new Empleado("1234658J", 123445);
        Empleado emp2 = new Empleado("9876545H", 765543);

        try {
            emp2.setfNacimiento(5, 2, 1999);
        } catch (Exception e) {
            System.out.println(e);
        }

        emp1.setNombre("María");
        emp1.setApellido1("Pérez");
        emp2.setNombre("Rafa");
        emp2.setApellido1("Sánchez");
        try {
            emp1.setGenero('P');
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            emp1.darAlta(c1);
            emp2.darAlta(c2);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        emp1.setnTaquilla(t1);
        emp2.setnTaquilla(t2);

        System.out.println("Empleado 1: " + emp1);
        System.out.println("Empleado 2: " + emp2);
       
        try {
            emp1.getContrato().sumarHorasExtra(10);
            System.out.println(emp1.getContrato().calcularSueldoMes(10.0f));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        System.out.println(emp2.getnTaquilla());
        
        emp2.getnTaquilla().setId("Taquilla de " + emp2.getNombre());
        System.out.println("Introduce el código de tu taquilla para obtener uno nuevo");
        String miCodigo = sc.next();
        emp2.getnTaquilla().renovarCodigo(miCodigo);
        
        System.out.println("Tu nueva taquilla es: ");
        System.out.println(emp2.getnTaquilla());
    
        emp1.getContrato().setTipo("Indefinido");
        System.out.println(emp1.getContrato());
    
        try {
            emp2.darBaja();
            System.out.println(emp2.isActivo());
            Contrato c3 = new Contrato(1000.0f, Calendar.getInstance(), "Obra o servicio");
            emp2.darAlta(c3);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println(Contrato.getContadorContratos());
        
        
        
    
    
    
    
    }

}
