package chylex.respack.gui;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import chylex.respack.ResourcePackOrganizerRevamp;

public final class GuiModConfig implements IModGuiFactory{
	@Override
	public void initialize(Minecraft mc){}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass(){
		return GuiModConfigInner.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories(){
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element){
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	public static final class GuiModConfigInner extends GuiConfig{
		public GuiModConfigInner(GuiScreen parent){
			super(parent, ResourcePackOrganizerRevamp.getConfig().getGuiConfigElements(), ResourcePackOrganizerRevamp.MODID,false,false, ResourcePackOrganizerRevamp.getConfig().getGuiConfigString());
		}
	}
}