/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import java.util.ArrayList;


/**
 *
 * @author ricardo
 */
public class Curso {
    
    private static int cID=1; 
    private int ID;
        private String Nombre;
        private String Seccion;
        private String FechaInicio;
        private String FechaFin;
        private String HoraInicio;
        private String HoraFin;
        private String Profesores;
        
        
        private ArrayList<Alumno> alumnos = new ArrayList<>();
        
        public Curso(){
            this.ID = cID++;
        }
    
     @Override
    public String toString(){
        return getNombre() + "" + getSeccion() + "" + getProfesores() + "";
    }

    /**
     * @return the cID
     */
    public static int getcID() {
        return cID;
    }

    /**
     * @param acID the cID to set
     */
    public static void setcID(int acID) {
        cID = acID;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Seccion
     */
    public String getSeccion() {
        return Seccion;
    }

    /**
     * @param Seccion the Seccion to set
     */
    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    /**
     * @return the FechaInicio
     */
    public String getFechaInicio() {
        return FechaInicio;
    }

    /**
     * @param FechaInicio the FechaInicio to set
     */
    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    /**
     * @return the FechaFin
     */
    public String getFechaFin() {
        return FechaFin;
    }

    /**
     * @param FechaFin the FechaFin to set
     */
    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    /**
     * @return the HoraInicio
     */
    public String getHoraInicio() {
        return HoraInicio;
    }

    /**
     * @param HoraInicio the HoraInicio to set
     */
    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    /**
     * @return the HoraFin
     */
    public String getHoraFin() {
        return HoraFin;
    }

    /**
     * @param HoraFin the HoraFin to set
     */
    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    /**
     * @return the Profesores
     */
    public String getProfesores() {
        return Profesores;
    }

    /**
     * @param Profesores the Profesores to set
     */
    public void setProfesores(String Profesores) {
        this.Profesores = Profesores;
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}

