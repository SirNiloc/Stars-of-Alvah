package soa.regs;

import java.util.ArrayList;

import soa.item.material.Material;
import soa.item.material.raw.MaterialRaw;
import soa.item.material.raw.gas.Gas;
import soa.item.material.raw.mineral.Mineral;
import soa.item.material.raw.mineral.MineralGem;
import soa.item.material.raw.mineral.MineralMetal;
import soa.item.material.raw.plant.Plant;
import soa.item.material.raw.plant.PlantCraft;
import soa.item.material.raw.plant.PlantFood;
import soa.item.material.raw.plant.PlantMedical;
import soa.item.material.refined.MaterialRefined;

public class Materials {

	private ArrayList<Material> materials = new ArrayList<Material>();
	
	private ArrayList<MaterialRaw> raw = new ArrayList<MaterialRaw>();
	private ArrayList<Mineral> minerals = new ArrayList<Mineral>();
	private ArrayList<MineralGem> gems = new ArrayList<MineralGem>();
	private ArrayList<MineralMetal> metals = new ArrayList<MineralMetal>();
	
	private ArrayList<Gas> gas = new ArrayList<Gas>();
	
	private ArrayList<Plant> plants = new ArrayList<Plant>();
	private ArrayList<PlantCraft> plantsCraft = new ArrayList<PlantCraft>();
	private ArrayList<PlantFood> plantsFood = new ArrayList<PlantFood>();
	private ArrayList<PlantMedical> plantsMedical = new ArrayList<PlantMedical>();
	
	private ArrayList<MaterialRefined> refined = new ArrayList<MaterialRefined>();
	
	

	public ArrayList<Material> getMaterials(){
		return materials;
	}
	
	public void add(Material r,long ammount){
		if(materials.contains(r));
		else materials.add(r);
		
		if(r instanceof MaterialRaw){
			if(raw.contains(r));
			else raw.add((MaterialRaw) r);
			if(r instanceof Mineral){
				if(minerals.contains(r));
				else minerals.add((Mineral) r);
				if(r instanceof MineralGem){
					if(gems.contains(r));
					else gems.add((MineralGem) r);
				}else if(r instanceof MineralMetal){
					if(metals.contains(r));
					else metals.add((MineralMetal) r);
				}
			}else if(r instanceof Plant){
				if(plants.contains(r));
				else plants.add((Plant) r);
				if(r instanceof PlantCraft){
					if(plantsCraft.contains(r));
					else plantsCraft.add((PlantCraft) r);
				}else if(r instanceof PlantMedical){
					if(plantsMedical.contains(r));
					else plantsMedical.add((PlantMedical) r);
				}else if(r instanceof PlantFood){
					if(plantsFood.contains(r));
					else plantsFood.add((PlantFood) r);
					
				}else if(r instanceof Gas){
					if(gas.contains(r));
					else gas.add((Gas) r);

				}
			}
			
		}else if(r instanceof MaterialRefined){
			if(refined.contains(r));
			else refined.add((MaterialRefined) r);
		}
	}
	
	public ArrayList<MaterialRaw> getRawMaterials(){
		return raw;
	}
	
	public ArrayList<Gas> getGases(){
		return gas;
	}
	
	public ArrayList<Mineral> getMinerals(){
		return minerals;
	}
	
	public ArrayList<MineralGem> getGems(){
		return gems;
	}
	
	public ArrayList<MineralMetal> getMetals(){
		return metals;
	}

	public ArrayList<Plant> getPlants(){
		return plants;
	}
	public ArrayList<PlantMedical> getMedicalPlants(){
		return plantsMedical;
	}
	public ArrayList<PlantCraft> getCraftingPlants(){
		return plantsCraft;
	}
	public ArrayList<PlantFood> getFoodPlants(){
		return plantsFood;
	}
	
	public ArrayList<MaterialRefined> getRefinedMaterials(){
		return refined;
	}
}

