package co.edu.unbosque.model;

import java.time.LocalDateTime;

public class NotaEstudiante {

	private int idEstudiante;
	private double valorNota;
	private String descripcionNota;
	private LocalDateTime fechaRegistro;

	public NotaEstudiante(int idEstudiante, double valorNota, String descripcionNota, LocalDateTime fechaRegistro) {
		super();
		this.idEstudiante = idEstudiante;
		this.valorNota = valorNota;
		this.descripcionNota = descripcionNota;
		this.fechaRegistro = LocalDateTime.now();
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}

	public String getDescripcionNota() {
		return descripcionNota;
	}

	public void setDescripcionNota(String descripcionNota) {
		this.descripcionNota = descripcionNota;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String listaEstudiante() {
		return idEstudiante + " -- " + valorNota + " -- " + descripcionNota + " -- " + fechaRegistro;
	}
	
	

}
