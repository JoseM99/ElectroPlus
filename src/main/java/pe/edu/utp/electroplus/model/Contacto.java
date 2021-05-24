package pe.edu.utp.electroplus.model;

import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String nombres;
    @NotNull
    private String apellidos;
    @NotNull
    private String telefono; 
    @NotNull
    private String correo;
    @NotNull
    private String mensaje;
}
