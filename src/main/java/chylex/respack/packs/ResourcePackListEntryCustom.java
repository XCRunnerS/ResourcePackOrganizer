package chylex.respack.packs;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import chylex.respack.gui.GuiCustomResourcePacks;

@SideOnly(Side.CLIENT)
public abstract class ResourcePackListEntryCustom extends ResourcePackListEntryFound{
	public ResourcePackListEntryCustom(GuiCustomResourcePacks ownerScreen){
		super(ownerScreen,null);
	}
	/**
	 * Set Pack Icon
	 * @Author TODO ICON
	 * */
	@Override
	public abstract void func_148313_c(); //sets icon
	/**
	 * Set Pack Name
	 * @Author TODO NAME
	 * */
	@Override
	public abstract String func_148311_a(); //sets name
	/**
	 * Set Pack Description
	 * @Author TODO DESCRIPTION
	 * */
	@Override
	public abstract String func_148312_b(); //sets description
	
	@Override
	public boolean func_148310_d(){
		return super.func_148310_d();
	}
	
	@Override
	public boolean func_148307_h(){
		return super.func_148307_h();
	}
	
	@Override
	public boolean func_148308_f(){
		return super.func_148308_f();
	}
	
	@Override
	public boolean func_148309_e(){
		return super.func_148309_e();
	}
	
	@Override
	public boolean func_148314_g(){
		return super.func_148314_g();
	}
}
