package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Cliente {
    @Id  // La propiedad numero es la clave.  Las claves son obligatorias (required) por defecto
    @Column(length=6)  // La longitud de columna se usa a nivel UI y a nivel DB
    int numero;

    @Column(length=50) // La longitud de columna se usa a nivel UI y a nivel DB
    @Required  // Se mostrará un error de validación si la propiedad nombre se deja en blanco
    String nombre;

}
