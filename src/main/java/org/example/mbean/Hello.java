package org.example.mbean;

public class Hello implements HelloMBean {
    private String name = "Reginald";
    private int cacheSize = DEFAULT_CACHE_SIZE;
    private static final int
            DEFAULT_CACHE_SIZE = 200;

    {
        System.out.println("init HelloMBean");
    }

    public void sayHello() {
        System.out.println("hello world");
    }

    public int add(int x, int y) {
        return x + y;
    }

    public String setName(String name) {
        this.name = name;
        return "ok";
    }

    public String getName() {
        return this.name;
    }

    public int getCacheSize() {
        return this.cacheSize;
    }

    public synchronized void setCacheSize(int size) {
        this.cacheSize = size;
        System.out.println("Cache size now " + this.cacheSize);
    }


}
