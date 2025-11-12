package co.edu.sena.daniel.sema01;

public class Estudiante {
    // ====== Atributos (mínimo 4) ======
    private String codigoEstudiante;
    private String nombreCompleto;
    private String email;
    private int cursosInscritos;
    private boolean certificado;

    // ====== Constructor ======
    public Estudiante(String codigoEstudiante, String nombreCompleto, String email) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.cursosInscritos = 0;
        this.certificado = false;
    }

    // ====== Método 1: mostrar datos ======
    public void mostrarDatos() {
        System.out.println("=== ESTUDIANTE ===");
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Email: " + email);
        System.out.println("Cursos inscritos: " + cursosInscritos);
        System.out.println("Certificado: " + (certificado ? "Sí" : "No"));
    }

    // ====== Método 2: inscribir curso ======
    public void inscribirCurso() {
        cursosInscritos++;
        System.out.println(nombreCompleto + " se ha inscrito en un nuevo curso. Total: " + cursosInscritos);
    }

    // ====== Método 3: verificar si obtiene certificado ======
    public boolean tieneCertificado() {
        certificado = cursosInscritos >= 3; // obtiene certificado si completó 3 o más cursos
        return certificado;
    }

    // ====== Getter ======
    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
