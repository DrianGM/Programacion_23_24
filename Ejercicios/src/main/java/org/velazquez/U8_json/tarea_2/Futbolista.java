package org.velazquez.U8_json.tarea_2;

public class Futbolista {
    private int id;
    private String nombre;
    private String equipo;
    private Estadisticas estadisticas;


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }

    public Estadisticas getEstadisticas() { return estadisticas; }
    public void setEstadisticas(Estadisticas estadisticas) { this.estadisticas = estadisticas; }

    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}

