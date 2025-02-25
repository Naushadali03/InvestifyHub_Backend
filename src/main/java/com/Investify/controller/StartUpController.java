package com.Investify.controller;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Investify.model.InvestorInfo;
import com.Investify.model.StartUpInfo;
import com.Investify.repository.StartUpRepository;
import com.Investify.service.StartUpService;

@RestController
@CrossOrigin("*")
public class StartUpController {
	
	@Autowired
	StartUpService startUpService;
	
	@Autowired
	StartUpRepository startUpRepository;
	
	@PostMapping("/saveData")
    public String saveData(
            @RequestParam("companyName") String companyName,
            @RequestParam("title") String title,
            @RequestParam("desc") String desc,
            @RequestParam("pitch") String pitch,
            @RequestParam("wti") String wti,
            @RequestParam("ceoName") String ceoName,
            @RequestParam("ctoName") String ctoName,
            @RequestParam("boardMemberName") String boardMemberName,
            @RequestParam("ceoInfo") String ceoInfo,
            @RequestParam("ctoInfo") String ctoInfo,
            @RequestParam("boardInfo") String boardInfo,
            @RequestParam("ppr") String ppr,
            @RequestParam("valuation") String valuation,
            @RequestParam("fundingGoal") String fundingGoal,
            @RequestParam("deadline") String deadline,
            @RequestParam("minInvest") String minInvest,
            @RequestParam("maxInvest") String maxInvest,
            @RequestParam("nofS") String nofS,
            @RequestParam("oft") String oft,
            @RequestParam("ast") String ast,
            @RequestParam("shareOf") String shareOf,
            @RequestParam("raised") String raised,
            @RequestParam("investor") String investor,
            @RequestParam("pitchImage") MultipartFile pitchImage,
            @RequestParam("wtiImage") MultipartFile wtiImage,
            @RequestParam("ceoImage") MultipartFile ceoImage,
            @RequestParam("ctoImage") MultipartFile ctoImage,
            @RequestParam("boardImage") MultipartFile boardImage,
            @RequestParam("ceolink") String ceoLink,
            @RequestParam("ctoLink") String ctoLink,
            @RequestParam("boardLink") String boardLink,
            @RequestParam("industry") String industry,
            @RequestParam("cmImage") MultipartFile companyImage) {

        // Create a Startup object
       return startUpService.saveData(companyName, title, desc, pitch, wti, ceoName, ctoName, boardMemberName, ceoInfo, ctoInfo, boardInfo, ppr, valuation, fundingGoal, deadline, minInvest, maxInvest, nofS, oft, ast, shareOf, raised, investor, pitchImage, wtiImage, ceoImage, ctoImage, boardImage,ceoLink,ctoLink,boardLink,industry,companyImage);
    }
	
	
	@GetMapping("/getbyName")
	public List<StartUpInfo> getByName(@RequestParam("cname") String sname){
		return startUpService.getByName(sname);
	}
	
	@GetMapping("/getByIndustry")
	public List<StartUpInfo> getByIndustryName(@RequestParam("ind") String industry){
		return startUpService.getByIndustryName(industry);
	}
	
	@PostMapping("/saveInvestorInfo")
	public String saveInvestor(@RequestBody InvestorInfo info) {
		return startUpService.saveInvestor(info);
	}
	
	
	@GetMapping("/getAllData")
	public List<StartUpInfo> getAll(){
		return startUpService.getAll();
	}
	
}
