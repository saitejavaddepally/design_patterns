package org.example.behavioural.chainofresponsibility.securityfilterchain;

public class AuthoriziedFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        if(isAuthorized(request)){
            filterChain.doFilter(request, response);
        }
        else {
            response.setStatus(403);
        }
    }

    private boolean isAuthorized(Request request){
        return request.isValid();
    }
}
