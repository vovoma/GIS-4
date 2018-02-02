package s4c.microservices.GIS.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import s4c.microservices.GIS.model.Device;
import s4c.microservices.GIS.model.Geometry;
import s4c.microservices.GIS.services.WFSService;

@Service("WFSService")
public class WFSServiceImpl implements WFSService{

	@Override
	public List<Device> getDummyDevices() {
		Device device;
		Geometry geom;
		double[] coordinates = new double[2];
		List<Device> devices = new ArrayList<Device>();
		
		coordinates[0] = 43.461733;
		coordinates[1] = -3.806941;
		geom = new Geometry("point", coordinates); 
		device = new Device("5a5f0e9c2c260400131897e7","devices_general","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);
		
		coordinates[0] = 43.462551;
		coordinates[1] = -3.802287;
		geom = new Geometry("point", coordinates); 
		device = new Device("5a5f0f7f2c260400131897e9","devices_general_2","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);
		
		coordinates[0] = 43.467262;
		coordinates[1] = -3.783029;
		geom = new Geometry("point", coordinates); 
		device = new Device("5a5f0e9c2c260400131897e8","devices_general","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);
		
		coordinates[0] = 43.469754;
		coordinates[1] = -3.782793;
		geom = new Geometry("point", coordinates); 
		device = new Device(null,"hola","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);
		
		coordinates[0] = 43.470198;
		coordinates[1] = -3.788050;
		geom = new Geometry("point", coordinates); 
		device = new Device("5a5f6f9e2c260400131897fe","devices_general","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);
		
		coordinates[0] = 43.469404;
		coordinates[1] = -3.792760;
		geom = new Geometry("point", coordinates); 
		device = new Device("5a606735e445980013c24904","devices_general","IoTA-UL","glucometer-type-1","HTTP",true,"507f191e810c19729de860ed","0",null,null,null,null,null,geom);
		devices.add(device);	
		
		
		return devices;
		
	}

}
