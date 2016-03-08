package com.ramilego.pixelgalaxy.dimension;

import com.ramilego.pixelgalaxy.PixelGalaxyMod;
import com.ramilego.pixelgalaxy.world.gen.ChunkProviderGreenPixel;
import com.ramilego.pixelgalaxy.world.gen.WorldChunkManagerGreenPixel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;

public class WorldProviderGreenPixel extends WorldProviderSpace implements IGalacticraftWorldProvider {

	@Override
	public float getGravity() {
		return 0F;
	}

	@Override
	public double getMeteorFrequency() {
		return 0;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 1.0;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		if (tier >= 3){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public float getFallDamageModifier() {
		return 1;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 1;
	}
	
	@Override
	public boolean hasBreathableAtmosphere() {
		return true;
	}

	@Override
	public float getThermalLevelModifier() {
		return 0;
	}

	@Override
	public float getWindLevel() {
		return 1.0F;
	}
	
	@Override
	public float getSolarSize() {
		return 1.0f;
	}

	@Override
	public CelestialBody getCelestialBody() {
		return PixelGalaxyMod.greenPixel;
	}

	@Override
	public Vector3 getFogColor() {
		float f = 2.0F - this.getStarBrightness(1.0F);
        return new Vector3(255F / 255F * f, 128F / 255F * f, 255F / 255F * f);
	}

	@Override
	public Vector3 getSkyColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(255 / 255.0F * f, 128 / 255.0F * f, 255 / 255.0F * f);
	}

	@Override
	public boolean canRainOrSnow() {
		return false;
	}

	@Override
	public boolean hasSunset() {
		return true;
	}

	@Override
	public long getDayLength() {
		return 24000;
	}

	@Override
	public boolean shouldForceRespawn() {
		return true;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderGreenPixel.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerGreenPixel.class;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        float f1 = this.worldObj.getCelestialAngle(par1);
        float f2 = 1.0F - (MathHelper.cos(f1 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);

        if (f2 < 0.0F)
        {
            f2 = 0.0F;
        }

        if (f2 > 1.0F)
        {
            f2 = 1.0F;
        }

        return f2 * f2 * 0.75F;
    }

}
