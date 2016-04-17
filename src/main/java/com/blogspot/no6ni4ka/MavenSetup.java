/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.no6ni4ka;

import com.blogspot.no6ni4ka.Settings;
import java.io.File;
import javax.xml.bind.JAXB;

/**
 *
 * @author georgeshumakov
 */
public class MavenSetup {

    public static void main(String[] args) {
        String mavenHome = System.getenv("M2_HOME");
        if (null == mavenHome || mavenHome.trim().isEmpty()) {
            System.out.printf("Maven environment variable is not set.");
            System.exit(1);
        }
        File f = new File(mavenHome + "/conf/settings.xml");
        Settings st = JAXB.unmarshal(f, Settings.class);
        System.out.println(st);
    }
}
