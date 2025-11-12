package co.edu.sena.daniel.sema01;

public class  PruebaSaboresDelChef {
    public static void main(String[] args) {
        System.out.println("=== ESCUELA DE COCINA 'SABORES DEL CHEF' ===\n");

        // ====== Crear estudiantes ======
        Estudiante e1 = new Estudiante("E001", "Laura Gómez", "laura@sabores.com");
        Estudiante e2 = new Estudiante("E002", "Carlos Rojas", "carlos@sabores.com");

        // ====== Crear cursos ======
        CursoCocina c1 = new CursoCocina("C001", "Cocina Colombiana Tradicional", "Chef Torres", 40, 20000);
        CursoCocina c2 = new CursoCocina("C002", "Repostería Creativa", "Chef Ramírez", 30, 25000);

        // ====== Mostrar datos ======
        System.out.println("--- ESTUDIANTES ---");
        e1.mostrarDatos();
        System.out.println();
        e2.mostrarDatos();

        System.out.println("\n--- CURSOS ---");
        c1.mostrarInformacion();
        System.out.println("Costo total: $" + c1.calcularCostoTotal());
        System.out.println();
        c2.mostrarInformacion();
        System.out.println("Costo total: $" + c2.calcularCostoTotal());

        // ====== Demostrar funcionalidad ======
        System.out.println("\n--- INSCRIPCIONES ---");
        e1.inscribirCurso();
        e1.inscribirCurso();
        e1.inscribirCurso(); // 3 cursos → certificado
        e2.inscribirCurso();

        System.out.println("\n¿" + e1.getNombreCompleto() + " tiene certificado?: " + e1.tieneCertificado());
        System.out.println("¿" + e2.getNombreCompleto() + " tiene certificado?: " + e2.tieneCertificado());

        // ====== Cambiar disponibilidad de un curso ======
        c2.setDisponible(false);
        System.out.println("\n--- ACTUALIZACIÓN DE CURSO ---");
        c2.mostrarInformacion();
    }
}
