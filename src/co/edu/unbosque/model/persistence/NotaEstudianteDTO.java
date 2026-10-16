package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;

public class NotaEstudianteDTO {
	private int idEstudiante;
	private double valorNota;
	private String descripcionNota;
	private LocalDateTime fechaRegistro;

	public NotaEstudianteDTO(int idEstudiante, double valorNota, String descripcionNota, LocalDateTime fechaRegistro) {
		this.idEstudiante = idEstudiante;
		this.valorNota = valorNota;
		this.descripcionNota = descripcionNota;
		this.fechaRegistro = fechaRegistro;
	}

	// Getters
	public int getIdEstudiante() {
		return idEstudiante;
	}

	public double getValorNota() {
		return valorNota;
	}

	public String getDescripcionNota() {
		return descripcionNota;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	@Override
	public String toString() {
		return idEstudiante + ";" + valorNota + ";" + descripcionNota + ";" + fechaRegistro;
	}
}