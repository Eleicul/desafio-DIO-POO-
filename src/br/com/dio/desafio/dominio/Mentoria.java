package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    Private LocalDate data;

    @Override
    public double caucularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "título='" + getTítulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }

    public void setdescrição(String descrição_mentoria_java) {
    }
}
