package nl.miwnn.ch19.vincent.meetkunde.controller;

import nl.miwnn.ch19.vincent.meetkunde.database.DBaccess;
import nl.miwnn.ch19.vincent.meetkunde.database.PuntDAO;
import nl.miwnn.ch19.vincent.meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * speelt met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();

        PuntDAO puntDAO = new PuntDAO(dBaccess);

        for (Punt punt : puntDAO.getPunten()) {
            System.out.println(punt);
        }

        dBaccess.closeConnection();
    }

}
