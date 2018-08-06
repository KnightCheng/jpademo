package com.example.demo;

import com.example.demo.Repository.ClothesRepository;
import com.example.demo.Repository.PlayerRepository;
import com.example.demo.Repository.PositionRepository;
import com.example.demo.Repository.TeamRepository;
import com.example.demo.Service.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//	private static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
//
//	@Autowired
//	PlayerRepository playerRepository;
//	@Autowired
//	TeamRepository teamRepository;
//	@Autowired
//	PositionRepository positionRepository;
//	@Autowired
//	ClothesRepository clothesRepository;
//
	@Test
	public void contextLoads() {
//		playerRepository.deleteAll();
//		positionRepository.deleteAll();
//		teamRepository.deleteAll();
//		clothesRepository.deleteAll();
//
//		Team team = new Team();
//		team.setName("湖人队");
//		teamRepository.save(team);
//		Assert.assertNotNull(team.getId());
//
//		Position position = new Position();
//		position.setName("SG");
//
//		Clothes clothes=new Clothes();
//		clothes.setNumber(24);
//		clothesRepository.save(clothes);
//
//		Clothes clothes01=new Clothes();
//		clothes01.setNumber(23);
//		clothesRepository.save(clothes01);
//
//		List<Clothes> clothesList=new ArrayList<>();
//		clothesList.add(clothes);
//		clothesList.add(clothes01);
//		position.setClothes(clothesList);
//
//		positionRepository.save(position);
//		Assert.assertNotNull(position.getId());
//
//		Player player = new Player();
//		player.setName("Kobe Bryant");
//		player.setCreatedate(new Date());
//		player.setTeam(team);
//		List<Position> positions = positionRepository.findAll();
//		Assert.assertNotNull(positions);
//		player.setPosition(positions);
//
//		playerRepository.save(player);
	}

//	@Test
//	public void test2(){
//		Team team = new Team();
//		team.setName("骑士队");
//		teamRepository.save(team);
//		Assert.assertNotNull(team.getId());
//
//		Position position = new Position();
//		position.setName("PF");
//
//
//		Clothes clothes=new Clothes();
//		clothes.setNumber(11);
//		clothesRepository.save(clothes);
//
//		Clothes clothes01=new Clothes();
//		clothes01.setNumber(15);
//		clothesRepository.save(clothes01);
//
//		List<Clothes> clothesList=new ArrayList<>();
//		clothesList.add(clothes);
//		clothesList.add(clothes01);
//
////		List<Clothes> clothesList=clothesRepository.findAll();
//		position.setClothes(clothesList);
//
//		positionRepository.save(position);
//		Assert.assertNotNull(position.getId());
//
//		Player player = new Player();
//		player.setName("james");
//		player.setCreatedate(new Date());
//		player.setTeam(team);
//		List<Position> positions = positionRepository.findAll();
//		Assert.assertNotNull(positions);
//		player.setPosition(positions);
//
//		playerRepository.save(player);
//	}
//
//	@Test
//	public void findPage(){
//		Pageable pageable = new PageRequest(0, 10, new Sort(Sort.Direction.ASC, "id"));
//		Page<Player> page = playerRepository.findAll(pageable);
//		Assert.assertNotNull(page);
//
//		for(Player player: page.getContent()){
//			logger.info("\n========player======== player name:{}, team name:{}, position name:{}\n",
//					player.getName(), player.getTeam().getName(), player.getPositions().get(0).getName());
//		}
//	}
//
//	@Resource
//	UserServiceImpl userService;
//
//
//
//	@Test
//	public void initUser(){
//		User user=new User();
//		user.setAge(18);
//		user.setUserName("骑士");
//		user.setPassword("@123Knight");
//		userService.save(user);
//	}

}
