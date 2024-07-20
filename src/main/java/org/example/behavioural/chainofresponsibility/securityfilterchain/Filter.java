package org.example.behavioural.chainofresponsibility.securityfilterchain;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
