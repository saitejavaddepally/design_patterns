package org.example.designPatterns.behavioural.chainofresponsibility.securityfilterchain;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
