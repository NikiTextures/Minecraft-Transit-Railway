package mtr;

import mtr.data.RailType;
import mtr.data.TransportMode;
import mtr.item.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public interface Items {

	RegistryObject<Item> APG_DOOR = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.APG));
	RegistryObject<Item> APG_GLASS = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.APG));
	RegistryObject<Item> APG_GLASS_END = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.APG));
	RegistryObject<Item> BRUSH = new RegistryObject<>(() -> new ItemWithCreativeTabBase(Keys.LIFTS_ONLY ? CreativeModeTabs.ESCALATORS_LIFTS : CreativeModeTabs.CORE, properties -> properties.stacksTo(1)));
	RegistryObject<Item> RAILWAY_DASHBOARD = new RegistryObject<>(() -> new ItemDashboard(TransportMode.TRAIN));
	RegistryObject<Item> BOAT_DASHBOARD = new RegistryObject<>(() -> new ItemDashboard(TransportMode.BOAT));
	RegistryObject<Item> CABLE_CAR_DASHBOARD = new RegistryObject<>(() -> new ItemDashboard(TransportMode.CABLE_CAR));
	RegistryObject<Item> AIRPLANE_DASHBOARD = new RegistryObject<>(() -> new ItemDashboard(TransportMode.AIRPLANE));
	RegistryObject<Item> DRIVER_KEY = new RegistryObject<>(() -> new ItemWithCreativeTabBase(CreativeModeTabs.CORE, properties -> properties.stacksTo(1)));
	RegistryObject<Item> BOAT_NODE = new RegistryObject<>(() -> new ItemWithCreativeTabBase.ItemPlaceOnWater(CreativeModeTabs.CORE, Blocks.BOAT_NODE.get()));
	RegistryObject<Item> ESCALATOR = new RegistryObject<>(ItemEscalator::new);
	RegistryObject<Item> LIFT_BUTTONS_LINK_CONNECTOR = new RegistryObject<>(() -> new ItemLiftButtonsLinkModifier(true));
	RegistryObject<Item> LIFT_BUTTONS_LINK_REMOVER = new RegistryObject<>(() -> new ItemLiftButtonsLinkModifier(false));
	RegistryObject<Item> LIFT_DOOR_1 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.LIFT_DOOR_1));
	RegistryObject<Item> LIFT_DOOR_ODD_1 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.LIFT_DOOR_ODD_1));
	RegistryObject<Item> LIFT_REFRESHER = new RegistryObject<>(ItemLiftRefresher::new);
	RegistryObject<Item> PSD_DOOR_1 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_1));
	RegistryObject<Item> PSD_GLASS_1 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_1));
	RegistryObject<Item> PSD_GLASS_END_1 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_1));
	RegistryObject<Item> PSD_DOOR_2 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_2));
	RegistryObject<Item> PSD_GLASS_2 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_2));
	RegistryObject<Item> PSD_GLASS_END_2 = new RegistryObject<>(() -> new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_2));
	RegistryObject<Item> RAIL_CONNECTOR_20 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.WOODEN));
	RegistryObject<Item> RAIL_CONNECTOR_20_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.WOODEN));
	RegistryObject<Item> RAIL_CONNECTOR_40 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.STONE));
	RegistryObject<Item> RAIL_CONNECTOR_40_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.STONE));
	RegistryObject<Item> RAIL_CONNECTOR_60 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.EMERALD));
	RegistryObject<Item> RAIL_CONNECTOR_60_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.EMERALD));
	RegistryObject<Item> RAIL_CONNECTOR_80 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.IRON));
	RegistryObject<Item> RAIL_CONNECTOR_80_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.IRON));
	RegistryObject<Item> RAIL_CONNECTOR_120 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.OBSIDIAN));
	RegistryObject<Item> RAIL_CONNECTOR_120_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.OBSIDIAN));
	RegistryObject<Item> RAIL_CONNECTOR_160 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.BLAZE));
	RegistryObject<Item> RAIL_CONNECTOR_160_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.BLAZE));
	RegistryObject<Item> RAIL_CONNECTOR_200 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.QUARTZ));
	RegistryObject<Item> RAIL_CONNECTOR_200_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.QUARTZ));
	RegistryObject<Item> RAIL_CONNECTOR_300 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.DIAMOND));
	RegistryObject<Item> RAIL_CONNECTOR_300_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.DIAMOND));
	RegistryObject<Item> RAIL_CONNECTOR_PLATFORM = new RegistryObject<>(() -> new ItemRailModifier(true, true, true, false, RailType.PLATFORM));
	RegistryObject<Item> RAIL_CONNECTOR_SIDING = new RegistryObject<>(() -> new ItemRailModifier(true, true, true, false, RailType.SIDING));
	RegistryObject<Item> RAIL_CONNECTOR_TURN_BACK = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.TURN_BACK));
	RegistryObject<Item> RAIL_CONNECTOR_CABLE_CAR = new RegistryObject<>(() -> new ItemRailModifier(false, true, false, true, RailType.CABLE_CAR));
	RegistryObject<Item> RAIL_CONNECTOR_RUNWAY = new RegistryObject<>(() -> new ItemRailModifier(false, false, true, true, RailType.RUNWAY));
	RegistryObject<Item> RAIL_REMOVER = new RegistryObject<>(ItemRailModifier::new);
	RegistryObject<Item> RESOURCE_PACK_CREATOR = new RegistryObject<>(ItemResourcePackCreator::new);
	RegistryObject<Item> SIGNAL_CONNECTOR_WHITE = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.WHITE));
	RegistryObject<Item> SIGNAL_CONNECTOR_ORANGE = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.ORANGE));
	RegistryObject<Item> SIGNAL_CONNECTOR_MAGENTA = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.MAGENTA));
	RegistryObject<Item> SIGNAL_CONNECTOR_LIGHT_BLUE = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.LIGHT_BLUE));
	RegistryObject<Item> SIGNAL_CONNECTOR_YELLOW = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.YELLOW));
	RegistryObject<Item> SIGNAL_CONNECTOR_LIME = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.LIME));
	RegistryObject<Item> SIGNAL_CONNECTOR_PINK = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.PINK));
	RegistryObject<Item> SIGNAL_CONNECTOR_GRAY = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.GRAY));
	RegistryObject<Item> SIGNAL_CONNECTOR_LIGHT_GRAY = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.LIGHT_GRAY));
	RegistryObject<Item> SIGNAL_CONNECTOR_CYAN = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.CYAN));
	RegistryObject<Item> SIGNAL_CONNECTOR_PURPLE = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.PURPLE));
	RegistryObject<Item> SIGNAL_CONNECTOR_BLUE = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.BLUE));
	RegistryObject<Item> SIGNAL_CONNECTOR_BROWN = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.BROWN));
	RegistryObject<Item> SIGNAL_CONNECTOR_GREEN = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.GREEN));
	RegistryObject<Item> SIGNAL_CONNECTOR_RED = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.RED));
	RegistryObject<Item> SIGNAL_CONNECTOR_BLACK = new RegistryObject<>(() -> new ItemSignalModifier(true, DyeColor.BLACK));
	RegistryObject<Item> SIGNAL_REMOVER_WHITE = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.WHITE));
	RegistryObject<Item> SIGNAL_REMOVER_ORANGE = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.ORANGE));
	RegistryObject<Item> SIGNAL_REMOVER_MAGENTA = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.MAGENTA));
	RegistryObject<Item> SIGNAL_REMOVER_LIGHT_BLUE = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.LIGHT_BLUE));
	RegistryObject<Item> SIGNAL_REMOVER_YELLOW = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.YELLOW));
	RegistryObject<Item> SIGNAL_REMOVER_LIME = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.LIME));
	RegistryObject<Item> SIGNAL_REMOVER_PINK = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.PINK));
	RegistryObject<Item> SIGNAL_REMOVER_GRAY = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.GRAY));
	RegistryObject<Item> SIGNAL_REMOVER_LIGHT_GRAY = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.LIGHT_GRAY));
	RegistryObject<Item> SIGNAL_REMOVER_CYAN = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.CYAN));
	RegistryObject<Item> SIGNAL_REMOVER_PURPLE = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.PURPLE));
	RegistryObject<Item> SIGNAL_REMOVER_BLUE = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.BLUE));
	RegistryObject<Item> SIGNAL_REMOVER_BROWN = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.BROWN));
	RegistryObject<Item> SIGNAL_REMOVER_GREEN = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.GREEN));
	RegistryObject<Item> SIGNAL_REMOVER_RED = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.RED));
	RegistryObject<Item> SIGNAL_REMOVER_BLACK = new RegistryObject<>(() -> new ItemSignalModifier(false, DyeColor.BLACK));
	RegistryObject<Item> BRIDGE_CREATOR_3 = new RegistryObject<>(() -> new ItemBridgeCreator(3));
	RegistryObject<Item> BRIDGE_CREATOR_5 = new RegistryObject<>(() -> new ItemBridgeCreator(5));
	RegistryObject<Item> BRIDGE_CREATOR_7 = new RegistryObject<>(() -> new ItemBridgeCreator(7));
	RegistryObject<Item> BRIDGE_CREATOR_9 = new RegistryObject<>(() -> new ItemBridgeCreator(9));
	RegistryObject<Item> TUNNEL_CREATOR_4_3 = new RegistryObject<>(() -> new ItemTunnelCreator(4, 3));
	RegistryObject<Item> TUNNEL_CREATOR_4_5 = new RegistryObject<>(() -> new ItemTunnelCreator(4, 5));
	RegistryObject<Item> TUNNEL_CREATOR_4_7 = new RegistryObject<>(() -> new ItemTunnelCreator(4, 7));
	RegistryObject<Item> TUNNEL_CREATOR_4_9 = new RegistryObject<>(() -> new ItemTunnelCreator(4, 9));
	RegistryObject<Item> TUNNEL_CREATOR_5_3 = new RegistryObject<>(() -> new ItemTunnelCreator(5, 3));
	RegistryObject<Item> TUNNEL_CREATOR_5_5 = new RegistryObject<>(() -> new ItemTunnelCreator(5, 5));
	RegistryObject<Item> TUNNEL_CREATOR_5_7 = new RegistryObject<>(() -> new ItemTunnelCreator(5, 7));
	RegistryObject<Item> TUNNEL_CREATOR_5_9 = new RegistryObject<>(() -> new ItemTunnelCreator(5, 9));
	RegistryObject<Item> TUNNEL_CREATOR_6_3 = new RegistryObject<>(() -> new ItemTunnelCreator(6, 3));
	RegistryObject<Item> TUNNEL_CREATOR_6_5 = new RegistryObject<>(() -> new ItemTunnelCreator(6, 5));
	RegistryObject<Item> TUNNEL_CREATOR_6_7 = new RegistryObject<>(() -> new ItemTunnelCreator(6, 7));
	RegistryObject<Item> TUNNEL_CREATOR_6_9 = new RegistryObject<>(() -> new ItemTunnelCreator(6, 9));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_4_3 = new RegistryObject<>(() -> new ItemTunnelWallCreator(4, 3));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_4_5 = new RegistryObject<>(() -> new ItemTunnelWallCreator(4, 5));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_4_7 = new RegistryObject<>(() -> new ItemTunnelWallCreator(4, 7));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_4_9 = new RegistryObject<>(() -> new ItemTunnelWallCreator(4, 9));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_5_3 = new RegistryObject<>(() -> new ItemTunnelWallCreator(5, 3));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_5_5 = new RegistryObject<>(() -> new ItemTunnelWallCreator(5, 5));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_5_7 = new RegistryObject<>(() -> new ItemTunnelWallCreator(5, 7));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_5_9 = new RegistryObject<>(() -> new ItemTunnelWallCreator(5, 9));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_6_3 = new RegistryObject<>(() -> new ItemTunnelWallCreator(6, 3));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_6_5 = new RegistryObject<>(() -> new ItemTunnelWallCreator(6, 5));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_6_7 = new RegistryObject<>(() -> new ItemTunnelWallCreator(6, 7));
	RegistryObject<Item> TUNNEL_WALL_CREATOR_6_9 = new RegistryObject<>(() -> new ItemTunnelWallCreator(6, 9));
}