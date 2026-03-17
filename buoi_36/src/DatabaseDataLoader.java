import ldtt_package.IDataLoader;

public class DatabaseDataLoader implements IDataLoader {
    
    @Override
    public void loadData() {
        System.out.println("Loading data from database ...");
    }

    @Override
    public void prepareData() {
        System.out.println("Preparing data from database ...");
    }

}
