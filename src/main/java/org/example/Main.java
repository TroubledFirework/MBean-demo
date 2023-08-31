package org.example;

import org.example.mbean.Hello;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException, InterruptedException {
        System.out.println("Hello example!");
        regMBean();
        Thread.sleep(Long.MAX_VALUE);
    }

    private static void regMBean() throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.example:type=Hello");
        Hello mbean = new Hello();
        mbs.registerMBean(mbean, name);

    }
}