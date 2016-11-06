package knitwatch3;

public class ProjectContainer extends Container {

    public ProjectContainer() {
        super();
    }

    @Override
    protected void createMyItem() {
        myItem = new Project("n", "y", 1, "p", 1, "n;y;1;1;n");
    }

    public void addNew(String line) {
        String[] attributes = line.split(";");
        int diff = Integer.parseInt(attributes[2].trim());
        int priority = Integer.parseInt(attributes[4].trim());
        list.add(new Project(attributes[0].trim(), attributes[1].trim(), diff, attributes[3].trim(), priority, line));
    }

}
