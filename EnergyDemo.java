package com.test;

class Energy
{
	private int Megawatt;
	Energy()
	{
		System.out.println("");
	}
	void source()
	{
		System.out.println("Enegy Generation");
	}
	public int getMegawatt() {
		return Megawatt;
	}
	public void setMegawatt(int megawatt) {
		Megawatt = megawatt;
	}
	
}

class SolarEnergy extends Energy
{
	private int Solar_panel_qunatity;
	@Override
	void source()
	{
		System.out.println("When use solar for enegry gereration");
	}
	
	public SolarEnergy(int solar_panel_qunatity) {
		super();
		Solar_panel_qunatity = solar_panel_qunatity;
	}

	public int getSolar_panel_qunatity() {
		return Solar_panel_qunatity;
	}
}

class WindEnergy extends Energy
{
	private int Wind_Turbines_quantity;
	@Override
	void source()
	{
		System.out.println("When use Wind for enegry gereration");
	}
	
	public WindEnergy(int wind_Turbines_quantity) {
		super();
		Wind_Turbines_quantity = wind_Turbines_quantity;
	}

	public int getWind_Turbines_quantity() {
		return Wind_Turbines_quantity;
	}
}

class CoalEnergy extends Energy
{
	private int coal_quantity;
	@Override
	void source()
	{
		System.out.println("When use Coal for enegry gereration");
	}
	
	public CoalEnergy(int coal_quantity) {
		super();
		this.coal_quantity = coal_quantity;
	}

	public int getCoal_quantity() {
		return coal_quantity;
	}
}

public class EnergyDemo {
	static void acceptData(Energy e,int megawatt)
	{
		if(e instanceof SolarEnergy)
		{
			e.source();
			System.out.println("Solar Panel => Quantity "+((SolarEnergy) e).getSolar_panel_qunatity()+" generate "+megawatt+" MegaWatt energy");
		}
		if(e instanceof WindEnergy)
		{
			e.source();
			System.out.println("Wind Turbines => Quantity "+((WindEnergy) e).getWind_Turbines_quantity()+" generate "+megawatt+" MegaWatt energy");
		}
		if(e instanceof CoalEnergy)
		{
			e.source();
			System.out.println("Coal => Quantity "+((CoalEnergy) e).getCoal_quantity()+" generate "+megawatt+" MegaWatt energy");
		}
	}
	
	public static void main(String[] args)
	{
		acceptData(new SolarEnergy(1000),750);
		System.out.println();
		acceptData(new WindEnergy(1000),650);
		System.out.println();
		acceptData(new CoalEnergy(1000),850);
		
	}
}