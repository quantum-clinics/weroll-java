package com.magicfish.weroll.config;

import java.util.*;

public class AuthConfiguration {

    private Set<String> publicPaths;

    public Set<String> getPublicPaths() {
        return publicPaths;
    }

    private String whitelist;

    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;

        List<String> paths = Arrays.asList(whitelist.split(","));
        publicPaths = new HashSet<>();

        paths.forEach(path -> publicPaths.add(path.trim()));
    }

    private String deniedRedirect;

    public String getDeniedRedirect() {
        return deniedRedirect;
    }

    public void setDeniedRedirect(String deniedRedirect) {
        this.deniedRedirect = deniedRedirect;
    }

    private String entryPoint;

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public boolean isPublicPath(String path) {
        return publicPaths.contains(path);
    }

    private boolean useRedis;

    public boolean getUseRedis() {
        return useRedis;
    }

    public void setUseRedis(boolean useRedis) {
        this.useRedis = useRedis;
    }

    
}
