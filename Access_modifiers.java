package practise;

public class Access_modifiers {

	public static void main(String[] args) {
		
        // Creating objects of classes
        PublicClass publicObj = new PublicClass();
        PrivateClass privateObj = new PrivateClass();
        ProtectedClass protectedObj = new ProtectedClass();
        DefaultClass defaultObj = new DefaultClass();

        // Accessing members of each class
        System.out.println("Accessing PublicClass members:");
        publicObj.publicMethod();
        System.out.println(publicObj.publicVar);

        // Private members are not accessible outside the class
        // Uncommenting the following line would result in a compilation error
        // System.out.println(privateObj.privateVar);

        // Protected members are accessible within subclasses
        System.out.println("\nAccessing ProtectedClass members:");
        protectedObj.protectedMethod();
        System.out.println(protectedObj.protectedVar);

        // Default members are accessible within the same package
        System.out.println("\nAccessing DefaultClass members:");
        defaultObj.defaultMethod();
        System.out.println(defaultObj.defaultVar);
    }
}

// Public class with public members
class PublicClass {
    public int publicVar = 10;

    public void publicMethod() {
        System.out.println("PublicClass publicMethod() called.");
    }
}

// Private class with private members
class PrivateClass {
    private int privateVar = 20;
           

    private void privateMethod() {
        System.out.println("PrivateClass privateMethod() called.");
    }
}

// Protected class with protected members
class ProtectedClass {
    protected int protectedVar = 30;

    protected void protectedMethod() {
        System.out.println("ProtectedClass protectedMethod() called.");
    }
}

// Default class with default (package-private) members
class DefaultClass {
    int defaultVar = 40;

    void defaultMethod() {
        System.out.println("DefaultClass defaultMethod() called.");
    }


	}


