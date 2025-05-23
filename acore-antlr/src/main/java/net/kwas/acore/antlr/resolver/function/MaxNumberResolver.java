package net.kwas.acore.antlr.resolver.function;

import net.kwas.acore.antlr.resolver.context.SpellContext;
import net.kwas.acore.antlr.resolver.NumberResolver;

public record MaxNumberResolver(NumberResolver left, NumberResolver right) implements NumberResolver {

    @Override
    public double resolveNumber(SpellContext ctx) {
        return Double.max(left.resolveNumber(ctx), right.resolveNumber(ctx));
    }

}
