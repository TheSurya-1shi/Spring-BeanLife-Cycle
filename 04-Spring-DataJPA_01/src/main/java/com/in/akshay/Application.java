package com.in.akshay;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.akshay.repository.Player;
import com.in.akshay.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		
		Player player = new Player();
		
		player.setPlayerId(33);
		player.setPlayerName("Akshay");
		player.setPlayerAge(26);
		player.setLocation("Nanded");
		
		playerRepository.save(player);
		System.out.println("Saved record to DB");
		
		Optional<Player> pl = playerRepository.findById(player.getPlayerId());
		System.out.println(pl.toString());
		
		
		
	}

}
