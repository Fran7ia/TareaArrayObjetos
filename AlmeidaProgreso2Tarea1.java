import java.util.Locale;

public class AlmeidaProgreso2Tarea1 {
    public static void main(String[] args) {
        double[] notas = {8.5, 6.0, 9.2, 5.5, 7.0};

        double suma = 0;
        double maxima = notas[0];
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
            if (notas[i] >= 7) {
                aprobados++;
            }
        }

        double promedio = suma / notas.length;

        System.out.printf(Locale.US, "Promedio: %.2f%n", promedio);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Aprobados: " + aprobados + " de " + notas.length);

        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }
}
