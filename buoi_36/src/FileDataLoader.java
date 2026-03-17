import ldtt_package.IDataLoader;

public class FileDataLoader implements IDataLoader {

    private String extension;

    public FileDataLoader(String extension) {
        this.extension = extension;
    }

    @Override
    public void loadData() {
        System.out.printf("Loading data from %s file ...\n", this.extension);
    }

    @Override
    public void prepareData() {
        System.out.printf("Preparing data from %s file ...\n", this.extension);
    }
    
}
