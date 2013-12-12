package bloodMod.tileEntity;

import bloodMod.Analyze;
import bloodMod.blocks.Phlebotor;
import bloodMod.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPhlebotor extends TileEntity implements ISidedInventory{
	private String localizedName;
	
	
	
	public static final int[] slots_top = new int[]{0}; //slot 0 can be accessed from the top with hopper
	public static final int[] slots_bottom = new int[]{2, 1}; //2 is higher priority
	public static final int[] slots_sides = new int[]{1}; //slot one can be acceed from side with hopper
	
	private ItemStack[] slots = new ItemStack[39];
	
	
	public int furnaceSpeed = 200;
	
	//how long this furnace will continue to burn for
	public int burnTime;
	
	//start time for this fuel
	public int currentItemBurnTime;
	
	//time left before cooked
	public int cookTime;
		
	
	public String getInvName(){
		return this.isInvNameLocalized() ? this.localizedName : "container.phlebotor";
	}
	
	public boolean isInvNameLocalized(){
		return this.localizedName != null && this.localizedName.length() > 0;
	}
	
	public void setGuiDisplayName(String displayName) {
		
		this.localizedName = displayName;
	}

	public ItemStack getStackInSlot(int i) {
		return this.slots[i];
	}


	public ItemStack decrStackSize(int i, int j) {//Right click to half stack
		if(this.slots[i] != null){
			ItemStack itemstack;
				
			if(this.slots[i].stackSize <=j){
				itemstack = this.slots[i];
				this.slots[i] = null;
				return itemstack;
			}else{
				itemstack = this.slots[i].splitStack(j);
				
				if(this.slots[i].stackSize ==0){
					this.slots[i] = null;
				}
				
				return itemstack;
			}
		}
		
		return null;
	}


	public ItemStack getStackInSlotOnClosing(int i) {
		if(this.slots[i] != null){
			ItemStack itemstack = this.slots[i];
			this.slots[i] = null;
			return itemstack;
		}
		
		return null;
	}
	
	public  void click(ItemStack itemstack, int slotnum){
		
		
		
	}


	public void setInventorySlotContents(int i, ItemStack itemstack) {
		this.slots[i] = itemstack;
		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()){
			itemstack.stackSize = this.getInventoryStackLimit();
		}
	}


	public int getInventoryStackLimit() {
		return 64;
	}
	
	public void readFromNBT(NBTTagCompound nbt){
		super.readFromNBT(nbt);
		
		NBTTagList list = nbt.getTagList("Items");
		this.slots = new ItemStack[this.getSizeInventory()];
		
		for(int i=0;i<list.tagCount();i++){
			NBTTagCompound compound = (NBTTagCompound) list.tagAt(i);
			byte b = compound.getByte("Slot");
			
			if(b >= 0 && b < this.slots.length){
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);//Write to slots
			}
		}
		
		this.burnTime = nbt.getShort("BurnTime");
		this.cookTime = nbt.getShort("CookTime");
		this.currentItemBurnTime = getItemBurnTime(this.slots[1]);/////////////////////////////////////////NOTE WHEN CHANGING WHERE FUEL IS PLACED
		
		if(nbt.hasKey("PhlebotorKey")){
			this.localizedName = nbt.getString("PhlebotorKey");
		}
	}
	
	public void writeToNBT(NBTTagCompound nbt){
		super.writeToNBT(nbt);
		
		nbt.setShort("BurnTime", (short)this.burnTime);
		nbt.setShort("CookTime", (short)this.cookTime);
		
		NBTTagList list = new NBTTagList();
		
		for(int i=0;i<this.slots.length;i++){
			if(this.slots[i] != null){
				NBTTagCompound compund = new NBTTagCompound();
				compund.setByte("Slot", (byte)i);
				this.slots[i].writeToNBT(compund);
				list.appendTag(compund);
			}
		}
		
		nbt.setTag("Items", list);
		
		if(this.isInvNameLocalized()){//If change name on anvil
			nbt.setString("PhlebotorKey", this.localizedName);
		}
		
	}
	
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}


	public void openChest() {}
	public void closeChest() {}
	
	public boolean isBurning(){
		return this.burnTime > 0;
	}
	
	public void updateEntity(){
		
		if(slots[0]!=null){		
			if(slots[0].stackTagCompound == null || slots[0].stackTagCompound.getBoolean("analyzed")==false){
				Analyze.AnalyzeBlood(slots[0], true);
			}
		}
		
		if(slots[0] != null){
			if(slots[0].stackTagCompound != null && slots[0].stackTagCompound.getBoolean("analyzed")==true){
				if(slots[0].stackTagCompound.getInteger("aqua")>0) slots[2] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("aqua"), 0);
				else slots[2] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("archier")>0) slots[3] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("archier"), 1);
				else slots[3] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("darkness")>0) slots[4] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("darkness"), 2);
				else slots[4] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("day")>0) slots[5] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("day"), 3);
				else slots[5] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("death")>0) slots[6] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("death"), 4);
				else slots[6] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("diamond")>0) slots[7] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("diamond"), 5);
				else slots[7] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("echo")>0) slots[8] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("echo"), 6);
				else slots[8] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("end")>0) slots[9] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("end"), 7);
				else slots[9] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("fear")>0) slots[10] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("fear"), 8);
				else slots[10] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("feather")>0) slots[11] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("feather"), 9);
				else slots[11] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("flame")>0) slots[12] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("flame"), 10);
				else slots[12] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("gunpowder")>0) slots[13] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("gunpowder"), 11);
				else slots[13] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("iron")>0) slots[14] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("iron"), 12);
				else slots[14] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("light")>0) slots[15] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("light"), 13);
				else slots[15] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("race")>0) slots[16] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("race"), 14);
				else slots[16] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("spring")>0) slots[17] = new ItemStack(Items.particle, slots[0].stackTagCompound.getInteger("spring"), 15);
				else slots[17] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("sugar")>0) slots[18] = new ItemStack(Items.particle1, slots[0].stackTagCompound.getInteger("sugar"), 0);
				else slots[18] = (ItemStack)null;
				if(slots[0].stackTagCompound.getInteger("sustenance")>0) slots[19] = new ItemStack(Items.particle1, slots[0].stackTagCompound.getInteger("sustenance"), 1);
				else slots[19] = (ItemStack)null;
				
				this.onInventoryChanged();
			} else {
				for(int i=2;i<20;i++){
					slots[i]=(ItemStack)null;
				}
			}
		}else {
			for(int i=2;i<20;i++){
				slots[i]=(ItemStack)null;
			}
		}
		for(int i=18;i<34;i++){
			if(slots[i+2] == null){
				//slots[i+2] = new ItemStack(Items.particle, 1, i-18);
			}
		}
		for(int i=34;i<36;i++){
			if(slots[i+2] == null){
				//slots[i+2] = new ItemStack(Items.particle1, 1, i-34);
			}
		}
		
		
		boolean flag = this.burnTime > 0;//flags for use later with changed state
		boolean flag1 = false;//update inventory later
		
		if(this.burnTime > 0){
			this.burnTime--;
		}
		if(!this.worldObj.isRemote){
			if(this.burnTime == 0 && this.canSmelt()){
				this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);//set to fuel time
				
				if(this.burnTime > 0){
					flag1 = true;
					
					if(this.slots[1] != null){
						this.slots[1].stackSize--;//remove 1 fuel
						
						if(this.slots[1].stackSize == 0){
							this.slots[1] = this.slots[1].getItem().getContainerItemStack(this.slots[1]);
						}
					}
				}
			}
			if(this.isBurning() && this.canSmelt()){
				this.cookTime++;//Advance the cooking
				
				if(this.cookTime == this.furnaceSpeed){//If the item is cooked
					this.cookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
				
			}else{
				this.cookTime = 0;
			}
			if(flag != this.burnTime > 0){//it changed
				flag1 = true;
				Phlebotor.updatePhlebotorBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord); //passes true if active
			}
			
		}
		
		if(flag1){//We removed a fuel and updated the inventory
			this.onInventoryChanged();
		}
	}
	
	private boolean canSmelt(){
		if(this.slots[0] == null){
			return false;
		}else{
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
			
			if(itemstack == null) return false;
			if(this.slots[2] == null) return true;
			if(!this.slots[2].isItemEqual(itemstack)) return false;//check if result is the same as source item
				
			int result = this.slots[2].stackSize + itemstack.stackSize;//theoretically adds result of smelting and stack thats already in result slot
			
			return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());//check stack size of output
		}
	}
	public void smeltItem(){
		if(this.canSmelt()){
			ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
			
			if(this.slots[2] == null){
				this.slots[2] = itemstack.copy();
			}else if(this.slots[2].isItemEqual(itemstack)){
				this.slots[2].stackSize += itemstack.stackSize;
			}
			
			this.slots[0].stackSize--;
			
			if(this.slots[0].stackSize <= 0){
				this.slots[0] = null;//removes itemstack from slot
			}
			
		}
	}
	
	public static int getItemBurnTime(ItemStack itemstack){
		if(itemstack == null){
			return 0;
		}else{
			int i = itemstack.itemID; //set i to whatever we are querying
			Item item = itemstack.getItem();
			
			if(item instanceof ItemBlock && Block.blocksList[i] != null){
				Block block = Block.blocksList[i];
				
				if(block == Block.woodSingleSlab){
					return 150;
				}
				if(block.blockMaterial == Material.wood){
					return 300;
				}
			}
			
			if(item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200; // wood makes wood tools burnable
			if(item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
			if(item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 200;
			
			if(i == Item.appleGold.itemID) return 100;//FUEL VALUE
			
			return GameRegistry.getFuelValue(itemstack);
		}
	}
	
	public static boolean isItemFuel(ItemStack itemstack){
		return getItemBurnTime(itemstack) > 0;
	}

	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 ? false : (i == 1 ? isItemFuel(itemstack) : true);
	}


	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 ==1 ? slots_top : slots_sides); // can a hopper acces from givin side
	}


	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return this.isItemValidForSlot(i, itemstack);//where does hopper put stuff
	}


	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 ||  i !=1 || itemstack.itemID == Item.bucketEmpty.itemID; //slot not 0 or 1, or isa a bukkit.. a hopper can extract
	}

	public int getBurnTimeRemainingScaled(int i) {//For the burning animation
		if(this.currentItemBurnTime == 0){
			this.currentItemBurnTime = this.furnaceSpeed;
		}
		
		return this.burnTime * i / this.currentItemBurnTime;
	}
	
	public int getCookProgressScaled(int i){//For progress animation
		return this.cookTime * i / this.furnaceSpeed;
	}

	public int getSizeInventory() {
		return this.slots.length;
	}

}
