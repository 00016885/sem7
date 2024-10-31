package composite;

import java.util.ArrayList;

public class Department implements IComponent {
    private String name;
    private ArrayList<IComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addComponent(IComponent component){
        components.add(component);
    }
    public void removeComponent(IComponent component){
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: "+name);
        for (IComponent component: components){
            component.showDetails();
        }
    }
}
