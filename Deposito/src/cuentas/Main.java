package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }

    /** Resultado del apartado 2 
     * 
     * 	Es el resultado de usar extract en el apartado 2 del ejercicio.
     *		   
     * */
	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		
		// Lo normal sería cambiar el código para que el nuevo parametro 
		// pase por el valor tanto a ingresar como a retirar... pero 
		// no es el objetivo de esta tarea.
		
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
 }