package com.bellapp;

import com.bellapp.dao.ProductRepository;
import com.bellapp.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    /**
     * Set some Random data
     * @param repository
     * @return
     */
	@Bean
    CommandLineRunner runner(ProductRepository repository) {
	    return args -> {

            repository.save(new Product("LG", "G7", 999.99F,"Discover the new LG G7ThinQ\n" +
                    "The LG G7ThinQ is built for big sound. Keep the bass bumping with " +
                    "the Boombox Speaker and listen to music the way it was meant to be" +
                    " heard with the G7’s Hi-Fi QuadDAC and DTS X Surround Sound. ",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/LG-G7-ThinQ/LG_G7_ThinQ_Silver_lrg1.png", 50));

            repository.save(new Product("Huawei", "P20 Pro", 1200.00F, "AI-powered triple camera\n" +
                    "Take photos with unparalleled sharpness, colour and accuracy with the world’s first Leica triple" +
                    " camera. Maintain richness and clarity in photos with the 40 MP RGB sensor, 20 MP monochrome" +
                    " sensor and 8 MP sensor with telephoto lens. ",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/Huawei_P20_Pro_Black_lrg1_en.png",33));

            repository.save(new Product("Samsung", "Galaxy S9", 980.99F, "AI-powered triple camera\n" +
                    "Take photos with unparalleled sharpness, colour and accuracy with the world’s first Leica triple" +
                    " camera. Maintain richness and clarity in photos with the 40 MP RGB sensor, 20 MP monochrome" +
                    " sensor and 8 MP sensor with telephoto lens. ",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/SamsungGalaxyS9Plus/Samsung_Galaxy-S9-plus_Grey_lrg1.png", 33));

            repository.save(new Product("IPhone", "8 Plus", 1099.99F,"iPhone 8 introduces an all-new" +
                    " glass design. The world's most popular camera, now even better. The smartest, most powerful chip ever in a smartphone." +
                    " Wireless charging that’s truly effortless. And augmented reality experiences never before possible.",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/large/iPhone8_plus_Spgry_lrg1_en.png", 50));

            repository.save(new Product("IPhone", "7", 800.99F, "AI-powered triple camera\n" +
                    "Take photos with unparalleled sharpness, colour and accuracy with the world’s first Leica triple" +
                    " camera. Maintain richness and clarity in photos with the 40 MP RGB sensor, 20 MP monochrome" +
                    " sensor and 8 MP sensor with telephoto lens. ",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/iPhone_7/iPhone7_MatBlk_lrg1_en.png",12));

            repository.save(new Product("Sony", "Xperia XZ2", 899.99F, "Discover the new Sony Xperia XZ2\n" +
                    "Experience videos like never before with the Sony Xperia XZ2. Shoot incredible 4K HDR videos, record super slow motion" +
                    " in full HD and get the best viewing experience by automatically up-converting ",
                    "https://www.bell.ca/Styles/wireless/all_languages/all_regions/catalog_images/Sony-Experia-XZ2/sonyXperia_XZ2_black_lrg1.png", 45));

        };
    }


}
