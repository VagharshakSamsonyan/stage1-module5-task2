package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (list) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer num : list) {
                result.add(num / divider);
            }
            return result;
        };
    }

    public static void main(String[] args) {
        InterfaceCreator creator = new InterfaceCreator();
        Operation<Integer> operation = creator.divideBy(3);
        List<Integer> result = operation.apply(List.of(3, 6, 9));
        System.out.println(result);
    }
}
