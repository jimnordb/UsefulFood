package mods.usefulfood;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import com.mrcrayfish.furnitureapi.OvenRecipesAPI;

public class UFRecipes 
{
	public UFRecipes() 
	{
		AddSmeltingRecipes();
		AddRecipes();
		AddShapelessRecipes();
	}

	private void AddRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(UFItems.porkwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.porkCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.steakwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.beefCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.fishwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.fishCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.chickenwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.chickenCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.eggwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.friedegg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MuttonSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UFItems.SquidSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', UFItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', UFItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CheeseSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.Cheese });
	}

	private void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.milkbottle, 2), new Object[] { Item.glassBottle, Item.glassBottle, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicfruitsalad), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold });
		
		if(mod_usefulfood.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.caramelapple), new Object[] { Item.stick,UFItems.caramel, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinsoup), new Object[] {Item.bowlEmpty, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.salad), new Object[] { Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fruitsalad), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oatmeal), new Object[] { Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.jelly), new Object[] { Item.bowlEmpty, Item.slimeBall,Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.marshmallow), new Object[] { Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.icecream), new Object[] { Item.bowlEmpty,Item.snowball, Item.sugar, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.breadslice, 5), new Object[] { Item.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.biscuit, 3), new Object[] { Item.wheat, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.trailmix), new Object[] { Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolateicecream), new Object[] {UFItems.chocolatecandy, UFItems.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sushi), new Object[] { Item.fishRaw, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.melonjuice), new Object[] {Item.melon, Item.melon, Item.melon, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.applejuice), new Object[] {Item.appleRed, Item.appleRed, Item.appleRed, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotjuice), new Object[] {Item.carrot, Item.carrot, Item.carrot, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicapplejuice), new Object[] {new ItemStack(Item.appleGold, 1, 1), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.appleGold, 1, 0), Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotsoup), new Object[] {Item.carrot, Item.carrot, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinbread), new Object[] {Item.wheat, Item.wheat, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fishnchips), new Object[] {UFItems.FrenchFries, Item.fishCooked });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotpie), new Object[] { Item.carrot, Item.egg, Item.sugar, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit), new Object[] {UFItems.AppleJam, UFItems.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarbiscuit), new Object[] {Item.sugar, UFItems.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SquidSushi), new Object[] {UFItems.SquidTentacleRaw, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CactusJuice), new Object[] {Item.glassBottle, Block.cactus, Block.cactus, Block.cactus });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Spaghetti), new Object[] {Item.wheat, Item.bucketWater, Item.egg, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleIceCream), new Object[] {UFItems.icecream, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MagicIceCream), new Object[] {new ItemStack(Item.appleGold, 1, 0), Item.speckledMelon, Item.speckledMelon, UFItems.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateApple), new Object[] {Item.stick, Item.appleRed, UFItems.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelBiscuit), new Object[] {UFItems.biscuit, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FishSoup), new Object[] {Item.bowlEmpty, Item.fishCooked, Item.carrot, Item.potato, Item.bucketWater });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Tea), new Object[] {Item.glassBottle, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cheese), new Object[] { UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonIceCream), new Object[] {UFItems.icecream, Item.melon, Item.melon, Item.melon });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.hotchocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocobiscuit, 2), new Object[] {UFItems.biscuit, UFItems.biscuit, UFItems.hotchocolatebottle});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelIceCream), new Object[] {UFItems.icecream, UFItems.caramel});
		
		// 1.4.3
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), new Object[] {Item.sugar, Item.appleRed, Item.slimeBall, Item.bowlEmpty});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), new Object[] {Item.sugar, Item.melon, Item.slimeBall, Item.bowlEmpty});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), new Object[] {UFItems.jelly, Item.appleRed});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), new Object[] {UFItems.jelly, Item.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cereal), new Object[] {UFItems.milkbottle, Item.wheat, Item.sugar, Item.bowlEmpty});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateCereal), new Object[] {UFItems.milkbottle, Item.wheat, Item.sugar, new ItemStack(Item.dyePowder, 1, 3), Item.bowlEmpty});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FrenchFries), new Object[] {Item.bakedPotato});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), new Object[] {Item.sugar, Item.bucketMilk, Item.wheat, Item.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), new Object[] {Item.sugar, UFItems.milkbottle, Item.wheat, Item.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJam),  new Object[] {Item.sugar, Item.bowlEmpty, Item.appleRed});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJam),  new Object[] {Item.sugar, Item.bowlEmpty, Item.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit),  new Object[] {UFItems.biscuit, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamPanCake),  new Object[] {UFItems.PanCake, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamToast),  new Object[] {UFItems.breadslice, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelPanCake),  new Object[] {UFItems.PanCake, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelToast),  new Object[] {UFItems.breadslice, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolatePanCake),  new Object[] {UFItems.PanCake, UFItems.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateToast),  new Object[] {UFItems.chocolatecandy, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamBiscuit),  new Object[] {UFItems.MelonJam, UFItems.biscuit});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamToast),  new Object[] {UFItems.MelonJam, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamPanCake),  new Object[] {UFItems.PanCake, UFItems.MelonJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarToast),  new Object[] {Item.sugar, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarPancake),  new Object[] {Item.sugar, UFItems.PanCake});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Donut),  new Object[] {Item.wheat, Item.wheat, Item.sugar, UFItems.milkbottle, new ItemStack(Item.dyePowder, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oreo),  new Object[] {UFItems.chocobiscuit, UFItems.chocobiscuit, Item.sugar, Item.sugar, UFItems.milkbottle});
	}

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UFItems.chocolatebottle.itemID, new ItemStack(UFItems.hotchocolatebottle));
    	AddSmeltingRecipe(UFItems.sugarcube.itemID, new ItemStack(UFItems.caramel));
    	AddSmeltingRecipe(Item.seeds.itemID, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Item.pumpkinSeeds.itemID, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Item.melonSeeds.itemID, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Item.egg.itemID, new ItemStack(UFItems.friedegg));
    	AddSmeltingRecipe(UFItems.marshmallow.itemID, new ItemStack(UFItems.cmarshmallow));
    	AddSmeltingRecipe(UFItems.MuttonRaw.itemID, new ItemStack(UFItems.MuttonCooked));
		
		// 1.2
    	AddSmeltingRecipe(UFItems.SquidTentacleRaw.itemID, new ItemStack(UFItems.SquidTentacleCooked));
		
		// 1.4
    	AddSmeltingRecipe(UFItems.milkbottle.itemID, new ItemStack(UFItems.HotMilkBottle));
    	AddSmeltingRecipe(UFItems.PanCakeDough.itemID, new ItemStack(UFItems.PanCake));
	}
    
    private void AddSmeltingRecipe(int input, ItemStack output, float xp) {
    	GameRegistry.addSmelting(input, output, xp);
    	OvenRecipesAPI.instance().addFoodToOvenRecipes(input, output);
    }
    
    private void AddSmeltingRecipe(int input, ItemStack output) {
    	GameRegistry.addSmelting(input, output, 0.3F);
    	OvenRecipesAPI.instance().addFoodToOvenRecipes(input, output);
    }
}