package org.example.behavioural.chainofresponsibility.securityfilterchain;

public class Main {

    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthoriziedFilter());

        Request request = new Request();
        Response response = new Response();

        filterChain.doFilter(request, response);

        if (response.getStatus() == 200) {
            System.out.println("Request processed successfully");
        } else {
            System.out.println("Request failed with status " + response.getStatus());
        }
    }
}
