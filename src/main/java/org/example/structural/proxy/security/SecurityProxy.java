package org.example.structural.proxy.security;

public class SecurityProxy implements SensitiveResource {

    private ActualSensitiveResource actualSensitiveResource;
    private final String username;

    public SecurityProxy(String username) {
        this.username = username;
    }

    private boolean checkAccess () {
        return "admin".equalsIgnoreCase(username);
    }

    @Override
    public void accessResource() {
        if (checkAccess()){
            if (actualSensitiveResource == null){
                actualSensitiveResource = new ActualSensitiveResource();
            }
            actualSensitiveResource.accessResource();
        }
        else {
            System.out.println("Access denied ..");
        }
    }

}
