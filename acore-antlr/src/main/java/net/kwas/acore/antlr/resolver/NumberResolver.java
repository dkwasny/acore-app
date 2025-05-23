package net.kwas.acore.antlr.resolver;

import net.kwas.acore.antlr.resolver.context.SpellContext;

public interface NumberResolver extends StringResolver {

    double resolveNumber(SpellContext ctx);

    @Override
    default String resolveString(SpellContext ctx) {
        var value = resolveNumber(ctx);
        var rounded = Math.round(value);
        var absoluteValue = Math.abs(rounded);
        ctx.setLastRenderedNumber(absoluteValue);
        return Long.toString(absoluteValue);
    }

}
