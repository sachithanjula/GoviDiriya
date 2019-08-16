package com.mobios.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobios.model.Advertisement;
import com.mobios.model.AdvertisementCropList;
import com.mobios.model.Crop;
import com.mobios.model.District;
import com.mobios.model.GnDivition;
import com.mobios.model.LandDivision;
import com.mobios.model.LandType;
import com.mobios.model.Month;
import com.mobios.model.Province;
import com.mobios.repository.AdCropLstRepository;
import com.mobios.repository.AdvertisementRepository;
import com.mobios.repository.CropRepository;
import com.mobios.repository.FarmerRepository;
import com.mobios.repository.GDDistrictRepository;
import com.mobios.repository.GDLandDivisionRepository;
import com.mobios.repository.GDLandGnRepository;
import com.mobios.repository.GDProvinceRepository;
import com.mobios.repository.LandTypeRepository;
import com.mobios.repository.MonthRepository;

@RestController
@RequestMapping("/api/govidiriya")
public class GDController {

	@Autowired
	GDProvinceRepository gdProvinceRepository;

	@Autowired
	GDDistrictRepository gdDistrictRepository;

	@Autowired
	GDLandDivisionRepository gdLandDivisionRepository;

	@Autowired
	GDLandGnRepository gdLandGnRepository;

	@Autowired
	CropRepository cropRepository;

	@Autowired
	MonthRepository monthRepository;

	@Autowired
	LandTypeRepository landTypeRepository;

	@Autowired
	AdCropLstRepository adCropLstRepository;
	
	@Autowired
	FarmerRepository farmerRepository;
	
	@Autowired
	AdvertisementRepository advertisementRepository;

	// Get All provinces
	@GetMapping("/provinces")
	public List<Province> getAllProvinces() {
		return gdProvinceRepository.findAll();
	}

	// Get All districts
	@GetMapping("/districts")
	public List<District> getAllDistricts() {
		return gdDistrictRepository.findAll();
	}

	// Get All land division
	@GetMapping("/lands")
	public List<LandDivision> getAllLands() {
		return gdLandDivisionRepository.findAll();
	}

	// Get All GNDivision
	@GetMapping("/gndivitions")
	public List<GnDivition> getAllGnDivition() {
		return gdLandGnRepository.findAll();
	}

	// Get All crops
	@GetMapping("/crops")
	public List<Crop> getAllCrops() {
		return cropRepository.findAll();
	}

	// Get All land types
	@GetMapping("/landtypes")
	public List<LandType> getAllLandTypes() {
		return landTypeRepository.findAll();
	}

	// Get All Months
	@GetMapping("/months")
	public List<Month> getAllMonths() {
		return monthRepository.findAll();
	}

	// Get All adcroplst
	@GetMapping("/adcroplst")
	public List<AdvertisementCropList> getAlladcroplst() {
		return adCropLstRepository.findAll();
	}

	// Get province by id
	@GetMapping("/provinces/{province_autoID}")
	public Province getProvinceById(@PathVariable(value = "province_autoID") Integer proId) {

		return gdProvinceRepository.findOne(proId);

	}

	// Get district by id
	@GetMapping("/districts/{district_autoID}")
	public District getDistrictById(@PathVariable(value = "district_autoID") Integer disId) {

		return gdDistrictRepository.findOne(disId);

	}

	// Get land by id
	@GetMapping("/lands/{divisionAutoId}")
	public LandDivision getLandDivisionById(@PathVariable(value = "divisionAutoId") Integer divId) {

		return gdLandDivisionRepository.findOne(divId);

	}

	// Get crop by id
	@GetMapping("/lands/{cxCropListAutoId}")
	public LandDivision getCropById(@PathVariable(value = "cxCropListAutoId") Integer cropId) {

		return gdLandDivisionRepository.findOne(cropId);

	}

	// Get GNDivision by id
	@GetMapping("/gndivitions/{gnDivisionAutoId}")
	public GnDivition getGnDivisionById(@PathVariable(value = "gnDivisionAutoId") Integer gnId) {

		return gdLandGnRepository.findOne(gnId);

	}

	// get district according to provinceId
	@GetMapping("/districts/id/{provinceId}")
	public List<District> getDistrictByProvince(@PathVariable(value = "provinceId") Integer proID) {

		return gdDistrictRepository.findByProvinceId(proID);

	}

	// get land according to districtId
	@GetMapping("/lands/id/{districtId}")
	public List<LandDivision> getLandByProvince(@PathVariable(value = "districtId") Integer distID) {

		return gdLandDivisionRepository.findByProvinceId(distID);

	}

	// get GN division according to LandId
	@GetMapping("/gndivitions/id/{divisionId}")
	public List<GnDivition> getGnDivitionByLandDivision(@PathVariable(value = "divisionId") Integer divID) {

		return gdLandGnRepository.findByDivisionId(divID);

	}
	
	//add form details
	@PostMapping("/form")
	public Advertisement createForm(@Valid @RequestBody Advertisement advertisement) {
		
		return advertisementRepository.save(advertisement);
		
	}
	
}
