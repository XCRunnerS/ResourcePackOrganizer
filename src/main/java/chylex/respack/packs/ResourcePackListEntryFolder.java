package chylex.respack.packs;
import java.io.File;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import chylex.respack.gui.GuiCustomResourcePacks;
import chylex.respack.gui.GuiUtils;

@SideOnly(Side.CLIENT)
public class ResourcePackListEntryFolder extends ResourcePackListEntryCustom{
	private ResourceLocation folderResource = new ResourceLocation("betterresourcepacks:textures/gui/folder.png");
	private final GuiCustomResourcePacks ownerScreen;
	public final File folder;
	public final String folderName;
	public final boolean isUp;
	
	public ResourcePackListEntryFolder(GuiCustomResourcePacks ownerScreen, File folder){
		super(ownerScreen);
		this.ownerScreen = ownerScreen;
		this.folder = folder;
		this.folderName = folder.getName();
		this.isUp = false;
	}
	
	public ResourcePackListEntryFolder(GuiCustomResourcePacks ownerScreen, File folder, boolean isUp){
		// back button
		super(ownerScreen);
		this.ownerScreen = ownerScreen;
		this.folder = folder;
		this.folderName = "<<";
		this.isUp = isUp;
		folderResource = new ResourceLocation("betterresourcepacks:textures/gui/arrow_left.png");
	}
	
	@Override
	public void func_148313_c(){
		mc.getTextureManager().bindTexture(folderResource);
	}
	
	@Override
	public String func_148312_b(){
		return folderName;
	}
	
	@Override
	public String func_148311_a(){
		return isUp ? "<<" : "Folder >>";
	}
	
	@Override
	public boolean mousePressed(int p_148278_1_, int p_148278_2_, int p_148278_3_, int p_148278_4_, int p_148278_5_, int p_148278_6_){
		ownerScreen.moveToFolder(folder);
		return true;
	}
	
	@Override
	public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected){
		GuiUtils.renderFolderEntry(this,x,y,isSelected);
	}
}
