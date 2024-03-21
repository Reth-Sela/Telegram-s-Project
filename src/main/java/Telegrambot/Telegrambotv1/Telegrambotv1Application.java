package Telegrambot.Telegrambotv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class Telegrambotv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Telegrambotv1Application.class, args);
//		Telegrambot telegrambot=new Telegrambot();
//
//		try {
//			TelegramBotsApi telegramBotsApi=new TelegramBotsApi(DefaultBotSession.class);
//			telegramBotsApi.registerBot(telegrambot);
//			telegrambot.sendText(1472128065L,"我想你");
//
//		} catch (TelegramApiException e) {
//			throw new RuntimeException(e);
//		}
	}

}
