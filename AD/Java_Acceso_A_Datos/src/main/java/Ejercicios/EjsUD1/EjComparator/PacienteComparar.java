package Ejercicios.EjsUD1.EjComparator;

import java.util.Comparator;
import java.util.Objects;

public class PacienteComparar implements Comparator<Paciente> {

    @Override
    public int compare(Paciente o1, Paciente o2) {

        if (!Objects.equals(o1.getGravedad(), o2.getGravedad())) {

            return Integer.compare(o2.getGravedad(),o1.getGravedad());

        }

        return o1.getLlegada().compareTo(o2.getLlegada());

    }
}