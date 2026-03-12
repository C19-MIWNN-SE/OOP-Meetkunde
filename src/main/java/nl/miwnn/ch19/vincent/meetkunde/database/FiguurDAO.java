package nl.miwnn.ch19.vincent.meetkunde.database;

import nl.miwnn.ch19.vincent.meetkunde.model.Figuur;

import java.sql.SQLException;

/**
 * @author Vincent Velthuizen
 */
public class FiguurDAO extends AbstractDAO {

    public FiguurDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    protected int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO Figuur (kleur) VALUES (?);";
        setupPreparedStatementWithKey(sql);

        try {
            getPreparedStatement().setString(1, figuur.getKleur());
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

        return executeInsertStatementWithKey();
    }
}
