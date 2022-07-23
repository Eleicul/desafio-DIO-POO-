package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    Private
    int cargaHorária;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorária;

    public Curso() {
    }

    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    @Override
        public String toString() {
            return "Curso{" +
                    "título='" + getTítulo() + '\'' +
                    ", descrição='" + getDescrição() + '\'' +
                    ", cargaHorária=" + cargaHorária +
                    '}';
    }

    }
}
