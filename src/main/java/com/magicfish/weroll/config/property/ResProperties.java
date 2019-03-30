package com.magicfish.weroll.config.property;

public class ResProperties extends AbstractProperties {

    private String domain = "/res";

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    private String[] handlers = new String[]{};

    public String[] getHandlers() {
        return handlers;
    }

    public void setHandlers(String[] handlers) {
        this.handlers = handlers;
    }

    private String[] locations = new String[]{};

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }
}
