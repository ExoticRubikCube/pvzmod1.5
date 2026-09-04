package com.hungteen.pvz.data;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.data.loot.LootTableGenerator;
import com.hungteen.pvz.data.recipe.RecipeGenerator;
import com.hungteen.pvz.data.tag.BlockTagGenerator;
import com.hungteen.pvz.data.tag.EntityTypeTagGenerator;
import com.hungteen.pvz.data.tag.ItemTagGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = PVZMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGeneratorHandler {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent ev) {
		ExistingFileHelper helper = ev.getExistingFileHelper();
		if(ev.includeServer()) {
			//for tags.
			BlockTagGenerator generator = new BlockTagGenerator(ev.getGenerator(), helper);
			ev.getGenerator().addProvider(true, generator);
			ev.getGenerator().addProvider(true, new ItemTagGenerator(ev.getGenerator(), generator, helper));
			ev.getGenerator().addProvider(true, new EntityTypeTagGenerator(ev.getGenerator(), helper));
			//for recipes.
			ev.getGenerator().addProvider(true, new RecipeGenerator(ev.getGenerator()));
			//for loot tables.
		    ev.getGenerator().addProvider(true, new LootTableGenerator(ev.getGenerator()));
		}
		if(ev.includeClient()) {
			///for language
//			ev.getGenerator().addProvider(new CNLanguageGenerator(ev.getGenerator()));
//			ev.getGenerator().addProvider(new USLanguageGenerator(ev.getGenerator()));
			//for item model
			ev.getGenerator().addProvider(true, new ItemModelGenerator(ev.getGenerator(), helper));
//			ev.getGenerator().addProvider(new BlockModelGenerator(ev.getGenerator(), helper));
			//for block state
//			ev.getGenerator().addProvider(new BlockStateGenerator(ev.getGenerator(), helper));
		}
	}
}
