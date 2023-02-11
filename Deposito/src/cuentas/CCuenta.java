package cuentas;

public class CCuenta {

// Métodos de clase de CCCuenta
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Comentario de CCuenta.
     * Primer comentario  
    */
    
    public CCuenta()
    {
    }
   
    /** Comentario de CCuenta.
     * Segundo comentario  
    */
    
    public CCuenta(String nom, String cue, double sal, double tipo)

    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /** Comentario de estado.
     * Cuarto comentario  
    */
    
    public double estado()

    {
        return getSaldo();
    }

    /** Comentario de Ingresar.
     * Quinto comentario  
    */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Comentario de retirar.
     * Sexto comentario  
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInterés
	 */
	double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
