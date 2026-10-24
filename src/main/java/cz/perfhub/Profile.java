package cz.perfhub;

import net.minecraft.client.CloudStatus;
import net.minecraft.client.GraphicsPreset;
import net.minecraft.server.level.ParticleStatus;

/** Hardwarové profily. Nastavují jen vanilla možnosti. */
public enum Profile {
    WEAK("Slabé PC", 6, 5, 120, 0, 0,
            ParticleStatus.MINIMAL, GraphicsPreset.FAST, CloudStatus.OFF, 0.5, false, false, 0.0),
    MEDIUM("Střední PC", 10, 8, 144, 2, 2,
            ParticleStatus.DECREASED, GraphicsPreset.FANCY, CloudStatus.FAST, 0.75, true, false, 0.5),
    STRONG("Silné PC", 16, 12, 260, 4, 5,
            ParticleStatus.ALL, GraphicsPreset.FANCY, CloudStatus.FANCY, 1.0, true, false, 0.5);

    public final String label;
    public final int renderDistance, simulationDistance, fpsLimit, mipmaps, biomeBlend;
    public final ParticleStatus particles;
    public final GraphicsPreset graphics;
    public final CloudStatus clouds;
    public final double entityDistance, textBackground;
    public final boolean entityShadows, vsync;

    Profile(String label, int renderDistance, int simulationDistance, int fpsLimit, int mipmaps, int biomeBlend,
            ParticleStatus particles, GraphicsPreset graphics, CloudStatus clouds,
            double entityDistance, boolean entityShadows, boolean vsync, double textBackground) {
        this.label = label;
        this.renderDistance = renderDistance;
        this.simulationDistance = simulationDistance;
        this.fpsLimit = fpsLimit;
        this.mipmaps = mipmaps;
        this.biomeBlend = biomeBlend;
        this.particles = particles;
        this.graphics = graphics;
        this.clouds = clouds;
        this.entityDistance = entityDistance;
        this.entityShadows = entityShadows;
        this.vsync = vsync;
        this.textBackground = textBackground;
    }
}
