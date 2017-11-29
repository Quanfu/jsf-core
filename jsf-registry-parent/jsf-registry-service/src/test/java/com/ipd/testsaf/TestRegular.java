/**
 * Copyright 2004-2048 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.testsaf;

import com.ipd.jsf.registry.util.RegistryUtil;

public class TestRegular {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TestRegular.test_jr_M6();
    }

    private static void testB28_qian() {
        //'B28 千兆老网络 192.168.128.0-192.168.143.254','192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.0"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.1"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.9"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.10"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.19"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.100"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.199"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.200"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.249"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.254"));
        
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.141.254"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.141.0"));
        
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.140.254"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.140.0"));
        
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.139.254"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.139.0"));
        
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.129.254"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.129.0"));

        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.128.254"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.128.0"));

        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.143.255"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.127.0"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.128.255"));
        System.out.println(RegistryUtil.match("192.168.(12[8-9]|13[0-9]|14[0-3]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "192.168.144.0"));
        
    }

    private static void test_B28_wan() {
        //'B28新万兆 172.17.128.0-172.17.255.254','172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.0"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.1"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.9"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.10"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.19"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.100"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.199"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.200"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.249"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.128.254"));

        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.129.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.129.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.130.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.130.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.199.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.199.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.200.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.200.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.249.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.249.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.255.254"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.255.0"));
        
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.255.255"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.256.1"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.256.01"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.127.0"));
        System.out.println(RegistryUtil.match("172.17.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.127.255"));
    }

    private static void test_yizhuang101() {
        //'亦庄101房 万兆 172.17.0.0-172.17.8.254','172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.0"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.1"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.9"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.11"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.19"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.99"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.100"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.199"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.200"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.249"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.254"));

        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.0"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.1"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.9"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.11"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.19"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.99"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.100"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.199"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.200"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.8.249"));

        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.0.255"));
        System.out.println(RegistryUtil.match("172.17.([0-8]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.9.254"));
        
    }
    
    private static void test_yizhuang102_qian() {
        //'亦庄102房 千兆 172.17.11.0-172.17.30.254','172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.0"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.1"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.9"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.10"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.11"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.99"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.100"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.199"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.200"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.249"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.11.254"));
        
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.0"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.1"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.9"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.10"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.11"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.99"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.100"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.199"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.200"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.249"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.29.254"));

        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.0"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.1"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.9"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.10"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.11"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.99"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.100"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.199"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.200"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.249"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.254"));

        
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.31.254"));
        System.out.println(RegistryUtil.match("172.17.(1[1-9]|2[0-9]|30).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.30.255"));
    }
    
    private static void test_yizhuang102_wan1() {
        //'亦庄202房万兆 172.17.33.0-172.17.39.254','172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.0"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.1"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.9"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.10"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.11"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.99"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.100"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.199"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.200"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.249"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.33.254"));

        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.0"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.1"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.9"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.10"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.11"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.99"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.100"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.199"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.200"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.249"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.254"));

        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.40.254"));
        System.out.println(RegistryUtil.match("172.17.(3[3-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.39.255"));
    }
    
    private static void test_yizhuang102_wan2() {
        //'亦庄202房万兆 172.17.42.0-172.17.57.254','172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.0"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.1"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.9"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.10"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.99"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.100"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.199"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.200"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.249"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.42.254"));

        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.0"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.1"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.9"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.10"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.99"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.100"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.199"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.200"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.249"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.254"));

        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.41.254"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.58.254"));
        System.out.println(RegistryUtil.match("172.17.(4[2-9]|5[0-7]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.57.255"));
    }
    
    private static void test_huangcun() {
        //'黄村机房万兆 172.22.0.0-172.22.255.254','172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.0"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.1"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.9"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.10"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.99"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.100"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.199"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.200"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.249"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.0.254"));

        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.0"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.1"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.9"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.10"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.99"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.100"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.199"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.200"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.249"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.254"));

        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.255.255"));
        System.out.println(RegistryUtil.match("172.22.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.22.256.254"));
    }
    
    private static void test_yongfeng() {
        //'永丰电信万兆 172.16.0.0-172.16.255.255','172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])'
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.0"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.1"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.9"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.10"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.99"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.100"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.199"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.200"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.249"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.0.254"));

        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.0"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.1"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.9"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.10"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.99"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.100"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.199"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.200"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.249"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.254"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.255"));
        
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.256.254"));
        System.out.println(RegistryUtil.match("172.16.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])", "172.16.255.256"));
    }
    
    private static void test_pci() {
        //'PCI区域万兆 172.17.68.0-172.17.69.254','172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])'
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.0"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.1"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.9"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.10"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.99"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.100"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.199"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.200"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.249"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.68.254"));

        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.0"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.1"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.9"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.10"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.99"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.100"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.199"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.200"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.249"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.254"));

        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.69.255"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.70.254"));
        System.out.println(RegistryUtil.match("172.17.(6[8-9]).([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-4])", "172.17.67.254"));
    }

    private static void test_jr_huangcun() {
        String reg = "(172.25.([0-9]|[1-9][0-9]|1[0-1][0-9]|12[0-7]).*)|(172.24.(6[4-9]|[7-9][0-9]|1[0-1][0-9]|12[0-7]).*)";
        System.out.println(RegistryUtil.match(reg, "172.25.1.254"));
        System.out.println(RegistryUtil.match(reg, "172.25.127.254"));
        System.out.println(RegistryUtil.match(reg, "172.25.128.254"));
        System.out.println(RegistryUtil.match(reg, "172.24.63.254"));
        System.out.println(RegistryUtil.match(reg, "172.25.64.1"));
        System.out.println(RegistryUtil.match(reg, "172.25.127.255"));
    }

    private static void test_jr_M6() {
        String reg = "(172.23.*.*)|(172.24.(12[8-9]|1[3-9][0-9]|2[0-4][0-9]|25[0-5]).*)";
        System.out.println(RegistryUtil.match(reg, "172.23.1.254"));
        System.out.println(RegistryUtil.match(reg, "172.23.127.254"));
        System.out.println(RegistryUtil.match(reg, "172.24.10.254"));
        System.out.println(RegistryUtil.match(reg, "172.24.127.254"));
        System.out.println(RegistryUtil.match(reg, "172.24.128.254"));
        System.out.println(RegistryUtil.match(reg, "172.24.255.1"));
        System.out.println(RegistryUtil.match(reg, "172.24.255.255"));
    }
}
