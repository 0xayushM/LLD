// navigationContext
class NavigationContext {
    private NavigationStrategy navigationStrategy;

    public NavigationContext(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate() {
        navigationStrategy.navigate();
    }
}

// navigationStrategy
interface NavigationStrategy {
    void navigate();
}

// bikeStrategy
class BikeStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating using Bike");
    }
}

// carStrategy
class CarStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating using Car");
    }
}

// walkStrategy
class WalkStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Navigating using Walk");
    }
}

// client 
public class Client {
    public static void main(String[] args) {
        NavigationContext navigationContext = new NavigationContext(new BikeStrategy());
        navigationContext.navigate();

        navigationContext.setNavigationStrategy(new CarStrategy());
        navigationContext.navigate();

        navigationContext.setNavigationStrategy(new WalkStrategy());
        navigationContext.navigate();
    }
}