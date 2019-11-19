package dao;

public class CompteDAOFactory {
	public static CompteDAO getInstance() {
        return new CompteDAOImpl();
    }

}
