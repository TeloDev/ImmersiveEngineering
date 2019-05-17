package blusunrize.immersiveengineering.api.energy;

import net.minecraft.util.Vec3;
import blusunrize.immersiveengineering.api.TargetingInfo;
import blusunrize.immersiveengineering.api.energy.ImmersiveNetHandler.Connection;

/**
 * @author unfoidable - 17.05.2019
 *
 * An interface to be implemented by TileEntities, to allow precise energy passthrough monitoring
 */
public interface IImmersiveConnectablePrecisePassthrough
{
	/**
	 * fired for every not-simulated energy packet passing through. Used for energy meter and stuff
	 */
	public void onEnergyPassthrough(double amount);

}