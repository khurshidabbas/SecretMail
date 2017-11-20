package com.mistcasters.secretmail;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by Khurshid Abbas on 11-Sep-17.
 */

public class MyWelcomeActivity extends WelcomeActivity {
	@Override
	protected WelcomeConfiguration configuration() {
		return new WelcomeConfiguration.Builder(this)
				.defaultBackgroundColor(R.color.firstBackground)
				
				.page(new TitlePage(R.drawable.img_title_one,
						"Secret Mail")
						.background(R.color.firstBackground))
				
				.page(new BasicPage(R.drawable.img_title_two,
						"Anonymous Emails",
						"Send Emails to Every Possible Address!")
						.background(R.color.secondBackground))
				
				.page(new BasicPage(R.drawable.img_title_three,
						"Secure",
						"Send Truly Anonymous Emails!")
						.background(R.color.thirdBackground))
				
				.page(new BasicPage(R.drawable.img_title_four,
						"MistCasters",
						"You've Got It!")
						.background(R.color.fourthBackground))
				
				.swipeToDismiss(true)
				.build();
	}
}