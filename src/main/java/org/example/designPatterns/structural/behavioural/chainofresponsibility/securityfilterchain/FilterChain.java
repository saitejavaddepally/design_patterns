package org.example.designPatterns.structural.behavioural.chainofresponsibility.securityfilterchain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private int currentIndex = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(Request request, Response response) {
        if (currentIndex < filters.size()) {
            Filter currentFilter = filters.get(currentIndex);
            currentIndex++;
            currentFilter.doFilter(request, response, this);
        }
    }
}
