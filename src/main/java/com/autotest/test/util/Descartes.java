package com.autotest.test.util;

import java.util.ArrayList;
import java.util.List;

public class Descartes {
    private static void descartes(List<List<String>> scenarioList, List<List<String>> result, int layer, List<String> curList) {
        if (layer < scenarioList.size() - 1) {
            System.out.println("1La:"+ layer);
            System.out.println("1scen:"+ scenarioList.size());
            System.out.println("List:"+scenarioList);
            if (scenarioList.get(layer).size() == 0) {
                descartes(scenarioList, result, layer + 1, curList);
            } else {
                for (int i = 0; i < scenarioList.get(layer).size(); i++) {
                    System.out.println("=====i:"+i);
                    System.out.println("size:"+scenarioList.get(layer).size());
                    List<String> list = new ArrayList<String>(curList);
                    list.add(scenarioList.get(layer).get(i));
                    System.out.println("scenarioList.get(layer).get(i)+++:"+scenarioList.get(layer).get(i));
                    System.out.println("list**************"+list);
                    System.out.println("result************"+result);
                    descartes(scenarioList, result, layer + 1, list);
                }
            }
        } else if (layer == scenarioList.size() - 1) {
            System.out.println("2La:"+ layer);
            System.out.println("2scen:"+ scenarioList.size());
            if (scenarioList.get(layer).size() == 0) {
                System.out.println(00000000000000000000000000000);
                result.add(curList);
            } else {
                for (int i = 0; i < scenarioList.get(layer).size(); i++) {
                    System.out.println("&&&&&&:"+i);
                    List<String> list = new ArrayList<String>(curList);
                    list.add(scenarioList.get(layer).get(i));
                    System.out.println("layer__:"+layer);
                    System.out.println("list___:"+list);

                    result.add(list);
                    System.out.println("result__:"+result);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> listSub1 = new ArrayList<String>();
        List<String> listSub2 = new ArrayList<String>();
        List<String> listSub3 = new ArrayList<String>();
        List<String> listSub4 = new ArrayList<String>();

        listSub1.add("用户名1");
        listSub1.add("用户名2");
        listSub1.add("用户名3");


        listSub2.add("密码1");
        listSub2.add("密码2");


        /*listSub3.add("a");
        listSub3.add("b");
        listSub3.add("c");

        listSub4.add("d");
        listSub4.add("e");*/

        /*System.out.println(list.get(0).size());//多个list存储时，list当下标来取值，size为下标数组的长度
        System.out.println(list);*/

        list.add(listSub1);
        list.add(listSub2);
        /*list.add(listSub3);
        list.add(listSub4);*/

        List<List<String>> result = new ArrayList<List<String>>();
        descartes(list, result, 0, new ArrayList<String>());
        System.out.println("========");
        System.out.println(result);

        //System.out.println(JSON.toJSONString(result));
    }
}
