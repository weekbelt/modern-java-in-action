package modernjavainaction.chap02;

import modernjavainaction.chap02.FilteringApples.Apple;

public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}
