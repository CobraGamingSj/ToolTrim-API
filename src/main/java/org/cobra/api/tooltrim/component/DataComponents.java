//package org.cobra.api.tooltrim.component;
//
//import net.minecraft.component.ComponentType;
//import net.minecraft.component.DataComponentTypes;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.util.Identifier;
//import org.cobra.api.tooltrim.item.trim.ToolTrim;
//
//import java.util.function.UnaryOperator;
//
//public class DataComponents {
//
//    public static final ComponentType<ToolTrim> TRIM = register("trim", builder -> builder.codec(ToolTrim.CODEC).packetCodec(ToolTrim.PACKET_CODEC).cache());
//
//    private static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
//        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.ofVanilla(id), (builderOperator.apply(ComponentType.builder())).build());
//    }
//
//}
