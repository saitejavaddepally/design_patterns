package org.example.designPatterns.behavioural.chainofresponsibility.securityfilterchain;

public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        if (authenticate(request)){
            filterChain.doFilter(request, response);
        }
        else {
            response.setStatus(401);
        }
    }

    private boolean authenticate(Request request) {
        return request.isValid();
    }
}
